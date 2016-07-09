package org.tes.hkx.model.files;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.innerFieldVariants;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.model.HkFile;

public class HkAnimationFile extends HkFile {

	public static final int animStartingKey = 39;
	public static final String variantClassName = "Animation Container";
	public static final String variantName = "Animation Container";
	private String fileName;

	private void setup() throws Exception {
		boolean hasAnimation = false;
		for (innerFieldVariants variant : getRoot().getNamedVariants()) {
			if (variant.getVariant() instanceof hkaAnimationContainer) {
				hasAnimation = true;
			}
		}
		if (!hasAnimation)
			throw new Exception("Cannot find expected object class: hkaAnimationContainer");

	}

	public HkAnimationFile(HkpackfileType source) throws Exception {
		super(source);
		setup();
	}

	public HkAnimationFile(String name) throws Exception {
		this();
		setFileName(name);
	}

	public HkAnimationFile() throws NegativeArraySizeException, JAXBException {
		innerFieldVariants variant = new innerFieldVariants();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		hkaAnimationContainer container = new hkaAnimationContainer();
		variant.setVariant(container);
		getRoot().addToNamedVariants(variant);
		getObjects().add(container);
		startingKey = animStartingKey;
		resetKeys();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}