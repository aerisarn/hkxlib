package org.tes.hkx.model.files;

import java.io.File;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbCharacterData;
import org.tes.hkx.lib.ext.hkbCharacterStringData;
import org.tes.hkx.lib.ext.hkbProjectData;
import org.tes.hkx.lib.ext.hkbProjectStringData;
import org.tes.hkx.model.HkFile;

public class HkCharacterFile extends HkFile {

	public final static Integer startingKey = 22;
	
	hkbCharacterData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbCharacterData)) {
			throw new Exception("Expected object class: hkbCharacterData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
		counter = startingKey;
	}

	public HkCharacterFile(File f) throws Exception {
		super(f);
		setup();
	}

	public HkCharacterFile(HkpackfileType hkxpackfile, String outFilePath) throws Exception {
		super(hkxpackfile, outFilePath);
		setup();
	}

	public HkCharacterFile(String outFilePath) throws Exception {
		super(outFilePath);
		setup();
	}

	public hkbCharacterData getData() {
		return data;
	}

	public hkbCharacterStringData getStringData() {
		return data.getStringData();
	}

}
