package org.tes.hkx.model.visitors;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class RenumberingVisitor implements IHkVisitor<Integer> {

	private int counter = 0;

	public RenumberingVisitor(int startingKey) {
		counter = startingKey;
	}
	
	@Override
	public void visit(IHkVisitable obj) {
		if (obj instanceof HkobjectType) {
			((HkobjectType)obj).setKey("#"+String.format("%04d",counter++));
		}
	}

	@Override
	public Integer getResults() {
		return counter;
	}
	

}
