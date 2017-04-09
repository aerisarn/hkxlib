package org.tes.hkx.model.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FilenameUtils;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkRootLevelContainer;
import org.tes.hkx.model.HkFile;
import org.tes.hkx.model.visitors.ParentLinkVisitor;

public class HkFilesFactory {
	JAXBContext context = null;
	Marshaller marshaller = null;
	Unmarshaller unmarshaller = null;

	public HkFilesFactory() throws Exception {
//		Reflections reflections = new Reflections("org.tes.hkx.lib.ext", new SubTypesScanner(false));
//		Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
//		allClasses.addAll(reflections.getSubTypesOf(HkobjectType.class));
//		allClasses.add(HkpackfileType.class);
//		for (Class c : allClasses) {
//			System.out.println(c.getSimpleName());
//		}
		//context = JAXBContext.newInstance(allClasses.toArray((Class[]) Array.newInstance(Class.class, 1)));
		context = JAXBContext.newInstance("org.tes.hkx.lib.ext", this.getClass().getClassLoader());
		
		unmarshaller = context.createUnmarshaller();
		marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}
	
	private JAXBElement<HkpackfileType> load(InputStream in) throws Exception {
		Object unmarshalledFile = null;
//		try {
			unmarshalledFile = unmarshaller.unmarshal(in);
//		} catch (Exception e) {
//			//try linux lowercase
//			File startPath = f.getParentFile().getParentFile();
////			String folderName = FilenameUtils.getBaseName(f.getParentFile().getAbsolutePath());
////			String filename = FilenameUtils.concat(startPath.getAbsolutePath(), folderName.toLowerCase());
////			filename = FilenameUtils.concat(filename, FilenameUtils.getName(f.getAbsolutePath()).toLowerCase());
////			
//			
////			unmarshalledFile = unmarshaller.unmarshal(new File(filename));
//		}
		JAXBElement<HkpackfileType> wrapper = (JAXBElement<HkpackfileType>) unmarshalledFile;
		HkpackfileType hkx = wrapper.getValue();
		String key = hkx.getToplevelobject();
		hkRootLevelContainer root = null;
		for (HkobjectType o : hkx.getHksection().getHkobject()) {
			if (o.getKey().equals(key)) {
				root = (hkRootLevelContainer) o;
			}
			// Fix for double signature
			o.setSignature(null);
		}
		root.accept(new ParentLinkVisitor(), null);
		if (root == null)
			throw new Exception("Malformed HKX file: Unable to find hkRootLevelContainer");
		return wrapper;
	}


	private JAXBElement<HkpackfileType> load(File f) throws Exception {
		Object unmarshalledFile = null;
		try {
			unmarshalledFile = unmarshaller.unmarshal(f);
		} catch (Exception e) {
			//try linux lowercase
			File startPath = f.getParentFile().getParentFile();
			String folderName = FilenameUtils.getBaseName(f.getParentFile().getAbsolutePath());
			String filename = FilenameUtils.concat(startPath.getAbsolutePath(), folderName.toLowerCase());
			filename = FilenameUtils.concat(filename, FilenameUtils.getName(f.getAbsolutePath()).toLowerCase());
			
			
			unmarshalledFile = unmarshaller.unmarshal(new File(filename));
		}
		JAXBElement<HkpackfileType> wrapper = (JAXBElement<HkpackfileType>) unmarshalledFile;
		HkpackfileType hkx = wrapper.getValue();
		String key = hkx.getToplevelobject();
		hkRootLevelContainer root = null;
		for (HkobjectType o : hkx.getHksection().getHkobject()) {
			if (o.getKey().equals(key)) {
				root = (hkRootLevelContainer) o;
			}
			// Fix for double signature
			o.setSignature(null);
		}
		if (root == null)
			throw new Exception("Malformed HKX file: Unable to find hkRootLevelContainer");
		root.accept(new ParentLinkVisitor(), null);
		return wrapper;
	}

	public HkFile loadFile(File f) throws Exception {
		return new HkFile(load(f));
	}

	public <T extends HkFile> T loadTypedFile(File f, Class<T> cl) throws Exception {
		return cl.getConstructor(JAXBElement.class).newInstance(load(f));
	}
	
	public <T extends HkFile> T loadTypedFile(InputStream in, Class<T> cl) throws Exception {
		return cl.getConstructor(JAXBElement.class).newInstance(load(in));
	}


	public void save(HkFile hf, File f) throws JAXBException, IOException {
		hf.resetKeys();
		marshaller.marshal(hf.getWrapper(), new FileWriter(f));
	}

	public void out(HkFile hf) throws JAXBException {
		hf.resetKeys();
		marshaller.marshal(hf.getWrapper(), System.out);
	}
}
