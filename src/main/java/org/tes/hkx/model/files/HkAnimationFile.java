package org.tes.hkx.model.files;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.Unnamed1;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.model.HkFile;

public class HkAnimationFile extends HkFile {

	public static final int animStartingKey = 39;
	public static final String variantClassName = "Animation Container";
	public static final String variantName = "Animation Container";
	private String fileName;

	private void setup() throws Exception {
		for (Unnamed1 variant : getRoot().getNamedVariants()) {
			if (!(variant.getVariant() instanceof hkaAnimationContainer)) {
				throw new Exception(
						"Expected object class: hkaAnimationContainer. found: " + variant.getVariant().getClazz());
			}
		}
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
		Unnamed1 variant = new Unnamed1();
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