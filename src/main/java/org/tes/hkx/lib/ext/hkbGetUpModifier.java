
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
@XmlDiscriminatorValue("0x61cb7ac0")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "groundNormal",
    "duration",
    "alignWithGroundDuration",
    "rootBoneIndex",
    "otherBoneIndex",
    "anotherBoneIndex"
})
public class hkbGetUpModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String groundNormal;
    private String duration;
    private String alignWithGroundDuration;
    private String rootBoneIndex;
    private String otherBoneIndex;
    private String anotherBoneIndex;

    public hkbGetUpModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Get Up Modifier");
        setEnable("true");
        setGroundNormal("(0.000000 0.000000 1.000000 0.000000)");
        setDuration("1.000000");
        setAlignWithGroundDuration("0.250000");
        setRootBoneIndex("-1");
        setOtherBoneIndex("-1");
        setAnotherBoneIndex("-1");
        setClazz("hkbGetUpModifier");
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

    @XmlPath("hkparam[@name=\"groundNormal\"]/text()")
    public String getGroundNormal() {
        return groundNormal;
    }

    @XmlPath("hkparam[@name=\"groundNormal\"]/text()")
    public void setGroundNormal(String newGroundNormal) {
        this.groundNormal = newGroundNormal;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public String getDuration() {
        return duration;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public void setDuration(String newDuration) {
        this.duration = newDuration;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundDuration\"]/text()")
    public String getAlignWithGroundDuration() {
        return alignWithGroundDuration;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundDuration\"]/text()")
    public void setAlignWithGroundDuration(String newAlignWithGroundDuration) {
        this.alignWithGroundDuration = newAlignWithGroundDuration;
    }

    @XmlPath("hkparam[@name=\"rootBoneIndex\"]/text()")
    public String getRootBoneIndex() {
        return rootBoneIndex;
    }

    @XmlPath("hkparam[@name=\"rootBoneIndex\"]/text()")
    public void setRootBoneIndex(String newRootBoneIndex) {
        this.rootBoneIndex = newRootBoneIndex;
    }

    @XmlPath("hkparam[@name=\"otherBoneIndex\"]/text()")
    public String getOtherBoneIndex() {
        return otherBoneIndex;
    }

    @XmlPath("hkparam[@name=\"otherBoneIndex\"]/text()")
    public void setOtherBoneIndex(String newOtherBoneIndex) {
        this.otherBoneIndex = newOtherBoneIndex;
    }

    @XmlPath("hkparam[@name=\"anotherBoneIndex\"]/text()")
    public String getAnotherBoneIndex() {
        return anotherBoneIndex;
    }

    @XmlPath("hkparam[@name=\"anotherBoneIndex\"]/text()")
    public void setAnotherBoneIndex(String newAnotherBoneIndex) {
        this.anotherBoneIndex = newAnotherBoneIndex;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
