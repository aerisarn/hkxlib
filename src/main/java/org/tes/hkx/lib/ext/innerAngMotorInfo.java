
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = { "type", "isEnabled", "motorAxis", "initializedOffset", "previousTargetAngleOffset",
		"correspondingAngLimitSolverResultOffset", "targetAngle", "motor" })
public class innerAngMotorInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String type;
	private String isEnabled;
	private String motorAxis;
	private String initializedOffset;
	private String previousTargetAngleOffset;
	private String correspondingAngLimitSolverResultOffset;
	private String targetAngle;
	private hkpPositionConstraintMotor motor;

	public innerAngMotorInfo() {
		setType(null);
		setIsEnabled(null);
		setMotorAxis(null);
		setInitializedOffset(null);
		setPreviousTargetAngleOffset(null);
		setCorrespondingAngLimitSolverResultOffset(null);
		setTargetAngle(null);
		setMotor(null);
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

	@XmlPath("hkparam[@name=\"motorAxis\"]/text()")
	public String getMotorAxis() {
		return motorAxis;
	}

	@XmlPath("hkparam[@name=\"motorAxis\"]/text()")
	public void setMotorAxis(String newMotorAxis) {
		this.motorAxis = newMotorAxis;
	}

	@XmlPath("hkparam[@name=\"initializedOffset\"]/text()")
	public String getInitializedOffset() {
		return initializedOffset;
	}

	@XmlPath("hkparam[@name=\"initializedOffset\"]/text()")
	public void setInitializedOffset(String newInitializedOffset) {
		this.initializedOffset = newInitializedOffset;
	}

	@XmlPath("hkparam[@name=\"previousTargetAngleOffset\"]/text()")
	public String getPreviousTargetAngleOffset() {
		return previousTargetAngleOffset;
	}

	@XmlPath("hkparam[@name=\"previousTargetAngleOffset\"]/text()")
	public void setPreviousTargetAngleOffset(String newPreviousTargetAngleOffset) {
		this.previousTargetAngleOffset = newPreviousTargetAngleOffset;
	}

	@XmlPath("hkparam[@name=\"correspondingAngLimitSolverResultOffset\"]/text()")
	public String getCorrespondingAngLimitSolverResultOffset() {
		return correspondingAngLimitSolverResultOffset;
	}

	@XmlPath("hkparam[@name=\"correspondingAngLimitSolverResultOffset\"]/text()")
	public void setCorrespondingAngLimitSolverResultOffset(String newCorrespondingAngLimitSolverResultOffset) {
		this.correspondingAngLimitSolverResultOffset = newCorrespondingAngLimitSolverResultOffset;
	}

	@XmlPath("hkparam[@name=\"targetAngle\"]/text()")
	public String getTargetAngle() {
		return targetAngle;
	}

	@XmlPath("hkparam[@name=\"targetAngle\"]/text()")
	public void setTargetAngle(String newTargetAngle) {
		this.targetAngle = newTargetAngle;
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"motor\"]/text()")
	@ObjectLink
	public hkpPositionConstraintMotor getMotor() {
		return motor;
	}

	public void setMotor(hkpPositionConstraintMotor newMotor) {
		this.motor = newMotor;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getMotor())) {
			getMotor().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getMotor())) {
			getMotor().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getMotor())) {
			theseObjects.add(getMotor());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getMotor() != null) && getMotor().equals(toRemove)) {
			setMotor(null);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "AngMotorInfo";
	}

}
