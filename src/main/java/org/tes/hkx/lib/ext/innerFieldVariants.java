
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "name", "className", "variant" })
public class innerFieldVariants extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String childname;
	private String className;
	private HkobjectType variant;

	public innerFieldVariants() {
		setName("Merged Animation Container");
		setClassName("hkaAnimationContainer");
		setVariant(null);
	}

	@XmlPath("hkparam[@name=\"name\"]/text()")
	public String getName() {
		return childname;
	}

	@XmlPath("hkparam[@name=\"name\"]/text()")
	public void setName(String newName) {
		this.childname = newName;
	}

	@XmlPath("hkparam[@name=\"className\"]/text()")
	public String getClassName() {
		return className;
	}

	@XmlPath("hkparam[@name=\"className\"]/text()")
	public void setClassName(String newClassName) {
		this.className = newClassName;
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"variant\"]/text()")
	@ObjectLink
	public HkobjectType getVariant() {
		return variant;
	}

	public void setVariant(HkobjectType newVariant) {
		this.variant = newVariant;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getVariant())) {
			getVariant().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getVariant())) {
			getVariant().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getVariant())) {
			theseObjects.add(getVariant());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getVariant() != null) && getVariant().equals(toRemove)) {
			setVariant(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
