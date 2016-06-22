package org.tes.hkx.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
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
import org.tes.hkx.model.visitors.RenumberingVisitor;

public class HkFile {

	File thisFile = null;
	HkpackfileType hkx = null;
	JAXBContext context = null;
	Marshaller marshaller = null;

	JAXBElement<HkpackfileType> wrapper = null;
	hkRootLevelContainer root;
	ArrayList<HkobjectType> variants;
	
	protected int counter = 0;

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
		out();
		marshaller.marshal(wrapper, new FileWriter(thisFile));
	}

	public void save(File f) throws JAXBException, IOException {
		out();
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
		removeUnreferenced();
		root.accept(new RenumberingVisitor(counter));
		hkx.setToplevelobject(root.getKey());
	}
	
	private void removeUnreferenced() {
		List<HkobjectType> referenced = root.accept(new HkTreeReferencedList());
		List<HkobjectType> unreferenced = new ArrayList<>();
		for (HkobjectType o : hkx.getHksection().getHkobject()) {
			if (!referenced.contains(o)) {
				unreferenced.add(o);
			}
		}
		for (HkobjectType o : unreferenced) {
			hkx.getHksection().getHkobject().remove(o);
		}
	}

}
