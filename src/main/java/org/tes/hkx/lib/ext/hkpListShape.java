
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
@XmlDiscriminatorValue("0xa1937cbd")
@XmlType(propOrder = {
    "userData",
    "disableWelding",
    "collectionType",
    "childInfo",
    "flags",
    "numDisabledChildren",
    "aabbHalfExtents",
    "aabbCenter",
    "enabledChildren"
})
public class hkpListShape
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private String disableWelding;
    private String collectionType;
    @XmlElement(name = "hkparam[@name=\"childInfo\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo> childInfo;
    @XmlPath("hkparam[@name=\"childInfo\"]/@numelements")
    private Integer numchildInfo;
    private String flags;
    private String numDisabledChildren;
    private String aabbHalfExtents;
    private String aabbCenter;
    private String enabledChildren;

    public hkpListShape() {
        setUserData("0");
        setDisableWelding("false");
        setCollectionType("COLLECTION_LIST");
        childInfo = new ArrayList<org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo>();
        numchildInfo = 0;
        setFlags("0");
        setNumDisabledChildren("0");
        setAabbHalfExtents("(322.754456 346.411926 144.035416 96.000031)");
        setAabbCenter("(0.846573 -45.587967 143.964615 1.000000)");
        setEnabledChildren("4294967295 4294967295 4294967295 4294967295 4294967295 4294967295 4294967295 4294967295");
        setClazz("hkpListShape");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"disableWelding\"]/text()")
    public String getDisableWelding() {
        return disableWelding;
    }

    @XmlPath("hkparam[@name=\"disableWelding\"]/text()")
    public void setDisableWelding(String newDisableWelding) {
        this.disableWelding = newDisableWelding;
    }

    @XmlPath("hkparam[@name=\"collectionType\"]/text()")
    public String getCollectionType() {
        return collectionType;
    }

    @XmlPath("hkparam[@name=\"collectionType\"]/text()")
    public void setCollectionType(String newCollectionType) {
        this.collectionType = newCollectionType;
    }

    public Integer getNumChildInfo() {
        return numchildInfo;
    }

    public Iterable<org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo> getChildInfo() {
        return childInfo;
    }

    public org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo getChildInfoAt(int index) {
        return childInfo.get(index);
    }

    public boolean addToChildInfo(org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo newChildInfo) {
        if (childInfo.add(newChildInfo)) {
            numchildInfo += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromChildInfo(org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo childInfoToRemove) {
        if (childInfo.remove(childInfoToRemove)) {
            numchildInfo += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo removeFromChildInfoAt(int index) {
        org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo toRemove;
        toRemove = childInfo.remove(index);
        if (!(null == toRemove)) {
            numchildInfo += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public String getFlags() {
        return flags;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public void setFlags(String newFlags) {
        this.flags = newFlags;
    }

    @XmlPath("hkparam[@name=\"numDisabledChildren\"]/text()")
    public String getNumDisabledChildren() {
        return numDisabledChildren;
    }

    @XmlPath("hkparam[@name=\"numDisabledChildren\"]/text()")
    public void setNumDisabledChildren(String newNumDisabledChildren) {
        this.numDisabledChildren = newNumDisabledChildren;
    }

    @XmlPath("hkparam[@name=\"aabbHalfExtents\"]/text()")
    public String getAabbHalfExtents() {
        return aabbHalfExtents;
    }

    @XmlPath("hkparam[@name=\"aabbHalfExtents\"]/text()")
    public void setAabbHalfExtents(String newAabbHalfExtents) {
        this.aabbHalfExtents = newAabbHalfExtents;
    }

    @XmlPath("hkparam[@name=\"aabbCenter\"]/text()")
    public String getAabbCenter() {
        return aabbCenter;
    }

    @XmlPath("hkparam[@name=\"aabbCenter\"]/text()")
    public void setAabbCenter(String newAabbCenter) {
        this.aabbCenter = newAabbCenter;
    }

    @XmlPath("hkparam[@name=\"enabledChildren\"]/text()")
    public String getEnabledChildren() {
        return enabledChildren;
    }

    @XmlPath("hkparam[@name=\"enabledChildren\"]/text()")
    public void setEnabledChildren(String newEnabledChildren) {
        this.enabledChildren = newEnabledChildren;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo child: getChildInfo()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo child: getChildInfo()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo child: getChildInfo()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo)&&removeFromChildInfo(((org.tes.hkx.lib.ext.innerFilteredCapsuleShapeInfo) toRemove))) {
            return true;
        }
        return false;
    }

}
