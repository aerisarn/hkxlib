package org.tes.hkx.model.files;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.Unnamed1;
import org.tes.hkx.lib.ext.hkbBehaviorGraph;
import org.tes.hkx.lib.ext.hkbProjectData;
import org.tes.hkx.lib.ext.hkbProjectStringData;
import org.tes.hkx.model.HkFile;

public class HkProjectFile extends HkFile {

	public final static Integer projectStartingKey = 8;
	public static final String variantClassName = "hkbProjectData";
	public static final String variantName = "hkbProjectData";
	
	hkbProjectData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbProjectData)) {
			throw new Exception("Expected object class: hkbProjectData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
	}
	
	public HkProjectFile(HkpackfileType source) throws Exception {
		super(source);
		setup();
	}
	
	public HkProjectFile() throws NegativeArraySizeException, JAXBException {
		Unnamed1 variant = new Unnamed1();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		data = new hkbProjectData();
		variant.setVariant(data);
		getRoot().addToNamedVariants(variant);
		getObjects().add(data);
		startingKey = projectStartingKey;
		resetKeys();
	}

	public hkbProjectData getData() {
		return data;
	}

	public hkbProjectStringData getGraphData() {
		return data.getStringData();
	}

}
