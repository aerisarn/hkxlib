package org.tes.hkx.model.files;

import java.io.File;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.lib.ext.hkaSkeleton;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.model.HkFile;

public class HkSkeletonFile extends HkFile {

	public final static Integer startingKey = 38;
	
	hkaAnimationContainer animationContainer;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkaAnimationContainer)) {
			throw new Exception("Expected object class: hkaAnimationContainer. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		animationContainer = getTypedObject(variant.getKey());
		counter = startingKey;
	}

	public HkSkeletonFile(File f) throws Exception {
		super(f);
		setup();
	}

	public HkSkeletonFile(HkpackfileType hkxpackfile, String outFilePath) throws Exception {
		super(hkxpackfile, outFilePath);
		setup();
	}

	public HkSkeletonFile(String outFilePath) throws Exception {
		super(outFilePath);
		setup();
	}

	public hkaAnimationContainer getAnimationContainer() {
		return animationContainer;
	}

	public Iterable<hkaSkeleton> getSkeletons() {
		return animationContainer.getSkeletons();
	}

}
