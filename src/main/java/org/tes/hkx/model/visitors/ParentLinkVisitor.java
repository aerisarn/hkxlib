package org.tes.hkx.model.visitors;

import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkParented;
import org.tes.hkx.model.IHkVisitable;

public class ParentLinkVisitor implements IHkParentVisitor<Void> {

	@Override
	public Void getResults() {
		return null;
	}

	@Override
	public void visit(IHkVisitable obj, IHkVisitable parent) {
		if (obj instanceof IHkParented) {
			((IHkParented)obj).addParent(parent);
		}
	}

}
