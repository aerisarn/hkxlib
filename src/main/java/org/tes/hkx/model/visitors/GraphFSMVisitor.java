package org.tes.hkx.model.visitors;

import java.util.ArrayList;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.ext.hkbStateMachine;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class GraphFSMVisitor implements IHkVisitor<ArrayList<hkbStateMachine>> {
	
	private final ArrayList<hkbStateMachine> result = new ArrayList<>();
	
	@Override
	public void visit(IHkVisitable obj) {
		if (obj instanceof hkbStateMachine)
			result.add((hkbStateMachine) obj);		
	}

	@Override
	public ArrayList<hkbStateMachine> getResults() {
		return result;
	}

}
