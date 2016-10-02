package org.tes.hkx.model;

import java.util.Set;

public interface IHkParented {

	Set<IHkVisitable> getParents();

	void addParent(IHkVisitable parent);
	
	boolean removeParent(IHkVisitable parent);

}