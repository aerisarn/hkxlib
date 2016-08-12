
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "value" })
public class innerWordVariableValue extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String value;

	public innerWordVariableValue() {
		setValue("0");
	}

	@XmlPath("hkparam[@name=\"value\"]/text()")
	public String getValue() {
		return value;
	}

	@XmlPath("hkparam[@name=\"value\"]/text()")
	public void setValue(String newValue) {
		this.value = newValue;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		return visitor.getResults();
	}

	@Override
	public String toString() {
		return "WordVariableValue";
	}
}
