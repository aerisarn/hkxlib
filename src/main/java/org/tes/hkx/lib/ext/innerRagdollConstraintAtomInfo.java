
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

@XmlType(propOrder = { "transforms", "setupStabilization", "ragdollMotors", "angFriction", "twistLimit", "coneLimit",
		"planesLimit", "ballSocket" })
public class innerRagdollConstraintAtomInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private innerRagdollConstraintTransform transforms;
	private innerRagdollStabilizationInfo setupStabilization;
	private innerRagdollMotorInfo ragdollMotors;
	private innerAngFrictionInfo angFriction;
	private innerTwistLimit twistLimit;
	private innerConeLimit coneLimit;
	private innerPlanesLimit planesLimit;
	private innerBallSocketJoint ballSocket;

	public innerRagdollConstraintAtomInfo() {
		setTransforms(null);
		setSetupStabilization(null);
		setRagdollMotors(null);
		setAngFriction(null);
		setTwistLimit(null);
		setConeLimit(null);
		setPlanesLimit(null);
		setBallSocket(null);
	}

	@XmlElement(name = "hkparam[@name=\"transforms\"]/hkobject")
	public innerRagdollConstraintTransform getTransforms() {
		return transforms;
	}

	public void setTransforms(innerRagdollConstraintTransform newTransforms) {
		this.transforms = newTransforms;
	}

	@XmlElement(name = "hkparam[@name=\"setupStabilization\"]/hkobject")
	public innerRagdollStabilizationInfo getSetupStabilization() {
		return setupStabilization;
	}

	public void setSetupStabilization(innerRagdollStabilizationInfo newSetupStabilization) {
		this.setupStabilization = newSetupStabilization;
	}

	@XmlElement(name = "hkparam[@name=\"ragdollMotors\"]/hkobject")
	public innerRagdollMotorInfo getRagdollMotors() {
		return ragdollMotors;
	}

	public void setRagdollMotors(innerRagdollMotorInfo newRagdollMotors) {
		this.ragdollMotors = newRagdollMotors;
	}

	@XmlElement(name = "hkparam[@name=\"angFriction\"]/hkobject")
	public innerAngFrictionInfo getAngFriction() {
		return angFriction;
	}

	public void setAngFriction(innerAngFrictionInfo newAngFriction) {
		this.angFriction = newAngFriction;
	}

	@XmlElement(name = "hkparam[@name=\"twistLimit\"]/hkobject")
	public innerTwistLimit getTwistLimit() {
		return twistLimit;
	}

	public void setTwistLimit(innerTwistLimit newTwistLimit) {
		this.twistLimit = newTwistLimit;
	}

	@XmlElement(name = "hkparam[@name=\"coneLimit\"]/hkobject")
	public innerConeLimit getConeLimit() {
		return coneLimit;
	}

	public void setConeLimit(innerConeLimit newConeLimit) {
		this.coneLimit = newConeLimit;
	}

	@XmlElement(name = "hkparam[@name=\"planesLimit\"]/hkobject")
	public innerPlanesLimit getPlanesLimit() {
		return planesLimit;
	}

	public void setPlanesLimit(innerPlanesLimit newPlanesLimit) {
		this.planesLimit = newPlanesLimit;
	}

	@XmlElement(name = "hkparam[@name=\"ballSocket\"]/hkobject")
	public innerBallSocketJoint getBallSocket() {
		return ballSocket;
	}

	public void setBallSocket(innerBallSocketJoint newBallSocket) {
		this.ballSocket = newBallSocket;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getTransforms())) {
			getTransforms().accept(visitor);
		}
		if (!(null == getSetupStabilization())) {
			getSetupStabilization().accept(visitor);
		}
		if (!(null == getRagdollMotors())) {
			getRagdollMotors().accept(visitor);
		}
		if (!(null == getAngFriction())) {
			getAngFriction().accept(visitor);
		}
		if (!(null == getTwistLimit())) {
			getTwistLimit().accept(visitor);
		}
		if (!(null == getConeLimit())) {
			getConeLimit().accept(visitor);
		}
		if (!(null == getPlanesLimit())) {
			getPlanesLimit().accept(visitor);
		}
		if (!(null == getBallSocket())) {
			getBallSocket().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getTransforms())) {
			getTransforms().accept(visitor, this);
		}
		if (!(null == getSetupStabilization())) {
			getSetupStabilization().accept(visitor, this);
		}
		if (!(null == getRagdollMotors())) {
			getRagdollMotors().accept(visitor, this);
		}
		if (!(null == getAngFriction())) {
			getAngFriction().accept(visitor, this);
		}
		if (!(null == getTwistLimit())) {
			getTwistLimit().accept(visitor, this);
		}
		if (!(null == getConeLimit())) {
			getConeLimit().accept(visitor, this);
		}
		if (!(null == getPlanesLimit())) {
			getPlanesLimit().accept(visitor, this);
		}
		if (!(null == getBallSocket())) {
			getBallSocket().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getTransforms())) {
			theseObjects.add(getTransforms());
		}
		if (!(null == getSetupStabilization())) {
			theseObjects.add(getSetupStabilization());
		}
		if (!(null == getRagdollMotors())) {
			theseObjects.add(getRagdollMotors());
		}
		if (!(null == getAngFriction())) {
			theseObjects.add(getAngFriction());
		}
		if (!(null == getTwistLimit())) {
			theseObjects.add(getTwistLimit());
		}
		if (!(null == getConeLimit())) {
			theseObjects.add(getConeLimit());
		}
		if (!(null == getPlanesLimit())) {
			theseObjects.add(getPlanesLimit());
		}
		if (!(null == getBallSocket())) {
			theseObjects.add(getBallSocket());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getTransforms() != null) && getTransforms().equals(toRemove)) {
			setTransforms(null);
			return true;
		}
		if ((getSetupStabilization() != null) && getSetupStabilization().equals(toRemove)) {
			setSetupStabilization(null);
			return true;
		}
		if ((getRagdollMotors() != null) && getRagdollMotors().equals(toRemove)) {
			setRagdollMotors(null);
			return true;
		}
		if ((getAngFriction() != null) && getAngFriction().equals(toRemove)) {
			setAngFriction(null);
			return true;
		}
		if ((getTwistLimit() != null) && getTwistLimit().equals(toRemove)) {
			setTwistLimit(null);
			return true;
		}
		if ((getConeLimit() != null) && getConeLimit().equals(toRemove)) {
			setConeLimit(null);
			return true;
		}
		if ((getPlanesLimit() != null) && getPlanesLimit().equals(toRemove)) {
			setPlanesLimit(null);
			return true;
		}
		if ((getBallSocket() != null) && getBallSocket().equals(toRemove)) {
			setBallSocket(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "RagdollConstraintAtomInfo";
	}
}
