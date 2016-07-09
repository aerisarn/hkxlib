
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlDiscriminatorValue("0xaa87d1eb")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "controlData",
    "bones"
})
public class hkbRigidBodyRagdollControlsModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private innerRigidBodyControlData controlData;
    private hkbBoneIndexArray bones;

    public hkbRigidBodyRagdollControlsModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("DriveRagdollRB");
        setEnable("true");
        setControlData(null);
        setBones(null);
        setClazz("hkbRigidBodyRagdollControlsModifier");
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

    @XmlElement(name = "hkparam[@name=\"controlData\"]/hkobject")
    public innerRigidBodyControlData getControlData() {
        return controlData;
    }

    public void setControlData(innerRigidBodyControlData newControlData) {
        this.controlData = newControlData;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"bones\"]/text()")
    @ObjectLink
    public hkbBoneIndexArray getBones() {
        return bones;
    }

    public void setBones(hkbBoneIndexArray newBones) {
        this.bones = newBones;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getControlData())) {
            getControlData().accept(visitor);
        }
        if (!(null == getBones())) {
            getBones().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getControlData())) {
            getControlData().accept(visitor, this);
        }
        if (!(null == getBones())) {
            getBones().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getControlData())) {
            theseObjects.add(getControlData());
        }
        if (!(null == getBones())) {
            theseObjects.add(getBones());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getControlData()!= null)&&getControlData().equals(toRemove)) {
            setControlData(null);
            return true;
        }
        if ((getBones()!= null)&&getBones().equals(toRemove)) {
            setBones(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
