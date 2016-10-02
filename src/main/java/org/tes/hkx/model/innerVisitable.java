package org.tes.hkx.model;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

public abstract class innerVisitable implements IHkParented {

	@XmlTransient
	private Set<IHkVisitable> parents = new HashSet<>();

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#getParent()
	 */
	@Override
	@XmlTransient
	public Set<IHkVisitable> getParents() {
		return parents;
	}

	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	@XmlTransient
	public void addParent(IHkVisitable parent) {
		parents.add(parent);
	}
	
	/* (non-Javadoc)
	 * @see org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	@XmlTransient
	public boolean removeParent(IHkVisitable parent) {
		return parents.remove(parent);
	}
	
}
