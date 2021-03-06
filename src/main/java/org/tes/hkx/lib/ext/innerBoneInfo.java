
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "name", "lockTranslation" })
public class innerBoneInfo extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String childname;
	private String lockTranslation;

	public innerBoneInfo() {
		setName("Base01");
		setLockTranslation("true");
	}

	@XmlPath("hkparam[@name=\"name\"]/text()")
	public String getName() {
		return childname;
	}

	@XmlPath("hkparam[@name=\"name\"]/text()")
	public void setName(String newName) {
		this.childname = newName;
	}

	@XmlPath("hkparam[@name=\"lockTranslation\"]/text()")
	public String getLockTranslation() {
		return lockTranslation;
	}

	@XmlPath("hkparam[@name=\"lockTranslation\"]/text()")
	public void setLockTranslation(String newLockTranslation) {
		this.lockTranslation = newLockTranslation;
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
		return "Bone [" + this.getName() + "]";
	}

}
