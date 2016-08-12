package org.tes.hkx.model.visitors;

import org.tes.hkx.lib.ext.hkbStateMachine;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class GraphFSMVisitor implements IHkVisitor<hkbStateMachine> {
	
	private hkbStateMachine result;

	@Override
	public hkbStateMachine getResults() {
		return result;
	}

	@Override
	public void visit(IHkVisitable obj) {
		if (result== null && obj instanceof hkbStateMachine) result = (hkbStateMachine) obj;
	}

}
