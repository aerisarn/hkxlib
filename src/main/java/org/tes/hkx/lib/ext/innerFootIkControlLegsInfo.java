
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

@XmlType(propOrder = { "groundPosition", "ungroundedEvent", "verticalError", "hitSomething", "isPlantedMS" })
public class innerFootIkControlLegsInfo extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String groundPosition;
	private innerEvent ungroundedEvent;
	private String verticalError;
	private String hitSomething;
	private String isPlantedMS;

	public innerFootIkControlLegsInfo() {
		setGroundPosition("(0.000000 0.000000 0.000000 0.000000)");
		setUngroundedEvent(null);
		setVerticalError("0.000000");
		setHitSomething("false");
		setIsPlantedMS("false");
	}

	@XmlPath("hkparam[@name=\"groundPosition\"]/text()")
	public String getGroundPosition() {
		return groundPosition;
	}

	@XmlPath("hkparam[@name=\"groundPosition\"]/text()")
	public void setGroundPosition(String newGroundPosition) {
		this.groundPosition = newGroundPosition;
	}

	@XmlElement(name = "hkparam[@name=\"ungroundedEvent\"]/hkobject")
	public innerEvent getUngroundedEvent() {
		return ungroundedEvent;
	}

	public void setUngroundedEvent(innerEvent newUngroundedEvent) {
		this.ungroundedEvent = newUngroundedEvent;
	}

	@XmlPath("hkparam[@name=\"verticalError\"]/text()")
	public String getVerticalError() {
		return verticalError;
	}

	@XmlPath("hkparam[@name=\"verticalError\"]/text()")
	public void setVerticalError(String newVerticalError) {
		this.verticalError = newVerticalError;
	}

	@XmlPath("hkparam[@name=\"hitSomething\"]/text()")
	public String getHitSomething() {
		return hitSomething;
	}

	@XmlPath("hkparam[@name=\"hitSomething\"]/text()")
	public void setHitSomething(String newHitSomething) {
		this.hitSomething = newHitSomething;
	}

	@XmlPath("hkparam[@name=\"isPlantedMS\"]/text()")
	public String getIsPlantedMS() {
		return isPlantedMS;
	}

	@XmlPath("hkparam[@name=\"isPlantedMS\"]/text()")
	public void setIsPlantedMS(String newIsPlantedMS) {
		this.isPlantedMS = newIsPlantedMS;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getUngroundedEvent())) {
			getUngroundedEvent().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getUngroundedEvent())) {
			getUngroundedEvent().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getUngroundedEvent())) {
			theseObjects.add(getUngroundedEvent());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getUngroundedEvent() != null) && getUngroundedEvent().equals(toRemove)) {
			setUngroundedEvent(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "FootIkControlLegsInfo";
	}
}
