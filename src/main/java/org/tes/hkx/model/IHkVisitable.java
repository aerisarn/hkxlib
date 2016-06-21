package org.tes.hkx.model;

public interface IHkVisitable {

	public <T> T accept(IHkVisitor<T> visitor);
	
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent);
}
