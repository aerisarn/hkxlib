package org.tes.hkx.model.files;

import java.io.File;
import java.util.List;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.Unnamed1;
import org.tes.hkx.lib.ext.hkaAnimationContainer;
import org.tes.hkx.lib.ext.hkaSkeleton;
import org.tes.hkx.model.HkFile;

public class HkAnimationFile extends HkFile {

	public final static Integer startingKey = 39;

	private void setup() throws Exception {
		for (Unnamed1 variant : getRoot().getNamedVariants()) {
			if (!(variant.getVariant() instanceof hkaAnimationContainer)) {
				throw new Exception(
						"Expected object class: hkaAnimationContainer. found: " + variant.getVariant().getClazz());
			}
		}
		counter = startingKey;
	}

	public HkAnimationFile(File f) throws Exception {
		super(f);
		setup();
	}

	public HkAnimationFile(HkpackfileType hkxpackfile, String outFilePath) throws Exception {
		super(hkxpackfile, outFilePath);
		setup();
	}

	public HkAnimationFile(String outFilePath) throws Exception {
		super(outFilePath);
		setup();
	}

}