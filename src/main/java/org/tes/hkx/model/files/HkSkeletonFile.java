package org.tes.hkx.model.files;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.innerFieldVariants;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.lib.ext.hkaSkeleton;
import org.tes.hkx.model.HkFile;

public class HkSkeletonFile extends HkFile {

	public final static Integer skeletonStartingKey = 38;
	public static final String variantClassName = "Animation Container";
	public static final String variantName = "Animation Container";
	private String fileName;

	hkaAnimationContainer animationContainer = null;

	private void setup() throws Exception {
		for (innerFieldVariants variant : getRoot().getNamedVariants()) {
			HkobjectType ivariant = variant.getVariant();
			if (ivariant instanceof hkaAnimationContainer) {
				animationContainer = getTypedObject(ivariant.getKey());	
			}
		}
		if (animationContainer==null)
		throw new Exception("Expected object class: hkaAnimationContainer. found: "
				+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
	}

	public HkSkeletonFile(JAXBElement<HkpackfileType> source) throws Exception {
		super(source);
		setup();
	}

	public HkSkeletonFile() throws NegativeArraySizeException, JAXBException {
		innerFieldVariants variant = new innerFieldVariants();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		animationContainer = new hkaAnimationContainer();
		variant.setVariant(animationContainer);
		getRoot().addToNamedVariants(variant);
		getObjects().add(animationContainer);
		startingKey = skeletonStartingKey;
		resetKeys();
	}

	public HkSkeletonFile(String name) throws NegativeArraySizeException, JAXBException {
		this();
		setFileName(name);
	}

	public hkaAnimationContainer getAnimationContainer() {
		return animationContainer;
	}

	public Iterable<hkaSkeleton> getSkeletons() {
		return animationContainer.getSkeletons();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
