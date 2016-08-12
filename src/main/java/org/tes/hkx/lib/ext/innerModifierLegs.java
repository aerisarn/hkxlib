
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

@XmlType(propOrder = { "originalAnkleTransformMS", "kneeAxisLS", "footEndLS", "ungroundedEvent",
		"footPlantedAnkleHeightMS", "footRaisedAnkleHeightMS", "maxAnkleHeightMS", "minAnkleHeightMS",
		"maxKneeAngleDegrees", "minKneeAngleDegrees", "verticalError", "maxAnkleAngleDegrees", "hipIndex", "kneeIndex",
		"ankleIndex", "hitSomething", "isPlantedMS", "isOriginalAnkleTransformMSSet" })
public class innerModifierLegs extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String originalAnkleTransformMS;
	private String kneeAxisLS;
	private String footEndLS;
	private innerEvent ungroundedEvent;
	private String footPlantedAnkleHeightMS;
	private String footRaisedAnkleHeightMS;
	private String maxAnkleHeightMS;
	private String minAnkleHeightMS;
	private String maxKneeAngleDegrees;
	private String minKneeAngleDegrees;
	private String verticalError;
	private String maxAnkleAngleDegrees;
	private String hipIndex;
	private String kneeIndex;
	private String ankleIndex;
	private String hitSomething;
	private String isPlantedMS;
	private String isOriginalAnkleTransformMSSet;

	public innerModifierLegs() {
		setOriginalAnkleTransformMS(
				"(0.000000 0.000000 0.000000)(0.000000 0.000000 0.000000 1.000000)(1.000000 1.000000 1.000000)");
		setKneeAxisLS("(0.000000 0.000000 1.000000 0.000000)");
		setFootEndLS("(0.000000 0.000000 0.000000 0.000000)");
		setUngroundedEvent(null);
		setFootPlantedAnkleHeightMS("0.000000");
		setFootRaisedAnkleHeightMS("0.500000");
		setMaxAnkleHeightMS("0.700000");
		setMinAnkleHeightMS("-0.100000");
		setMaxKneeAngleDegrees("180.000000");
		setMinKneeAngleDegrees("0.000000");
		setVerticalError("0.000000");
		setMaxAnkleAngleDegrees("45.000000");
		setHipIndex("-1");
		setKneeIndex("-1");
		setAnkleIndex("-1");
		setHitSomething("false");
		setIsPlantedMS("false");
		setIsOriginalAnkleTransformMSSet("false");
	}

	@XmlPath("hkparam[@name=\"originalAnkleTransformMS\"]/text()")
	public String getOriginalAnkleTransformMS() {
		return originalAnkleTransformMS;
	}

	@XmlPath("hkparam[@name=\"originalAnkleTransformMS\"]/text()")
	public void setOriginalAnkleTransformMS(String newOriginalAnkleTransformMS) {
		this.originalAnkleTransformMS = newOriginalAnkleTransformMS;
	}

	@XmlPath("hkparam[@name=\"kneeAxisLS\"]/text()")
	public String getKneeAxisLS() {
		return kneeAxisLS;
	}

	@XmlPath("hkparam[@name=\"kneeAxisLS\"]/text()")
	public void setKneeAxisLS(String newKneeAxisLS) {
		this.kneeAxisLS = newKneeAxisLS;
	}

	@XmlPath("hkparam[@name=\"footEndLS\"]/text()")
	public String getFootEndLS() {
		return footEndLS;
	}

	@XmlPath("hkparam[@name=\"footEndLS\"]/text()")
	public void setFootEndLS(String newFootEndLS) {
		this.footEndLS = newFootEndLS;
	}

	@XmlElement(name = "hkparam[@name=\"ungroundedEvent\"]/hkobject")
	public innerEvent getUngroundedEvent() {
		return ungroundedEvent;
	}

	public void setUngroundedEvent(innerEvent newUngroundedEvent) {
		this.ungroundedEvent = newUngroundedEvent;
	}

	@XmlPath("hkparam[@name=\"footPlantedAnkleHeightMS\"]/text()")
	public String getFootPlantedAnkleHeightMS() {
		return footPlantedAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"footPlantedAnkleHeightMS\"]/text()")
	public void setFootPlantedAnkleHeightMS(String newFootPlantedAnkleHeightMS) {
		this.footPlantedAnkleHeightMS = newFootPlantedAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"footRaisedAnkleHeightMS\"]/text()")
	public String getFootRaisedAnkleHeightMS() {
		return footRaisedAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"footRaisedAnkleHeightMS\"]/text()")
	public void setFootRaisedAnkleHeightMS(String newFootRaisedAnkleHeightMS) {
		this.footRaisedAnkleHeightMS = newFootRaisedAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"maxAnkleHeightMS\"]/text()")
	public String getMaxAnkleHeightMS() {
		return maxAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"maxAnkleHeightMS\"]/text()")
	public void setMaxAnkleHeightMS(String newMaxAnkleHeightMS) {
		this.maxAnkleHeightMS = newMaxAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"minAnkleHeightMS\"]/text()")
	public String getMinAnkleHeightMS() {
		return minAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"minAnkleHeightMS\"]/text()")
	public void setMinAnkleHeightMS(String newMinAnkleHeightMS) {
		this.minAnkleHeightMS = newMinAnkleHeightMS;
	}

	@XmlPath("hkparam[@name=\"maxKneeAngleDegrees\"]/text()")
	public String getMaxKneeAngleDegrees() {
		return maxKneeAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"maxKneeAngleDegrees\"]/text()")
	public void setMaxKneeAngleDegrees(String newMaxKneeAngleDegrees) {
		this.maxKneeAngleDegrees = newMaxKneeAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"minKneeAngleDegrees\"]/text()")
	public String getMinKneeAngleDegrees() {
		return minKneeAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"minKneeAngleDegrees\"]/text()")
	public void setMinKneeAngleDegrees(String newMinKneeAngleDegrees) {
		this.minKneeAngleDegrees = newMinKneeAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"verticalError\"]/text()")
	public String getVerticalError() {
		return verticalError;
	}

	@XmlPath("hkparam[@name=\"verticalError\"]/text()")
	public void setVerticalError(String newVerticalError) {
		this.verticalError = newVerticalError;
	}

	@XmlPath("hkparam[@name=\"maxAnkleAngleDegrees\"]/text()")
	public String getMaxAnkleAngleDegrees() {
		return maxAnkleAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"maxAnkleAngleDegrees\"]/text()")
	public void setMaxAnkleAngleDegrees(String newMaxAnkleAngleDegrees) {
		this.maxAnkleAngleDegrees = newMaxAnkleAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"hipIndex\"]/text()")
	public String getHipIndex() {
		return hipIndex;
	}

	@XmlPath("hkparam[@name=\"hipIndex\"]/text()")
	public void setHipIndex(String newHipIndex) {
		this.hipIndex = newHipIndex;
	}

	@XmlPath("hkparam[@name=\"kneeIndex\"]/text()")
	public String getKneeIndex() {
		return kneeIndex;
	}

	@XmlPath("hkparam[@name=\"kneeIndex\"]/text()")
	public void setKneeIndex(String newKneeIndex) {
		this.kneeIndex = newKneeIndex;
	}

	@XmlPath("hkparam[@name=\"ankleIndex\"]/text()")
	public String getAnkleIndex() {
		return ankleIndex;
	}

	@XmlPath("hkparam[@name=\"ankleIndex\"]/text()")
	public void setAnkleIndex(String newAnkleIndex) {
		this.ankleIndex = newAnkleIndex;
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

	@XmlPath("hkparam[@name=\"isOriginalAnkleTransformMSSet\"]/text()")
	public String getIsOriginalAnkleTransformMSSet() {
		return isOriginalAnkleTransformMSSet;
	}

	@XmlPath("hkparam[@name=\"isOriginalAnkleTransformMSSet\"]/text()")
	public void setIsOriginalAnkleTransformMSSet(String newIsOriginalAnkleTransformMSSet) {
		this.isOriginalAnkleTransformMSSet = newIsOriginalAnkleTransformMSSet;
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
		return "ModifierLegs";
	}
}
