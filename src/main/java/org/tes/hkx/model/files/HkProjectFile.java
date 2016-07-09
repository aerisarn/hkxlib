package org.tes.hkx.model.files;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.innerFieldVariants;
import org.tes.hkx.lib.ext.hkbProjectData;
import org.tes.hkx.lib.ext.hkbProjectStringData;
import org.tes.hkx.model.HkFile;

public class HkProjectFile extends HkFile {

	public final static Integer projectStartingKey = 8;
	public static final String variantClassName = "hkbProjectData";
	public static final String variantName = "hkbProjectData";
	private String fileName;

	hkbProjectData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbProjectData)) {
			throw new Exception("Expected object class: hkbProjectData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
	}

	public HkProjectFile(HkpackfileType source) throws Exception {
		super(source);
		setup();
	}
	
	public HkProjectFile(String name) throws Exception {
		this();
		setFileName(name);
	}

	public HkProjectFile() throws Exception {
		innerFieldVariants variant = new innerFieldVariants();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		data = createObject(hkbProjectData.class);
		hkbProjectStringData stringData = createObject(hkbProjectStringData.class);
		data.setStringData(stringData);
		data = new hkbProjectData();
		variant.setVariant(data);
		getRoot().addToNamedVariants(variant);
		startingKey = projectStartingKey;
		resetKeys();
	}

	public hkbProjectData getData() {
		return data;
	}

	public hkbProjectStringData getStringData() {
		return data.getStringData();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
