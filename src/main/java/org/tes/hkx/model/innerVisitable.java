package org.tes.hkx.model;

import javax.xml.bind.annotation.XmlTransient;

public abstract class innerVisitable implements IHkParented {

	@XmlTransient
	private IHkVisitable parent;

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#getParent()
	 */
	@Override
	@XmlTransient
	public IHkVisitable getParent() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	@XmlTransient
	public void setParent(IHkVisitable parent) {
		this.parent = parent;
	}
	
}
