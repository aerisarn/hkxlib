
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = { "shape", "collisionFilterInfo" })
public class innerFilteredCapsuleShapeInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private hkpCapsuleShape shape;
	private String collisionFilterInfo;

	public innerFilteredCapsuleShapeInfo() {
		setShape(null);
		setCollisionFilterInfo("0");
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"shape\"]/text()")
	@ObjectLink
	public hkpCapsuleShape getShape() {
		return shape;
	}

	public void setShape(hkpCapsuleShape newShape) {
		this.shape = newShape;
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
		if (!(null == getShape())) {
			getShape().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getShape())) {
			getShape().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getShape())) {
			theseObjects.add(getShape());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getShape() != null) && getShape().equals(toRemove)) {
			setShape(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "FilteredCapsuleShapeInfo";
	}
}
