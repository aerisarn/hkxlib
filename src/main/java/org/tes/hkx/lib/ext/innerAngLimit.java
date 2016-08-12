
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "type", "isEnabled", "limitAxis", "minAngle", "maxAngle", "angularLimitsTauFactor" })
public class innerAngLimit extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String type;
	private String isEnabled;
	private String limitAxis;
	private String minAngle;
	private String maxAngle;
	private String angularLimitsTauFactor;

	public innerAngLimit() {
		setType(null);
		setIsEnabled(null);
		setLimitAxis(null);
		setMinAngle(null);
		setMaxAngle(null);
		setAngularLimitsTauFactor(null);
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public String getType() {
		return type;
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public void setType(String newType) {
		this.type = newType;
	}

	@XmlPath("hkparam[@name=\"isEnabled\"]/text()")
	public String getIsEnabled() {
		return isEnabled;
	}

	@XmlPath("hkparam[@name=\"isEnabled\"]/text()")
	public void setIsEnabled(String newIsEnabled) {
		this.isEnabled = newIsEnabled;
	}

	@XmlPath("hkparam[@name=\"limitAxis\"]/text()")
	public String getLimitAxis() {
		return limitAxis;
	}

	@XmlPath("hkparam[@name=\"limitAxis\"]/text()")
	public void setLimitAxis(String newLimitAxis) {
		this.limitAxis = newLimitAxis;
	}

	@XmlPath("hkparam[@name=\"minAngle\"]/text()")
	public String getMinAngle() {
		return minAngle;
	}

	@XmlPath("hkparam[@name=\"minAngle\"]/text()")
	public void setMinAngle(String newMinAngle) {
		this.minAngle = newMinAngle;
	}

	@XmlPath("hkparam[@name=\"maxAngle\"]/text()")
	public String getMaxAngle() {
		return maxAngle;
	}

	@XmlPath("hkparam[@name=\"maxAngle\"]/text()")
	public void setMaxAngle(String newMaxAngle) {
		this.maxAngle = newMaxAngle;
	}

	@XmlPath("hkparam[@name=\"angularLimitsTauFactor\"]/text()")
	public String getAngularLimitsTauFactor() {
		return angularLimitsTauFactor;
	}

	@XmlPath("hkparam[@name=\"angularLimitsTauFactor\"]/text()")
	public void setAngularLimitsTauFactor(String newAngularLimitsTauFactor) {
		this.angularLimitsTauFactor = newAngularLimitsTauFactor;
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
		return "angLimit";
	}

}
