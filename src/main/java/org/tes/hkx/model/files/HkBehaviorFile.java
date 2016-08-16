package org.tes.hkx.model.files;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.innerFieldVariants;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbBehaviorGraphData;
import org.tes.hkx.model.HkFile;

public class HkBehaviorFile extends HkFile {

	public static final int behaviorStartingKey = 100;
	public static final String variantClassName = "hkbBehaviorGraph";
	public static final String variantName = "hkbBehaviorGraph";
	private String fileName;
	
	hkbBehaviorGraph graph;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbBehaviorGraph)) {
			throw new Exception("Expected object class: hkbBehaviorGraph. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		graph = getTypedObject(variant.getKey());
		startingKey = Integer.parseInt(getRoot().getKey().substring(1, getRoot().getKey().length()));
		System.out.println(variant.getKey()+": "+startingKey);
	}

	public HkBehaviorFile(JAXBElement<HkpackfileType> source) throws Exception {
		super(source);
		setup();
	}
	
	public HkBehaviorFile(String name) throws Exception {
		this();
		setFileName(name);
	}
	
	public HkBehaviorFile() throws NegativeArraySizeException, JAXBException {
		innerFieldVariants variant = new innerFieldVariants();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		graph = new hkbBehaviorGraph();
		variant.setVariant(graph);
		getRoot().addToNamedVariants(variant);
		getObjects().add(graph);
		startingKey = behaviorStartingKey;
		resetKeys();
	}


	public hkbBehaviorGraph getGraph() {
		return graph;
	}

	public hkbBehaviorGraphData getGraphData() {
		return graph.getData();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
