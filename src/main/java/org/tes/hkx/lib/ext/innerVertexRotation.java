
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "x", "y", "z" })
public class innerVertexRotation extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String x;
	private String y;
	private String z;

	public innerVertexRotation() {
		setX("(20.973042 -20.973045 -20.973047 20.973045)");
		setY("(-2.110630 -2.110630 -2.110630 -2.110630)");
		setZ("(8.804000 8.804000 0.013194 0.013195)");
	}

	@XmlPath("hkparam[@name=\"x\"]/text()")
	public String getX() {
		return x;
	}

	@XmlPath("hkparam[@name=\"x\"]/text()")
	public void setX(String newX) {
		this.x = newX;
	}

	@XmlPath("hkparam[@name=\"y\"]/text()")
	public String getY() {
		return y;
	}

	@XmlPath("hkparam[@name=\"y\"]/text()")
	public void setY(String newY) {
		this.y = newY;
	}

	@XmlPath("hkparam[@name=\"z\"]/text()")
	public String getZ() {
		return z;
	}

	@XmlPath("hkparam[@name=\"z\"]/text()")
	public void setZ(String newZ) {
		this.z = newZ;
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
		return "VertexRotation";
	}
}
