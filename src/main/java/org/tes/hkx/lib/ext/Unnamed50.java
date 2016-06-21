
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = {
    "skeletonA",
    "skeletonB",
    "simpleMappings",
    "chainMappings",
    "unmappedBones",
    "extractedMotionMapping",
    "keepUnmappedLocal",
    "mappingType"
})
public class Unnamed50 implements IHkContainer, IHkVisitable
{

    private hkaSkeleton skeletonA;
    private hkaSkeleton skeletonB;
    @XmlElement(name = "hkparam[@name=\"simpleMappings\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed51> simpleMappings;
    @XmlPath("hkparam[@name=\"simpleMappings\"]/@numelements")
    private Integer numsimpleMappings;
    @XmlElement(name = "hkparam[@name=\"chainMappings\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed51> chainMappings;
    @XmlPath("hkparam[@name=\"chainMappings\"]/@numelements")
    private Integer numchainMappings;
    @XmlElement(name = "hkparam[@name=\"unmappedBones\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed51> unmappedBones;
    @XmlPath("hkparam[@name=\"unmappedBones\"]/@numelements")
    private Integer numunmappedBones;
    private String extractedMotionMapping;
    private String keepUnmappedLocal;
    private String mappingType;

    public Unnamed50() {
        setSkeletonA(null);
        setSkeletonB(null);
        simpleMappings = new ArrayList<org.tes.hkx.lib.ext.Unnamed51>();
        numsimpleMappings = 0;
        chainMappings = new ArrayList<org.tes.hkx.lib.ext.Unnamed51>();
        numchainMappings = 0;
        unmappedBones = new ArrayList<org.tes.hkx.lib.ext.Unnamed51>();
        numunmappedBones = 0;
        setExtractedMotionMapping(null);
        setKeepUnmappedLocal(null);
        setMappingType(null);
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"skeletonA\"]/text()")
    @ObjectLink
    public hkaSkeleton getSkeletonA() {
        return skeletonA;
    }

    public void setSkeletonA(hkaSkeleton newSkeletonA) {
        this.skeletonA = newSkeletonA;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"skeletonB\"]/text()")
    @ObjectLink
    public hkaSkeleton getSkeletonB() {
        return skeletonB;
    }

    public void setSkeletonB(hkaSkeleton newSkeletonB) {
        this.skeletonB = newSkeletonB;
    }

    public Integer getNumSimpleMappings() {
        return numsimpleMappings;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed51> getSimpleMappings() {
        return simpleMappings;
    }

    public org.tes.hkx.lib.ext.Unnamed51 getSimpleMappingsAt(int index) {
        return simpleMappings.get(index);
    }

    public boolean addToSimpleMappings(org.tes.hkx.lib.ext.Unnamed51 newSimpleMappings) {
        if (simpleMappings.add(newSimpleMappings)) {
            numsimpleMappings += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromSimpleMappings(org.tes.hkx.lib.ext.Unnamed51 simpleMappingsToRemove) {
        if (simpleMappings.remove(simpleMappingsToRemove)) {
            numsimpleMappings += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed51 removeFromSimpleMappingsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed51 toRemove;
        toRemove = simpleMappings.remove(index);
        if (!(null == toRemove)) {
            numsimpleMappings += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumChainMappings() {
        return numchainMappings;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed51> getChainMappings() {
        return chainMappings;
    }

    public org.tes.hkx.lib.ext.Unnamed51 getChainMappingsAt(int index) {
        return chainMappings.get(index);
    }

    public boolean addToChainMappings(org.tes.hkx.lib.ext.Unnamed51 newChainMappings) {
        if (chainMappings.add(newChainMappings)) {
            numchainMappings += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromChainMappings(org.tes.hkx.lib.ext.Unnamed51 chainMappingsToRemove) {
        if (chainMappings.remove(chainMappingsToRemove)) {
            numchainMappings += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed51 removeFromChainMappingsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed51 toRemove;
        toRemove = chainMappings.remove(index);
        if (!(null == toRemove)) {
            numchainMappings += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumUnmappedBones() {
        return numunmappedBones;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed51> getUnmappedBones() {
        return unmappedBones;
    }

    public org.tes.hkx.lib.ext.Unnamed51 getUnmappedBonesAt(int index) {
        return unmappedBones.get(index);
    }

    public boolean addToUnmappedBones(org.tes.hkx.lib.ext.Unnamed51 newUnmappedBones) {
        if (unmappedBones.add(newUnmappedBones)) {
            numunmappedBones += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromUnmappedBones(org.tes.hkx.lib.ext.Unnamed51 unmappedBonesToRemove) {
        if (unmappedBones.remove(unmappedBonesToRemove)) {
            numunmappedBones += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed51 removeFromUnmappedBonesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed51 toRemove;
        toRemove = unmappedBones.remove(index);
        if (!(null == toRemove)) {
            numunmappedBones += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"extractedMotionMapping\"]/text()")
    public String getExtractedMotionMapping() {
        return extractedMotionMapping;
    }

    @XmlPath("hkparam[@name=\"extractedMotionMapping\"]/text()")
    public void setExtractedMotionMapping(String newExtractedMotionMapping) {
        this.extractedMotionMapping = newExtractedMotionMapping;
    }

    @XmlPath("hkparam[@name=\"keepUnmappedLocal\"]/text()")
    public String getKeepUnmappedLocal() {
        return keepUnmappedLocal;
    }

    @XmlPath("hkparam[@name=\"keepUnmappedLocal\"]/text()")
    public void setKeepUnmappedLocal(String newKeepUnmappedLocal) {
        this.keepUnmappedLocal = newKeepUnmappedLocal;
    }

    @XmlPath("hkparam[@name=\"mappingType\"]/text()")
    public String getMappingType() {
        return mappingType;
    }

    @XmlPath("hkparam[@name=\"mappingType\"]/text()")
    public void setMappingType(String newMappingType) {
        this.mappingType = newMappingType;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getSkeletonA())) {
            getSkeletonA().accept(visitor);
        }
        if (!(null == getSkeletonB())) {
            getSkeletonB().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getSimpleMappings()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getChainMappings()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getUnmappedBones()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getSkeletonA())) {
            getSkeletonA().accept(visitor, this);
        }
        if (!(null == getSkeletonB())) {
            getSkeletonB().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getSimpleMappings()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getChainMappings()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getUnmappedBones()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getSkeletonA())) {
            theseObjects.add(getSkeletonA());
        }
        if (!(null == getSkeletonB())) {
            theseObjects.add(getSkeletonB());
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getSimpleMappings()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getChainMappings()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed51 child: getUnmappedBones()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getSkeletonA()!= null)&&getSkeletonA().equals(toRemove)) {
            setSkeletonA(null);
            return true;
        }
        if ((getSkeletonB()!= null)&&getSkeletonB().equals(toRemove)) {
            setSkeletonB(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed51)&&removeFromSimpleMappings(((org.tes.hkx.lib.ext.Unnamed51) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed51)&&removeFromChainMappings(((org.tes.hkx.lib.ext.Unnamed51) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed51)&&removeFromUnmappedBones(((org.tes.hkx.lib.ext.Unnamed51) toRemove))) {
            return true;
        }
        return false;
    }

}
