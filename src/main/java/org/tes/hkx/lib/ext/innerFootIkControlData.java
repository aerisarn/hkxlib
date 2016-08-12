
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "gains" })
public class innerFootIkControlData extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private innerFootIkControlGains gains;

	public innerFootIkControlData() {
		setGains(null);
	}

	@XmlElement(name = "hkparam[@name=\"gains\"]/hkobject")
	public innerFootIkControlGains getGains() {
		return gains;
	}

	public void setGains(innerFootIkControlGains newGains) {
		this.gains = newGains;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getGains())) {
			getGains().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getGains())) {
			getGains().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getGains())) {
			theseObjects.add(getGains());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getGains() != null) && getGains().equals(toRemove)) {
			setGains(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "FootIkControlData";
	}
}
