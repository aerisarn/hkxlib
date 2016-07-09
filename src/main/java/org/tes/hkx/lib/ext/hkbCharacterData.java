
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
@XmlDiscriminatorValue("0x300d6808")
@XmlType(propOrder = {
    "characterControllerInfo",
    "modelUpMS",
    "modelForwardMS",
    "modelRightMS",
    "characterPropertyInfos",
    "numBonesPerLod",
    "characterPropertyValues",
    "footIkDriverInfo",
    "handIkDriverInfo",
    "stringData",
    "mirroredSkeletonInfo",
    "scale"
})
public class hkbCharacterData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private innerCharacterControllerInfo characterControllerInfo;
    private String modelUpMS;
    private String modelForwardMS;
    private String modelRightMS;
    @XmlElement(name = "hkparam[@name=\"characterPropertyInfos\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerVariableInfo> characterPropertyInfos;
    @XmlPath("hkparam[@name=\"characterPropertyInfos\"]/@numelements")
    private Integer numcharacterPropertyInfos;
    @XmlElement(name = "hkparam[@name=\"numBonesPerLod\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerVariableInfo> numBonesPerLod;
    @XmlPath("hkparam[@name=\"numBonesPerLod\"]/@numelements")
    private Integer numnumBonesPerLod;
    private hkbVariableValueSet characterPropertyValues;
    private hkbFootIkDriverInfo footIkDriverInfo;
    private String handIkDriverInfo;
    private hkbCharacterStringData stringData;
    private hkbMirroredSkeletonInfo mirroredSkeletonInfo;
    private String scale;

    public hkbCharacterData() {
        setCharacterControllerInfo(null);
        setModelUpMS("(0.000000 0.000000 1.000000 0.000000)");
        setModelForwardMS("(1.000000 0.000000 0.000000 0.000000)");
        setModelRightMS("(-0.000000 -1.000000 -0.000000 0.000000)");
        characterPropertyInfos = new ArrayList<org.tes.hkx.lib.ext.innerVariableInfo>();
        numcharacterPropertyInfos = 0;
        numBonesPerLod = new ArrayList<org.tes.hkx.lib.ext.innerVariableInfo>();
        numnumBonesPerLod = 0;
        setCharacterPropertyValues(null);
        setFootIkDriverInfo(null);
        setHandIkDriverInfo("null");
        setStringData(null);
        setMirroredSkeletonInfo(null);
        setScale("1.000000");
        setClazz("hkbCharacterData");
    }

    @XmlElement(name = "hkparam[@name=\"characterControllerInfo\"]/hkobject")
    public innerCharacterControllerInfo getCharacterControllerInfo() {
        return characterControllerInfo;
    }

    public void setCharacterControllerInfo(innerCharacterControllerInfo newCharacterControllerInfo) {
        this.characterControllerInfo = newCharacterControllerInfo;
    }

    @XmlPath("hkparam[@name=\"modelUpMS\"]/text()")
    public String getModelUpMS() {
        return modelUpMS;
    }

    @XmlPath("hkparam[@name=\"modelUpMS\"]/text()")
    public void setModelUpMS(String newModelUpMS) {
        this.modelUpMS = newModelUpMS;
    }

    @XmlPath("hkparam[@name=\"modelForwardMS\"]/text()")
    public String getModelForwardMS() {
        return modelForwardMS;
    }

    @XmlPath("hkparam[@name=\"modelForwardMS\"]/text()")
    public void setModelForwardMS(String newModelForwardMS) {
        this.modelForwardMS = newModelForwardMS;
    }

    @XmlPath("hkparam[@name=\"modelRightMS\"]/text()")
    public String getModelRightMS() {
        return modelRightMS;
    }

    @XmlPath("hkparam[@name=\"modelRightMS\"]/text()")
    public void setModelRightMS(String newModelRightMS) {
        this.modelRightMS = newModelRightMS;
    }

    public Integer getNumCharacterPropertyInfos() {
        return numcharacterPropertyInfos;
    }

    public Iterable<org.tes.hkx.lib.ext.innerVariableInfo> getCharacterPropertyInfos() {
        return characterPropertyInfos;
    }

    public org.tes.hkx.lib.ext.innerVariableInfo getCharacterPropertyInfosAt(int index) {
        return characterPropertyInfos.get(index);
    }

    public boolean addToCharacterPropertyInfos(org.tes.hkx.lib.ext.innerVariableInfo newCharacterPropertyInfos) {
        if (characterPropertyInfos.add(newCharacterPropertyInfos)) {
            numcharacterPropertyInfos += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromCharacterPropertyInfos(org.tes.hkx.lib.ext.innerVariableInfo characterPropertyInfosToRemove) {
        if (characterPropertyInfos.remove(characterPropertyInfosToRemove)) {
            numcharacterPropertyInfos += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerVariableInfo removeFromCharacterPropertyInfosAt(int index) {
        org.tes.hkx.lib.ext.innerVariableInfo toRemove;
        toRemove = characterPropertyInfos.remove(index);
        if (!(null == toRemove)) {
            numcharacterPropertyInfos += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumNumBonesPerLod() {
        return numnumBonesPerLod;
    }

    public Iterable<org.tes.hkx.lib.ext.innerVariableInfo> getNumBonesPerLod() {
        return numBonesPerLod;
    }

    public org.tes.hkx.lib.ext.innerVariableInfo getNumBonesPerLodAt(int index) {
        return numBonesPerLod.get(index);
    }

    public boolean addToNumBonesPerLod(org.tes.hkx.lib.ext.innerVariableInfo newNumBonesPerLod) {
        if (numBonesPerLod.add(newNumBonesPerLod)) {
            numnumBonesPerLod += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromNumBonesPerLod(org.tes.hkx.lib.ext.innerVariableInfo numBonesPerLodToRemove) {
        if (numBonesPerLod.remove(numBonesPerLodToRemove)) {
            numnumBonesPerLod += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerVariableInfo removeFromNumBonesPerLodAt(int index) {
        org.tes.hkx.lib.ext.innerVariableInfo toRemove;
        toRemove = numBonesPerLod.remove(index);
        if (!(null == toRemove)) {
            numnumBonesPerLod += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"characterPropertyValues\"]/text()")
    @ObjectLink
    public hkbVariableValueSet getCharacterPropertyValues() {
        return characterPropertyValues;
    }

    public void setCharacterPropertyValues(hkbVariableValueSet newCharacterPropertyValues) {
        this.characterPropertyValues = newCharacterPropertyValues;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"footIkDriverInfo\"]/text()")
    @ObjectLink
    public hkbFootIkDriverInfo getFootIkDriverInfo() {
        return footIkDriverInfo;
    }

    public void setFootIkDriverInfo(hkbFootIkDriverInfo newFootIkDriverInfo) {
        this.footIkDriverInfo = newFootIkDriverInfo;
    }

    @XmlPath("hkparam[@name=\"handIkDriverInfo\"]/text()")
    public String getHandIkDriverInfo() {
        return handIkDriverInfo;
    }

    @XmlPath("hkparam[@name=\"handIkDriverInfo\"]/text()")
    public void setHandIkDriverInfo(String newHandIkDriverInfo) {
        this.handIkDriverInfo = newHandIkDriverInfo;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"stringData\"]/text()")
    @ObjectLink
    public hkbCharacterStringData getStringData() {
        return stringData;
    }

    public void setStringData(hkbCharacterStringData newStringData) {
        this.stringData = newStringData;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"mirroredSkeletonInfo\"]/text()")
    @ObjectLink
    public hkbMirroredSkeletonInfo getMirroredSkeletonInfo() {
        return mirroredSkeletonInfo;
    }

    public void setMirroredSkeletonInfo(hkbMirroredSkeletonInfo newMirroredSkeletonInfo) {
        this.mirroredSkeletonInfo = newMirroredSkeletonInfo;
    }

    @XmlPath("hkparam[@name=\"scale\"]/text()")
    public String getScale() {
        return scale;
    }

    @XmlPath("hkparam[@name=\"scale\"]/text()")
    public void setScale(String newScale) {
        this.scale = newScale;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getCharacterControllerInfo())) {
            getCharacterControllerInfo().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getCharacterPropertyInfos()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getNumBonesPerLod()) {
            child.accept(visitor);
        }
        if (!(null == getCharacterPropertyValues())) {
            getCharacterPropertyValues().accept(visitor);
        }
        if (!(null == getFootIkDriverInfo())) {
            getFootIkDriverInfo().accept(visitor);
        }
        if (!(null == getStringData())) {
            getStringData().accept(visitor);
        }
        if (!(null == getMirroredSkeletonInfo())) {
            getMirroredSkeletonInfo().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getCharacterControllerInfo())) {
            getCharacterControllerInfo().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getCharacterPropertyInfos()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getNumBonesPerLod()) {
            child.accept(visitor, this);
        }
        if (!(null == getCharacterPropertyValues())) {
            getCharacterPropertyValues().accept(visitor, this);
        }
        if (!(null == getFootIkDriverInfo())) {
            getFootIkDriverInfo().accept(visitor, this);
        }
        if (!(null == getStringData())) {
            getStringData().accept(visitor, this);
        }
        if (!(null == getMirroredSkeletonInfo())) {
            getMirroredSkeletonInfo().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getCharacterControllerInfo())) {
            theseObjects.add(getCharacterControllerInfo());
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getCharacterPropertyInfos()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.innerVariableInfo child: getNumBonesPerLod()) {
            theseObjects.add(child);
        }
        if (!(null == getCharacterPropertyValues())) {
            theseObjects.add(getCharacterPropertyValues());
        }
        if (!(null == getFootIkDriverInfo())) {
            theseObjects.add(getFootIkDriverInfo());
        }
        if (!(null == getStringData())) {
            theseObjects.add(getStringData());
        }
        if (!(null == getMirroredSkeletonInfo())) {
            theseObjects.add(getMirroredSkeletonInfo());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getCharacterControllerInfo()!= null)&&getCharacterControllerInfo().equals(toRemove)) {
            setCharacterControllerInfo(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerVariableInfo)&&removeFromCharacterPropertyInfos(((org.tes.hkx.lib.ext.innerVariableInfo) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerVariableInfo)&&removeFromNumBonesPerLod(((org.tes.hkx.lib.ext.innerVariableInfo) toRemove))) {
            return true;
        }
        if ((getCharacterPropertyValues()!= null)&&getCharacterPropertyValues().equals(toRemove)) {
            setCharacterPropertyValues(null);
            return true;
        }
        if ((getFootIkDriverInfo()!= null)&&getFootIkDriverInfo().equals(toRemove)) {
            setFootIkDriverInfo(null);
            return true;
        }
        if ((getStringData()!= null)&&getStringData().equals(toRemove)) {
            setStringData(null);
            return true;
        }
        if ((getMirroredSkeletonInfo()!= null)&&getMirroredSkeletonInfo().equals(toRemove)) {
            setMirroredSkeletonInfo(null);
            return true;
        }
        return false;
    }

}
