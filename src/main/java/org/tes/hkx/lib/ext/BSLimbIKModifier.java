
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
@XmlDiscriminatorValue("0x8ea971e5")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "limitAngleDegrees",
    "startBoneIndex",
    "endBoneIndex",
    "gain",
    "boneRadius",
    "castOffset"
})
public class BSLimbIKModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String limitAngleDegrees;
    private String startBoneIndex;
    private String endBoneIndex;
    private String gain;
    private String boneRadius;
    private String castOffset;

    public BSLimbIKModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("BSLimbIKModifier_Tail");
        setEnable("true");
        setLimitAngleDegrees("90.000000");
        setStartBoneIndex("-1");
        setEndBoneIndex("-1");
        setGain("0.010000");
        setBoneRadius("0.750000");
        setCastOffset("12.000000");
        setClazz("BSLimbIKModifier");
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

    @XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
    public String getLimitAngleDegrees() {
        return limitAngleDegrees;
    }

    @XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
    public void setLimitAngleDegrees(String newLimitAngleDegrees) {
        this.limitAngleDegrees = newLimitAngleDegrees;
    }

    @XmlPath("hkparam[@name=\"startBoneIndex\"]/text()")
    public String getStartBoneIndex() {
        return startBoneIndex;
    }

    @XmlPath("hkparam[@name=\"startBoneIndex\"]/text()")
    public void setStartBoneIndex(String newStartBoneIndex) {
        this.startBoneIndex = newStartBoneIndex;
    }

    @XmlPath("hkparam[@name=\"endBoneIndex\"]/text()")
    public String getEndBoneIndex() {
        return endBoneIndex;
    }

    @XmlPath("hkparam[@name=\"endBoneIndex\"]/text()")
    public void setEndBoneIndex(String newEndBoneIndex) {
        this.endBoneIndex = newEndBoneIndex;
    }

    @XmlPath("hkparam[@name=\"gain\"]/text()")
    public String getGain() {
        return gain;
    }

    @XmlPath("hkparam[@name=\"gain\"]/text()")
    public void setGain(String newGain) {
        this.gain = newGain;
    }

    @XmlPath("hkparam[@name=\"boneRadius\"]/text()")
    public String getBoneRadius() {
        return boneRadius;
    }

    @XmlPath("hkparam[@name=\"boneRadius\"]/text()")
    public void setBoneRadius(String newBoneRadius) {
        this.boneRadius = newBoneRadius;
    }

    @XmlPath("hkparam[@name=\"castOffset\"]/text()")
    public String getCastOffset() {
        return castOffset;
    }

    @XmlPath("hkparam[@name=\"castOffset\"]/text()")
    public void setCastOffset(String newCastOffset) {
        this.castOffset = newCastOffset;
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
