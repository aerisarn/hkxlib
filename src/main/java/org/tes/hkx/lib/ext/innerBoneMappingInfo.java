
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = { "boneA", "boneB", "AFromBTransform" })
public class innerBoneMappingInfo implements IHkVisitable, IHkInnerObject {

	private String boneA;
	private String boneB;
	private String aFromBTransform;

	public innerBoneMappingInfo() {
		setBoneA(null);
		setBoneB(null);
		setAFromBTransform(null);
	}

	@XmlPath("hkparam[@name=\"boneA\"]/text()")
	public String getBoneA() {
		return boneA;
	}

	@XmlPath("hkparam[@name=\"boneA\"]/text()")
	public void setBoneA(String newBoneA) {
		this.boneA = newBoneA;
	}

	@XmlPath("hkparam[@name=\"boneB\"]/text()")
	public String getBoneB() {
		return boneB;
	}

	@XmlPath("hkparam[@name=\"boneB\"]/text()")
	public void setBoneB(String newBoneB) {
		this.boneB = newBoneB;
	}

	@XmlPath("hkparam[@name=\"aFromBTransform\"]/text()")
	public String getAFromBTransform() {
		return aFromBTransform;
	}

	@XmlPath("hkparam[@name=\"aFromBTransform\"]/text()")
	public void setAFromBTransform(String newAFromBTransform) {
		this.aFromBTransform = newAFromBTransform;
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
		return "BoneMapping ["+getBoneA()+" -> "+getBoneB()+"]";
	}

}
