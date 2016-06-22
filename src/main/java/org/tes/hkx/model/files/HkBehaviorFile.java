package org.tes.hkx.model.files;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbBehaviorGraphData;
import org.tes.hkx.model.HkFile;

public class HkBehaviorFile {

	private final HkFile file;
	hkbBehaviorGraph graph;

	public HkBehaviorFile(HkFile f) throws Exception {
		file = f;
		HkobjectType variant = file.getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbBehaviorGraph)) {
			throw new Exception("Expected object class: hkbBehaviorGraph. found: "+file.getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		graph = file.getTypedObject(variant.getKey());
	}

	public hkbBehaviorGraph getGraph() {
		return graph;
	}
	
	public hkbBehaviorGraphData getGraphData() {
		return graph.getData();
	}

}
