
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "index", "fwdAxisLS", "limitAngleDegrees", "onGain", "offGain", "enabled" })
public class innerLookModifierEyeBonesInfo extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String index;
	private String fwdAxisLS;
	private String limitAngleDegrees;
	private String onGain;
	private String offGain;
	private String enabled;

	public innerLookModifierEyeBonesInfo() {
		setIndex("-1");
		setFwdAxisLS("(0.000000 1.000000 0.000000 0.000000)");
		setLimitAngleDegrees("50.000000");
		setOnGain("0.050000");
		setOffGain("0.050000");
		setEnabled("true");
	}

	@XmlPath("hkparam[@name=\"index\"]/text()")
	public String getIndex() {
		return index;
	}

	@XmlPath("hkparam[@name=\"index\"]/text()")
	public void setIndex(String newIndex) {
		this.index = newIndex;
	}

	@XmlPath("hkparam[@name=\"fwdAxisLS\"]/text()")
	public String getFwdAxisLS() {
		return fwdAxisLS;
	}

	@XmlPath("hkparam[@name=\"fwdAxisLS\"]/text()")
	public void setFwdAxisLS(String newFwdAxisLS) {
		this.fwdAxisLS = newFwdAxisLS;
	}

	@XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
	public String getLimitAngleDegrees() {
		return limitAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
	public void setLimitAngleDegrees(String newLimitAngleDegrees) {
		this.limitAngleDegrees = newLimitAngleDegrees;
	}

	@XmlPath("hkparam[@name=\"onGain\"]/text()")
	public String getOnGain() {
		return onGain;
	}

	@XmlPath("hkparam[@name=\"onGain\"]/text()")
	public void setOnGain(String newOnGain) {
		this.onGain = newOnGain;
	}

	@XmlPath("hkparam[@name=\"offGain\"]/text()")
	public String getOffGain() {
		return offGain;
	}

	@XmlPath("hkparam[@name=\"offGain\"]/text()")
	public void setOffGain(String newOffGain) {
		this.offGain = newOffGain;
	}

	@XmlPath("hkparam[@name=\"enabled\"]/text()")
	public String getEnabled() {
		return enabled;
	}

	@XmlPath("hkparam[@name=\"enabled\"]/text()")
	public void setEnabled(String newEnabled) {
		this.enabled = newEnabled;
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
		return "LookModifierEyeBonesInfo";
	}
}
