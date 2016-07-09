
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = { "poseMatchingBone0", "poseMatchingBone1", "poseMatchingBone2", "mode" })
public class innerWorldFromModelModeData implements IHkVisitable, IHkInnerObject {

	private String poseMatchingBone0;
	private String poseMatchingBone1;
	private String poseMatchingBone2;
	private String mode;

	public innerWorldFromModelModeData() {
		setPoseMatchingBone0(null);
		setPoseMatchingBone1(null);
		setPoseMatchingBone2(null);
		setMode(null);
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone0\"]/text()")
	public String getPoseMatchingBone0() {
		return poseMatchingBone0;
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone0\"]/text()")
	public void setPoseMatchingBone0(String newPoseMatchingBone0) {
		this.poseMatchingBone0 = newPoseMatchingBone0;
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone1\"]/text()")
	public String getPoseMatchingBone1() {
		return poseMatchingBone1;
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone1\"]/text()")
	public void setPoseMatchingBone1(String newPoseMatchingBone1) {
		this.poseMatchingBone1 = newPoseMatchingBone1;
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone2\"]/text()")
	public String getPoseMatchingBone2() {
		return poseMatchingBone2;
	}

	@XmlPath("hkparam[@name=\"poseMatchingBone2\"]/text()")
	public void setPoseMatchingBone2(String newPoseMatchingBone2) {
		this.poseMatchingBone2 = newPoseMatchingBone2;
	}

	@XmlPath("hkparam[@name=\"mode\"]/text()")
	public String getMode() {
		return mode;
	}

	@XmlPath("hkparam[@name=\"mode\"]/text()")
	public void setMode(String newMode) {
		this.mode = newMode;
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
		return "WorldFromModelModeData";
	}
}
