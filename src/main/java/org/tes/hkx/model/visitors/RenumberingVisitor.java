package org.tes.hkx.model.visitors;

import java.util.HashSet;
import java.util.Set;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class RenumberingVisitor implements IHkVisitor<Integer> {

	private int counter = 0;
	private final Set<IHkVisitable> visitedSet = new HashSet<>();

	public RenumberingVisitor(int startingKey) {
		counter = startingKey;
	}

	@Override
	public void visit(IHkVisitable obj) {
		if (!visitedSet.contains(obj)) {
			if (obj instanceof HkobjectType) {
				((HkobjectType) obj).setKey("#" + String.format("%04d", counter++));
			}
			visitedSet.add(obj);
		}
	}

	@Override
	public Integer getResults() {
		return counter;
	}

}
