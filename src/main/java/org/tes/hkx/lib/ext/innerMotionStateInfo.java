
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
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "transform", "sweptTransform", "deltaAngle", "objectRadius", "linearDamping", "angularDamping",
		"timeFactor", "maxLinearVelocity", "maxAngularVelocity", "deactivationClass" })
public class innerMotionStateInfo extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String transform;
	private innerSweptTransform sweptTransform;
	private String deltaAngle;
	private String objectRadius;
	private String linearDamping;
	private String angularDamping;
	private String timeFactor;
	private String maxLinearVelocity;
	private String maxAngularVelocity;
	private String deactivationClass;

	public innerMotionStateInfo() {
		setTransform(null);
		setSweptTransform(null);
		setDeltaAngle(null);
		setObjectRadius(null);
		setLinearDamping(null);
		setAngularDamping(null);
		setTimeFactor(null);
		setMaxLinearVelocity(null);
		setMaxAngularVelocity(null);
		setDeactivationClass(null);
	}

	@XmlPath("hkparam[@name=\"transform\"]/text()")
	public String getTransform() {
		return transform;
	}

	@XmlPath("hkparam[@name=\"transform\"]/text()")
	public void setTransform(String newTransform) {
		this.transform = newTransform;
	}

	@XmlElement(name = "hkparam[@name=\"sweptTransform\"]/hkobject")
	public innerSweptTransform getSweptTransform() {
		return sweptTransform;
	}

	public void setSweptTransform(innerSweptTransform newSweptTransform) {
		this.sweptTransform = newSweptTransform;
	}

	@XmlPath("hkparam[@name=\"deltaAngle\"]/text()")
	public String getDeltaAngle() {
		return deltaAngle;
	}

	@XmlPath("hkparam[@name=\"deltaAngle\"]/text()")
	public void setDeltaAngle(String newDeltaAngle) {
		this.deltaAngle = newDeltaAngle;
	}

	@XmlPath("hkparam[@name=\"objectRadius\"]/text()")
	public String getObjectRadius() {
		return objectRadius;
	}

	@XmlPath("hkparam[@name=\"objectRadius\"]/text()")
	public void setObjectRadius(String newObjectRadius) {
		this.objectRadius = newObjectRadius;
	}

	@XmlPath("hkparam[@name=\"linearDamping\"]/text()")
	public String getLinearDamping() {
		return linearDamping;
	}

	@XmlPath("hkparam[@name=\"linearDamping\"]/text()")
	public void setLinearDamping(String newLinearDamping) {
		this.linearDamping = newLinearDamping;
	}

	@XmlPath("hkparam[@name=\"angularDamping\"]/text()")
	public String getAngularDamping() {
		return angularDamping;
	}

	@XmlPath("hkparam[@name=\"angularDamping\"]/text()")
	public void setAngularDamping(String newAngularDamping) {
		this.angularDamping = newAngularDamping;
	}

	@XmlPath("hkparam[@name=\"timeFactor\"]/text()")
	public String getTimeFactor() {
		return timeFactor;
	}

	@XmlPath("hkparam[@name=\"timeFactor\"]/text()")
	public void setTimeFactor(String newTimeFactor) {
		this.timeFactor = newTimeFactor;
	}

	@XmlPath("hkparam[@name=\"maxLinearVelocity\"]/text()")
	public String getMaxLinearVelocity() {
		return maxLinearVelocity;
	}

	@XmlPath("hkparam[@name=\"maxLinearVelocity\"]/text()")
	public void setMaxLinearVelocity(String newMaxLinearVelocity) {
		this.maxLinearVelocity = newMaxLinearVelocity;
	}

	@XmlPath("hkparam[@name=\"maxAngularVelocity\"]/text()")
	public String getMaxAngularVelocity() {
		return maxAngularVelocity;
	}

	@XmlPath("hkparam[@name=\"maxAngularVelocity\"]/text()")
	public void setMaxAngularVelocity(String newMaxAngularVelocity) {
		this.maxAngularVelocity = newMaxAngularVelocity;
	}

	@XmlPath("hkparam[@name=\"deactivationClass\"]/text()")
	public String getDeactivationClass() {
		return deactivationClass;
	}

	@XmlPath("hkparam[@name=\"deactivationClass\"]/text()")
	public void setDeactivationClass(String newDeactivationClass) {
		this.deactivationClass = newDeactivationClass;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getSweptTransform())) {
			getSweptTransform().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getSweptTransform())) {
			getSweptTransform().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getSweptTransform())) {
			theseObjects.add(getSweptTransform());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getSweptTransform() != null) && getSweptTransform().equals(toRemove)) {
			setSweptTransform(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "MotionStateInfo";
	}
}
