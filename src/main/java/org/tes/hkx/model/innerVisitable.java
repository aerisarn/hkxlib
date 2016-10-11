package org.tes.hkx.model;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

public abstract class innerVisitable implements IHkParented {

	@XmlTransient
	private Set<IHkVisitable> parents = new HashSet<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tes.hkx.model.IHkParented#getParent()
	 */
	@Override
	@XmlTransient
	public Set<IHkVisitable> getParents() {
		return parents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	@XmlTransient
	public void addParent(IHkVisitable parent) {
		parents.add(parent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tes.hkx.model.IHkParented#setParent(org.tes.hkx.model.IHkVisitable)
	 */
	@Override
	@XmlTransient
	public boolean removeParent(IHkVisitable parent) {
		return parents.remove(parent);
	}

	@Override
	@XmlTransient
	public IHkParented findRoot(IHkParented child) {
		IHkParented p = null;
		if (getParents().isEmpty())
			return child;
		for (IHkVisitable parent : child.getParents()) {
			if (parent instanceof IHkParented) {
				IHkParented pn = findRoot((IHkParented) parent);
				if (pn != null) {
					p = pn;
				}
			}
		}
		return p;
	}

	@XmlTransient
	private IHkParented findParentWithClass(IHkParented child, Class<?> c) {
		IHkParented p = null;
		if (getParents().isEmpty() && !child.getClass().equals(c))
			return null;
		if (child.getClass().equals(c))
			return child; 
		for (IHkVisitable parent : child.getParents()) {
			if (parent instanceof IHkParented) {
				IHkParented pn = findParentWithClass((IHkParented) parent,c);
				if (pn != null) {
					p = pn;
				}
			}
		}
		return p;
	}

	@Override
	@XmlTransient
	public <T> T findParentWithClass(Class<T> c) {
		return (T) findParentWithClass(this, c);
	}
}
