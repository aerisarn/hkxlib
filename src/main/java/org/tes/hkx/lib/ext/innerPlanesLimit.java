
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = { "type", "isEnabled", "twistAxisInA", "refAxisInB", "angleMeasurementMode",
		"memOffsetToAngleOffset", "minAngle", "maxAngle", "angularLimitsTauFactor" })
public class innerPlanesLimit implements IHkVisitable, IHkInnerObject {

	private String type;
	private String isEnabled;
	private String twistAxisInA;
	private String refAxisInB;
	private String angleMeasurementMode;
	private String memOffsetToAngleOffset;
	private String minAngle;
	private String maxAngle;
	private String angularLimitsTauFactor;

	public innerPlanesLimit() {
		setType(null);
		setIsEnabled(null);
		setTwistAxisInA(null);
		setRefAxisInB(null);
		setAngleMeasurementMode(null);
		setMemOffsetToAngleOffset(null);
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

	@XmlPath("hkparam[@name=\"twistAxisInA\"]/text()")
	public String getTwistAxisInA() {
		return twistAxisInA;
	}

	@XmlPath("hkparam[@name=\"twistAxisInA\"]/text()")
	public void setTwistAxisInA(String newTwistAxisInA) {
		this.twistAxisInA = newTwistAxisInA;
	}

	@XmlPath("hkparam[@name=\"refAxisInB\"]/text()")
	public String getRefAxisInB() {
		return refAxisInB;
	}

	@XmlPath("hkparam[@name=\"refAxisInB\"]/text()")
	public void setRefAxisInB(String newRefAxisInB) {
		this.refAxisInB = newRefAxisInB;
	}

	@XmlPath("hkparam[@name=\"angleMeasurementMode\"]/text()")
	public String getAngleMeasurementMode() {
		return angleMeasurementMode;
	}

	@XmlPath("hkparam[@name=\"angleMeasurementMode\"]/text()")
	public void setAngleMeasurementMode(String newAngleMeasurementMode) {
		this.angleMeasurementMode = newAngleMeasurementMode;
	}

	@XmlPath("hkparam[@name=\"memOffsetToAngleOffset\"]/text()")
	public String getMemOffsetToAngleOffset() {
		return memOffsetToAngleOffset;
	}

	@XmlPath("hkparam[@name=\"memOffsetToAngleOffset\"]/text()")
	public void setMemOffsetToAngleOffset(String newMemOffsetToAngleOffset) {
		this.memOffsetToAngleOffset = newMemOffsetToAngleOffset;
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
		return "PlanesLimit";
	}
}
