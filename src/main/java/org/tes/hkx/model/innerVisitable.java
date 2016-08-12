package org.tes.hkx.model;

public abstract class innerVisitable implements IHkParented {

	private IHkVisitable parent;

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#getParent()
	 */
	@Override
	public IHkVisitable getParent() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	public void setParent(IHkVisitable parent) {
		this.parent = parent;
	}
	
}
