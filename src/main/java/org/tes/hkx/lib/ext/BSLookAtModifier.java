
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
@XmlDiscriminatorValue("0xd756fc25")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "lookAtTarget",
    "bones",
    "eyeBones",
    "limitAngleDegrees",
    "limitAngleThresholdDegrees",
    "continueLookOutsideOfLimit",
    "onGain",
    "offGain",
    "useBoneGains",
    "targetLocation",
    "targetOutsideLimits",
    "targetOutOfLimitEvent",
    "lookAtCamera",
    "lookAtCameraX",
    "lookAtCameraY",
    "lookAtCameraZ"
})
public class BSLookAtModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String lookAtTarget;
    @XmlElement(name = "hkparam[@name=\"bones\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed78> bones;
    @XmlPath("hkparam[@name=\"bones\"]/@numelements")
    private Integer numbones;
    @XmlElement(name = "hkparam[@name=\"eyeBones\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed79> eyeBones;
    @XmlPath("hkparam[@name=\"eyeBones\"]/@numelements")
    private Integer numeyeBones;
    private String limitAngleDegrees;
    private String limitAngleThresholdDegrees;
    private String continueLookOutsideOfLimit;
    private String onGain;
    private String offGain;
    private String useBoneGains;
    private String targetLocation;
    private String targetOutsideLimits;
    private Unnamed80 targetOutOfLimitEvent;
    private String lookAtCamera;
    private String lookAtCameraX;
    private String lookAtCameraY;
    private String lookAtCameraZ;

    public BSLookAtModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("BSLookAtModifier");
        setEnable("true");
        setLookAtTarget("true");
        bones = new ArrayList<org.tes.hkx.lib.ext.Unnamed78>();
        numbones = 0;
        eyeBones = new ArrayList<org.tes.hkx.lib.ext.Unnamed79>();
        numeyeBones = 0;
        setLimitAngleDegrees("65.000000");
        setLimitAngleThresholdDegrees("0.000000");
        setContinueLookOutsideOfLimit("-1");
        setOnGain("0.050000");
        setOffGain("0.050000");
        setUseBoneGains("false");
        setTargetLocation("(0.000000 0.000000 0.000000 0.000000)");
        setTargetOutsideLimits("-1");
        setTargetOutOfLimitEvent(null);
        setLookAtCamera("false");
        setLookAtCameraX("0.000000");
        setLookAtCameraY("0.000000");
        setLookAtCameraZ("0.000000");
        setClazz("BSLookAtModifier");
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

    @XmlPath("hkparam[@name=\"lookAtTarget\"]/text()")
    public String getLookAtTarget() {
        return lookAtTarget;
    }

    @XmlPath("hkparam[@name=\"lookAtTarget\"]/text()")
    public void setLookAtTarget(String newLookAtTarget) {
        this.lookAtTarget = newLookAtTarget;
    }

    public Integer getNumBones() {
        return numbones;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed78> getBones() {
        return bones;
    }

    public org.tes.hkx.lib.ext.Unnamed78 getBonesAt(int index) {
        return bones.get(index);
    }

    public boolean addToBones(org.tes.hkx.lib.ext.Unnamed78 newBones) {
        if (bones.add(newBones)) {
            numbones += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromBones(org.tes.hkx.lib.ext.Unnamed78 bonesToRemove) {
        if (bones.remove(bonesToRemove)) {
            numbones += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed78 removeFromBonesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed78 toRemove;
        toRemove = bones.remove(index);
        if (!(null == toRemove)) {
            numbones += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumEyeBones() {
        return numeyeBones;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed79> getEyeBones() {
        return eyeBones;
    }

    public org.tes.hkx.lib.ext.Unnamed79 getEyeBonesAt(int index) {
        return eyeBones.get(index);
    }

    public boolean addToEyeBones(org.tes.hkx.lib.ext.Unnamed79 newEyeBones) {
        if (eyeBones.add(newEyeBones)) {
            numeyeBones += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromEyeBones(org.tes.hkx.lib.ext.Unnamed79 eyeBonesToRemove) {
        if (eyeBones.remove(eyeBonesToRemove)) {
            numeyeBones += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed79 removeFromEyeBonesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed79 toRemove;
        toRemove = eyeBones.remove(index);
        if (!(null == toRemove)) {
            numeyeBones += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
    public String getLimitAngleDegrees() {
        return limitAngleDegrees;
    }

    @XmlPath("hkparam[@name=\"limitAngleDegrees\"]/text()")
    public void setLimitAngleDegrees(String newLimitAngleDegrees) {
        this.limitAngleDegrees = newLimitAngleDegrees;
    }

    @XmlPath("hkparam[@name=\"limitAngleThresholdDegrees\"]/text()")
    public String getLimitAngleThresholdDegrees() {
        return limitAngleThresholdDegrees;
    }

    @XmlPath("hkparam[@name=\"limitAngleThresholdDegrees\"]/text()")
    public void setLimitAngleThresholdDegrees(String newLimitAngleThresholdDegrees) {
        this.limitAngleThresholdDegrees = newLimitAngleThresholdDegrees;
    }

    @XmlPath("hkparam[@name=\"continueLookOutsideOfLimit\"]/text()")
    public String getContinueLookOutsideOfLimit() {
        return continueLookOutsideOfLimit;
    }

    @XmlPath("hkparam[@name=\"continueLookOutsideOfLimit\"]/text()")
    public void setContinueLookOutsideOfLimit(String newContinueLookOutsideOfLimit) {
        this.continueLookOutsideOfLimit = newContinueLookOutsideOfLimit;
    }

    @XmlPath("hkparam[@name=\"onGain\"]/text()")
    public String getOnGain() {
        return onGain;
    }

    @XmlPath("hkparam[@name=\"onGain\"]/text()")
    public void setOnGain(String newOnGain) {
        this.onGain = newOnGain;
    }

    @XmlPath("hkparam[@name=\"offGain\"]/text()")
    public String getOffGain() {
        return offGain;
    }

    @XmlPath("hkparam[@name=\"offGain\"]/text()")
    public void setOffGain(String newOffGain) {
        this.offGain = newOffGain;
    }

    @XmlPath("hkparam[@name=\"useBoneGains\"]/text()")
    public String getUseBoneGains() {
        return useBoneGains;
    }

    @XmlPath("hkparam[@name=\"useBoneGains\"]/text()")
    public void setUseBoneGains(String newUseBoneGains) {
        this.useBoneGains = newUseBoneGains;
    }

    @XmlPath("hkparam[@name=\"targetLocation\"]/text()")
    public String getTargetLocation() {
        return targetLocation;
    }

    @XmlPath("hkparam[@name=\"targetLocation\"]/text()")
    public void setTargetLocation(String newTargetLocation) {
        this.targetLocation = newTargetLocation;
    }

    @XmlPath("hkparam[@name=\"targetOutsideLimits\"]/text()")
    public String getTargetOutsideLimits() {
        return targetOutsideLimits;
    }

    @XmlPath("hkparam[@name=\"targetOutsideLimits\"]/text()")
    public void setTargetOutsideLimits(String newTargetOutsideLimits) {
        this.targetOutsideLimits = newTargetOutsideLimits;
    }

    @XmlElement(name = "hkparam[@name=\"targetOutOfLimitEvent\"]/hkobject")
    public Unnamed80 getTargetOutOfLimitEvent() {
        return targetOutOfLimitEvent;
    }

    public void setTargetOutOfLimitEvent(Unnamed80 newTargetOutOfLimitEvent) {
        this.targetOutOfLimitEvent = newTargetOutOfLimitEvent;
    }

    @XmlPath("hkparam[@name=\"lookAtCamera\"]/text()")
    public String getLookAtCamera() {
        return lookAtCamera;
    }

    @XmlPath("hkparam[@name=\"lookAtCamera\"]/text()")
    public void setLookAtCamera(String newLookAtCamera) {
        this.lookAtCamera = newLookAtCamera;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraX\"]/text()")
    public String getLookAtCameraX() {
        return lookAtCameraX;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraX\"]/text()")
    public void setLookAtCameraX(String newLookAtCameraX) {
        this.lookAtCameraX = newLookAtCameraX;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraY\"]/text()")
    public String getLookAtCameraY() {
        return lookAtCameraY;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraY\"]/text()")
    public void setLookAtCameraY(String newLookAtCameraY) {
        this.lookAtCameraY = newLookAtCameraY;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraZ\"]/text()")
    public String getLookAtCameraZ() {
        return lookAtCameraZ;
    }

    @XmlPath("hkparam[@name=\"lookAtCameraZ\"]/text()")
    public void setLookAtCameraZ(String newLookAtCameraZ) {
        this.lookAtCameraZ = newLookAtCameraZ;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed78 child: getBones()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed79 child: getEyeBones()) {
            child.accept(visitor);
        }
        if (!(null == getTargetOutOfLimitEvent())) {
            getTargetOutOfLimitEvent().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed78 child: getBones()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed79 child: getEyeBones()) {
            child.accept(visitor, this);
        }
        if (!(null == getTargetOutOfLimitEvent())) {
            getTargetOutOfLimitEvent().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        for (org.tes.hkx.lib.ext.Unnamed78 child: getBones()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed79 child: getEyeBones()) {
            theseObjects.add(child);
        }
        if (!(null == getTargetOutOfLimitEvent())) {
            theseObjects.add(getTargetOutOfLimitEvent());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed78)&&removeFromBones(((org.tes.hkx.lib.ext.Unnamed78) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed79)&&removeFromEyeBones(((org.tes.hkx.lib.ext.Unnamed79) toRemove))) {
            return true;
        }
        if ((getTargetOutOfLimitEvent()!= null)&&getTargetOutOfLimitEvent().equals(toRemove)) {
            setTargetOutOfLimitEvent(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
