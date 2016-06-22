package org.tes.hkx.model.files;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbBehaviorGraphData;
import org.tes.hkx.model.HkFile;

public class HkBehaviorFile extends HkFile {

	public final static Integer startingKey = 100;
	
	hkbBehaviorGraph graph;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbBehaviorGraph)) {
			throw new Exception("Expected object class: hkbBehaviorGraph. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		graph = getTypedObject(variant.getKey());
		counter = startingKey;
	}

	public HkBehaviorFile(File f) throws Exception {
		super(f);
		setup();
	}

	public HkBehaviorFile(HkpackfileType hkxpackfile, String outFilePath) throws Exception {
		super(hkxpackfile, outFilePath);
		setup();
	}

	public HkBehaviorFile(String outFilePath) throws Exception {
		super(outFilePath);
		setup();
	}

	public hkbBehaviorGraph getGraph() {
		return graph;
	}

	public hkbBehaviorGraphData getGraphData() {
		return graph.getData();
	}

}
