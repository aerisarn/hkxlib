package org.tes.hkx.model.visitors;

import java.util.ArrayList;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

public class HkSearchObjectReferencesVisitor implements IHkVisitor<Object>  {
	
	private final HkobjectType toSearch;
	private Object parent = null;
	private final ArrayList<Object> result = new ArrayList<>();

	public HkSearchObjectReferencesVisitor(HkobjectType toSearch)
	{
		this.toSearch = toSearch;
	}
	
	@Override
	public void visit(IHkVisitable obj) {
		if (toSearch!= null && obj.equals(toSearch)) {
			result.add(parent);
		}
		parent = obj;
	}

	@Override
	public Object getResults() {
		return result;
	}

}
