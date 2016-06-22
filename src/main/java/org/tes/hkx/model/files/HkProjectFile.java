package org.tes.hkx.model.files;

import java.io.File;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkbProjectData;
import org.tes.hkx.lib.ext.hkbProjectStringData;
import org.tes.hkx.model.HkFile;

public class HkProjectFile extends HkFile {

	public final static Integer startingKey = 8;
	
	hkbProjectData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbProjectData)) {
			throw new Exception("Expected object class: hkbProjectData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
		counter = startingKey;
	}

	public HkProjectFile(File f) throws Exception {
		super(f);
		setup();
	}

	public HkProjectFile(HkpackfileType hkxpackfile, String outFilePath) throws Exception {
		super(hkxpackfile, outFilePath);
		setup();
	}

	public HkProjectFile(String outFilePath) throws Exception {
		super(outFilePath);
		setup();
	}

	public hkbProjectData getData() {
		return data;
	}

	public hkbProjectStringData getGraphData() {
		return data.getStringData();
	}

}
