
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

@XmlType(propOrder = { "type", "isEnabled", "initializedOffset", "previousTargetAnglesOffset", "target_bRca",
		"motors" })
public class innerRagdollMotorInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String type;
	private String isEnabled;
	private String initializedOffset;
	private String previousTargetAnglesOffset;
	private String target_bRca;
	private hkpPositionConstraintMotor motors;

	public innerRagdollMotorInfo() {
		setType(null);
		setIsEnabled(null);
		setInitializedOffset(null);
		setPreviousTargetAnglesOffset(null);
		setTarget_bRca(null);
		setMotors(null);
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

	@XmlPath("hkparam[@name=\"initializedOffset\"]/text()")
	public String getInitializedOffset() {
		return initializedOffset;
	}

	@XmlPath("hkparam[@name=\"initializedOffset\"]/text()")
	public void setInitializedOffset(String newInitializedOffset) {
		this.initializedOffset = newInitializedOffset;
	}

	@XmlPath("hkparam[@name=\"previousTargetAnglesOffset\"]/text()")
	public String getPreviousTargetAnglesOffset() {
		return previousTargetAnglesOffset;
	}

	@XmlPath("hkparam[@name=\"previousTargetAnglesOffset\"]/text()")
	public void setPreviousTargetAnglesOffset(String newPreviousTargetAnglesOffset) {
		this.previousTargetAnglesOffset = newPreviousTargetAnglesOffset;
	}

	@XmlPath("hkparam[@name=\"target_bRca\"]/text()")
	public String getTarget_bRca() {
		return target_bRca;
	}

	@XmlPath("hkparam[@name=\"target_bRca\"]/text()")
	public void setTarget_bRca(String newTarget_bRca) {
		this.target_bRca = newTarget_bRca;
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"motors\"]/text()")
	@ObjectLink
	public hkpPositionConstraintMotor getMotors() {
		return motors;
	}

	public void setMotors(hkpPositionConstraintMotor newMotors) {
		this.motors = newMotors;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getMotors())) {
			getMotors().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getMotors())) {
			getMotors().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getMotors())) {
			theseObjects.add(getMotors());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getMotors() != null) && getMotors().equals(toRemove)) {
			setMotors(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "RagdollMotorInfo";
	}
}
