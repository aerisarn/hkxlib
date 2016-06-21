package org.tes.hkx.model;

import java.util.Collection;

public interface IHkContainer {
	
	public Collection<IHkVisitable> objects();
	
	public boolean remove(Object toRemove);
	
}
