package org.tes.hkx.model.files;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.Unnamed1;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.lib.ext.hkaSkeleton;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbProjectData;
import org.tes.hkx.model.HkFile;

public class HkSkeletonFile extends HkFile {

	public final static Integer skeletonStartingKey = 38;
	public static final String variantClassName = "Animation Container";
	public static final String variantName = "Animation Container";
	
	hkaAnimationContainer animationContainer;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkaAnimationContainer)) {
			throw new Exception("Expected object class: hkaAnimationContainer. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		animationContainer = getTypedObject(variant.getKey());
	}

	public HkSkeletonFile(HkpackfileType source) throws Exception {
		super(source);
		setup();
	}
	
	public HkSkeletonFile() throws NegativeArraySizeException, JAXBException {
		Unnamed1 variant = new Unnamed1();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		animationContainer = new hkaAnimationContainer();
		variant.setVariant(animationContainer);
		getRoot().addToNamedVariants(variant);
		getObjects().add(animationContainer);
		startingKey = skeletonStartingKey;
		resetKeys();
	}

	public hkaAnimationContainer getAnimationContainer() {
		return animationContainer;
	}

	public Iterable<hkaSkeleton> getSkeletons() {
		return animationContainer.getSkeletons();
	}

}
