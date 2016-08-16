package org.tes.hkx.model.visitors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class HkTreeReferencedList implements IHkVisitor<List<HkobjectType>> {

	private ArrayList<HkobjectType> result = new ArrayList<>();
	private final Set<IHkVisitable> visitedSet = new HashSet<>();

	@Override
	public void visit(IHkVisitable obj) {
		if (!visitedSet.contains(obj)) {
			if (obj instanceof HkobjectType && !result.contains(obj))
				result.add((HkobjectType) obj);
			visitedSet.add(obj);
		}
	}

	@Override
	public List<HkobjectType> getResults() {
		return result;
	}

}
