
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "type", "objectQualityType", "collisionFilterInfo" })
public class innerBroadPhaseHandler extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String type;
	private String objectQualityType;
	private String collisionFilterInfo;

	public innerBroadPhaseHandler() {
		setType(null);
		setObjectQualityType(null);
		setCollisionFilterInfo(null);
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public String getType() {
		return type;
	}

	@XmlPath("hkparam[@name=\"type\"]/text()")
	public void setType(String newType) {
		this.type = newType;
	}

	@XmlPath("hkparam[@name=\"objectQualityType\"]/text()")
	public String getObjectQualityType() {
		return objectQualityType;
	}

	@XmlPath("hkparam[@name=\"objectQualityType\"]/text()")
	public void setObjectQualityType(String newObjectQualityType) {
		this.objectQualityType = newObjectQualityType;
	}

	@XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
	public String getCollisionFilterInfo() {
		return collisionFilterInfo;
	}

	@XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
	public void setCollisionFilterInfo(String newCollisionFilterInfo) {
		this.collisionFilterInfo = newCollisionFilterInfo;
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
		return "BroadPhaseHandler";
	}

}
