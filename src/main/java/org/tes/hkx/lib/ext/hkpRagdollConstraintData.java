
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x8fb5dd29")
@XmlType(propOrder = {
    "userData",
    "atoms"
})
public class hkpRagdollConstraintData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private Unnamed54 atoms;

    public hkpRagdollConstraintData() {
        setUserData("0");
        setAtoms(null);
        setClazz("hkpRagdollConstraintData");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlElement(name = "hkparam[@name=\"atoms\"]/hkobject")
    public Unnamed54 getAtoms() {
        return atoms;
    }

    public void setAtoms(Unnamed54 newAtoms) {
        this.atoms = newAtoms;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getAtoms())) {
            getAtoms().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getAtoms())) {
            getAtoms().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getAtoms())) {
            theseObjects.add(getAtoms());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getAtoms()!= null)&&getAtoms().equals(toRemove)) {
            setAtoms(null);
            return true;
        }
        return false;
    }

}
