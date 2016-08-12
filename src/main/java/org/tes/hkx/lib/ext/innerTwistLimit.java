
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "type", "isEnabled", "twistAxis", "refAxis", "minAngle", "maxAngle", "angularLimitsTauFactor" })
public class innerTwistLimit extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String type;
	private String isEnabled;
	private String twistAxis;
	private String refAxis;
	private String minAngle;
	private String maxAngle;
	private String angularLimitsTauFactor;

	public innerTwistLimit() {
		setType(null);
		setIsEnabled(null);
		setTwistAxis(null);
		setRefAxis(null);
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

	@XmlPath("hkparam[@name=\"twistAxis\"]/text()")
	public String getTwistAxis() {
		return twistAxis;
	}

	@XmlPath("hkparam[@name=\"twistAxis\"]/text()")
	public void setTwistAxis(String newTwistAxis) {
		this.twistAxis = newTwistAxis;
	}

	@XmlPath("hkparam[@name=\"refAxis\"]/text()")
	public String getRefAxis() {
		return refAxis;
	}

	@XmlPath("hkparam[@name=\"refAxis\"]/text()")
	public void setRefAxis(String newRefAxis) {
		this.refAxis = newRefAxis;
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
		return "TwistLimit";
	}
}
