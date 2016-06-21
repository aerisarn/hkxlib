package org.tes.hkx.model;

public interface IHkVisitor<T> {
	public void visit(IHkVisitable obj);
	
	public T getResults();
}
