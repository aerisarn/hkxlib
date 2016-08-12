
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "type", "solvingMethod", "bodiesToNotify", "velocityStabilizationFactor", "maxImpulse",
		"inertiaStabilizationFactor" })
public class innerBallSocketJoint extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String type;
	private String solvingMethod;
	private String bodiesToNotify;
	private String velocityStabilizationFactor;
	private String maxImpulse;
	private String inertiaStabilizationFactor;

	public innerBallSocketJoint() {
		setType(null);
		setSolvingMethod(null);
		setBodiesToNotify(null);
		setVelocityStabilizationFactor(null);
		setMaxImpulse(null);
		setInertiaStabilizationFactor(null);
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public String getType() {
		return type;
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public void setType(String newType) {
		this.type = newType;
	}

	@XmlPath("hkparam[@name=\"solvingMethod\"]/text()")
	public String getSolvingMethod() {
		return solvingMethod;
	}

	@XmlPath("hkparam[@name=\"solvingMethod\"]/text()")
	public void setSolvingMethod(String newSolvingMethod) {
		this.solvingMethod = newSolvingMethod;
	}

	@XmlPath("hkparam[@name=\"bodiesToNotify\"]/text()")
	public String getBodiesToNotify() {
		return bodiesToNotify;
	}

	@XmlPath("hkparam[@name=\"bodiesToNotify\"]/text()")
	public void setBodiesToNotify(String newBodiesToNotify) {
		this.bodiesToNotify = newBodiesToNotify;
	}

	@XmlPath("hkparam[@name=\"velocityStabilizationFactor\"]/text()")
	public String getVelocityStabilizationFactor() {
		return velocityStabilizationFactor;
	}

	@XmlPath("hkparam[@name=\"velocityStabilizationFactor\"]/text()")
	public void setVelocityStabilizationFactor(String newVelocityStabilizationFactor) {
		this.velocityStabilizationFactor = newVelocityStabilizationFactor;
	}

	@XmlPath("hkparam[@name=\"maxImpulse\"]/text()")
	public String getMaxImpulse() {
		return maxImpulse;
	}

	@XmlPath("hkparam[@name=\"maxImpulse\"]/text()")
	public void setMaxImpulse(String newMaxImpulse) {
		this.maxImpulse = newMaxImpulse;
	}

	@XmlPath("hkparam[@name=\"inertiaStabilizationFactor\"]/text()")
	public String getInertiaStabilizationFactor() {
		return inertiaStabilizationFactor;
	}

	@XmlPath("hkparam[@name=\"inertiaStabilizationFactor\"]/text()")
	public void setInertiaStabilizationFactor(String newInertiaStabilizationFactor) {
		this.inertiaStabilizationFactor = newInertiaStabilizationFactor;
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
		return "ballSocketJoint";
	}

}
