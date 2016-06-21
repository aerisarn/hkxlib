
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
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xc6a09dbf")
@XmlType(propOrder = {
    "legs",
    "raycastDistanceUp",
    "raycastDistanceDown",
    "originalGroundHeightMS",
    "verticalOffset",
    "collisionFilterInfo",
    "forwardAlignFraction",
    "sidewaysAlignFraction",
    "sidewaysSampleWidth",
    "lockFeetWhenPlanted",
    "useCharacterUpVector",
    "isQuadrupedNarrow"
})
public class hkbFootIkDriverInfo
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"legs\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed28> legs;
    @XmlPath("hkparam[@name=\"legs\"]/@numelements")
    private Integer numlegs;
    private String raycastDistanceUp;
    private String raycastDistanceDown;
    private String originalGroundHeightMS;
    private String verticalOffset;
    private String collisionFilterInfo;
    private String forwardAlignFraction;
    private String sidewaysAlignFraction;
    private String sidewaysSampleWidth;
    private String lockFeetWhenPlanted;
    private String useCharacterUpVector;
    private String isQuadrupedNarrow;

    public hkbFootIkDriverInfo() {
        legs = new ArrayList<org.tes.hkx.lib.ext.Unnamed28>();
        numlegs = 0;
        setRaycastDistanceUp("64.000000");
        setRaycastDistanceDown("192.000000");
        setOriginalGroundHeightMS("0.000000");
        setVerticalOffset("0.000000");
        setCollisionFilterInfo("3");
        setForwardAlignFraction("1.000000");
        setSidewaysAlignFraction("-1");
        setSidewaysSampleWidth("-1");
        setLockFeetWhenPlanted("false");
        setUseCharacterUpVector("false");
        setIsQuadrupedNarrow("false");
        setClazz("hkbFootIkDriverInfo");
    }

    public Integer getNumLegs() {
        return numlegs;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed28> getLegs() {
        return legs;
    }

    public org.tes.hkx.lib.ext.Unnamed28 getLegsAt(int index) {
        return legs.get(index);
    }

    public boolean addToLegs(org.tes.hkx.lib.ext.Unnamed28 newLegs) {
        if (legs.add(newLegs)) {
            numlegs += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromLegs(org.tes.hkx.lib.ext.Unnamed28 legsToRemove) {
        if (legs.remove(legsToRemove)) {
            numlegs += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed28 removeFromLegsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed28 toRemove;
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

    @XmlPath("hkparam[@name=\"isQuadrupedNarrow\"]/text()")
    public String getIsQuadrupedNarrow() {
        return isQuadrupedNarrow;
    }

    @XmlPath("hkparam[@name=\"isQuadrupedNarrow\"]/text()")
    public void setIsQuadrupedNarrow(String newIsQuadrupedNarrow) {
        this.isQuadrupedNarrow = newIsQuadrupedNarrow;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed28 child: getLegs()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed28 child: getLegs()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed28 child: getLegs()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed28)&&removeFromLegs(((org.tes.hkx.lib.ext.Unnamed28) toRemove))) {
            return true;
        }
        return false;
    }

}
