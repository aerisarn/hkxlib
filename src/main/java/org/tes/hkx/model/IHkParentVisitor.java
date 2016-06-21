package org.tes.hkx.model;

public interface IHkParentVisitor<T> {
	public void visit(IHkVisitable obj, IHkVisitable parent);
	
	public T getResults();
}
