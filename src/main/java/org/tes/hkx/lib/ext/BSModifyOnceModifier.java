
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x1e20a97a")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "POnActivateModifier",
    "POnDeactivateModifier"
})
public class BSModifyOnceModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private HkobjectType pOnActivateModifier;
    private HkobjectType pOnDeactivateModifier;

    public BSModifyOnceModifier() {
        setVariableBindingSet(null);
        setUserData("3");
        setName("SetBlendJump_Standing");
        setEnable("true");
        setPOnActivateModifier(null);
        setPOnDeactivateModifier(null);
        setClazz("BSModifyOnceModifier");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableBindingSet\"]/text()")
    @ObjectLink
    public hkbVariableBindingSet getVariableBindingSet() {
        return variableBindingSet;
    }

    public void setVariableBindingSet(hkbVariableBindingSet newVariableBindingSet) {
        this.variableBindingSet = newVariableBindingSet;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public String getEnable() {
        return enable;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public void setEnable(String newEnable) {
        this.enable = newEnable;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pOnActivateModifier\"]/text()")
    @ObjectLink
    public HkobjectType getPOnActivateModifier() {
        return pOnActivateModifier;
    }

    public void setPOnActivateModifier(HkobjectType newPOnActivateModifier) {
        this.pOnActivateModifier = newPOnActivateModifier;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pOnDeactivateModifier\"]/text()")
    @ObjectLink
    public HkobjectType getPOnDeactivateModifier() {
        return pOnDeactivateModifier;
    }

    public void setPOnDeactivateModifier(HkobjectType newPOnDeactivateModifier) {
        this.pOnDeactivateModifier = newPOnDeactivateModifier;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPOnActivateModifier())) {
            getPOnActivateModifier().accept(visitor);
        }
        if (!(null == getPOnDeactivateModifier())) {
            getPOnDeactivateModifier().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPOnActivateModifier())) {
            getPOnActivateModifier().accept(visitor, this);
        }
        if (!(null == getPOnDeactivateModifier())) {
            getPOnDeactivateModifier().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPOnActivateModifier())) {
            theseObjects.add(getPOnActivateModifier());
        }
        if (!(null == getPOnDeactivateModifier())) {
            theseObjects.add(getPOnDeactivateModifier());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPOnActivateModifier()!= null)&&getPOnActivateModifier().equals(toRemove)) {
            setPOnActivateModifier(null);
            return true;
        }
        if ((getPOnDeactivateModifier()!= null)&&getPOnDeactivateModifier().equals(toRemove)) {
            setPOnDeactivateModifier(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
