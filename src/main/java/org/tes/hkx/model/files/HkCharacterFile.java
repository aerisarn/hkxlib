package org.tes.hkx.model.files;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.innerFieldVariants;
import org.tes.hkx.lib.ext.hkbCharacterData;
import org.tes.hkx.lib.ext.hkbCharacterStringData;
import org.tes.hkx.model.HkFile;

public class HkCharacterFile extends HkFile {

	public final static Integer characterStartingKey = 22;
	public static final String variantClassName = "hkbCharacterData";
	public static final String variantName = "hkbCharacterData";
	private String fileName;
	
	hkbCharacterData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbCharacterData)) {
			throw new Exception("Expected object class: hkbCharacterData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
	}

	public HkCharacterFile(JAXBElement<HkpackfileType> source) throws Exception {
		super(source);
		setup();
	}
	
	public HkCharacterFile(String name) throws Exception {
		this();
		setFileName(name);
	}
	
	public HkCharacterFile() throws Exception {
		innerFieldVariants variant = new innerFieldVariants();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		data = createObject(hkbCharacterData.class);
		data.setStringData(createObject(hkbCharacterStringData.class));
		variant.setVariant(data);
		getRoot().addToNamedVariants(variant);
		getObjects().add(data);
		startingKey = characterStartingKey;
		resetKeys();
	}

	public hkbCharacterData getData() {
		return data;
	}

	public hkbCharacterStringData getStringData() {
		return data.getStringData();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
