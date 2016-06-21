
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
@XmlDiscriminatorValue("0x19a005c0")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "directAtTarget",
    "sourceBoneIndex",
    "startBoneIndex",
    "endBoneIndex",
    "limitHeadingDegrees",
    "limitPitchDegrees",
    "offsetHeadingDegrees",
    "offsetPitchDegrees",
    "onGain",
    "offGain",
    "targetLocation",
    "userInfo",
    "directAtCamera",
    "directAtCameraX",
    "directAtCameraY",
    "directAtCameraZ",
    "active",
    "currentHeadingOffset",
    "currentPitchOffset"
})
public class BSDirectAtModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String directAtTarget;
    private String sourceBoneIndex;
    private String startBoneIndex;
    private String endBoneIndex;
    private String limitHeadingDegrees;
    private String limitPitchDegrees;
    private String offsetHeadingDegrees;
    private String offsetPitchDegrees;
    private String onGain;
    private String offGain;
    private String targetLocation;
    private String userInfo;
    private String directAtCamera;
    private String directAtCameraX;
    private String directAtCameraY;
    private String directAtCameraZ;
    private String active;
    private String currentHeadingOffset;
    private String currentPitchOffset;

    public BSDirectAtModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Z_AimAttackPlayerTM");
        setEnable("true");
        setDirectAtTarget("true");
        setSourceBoneIndex("-1");
        setStartBoneIndex("-1");
        setEndBoneIndex("-1");
        setLimitHeadingDegrees("90.000000");
        setLimitPitchDegrees("90.000000");
        setOffsetHeadingDegrees("0.000000");
        setOffsetPitchDegrees("0.000000");
        setOnGain("0.550000");
        setOffGain("0.550000");
        setTargetLocation("(0.000000 0.000000 0.000000 0.000000)");
        setUserInfo("2");
        setDirectAtCamera("false");
        setDirectAtCameraX("0.000000");
        setDirectAtCameraY("0.000000");
        setDirectAtCameraZ("0.000000");
        setActive("false");
        setCurrentHeadingOffset("0.000000");
        setCurrentPitchOffset("0.000000");
        setClazz("BSDirectAtModifier");
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

    @XmlPath("hkparam[@name=\"directAtTarget\"]/text()")
    public String getDirectAtTarget() {
        return directAtTarget;
    }

    @XmlPath("hkparam[@name=\"directAtTarget\"]/text()")
    public void setDirectAtTarget(String newDirectAtTarget) {
        this.directAtTarget = newDirectAtTarget;
    }

    @XmlPath("hkparam[@name=\"sourceBoneIndex\"]/text()")
    public String getSourceBoneIndex() {
        return sourceBoneIndex;
    }

    @XmlPath("hkparam[@name=\"sourceBoneIndex\"]/text()")
    public void setSourceBoneIndex(String newSourceBoneIndex) {
        this.sourceBoneIndex = newSourceBoneIndex;
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

    @XmlPath("hkparam[@name=\"limitHeadingDegrees\"]/text()")
    public String getLimitHeadingDegrees() {
        return limitHeadingDegrees;
    }

    @XmlPath("hkparam[@name=\"limitHeadingDegrees\"]/text()")
    public void setLimitHeadingDegrees(String newLimitHeadingDegrees) {
        this.limitHeadingDegrees = newLimitHeadingDegrees;
    }

    @XmlPath("hkparam[@name=\"limitPitchDegrees\"]/text()")
    public String getLimitPitchDegrees() {
        return limitPitchDegrees;
    }

    @XmlPath("hkparam[@name=\"limitPitchDegrees\"]/text()")
    public void setLimitPitchDegrees(String newLimitPitchDegrees) {
        this.limitPitchDegrees = newLimitPitchDegrees;
    }

    @XmlPath("hkparam[@name=\"offsetHeadingDegrees\"]/text()")
    public String getOffsetHeadingDegrees() {
        return offsetHeadingDegrees;
    }

    @XmlPath("hkparam[@name=\"offsetHeadingDegrees\"]/text()")
    public void setOffsetHeadingDegrees(String newOffsetHeadingDegrees) {
        this.offsetHeadingDegrees = newOffsetHeadingDegrees;
    }

    @XmlPath("hkparam[@name=\"offsetPitchDegrees\"]/text()")
    public String getOffsetPitchDegrees() {
        return offsetPitchDegrees;
    }

    @XmlPath("hkparam[@name=\"offsetPitchDegrees\"]/text()")
    public void setOffsetPitchDegrees(String newOffsetPitchDegrees) {
        this.offsetPitchDegrees = newOffsetPitchDegrees;
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

    @XmlPath("hkparam[@name=\"targetLocation\"]/text()")
    public String getTargetLocation() {
        return targetLocation;
    }

    @XmlPath("hkparam[@name=\"targetLocation\"]/text()")
    public void setTargetLocation(String newTargetLocation) {
        this.targetLocation = newTargetLocation;
    }

    @XmlPath("hkparam[@name=\"userInfo\"]/text()")
    public String getUserInfo() {
        return userInfo;
    }

    @XmlPath("hkparam[@name=\"userInfo\"]/text()")
    public void setUserInfo(String newUserInfo) {
        this.userInfo = newUserInfo;
    }

    @XmlPath("hkparam[@name=\"directAtCamera\"]/text()")
    public String getDirectAtCamera() {
        return directAtCamera;
    }

    @XmlPath("hkparam[@name=\"directAtCamera\"]/text()")
    public void setDirectAtCamera(String newDirectAtCamera) {
        this.directAtCamera = newDirectAtCamera;
    }

    @XmlPath("hkparam[@name=\"directAtCameraX\"]/text()")
    public String getDirectAtCameraX() {
        return directAtCameraX;
    }

    @XmlPath("hkparam[@name=\"directAtCameraX\"]/text()")
    public void setDirectAtCameraX(String newDirectAtCameraX) {
        this.directAtCameraX = newDirectAtCameraX;
    }

    @XmlPath("hkparam[@name=\"directAtCameraY\"]/text()")
    public String getDirectAtCameraY() {
        return directAtCameraY;
    }

    @XmlPath("hkparam[@name=\"directAtCameraY\"]/text()")
    public void setDirectAtCameraY(String newDirectAtCameraY) {
        this.directAtCameraY = newDirectAtCameraY;
    }

    @XmlPath("hkparam[@name=\"directAtCameraZ\"]/text()")
    public String getDirectAtCameraZ() {
        return directAtCameraZ;
    }

    @XmlPath("hkparam[@name=\"directAtCameraZ\"]/text()")
    public void setDirectAtCameraZ(String newDirectAtCameraZ) {
        this.directAtCameraZ = newDirectAtCameraZ;
    }

    @XmlPath("hkparam[@name=\"active\"]/text()")
    public String getActive() {
        return active;
    }

    @XmlPath("hkparam[@name=\"active\"]/text()")
    public void setActive(String newActive) {
        this.active = newActive;
    }

    @XmlPath("hkparam[@name=\"currentHeadingOffset\"]/text()")
    public String getCurrentHeadingOffset() {
        return currentHeadingOffset;
    }

    @XmlPath("hkparam[@name=\"currentHeadingOffset\"]/text()")
    public void setCurrentHeadingOffset(String newCurrentHeadingOffset) {
        this.currentHeadingOffset = newCurrentHeadingOffset;
    }

    @XmlPath("hkparam[@name=\"currentPitchOffset\"]/text()")
    public String getCurrentPitchOffset() {
        return currentPitchOffset;
    }

    @XmlPath("hkparam[@name=\"currentPitchOffset\"]/text()")
    public void setCurrentPitchOffset(String newCurrentPitchOffset) {
        this.currentPitchOffset = newCurrentPitchOffset;
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
