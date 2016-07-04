package org.tes.hkx.model.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkRootLevelContainer;
import org.tes.hkx.model.HkFile;

public class HkFilesFactory {
	JAXBContext context = null;
	Marshaller marshaller = null;
	Unmarshaller unmarshaller = null;

	JAXBElement<HkpackfileType> wrapper = null;
	
	public HkFilesFactory() throws Exception {
		Reflections reflections = new Reflections("org.tes.hkx.lib.ext", new SubTypesScanner(false));
		Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
		allClasses.addAll(reflections.getSubTypesOf(HkobjectType.class));
		allClasses.add(HkpackfileType.class);
		context = JAXBContext.newInstance(allClasses.toArray((Class[]) Array.newInstance(Class.class, 1)));
		unmarshaller = context.createUnmarshaller();
		marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}
	
	private HkpackfileType load(File f) throws Exception{
		Object unmarshalledFile = unmarshaller.unmarshal(f);
		JAXBElement<HkpackfileType> wrapper = (JAXBElement<HkpackfileType>) unmarshalledFile;
		HkpackfileType hkx = wrapper.getValue();
		String key = hkx.getToplevelobject();
		hkRootLevelContainer root = null;
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey()
					.equals(key))
			{
				root = (hkRootLevelContainer) o;
				// Fix for double signature
				o.setSignature(null);
			}
		if (root == null)
			throw new Exception("Malformed HKX file: Unable to find hkRootLevelContainer");
		return hkx;
	}
	
	public HkFile loadFile(File f) throws Exception {
		return new HkFile(load(f));
	}
	
	public <T extends HkFile> T loadTypedFile(File f, Class<T> cl) throws Exception {
		return cl.getConstructor(HkpackfileType.class).newInstance(load(f));
	}

	public void save(HkFile hf, File f) throws JAXBException, IOException {
		hf.resetKeys();
		marshaller.marshal(wrapper, new FileWriter(f));
	}
}
