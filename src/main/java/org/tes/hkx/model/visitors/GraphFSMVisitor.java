package org.tes.hkx.model.visitors;

import java.util.ArrayList;
import java.util.List;

import org.tes.hkx.lib.ext.hkbStateMachine;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class GraphFSMVisitor implements IHkVisitor<List<hkbStateMachine>> {
	
	private final List<hkbStateMachine> result = new ArrayList<>();
	
	@Override
	public void visit(IHkVisitable obj) {
		if (obj instanceof hkbStateMachine)
			result.add((hkbStateMachine) obj);		
	}

	@Override
	public List<hkbStateMachine> getResults() {
		return result;
	}

}
