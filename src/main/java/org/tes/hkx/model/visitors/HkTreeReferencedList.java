package org.tes.hkx.model.visitors;

import java.util.ArrayList;
import java.util.List;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class HkTreeReferencedList implements IHkVisitor<List<HkobjectType>> {
	
	private ArrayList<HkobjectType> result = new ArrayList<>();

	@Override
	public void visit(IHkVisitable obj) {
		if (obj instanceof HkobjectType)
			result.add((HkobjectType) obj);
	}

	@Override
	public List<HkobjectType> getResults() {
		return result;
	}

}
