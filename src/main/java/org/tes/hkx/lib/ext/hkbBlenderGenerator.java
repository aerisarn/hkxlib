
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0x22df7147")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "referencePoseWeightThreshold",
    "blendParameter",
    "minCyclicBlendParameter",
    "maxCyclicBlendParameter",
    "indexOfSyncMasterChild",
    "flags",
    "subtractLastChild",
    "children"
})
public class hkbBlenderGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String referencePoseWeightThreshold;
    private String blendParameter;
    private String minCyclicBlendParameter;
    private String maxCyclicBlendParameter;
    private String indexOfSyncMasterChild;
    private String flags;
    private String subtractLastChild;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"children\"]/text()")
    @XmlList
    private ArrayList<hkbBlenderGeneratorChild> children;
    @XmlPath("hkparam[@name=\"children\"]/@numelements")
    private Integer numchildren;

    public hkbBlenderGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Blend00");
        setReferencePoseWeightThreshold("0.000000");
        setBlendParameter("1.000000");
        setMinCyclicBlendParameter("0.000000");
        setMaxCyclicBlendParameter("1.000000");
        setIndexOfSyncMasterChild("-1");
        setFlags("17");
        setSubtractLastChild("false");
        children = new ArrayList<hkbBlenderGeneratorChild>();
        numchildren = 0;
        setClazz("hkbBlenderGenerator");
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

    @XmlPath("hkparam[@name=\"referencePoseWeightThreshold\"]/text()")
    public String getReferencePoseWeightThreshold() {
        return referencePoseWeightThreshold;
    }

    @XmlPath("hkparam[@name=\"referencePoseWeightThreshold\"]/text()")
    public void setReferencePoseWeightThreshold(String newReferencePoseWeightThreshold) {
        this.referencePoseWeightThreshold = newReferencePoseWeightThreshold;
    }

    @XmlPath("hkparam[@name=\"blendParameter\"]/text()")
    public String getBlendParameter() {
        return blendParameter;
    }

    @XmlPath("hkparam[@name=\"blendParameter\"]/text()")
    public void setBlendParameter(String newBlendParameter) {
        this.blendParameter = newBlendParameter;
    }

    @XmlPath("hkparam[@name=\"minCyclicBlendParameter\"]/text()")
    public String getMinCyclicBlendParameter() {
        return minCyclicBlendParameter;
    }

    @XmlPath("hkparam[@name=\"minCyclicBlendParameter\"]/text()")
    public void setMinCyclicBlendParameter(String newMinCyclicBlendParameter) {
        this.minCyclicBlendParameter = newMinCyclicBlendParameter;
    }

    @XmlPath("hkparam[@name=\"maxCyclicBlendParameter\"]/text()")
    public String getMaxCyclicBlendParameter() {
        return maxCyclicBlendParameter;
    }

    @XmlPath("hkparam[@name=\"maxCyclicBlendParameter\"]/text()")
    public void setMaxCyclicBlendParameter(String newMaxCyclicBlendParameter) {
        this.maxCyclicBlendParameter = newMaxCyclicBlendParameter;
    }

    @XmlPath("hkparam[@name=\"indexOfSyncMasterChild\"]/text()")
    public String getIndexOfSyncMasterChild() {
        return indexOfSyncMasterChild;
    }

    @XmlPath("hkparam[@name=\"indexOfSyncMasterChild\"]/text()")
    public void setIndexOfSyncMasterChild(String newIndexOfSyncMasterChild) {
        this.indexOfSyncMasterChild = newIndexOfSyncMasterChild;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public String getFlags() {
        return flags;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public void setFlags(String newFlags) {
        this.flags = newFlags;
    }

    @XmlPath("hkparam[@name=\"subtractLastChild\"]/text()")
    public String getSubtractLastChild() {
        return subtractLastChild;
    }

    @XmlPath("hkparam[@name=\"subtractLastChild\"]/text()")
    public void setSubtractLastChild(String newSubtractLastChild) {
        this.subtractLastChild = newSubtractLastChild;
    }

    public Integer getNumChildren() {
        return numchildren;
    }

    public Iterable<hkbBlenderGeneratorChild> getChildren() {
        return children;
    }

    public hkbBlenderGeneratorChild getChildrenAt(int index) {
        return children.get(index);
    }

    public boolean addToChildren(hkbBlenderGeneratorChild newChildren) {
        if (children.add(newChildren)) {
            numchildren += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromChildren(hkbBlenderGeneratorChild childrenToRemove) {
        if (children.remove(childrenToRemove)) {
            numchildren += -1;
            return true;
        }
        return false;
    }

    public hkbBlenderGeneratorChild removeFromChildrenAt(int index) {
        hkbBlenderGeneratorChild toRemove;
        toRemove = children.remove(index);
        if (!(null == toRemove)) {
            numchildren += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        for (hkbBlenderGeneratorChild child: getChildren()) {
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
        for (hkbBlenderGeneratorChild child: getChildren()) {
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
        for (hkbBlenderGeneratorChild child: getChildren()) {
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
        if ((toRemove instanceof hkbBlenderGeneratorChild)&&removeFromChildren(((hkbBlenderGeneratorChild) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
