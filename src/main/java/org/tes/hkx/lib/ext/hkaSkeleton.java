
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x366e8220")
@XmlType(propOrder = {
    "name",
    "parentIndices",
    "bones",
    "referencePose",
    "referenceFloats",
    "floatSlots",
    "localFrames"
})
public class hkaSkeleton
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String childname;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"parentIndices\"]/text()")
    private ArrayList<String> parentIndices;
    @XmlPath("hkparam[@name=\"parentIndices\"]/@numelements")
    private Integer numparentIndices;
    @XmlElement(name = "hkparam[@name=\"bones\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerBoneInfo> bones;
    @XmlPath("hkparam[@name=\"bones\"]/@numelements")
    private Integer numbones;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"referencePose\"]/text()")
    private ArrayList<String> referencePose;
    @XmlPath("hkparam[@name=\"referencePose\"]/@numelements")
    private Integer numreferencePose;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"referenceFloats\"]/text()")
    private ArrayList<String> referenceFloats;
    @XmlPath("hkparam[@name=\"referenceFloats\"]/@numelements")
    private Integer numreferenceFloats;
    @XmlElement(name = "hkparam[@name=\"floatSlots\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> floatSlots;
    @XmlPath("hkparam[@name=\"floatSlots\"]/@numelements")
    private Integer numfloatSlots;
    @XmlElement(name = "hkparam[@name=\"localFrames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> localFrames;
    @XmlPath("hkparam[@name=\"localFrames\"]/@numelements")
    private Integer numlocalFrames;

    public hkaSkeleton() {
        setName("Base01");
        parentIndices = new ArrayList<String>();
        numparentIndices = 0;
        bones = new ArrayList<org.tes.hkx.lib.ext.innerBoneInfo>();
        numbones = 0;
        referencePose = new ArrayList<String>();
        numreferencePose = 0;
        referenceFloats = new ArrayList<String>();
        numreferenceFloats = 0;
        floatSlots = new ArrayList<String>();
        numfloatSlots = 0;
        localFrames = new ArrayList<String>();
        numlocalFrames = 0;
        setClazz("hkaSkeleton");
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumParentIndices() {
        return numparentIndices;
    }

    public Iterable<String> getParentIndices() {
        return parentIndices;
    }

    public String getParentIndicesAt(int index) {
        return parentIndices.get(index);
    }

    public boolean addToParentIndices(String newParentIndices) {
        if (parentIndices.add(newParentIndices)) {
            numparentIndices += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromParentIndices(String parentIndicesToRemove) {
        if (parentIndices.remove(parentIndicesToRemove)) {
            numparentIndices += -1;
            return true;
        }
        return false;
    }

    public String removeFromParentIndicesAt(int index) {
        String toRemove;
        toRemove = parentIndices.remove(index);
        if (!(null == toRemove)) {
            numparentIndices += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumBones() {
        return numbones;
    }

    public Iterable<org.tes.hkx.lib.ext.innerBoneInfo> getBones() {
        return bones;
    }

    public org.tes.hkx.lib.ext.innerBoneInfo getBonesAt(int index) {
        return bones.get(index);
    }

    public boolean addToBones(org.tes.hkx.lib.ext.innerBoneInfo newBones) {
        if (bones.add(newBones)) {
            numbones += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromBones(org.tes.hkx.lib.ext.innerBoneInfo bonesToRemove) {
        if (bones.remove(bonesToRemove)) {
            numbones += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerBoneInfo removeFromBonesAt(int index) {
        org.tes.hkx.lib.ext.innerBoneInfo toRemove;
        toRemove = bones.remove(index);
        if (!(null == toRemove)) {
            numbones += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumReferencePose() {
        return numreferencePose;
    }

    public Iterable<String> getReferencePose() {
        return referencePose;
    }

    public String getReferencePoseAt(int index) {
        return referencePose.get(index);
    }

    public boolean addToReferencePose(String newReferencePose) {
        if (referencePose.add(newReferencePose)) {
            numreferencePose += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromReferencePose(String referencePoseToRemove) {
        if (referencePose.remove(referencePoseToRemove)) {
            numreferencePose += -1;
            return true;
        }
        return false;
    }

    public String removeFromReferencePoseAt(int index) {
        String toRemove;
        toRemove = referencePose.remove(index);
        if (!(null == toRemove)) {
            numreferencePose += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumReferenceFloats() {
        return numreferenceFloats;
    }

    public Iterable<String> getReferenceFloats() {
        return referenceFloats;
    }

    public String getReferenceFloatsAt(int index) {
        return referenceFloats.get(index);
    }

    public boolean addToReferenceFloats(String newReferenceFloats) {
        if (referenceFloats.add(newReferenceFloats)) {
            numreferenceFloats += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromReferenceFloats(String referenceFloatsToRemove) {
        if (referenceFloats.remove(referenceFloatsToRemove)) {
            numreferenceFloats += -1;
            return true;
        }
        return false;
    }

    public String removeFromReferenceFloatsAt(int index) {
        String toRemove;
        toRemove = referenceFloats.remove(index);
        if (!(null == toRemove)) {
            numreferenceFloats += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumFloatSlots() {
        return numfloatSlots;
    }

    public Iterable<String> getFloatSlots() {
        return floatSlots;
    }

    public String getFloatSlotsAt(int index) {
        return floatSlots.get(index);
    }

    public boolean addToFloatSlots(String newFloatSlots) {
        if (floatSlots.add(newFloatSlots)) {
            numfloatSlots += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromFloatSlots(String floatSlotsToRemove) {
        if (floatSlots.remove(floatSlotsToRemove)) {
            numfloatSlots += -1;
            return true;
        }
        return false;
    }

    public String removeFromFloatSlotsAt(int index) {
        String toRemove;
        toRemove = floatSlots.remove(index);
        if (!(null == toRemove)) {
            numfloatSlots += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumLocalFrames() {
        return numlocalFrames;
    }

    public Iterable<String> getLocalFrames() {
        return localFrames;
    }

    public String getLocalFramesAt(int index) {
        return localFrames.get(index);
    }

    public boolean addToLocalFrames(String newLocalFrames) {
        if (localFrames.add(newLocalFrames)) {
            numlocalFrames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromLocalFrames(String localFramesToRemove) {
        if (localFrames.remove(localFramesToRemove)) {
            numlocalFrames += -1;
            return true;
        }
        return false;
    }

    public String removeFromLocalFramesAt(int index) {
        String toRemove;
        toRemove = localFrames.remove(index);
        if (!(null == toRemove)) {
            numlocalFrames += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerBoneInfo child: getBones()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerBoneInfo child: getBones()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerBoneInfo child: getBones()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerBoneInfo)&&removeFromBones(((org.tes.hkx.lib.ext.innerBoneInfo) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
