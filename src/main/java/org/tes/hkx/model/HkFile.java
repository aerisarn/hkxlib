package org.tes.hkx.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.HksectionType;
import org.tes.hkx.lib.ext.hkRootLevelContainer;
import org.tes.hkx.model.visitors.HkTreeReferencedList;

public class HkFile {

	File thisFile = null;
	HkpackfileType hkx = null;
	JAXBContext context = null;
	Marshaller marshaller = null;

	JAXBElement<HkpackfileType> wrapper = null;
	hkRootLevelContainer root;
	ArrayList<HkobjectType> variants;

	private void setupContext() throws NegativeArraySizeException, JAXBException {
		Reflections reflections = new Reflections("org.tes.hkx.lib.ext", new SubTypesScanner(false));
		Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
		allClasses.addAll(reflections.getSubTypesOf(HkobjectType.class));
		allClasses.add(HkpackfileType.class);
		context = JAXBContext.newInstance(allClasses.toArray((Class[]) Array.newInstance(Class.class, 1)));
		marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}

	public HkFile(File f) throws Exception {
		setupContext();
		thisFile = f;
		load(f);
	}

	public HkFile(HkpackfileType hkxpackfile, String outFilePath) throws JAXBException {
		setupContext();
		thisFile = new File(outFilePath);
		hkx = hkxpackfile;
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o instanceof hkRootLevelContainer) {
				root = (hkRootLevelContainer) o;
				// Fix for double signature
				o.setSignature(null);
			}
		if (root == null)
			throw new JAXBException("Unable to find hkRootLevelContainer");
		wrapper = new JAXBElement<HkpackfileType>(new QName("hkpackfile"), HkpackfileType.class, hkxpackfile);
	}

	public HkFile(String outFilePath) throws JAXBException {
		setupContext();
		thisFile = new File(outFilePath);
		hkx = new HkpackfileType();
		hkx.setHksection(new HksectionType());
	}

	public void setHkClassVersion(Byte version) {
		hkx.setClassversion(version);
	}

	public void setHkContentsVersion(String version) {
		hkx.setContentsversion(version);
	}

	public void setOutputFile(File f) {
		thisFile = f;
	}

	public void load(File f) throws JAXBException, IOException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		wrapper = (JAXBElement<HkpackfileType>) unmarshaller.unmarshal(f);
		hkx = wrapper.getValue();
		String key = hkx.getToplevelobject();
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey()
					.equals(key))/* && o instanceof hkRootLevelContainer) */
			{
				root = (hkRootLevelContainer) o;
				// Fix for double signature
				o.setSignature(null);
			}
		if (root == null)
			// TODO: better exception
			throw new IOException("Malformed HKX file: Unable to find hkRootLevelContainer");
	}

	public void save() throws JAXBException, IOException {
		setKeys();
		marshaller.marshal(wrapper, new FileWriter(thisFile));
	}

	public void save(File f) throws JAXBException, IOException {
		setKeys();
		marshaller.marshal(wrapper, new FileWriter(f));
	}

	public List<HkobjectType> getObjects() {
		return hkx.getHksection().getHkobject();
	}

	public HkobjectType getObject(String key) {
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey().equals(key))
				return o;
		return null;
	}

	public <T extends HkobjectType> T getTypedObject(String key) {
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey().equals(key))
				return (T) o;
		return null;
	}

	public hkRootLevelContainer getRoot() {
		return root;
	}

	public void out() throws JAXBException {
		setKeys();
		// marshaller.marshal(wrapper, System.out);

	}

	private int counter;

	private void setKeys() {
		List<HkobjectType> referenced = root.accept(new HkTreeReferencedList());
		// reset and remove unreferenced
		List<HkobjectType> unreferenced = new ArrayList<>();
		for (HkobjectType o : hkx.getHksection().getHkobject()) {
			o.setKey("-1");
			if (!referenced.contains(o)) {
				System.out.println("Removing Unreferenced " + o);
				unreferenced.add(o);
				// hkx.getHksection().getHkobject().remove(o);
			}
		}
		for (HkobjectType o : unreferenced) {
			hkx.getHksection().getHkobject().remove(o);
		}

		// remove unreferenced

		counter = 100;

		try {
			visit(root);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		hkx.setToplevelobject(root.getKey());

	}

	private void visit(Object obj) throws Exception {

		if (obj instanceof HkobjectType) {
			HkobjectType hkobj = (HkobjectType) obj;
			if (hkobj.getKey().equals("-1"))
				hkobj.setKey("#" + String.format("%04d", counter++));
		}

		for (Method m : obj.getClass().getMethods()) {

			if (m.getName().toLowerCase().contains("hkparam"))
				continue;

			Type c = m.getReturnType();
			String methodName = m.getName();

			// Type c1 = m.getParameterTypes()[0];
			if (methodName.contains("get") && (c.toString().contains("HkobjectType") || c.toString().contains("Unnamed")
					|| c.toString().contains("hk") || c.toString().contains("BS"))) {

				// Array
				if (m.getParameterTypes().length > 0 && m.getParameterTypes()[0].toString().contains("int")) {
					// get num method
					String getNumMethodName = "getNum" + methodName.substring(3, methodName.length() - 2);

					Method getNumElems = obj.getClass().getDeclaredMethod(getNumMethodName, null);
					Integer numElems = (Integer) getNumElems.invoke(obj);

					for (int i = 0; i < numElems; i++) {
						Object out = m.invoke(obj, i);
						if (out != null) {
							visit(out);
						}
					}
				} else {
					// invoke method
					Object out = m.invoke(obj);
					if (out != null) {
						visit(out);
					}
				}
			}
		}
	}

}
