
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = { "role", "type" })
public class innerVariableInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private innerVariableRole role;
	private String type;

	public innerVariableInfo() {
		setRole(null);
		setType("VARIABLE_TYPE_REAL");
	}

	@XmlElement(name = "hkparam[@name=\"role\"]/hkobject")
	public innerVariableRole getRole() {
		return role;
	}

	public void setRole(innerVariableRole newRole) {
		this.role = newRole;
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public String getType() {
		return type;
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public void setType(String newType) {
		this.type = newType;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getRole())) {
			getRole().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getRole())) {
			getRole().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getRole())) {
			theseObjects.add(getRole());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getRole() != null) && getRole().equals(toRemove)) {
			setRole(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "VariableInfo";
	}
}
