
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "kneeAxisLS", "footEndLS", "footPlantedAnkleHeightMS", "footRaisedAnkleHeightMS",
		"maxAnkleHeightMS", "minAnkleHeightMS", "maxKneeAngleDegrees", "minKneeAngleDegrees", "maxAnkleAngleDegrees",
		"hipIndex", "kneeIndex", "ankleIndex" })
public class innerLegInfo extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String kneeAxisLS;
	private String footEndLS;
	private String footPlantedAnkleHeightMS;
	private String footRaisedAnkleHeightMS;
	private String maxAnkleHeightMS;
	private String minAnkleHeightMS;
	private String maxKneeAngleDegrees;
	private String minKneeAngleDegrees;
	private String maxAnkleAngleDegrees;
	private String hipIndex;
	private String kneeIndex;
	private String ankleIndex;

	public innerLegInfo() {
		setKneeAxisLS("(-1.000000 0.000000 0.000000 0.000000)");
		setFootEndLS("(0.000000 0.000000 0.000000 0.000000)");
		setFootPlantedAnkleHeightMS("0.000000");
		setFootRaisedAnkleHeightMS("16.000000");
		setMaxAnkleHeightMS("40.000000");
		setMinAnkleHeightMS("-48.000000");
		setMaxKneeAngleDegrees("180.000000");
		setMinKneeAngleDegrees("0.000000");
		setMaxAnkleAngleDegrees("45.000000");
		setHipIndex("-1");
		setKneeIndex("-1");
		setAnkleIndex("-1");
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
		return "LegInfo";
	}
}
