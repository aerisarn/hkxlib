
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
@XmlDiscriminatorValue("0xed8966c0")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "gains",
    "legs",
    "raycastDistanceUp",
    "raycastDistanceDown",
    "originalGroundHeightMS",
    "errorOut",
    "errorOutTranslation",
    "alignWithGroundRotation",
    "verticalOffset",
    "collisionFilterInfo",
    "forwardAlignFraction",
    "sidewaysAlignFraction",
    "sidewaysSampleWidth",
    "useTrackData",
    "lockFeetWhenPlanted",
    "useCharacterUpVector",
    "alignMode"
})
public class hkbFootIkModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private innerModifierGains gains;
    @XmlElement(name = "hkparam[@name=\"legs\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerModifierLegs> legs;
    @XmlPath("hkparam[@name=\"legs\"]/@numelements")
    private Integer numlegs;
    private String raycastDistanceUp;
    private String raycastDistanceDown;
    private String originalGroundHeightMS;
    private String errorOut;
    private String errorOutTranslation;
    private String alignWithGroundRotation;
    private String verticalOffset;
    private String collisionFilterInfo;
    private String forwardAlignFraction;
    private String sidewaysAlignFraction;
    private String sidewaysSampleWidth;
    private String useTrackData;
    private String lockFeetWhenPlanted;
    private String useCharacterUpVector;
    private String alignMode;

    public hkbFootIkModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("FootIKModifier_TakeOff");
        setEnable("true");
        setGains(null);
        legs = new ArrayList<org.tes.hkx.lib.ext.innerModifierLegs>();
        numlegs = 0;
        setRaycastDistanceUp("0.500000");
        setRaycastDistanceDown("0.800000");
        setOriginalGroundHeightMS("0.000000");
        setErrorOut("0.000000");
        setErrorOutTranslation("(0.000000 0.000000 0.000000 0.000000)");
        setAlignWithGroundRotation("(0.000000 0.000000 0.000000 1.000000)");
        setVerticalOffset("0.000000");
        setCollisionFilterInfo("3");
        setForwardAlignFraction("1.000000");
        setSidewaysAlignFraction("-1");
        setSidewaysSampleWidth("-1");
        setUseTrackData("false");
        setLockFeetWhenPlanted("false");
        setUseCharacterUpVector("true");
        setAlignMode("ALIGN_MODE_FORWARD_RIGHT");
        setClazz("hkbFootIkModifier");
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

    @XmlElement(name = "hkparam[@name=\"gains\"]/hkobject")
    public innerModifierGains getGains() {
        return gains;
    }

    public void setGains(innerModifierGains newGains) {
        this.gains = newGains;
    }

    public Integer getNumLegs() {
        return numlegs;
    }

    public Iterable<org.tes.hkx.lib.ext.innerModifierLegs> getLegs() {
        return legs;
    }

    public org.tes.hkx.lib.ext.innerModifierLegs getLegsAt(int index) {
        return legs.get(index);
    }

    public boolean addToLegs(org.tes.hkx.lib.ext.innerModifierLegs newLegs) {
        if (legs.add(newLegs)) {
            numlegs += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromLegs(org.tes.hkx.lib.ext.innerModifierLegs legsToRemove) {
        if (legs.remove(legsToRemove)) {
            numlegs += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerModifierLegs removeFromLegsAt(int index) {
        org.tes.hkx.lib.ext.innerModifierLegs toRemove;
        toRemove = legs.remove(index);
        if (!(null == toRemove)) {
            numlegs += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"raycastDistanceUp\"]/text()")
    public String getRaycastDistanceUp() {
        return raycastDistanceUp;
    }

    @XmlPath("hkparam[@name=\"raycastDistanceUp\"]/text()")
    public void setRaycastDistanceUp(String newRaycastDistanceUp) {
        this.raycastDistanceUp = newRaycastDistanceUp;
    }

    @XmlPath("hkparam[@name=\"raycastDistanceDown\"]/text()")
    public String getRaycastDistanceDown() {
        return raycastDistanceDown;
    }

    @XmlPath("hkparam[@name=\"raycastDistanceDown\"]/text()")
    public void setRaycastDistanceDown(String newRaycastDistanceDown) {
        this.raycastDistanceDown = newRaycastDistanceDown;
    }

    @XmlPath("hkparam[@name=\"originalGroundHeightMS\"]/text()")
    public String getOriginalGroundHeightMS() {
        return originalGroundHeightMS;
    }

    @XmlPath("hkparam[@name=\"originalGroundHeightMS\"]/text()")
    public void setOriginalGroundHeightMS(String newOriginalGroundHeightMS) {
        this.originalGroundHeightMS = newOriginalGroundHeightMS;
    }

    @XmlPath("hkparam[@name=\"errorOut\"]/text()")
    public String getErrorOut() {
        return errorOut;
    }

    @XmlPath("hkparam[@name=\"errorOut\"]/text()")
    public void setErrorOut(String newErrorOut) {
        this.errorOut = newErrorOut;
    }

    @XmlPath("hkparam[@name=\"errorOutTranslation\"]/text()")
    public String getErrorOutTranslation() {
        return errorOutTranslation;
    }

    @XmlPath("hkparam[@name=\"errorOutTranslation\"]/text()")
    public void setErrorOutTranslation(String newErrorOutTranslation) {
        this.errorOutTranslation = newErrorOutTranslation;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundRotation\"]/text()")
    public String getAlignWithGroundRotation() {
        return alignWithGroundRotation;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundRotation\"]/text()")
    public void setAlignWithGroundRotation(String newAlignWithGroundRotation) {
        this.alignWithGroundRotation = newAlignWithGroundRotation;
    }

    @XmlPath("hkparam[@name=\"verticalOffset\"]/text()")
    public String getVerticalOffset() {
        return verticalOffset;
    }

    @XmlPath("hkparam[@name=\"verticalOffset\"]/text()")
    public void setVerticalOffset(String newVerticalOffset) {
        this.verticalOffset = newVerticalOffset;
    }

    @XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
    public String getCollisionFilterInfo() {
        return collisionFilterInfo;
    }

    @XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
    public void setCollisionFilterInfo(String newCollisionFilterInfo) {
        this.collisionFilterInfo = newCollisionFilterInfo;
    }

    @XmlPath("hkparam[@name=\"forwardAlignFraction\"]/text()")
    public String getForwardAlignFraction() {
        return forwardAlignFraction;
    }

    @XmlPath("hkparam[@name=\"forwardAlignFraction\"]/text()")
    public void setForwardAlignFraction(String newForwardAlignFraction) {
        this.forwardAlignFraction = newForwardAlignFraction;
    }

    @XmlPath("hkparam[@name=\"sidewaysAlignFraction\"]/text()")
    public String getSidewaysAlignFraction() {
        return sidewaysAlignFraction;
    }

    @XmlPath("hkparam[@name=\"sidewaysAlignFraction\"]/text()")
    public void setSidewaysAlignFraction(String newSidewaysAlignFraction) {
        this.sidewaysAlignFraction = newSidewaysAlignFraction;
    }

    @XmlPath("hkparam[@name=\"sidewaysSampleWidth\"]/text()")
    public String getSidewaysSampleWidth() {
        return sidewaysSampleWidth;
    }

    @XmlPath("hkparam[@name=\"sidewaysSampleWidth\"]/text()")
    public void setSidewaysSampleWidth(String newSidewaysSampleWidth) {
        this.sidewaysSampleWidth = newSidewaysSampleWidth;
    }

    @XmlPath("hkparam[@name=\"useTrackData\"]/text()")
    public String getUseTrackData() {
        return useTrackData;
    }

    @XmlPath("hkparam[@name=\"useTrackData\"]/text()")
    public void setUseTrackData(String newUseTrackData) {
        this.useTrackData = newUseTrackData;
    }

    @XmlPath("hkparam[@name=\"lockFeetWhenPlanted\"]/text()")
    public String getLockFeetWhenPlanted() {
        return lockFeetWhenPlanted;
    }

    @XmlPath("hkparam[@name=\"lockFeetWhenPlanted\"]/text()")
    public void setLockFeetWhenPlanted(String newLockFeetWhenPlanted) {
        this.lockFeetWhenPlanted = newLockFeetWhenPlanted;
    }

    @XmlPath("hkparam[@name=\"useCharacterUpVector\"]/text()")
    public String getUseCharacterUpVector() {
        return useCharacterUpVector;
    }

    @XmlPath("hkparam[@name=\"useCharacterUpVector\"]/text()")
    public void setUseCharacterUpVector(String newUseCharacterUpVector) {
        this.useCharacterUpVector = newUseCharacterUpVector;
    }

    @XmlPath("hkparam[@name=\"alignMode\"]/text()")
    public String getAlignMode() {
        return alignMode;
    }

    @XmlPath("hkparam[@name=\"alignMode\"]/text()")
    public void setAlignMode(String newAlignMode) {
        this.alignMode = newAlignMode;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getGains())) {
            getGains().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.innerModifierLegs child: getLegs()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getGains())) {
            getGains().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.innerModifierLegs child: getLegs()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getGains())) {
            theseObjects.add(getGains());
        }
        for (org.tes.hkx.lib.ext.innerModifierLegs child: getLegs()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getGains()!= null)&&getGains().equals(toRemove)) {
            setGains(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerModifierLegs)&&removeFromLegs(((org.tes.hkx.lib.ext.innerModifierLegs) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
