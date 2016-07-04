package org.tes.hkx.model.files;

import javax.xml.bind.JAXBException;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.ext.Unnamed1;
import org.tes.hkx.lib.ext.hkbCharacterData;
import org.tes.hkx.lib.ext.hkbCharacterStringData;
import org.tes.hkx.model.HkFile;

public class HkCharacterFile extends HkFile {

	public final static Integer characterStartingKey = 22;
	public static final String variantClassName = "hkbCharacterData";
	public static final String variantName = "hkbCharacterData";
	
	hkbCharacterData data;

	private void setup() throws Exception {
		HkobjectType variant = getRoot().getNamedVariants().iterator().next().getVariant();
		if (!(variant instanceof hkbCharacterData)) {
			throw new Exception("Expected object class: hkbCharacterData. found: "
					+ getRoot().getNamedVariants().iterator().next().getVariant().getClazz());
		}
		data = getTypedObject(variant.getKey());
	}

	public HkCharacterFile(HkpackfileType source) throws Exception {
		super(source);
		setup();
	}
	
	public HkCharacterFile() throws NegativeArraySizeException, JAXBException {
		Unnamed1 variant = new Unnamed1();
		variant.setClassName(variantClassName);
		variant.setName(variantName);
		data = new hkbCharacterData();
		variant.setVariant(data);
		getRoot().addToNamedVariants(variant);
		getObjects().add(data);
		startingKey = characterStartingKey;
		resetKeys();
	}

	public hkbCharacterData getData() {
		return data;
	}

	public hkbCharacterStringData getStringData() {
		return data.getStringData();
	}

}
