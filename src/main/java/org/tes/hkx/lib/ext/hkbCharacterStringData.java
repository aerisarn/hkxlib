
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x655b42bc")
@XmlType(propOrder = {
    "deformableSkinNames",
    "rigidSkinNames",
    "animationNames",
    "animationFilenames",
    "characterPropertyNames",
    "retargetingSkeletonMapperFilenames",
    "lodNames",
    "mirroredSyncPointSubstringsA",
    "mirroredSyncPointSubstringsB",
    "name",
    "rigName",
    "ragdollName",
    "behaviorFilename"
})
public class hkbCharacterStringData
    extends HkobjectType
    implements IHkVisitable
{

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"deformableSkinNames\"]/text()")
    private ArrayList<String> deformableSkinNames;
    @XmlPath("hkparam[@name=\"deformableSkinNames\"]/@numelements")
    private Integer numdeformableSkinNames;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"rigidSkinNames\"]/text()")
    private ArrayList<String> rigidSkinNames;
    @XmlPath("hkparam[@name=\"rigidSkinNames\"]/@numelements")
    private Integer numrigidSkinNames;
    @XmlElement(name = "hkparam[@name=\"animationNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> animationNames;
    @XmlPath("hkparam[@name=\"animationNames\"]/@numelements")
    private Integer numanimationNames;
    @XmlElement(name = "hkparam[@name=\"animationFilenames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> animationFilenames;
    @XmlPath("hkparam[@name=\"animationFilenames\"]/@numelements")
    private Integer numanimationFilenames;
    @XmlElement(name = "hkparam[@name=\"characterPropertyNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> characterPropertyNames;
    @XmlPath("hkparam[@name=\"characterPropertyNames\"]/@numelements")
    private Integer numcharacterPropertyNames;
    @XmlElement(name = "hkparam[@name=\"retargetingSkeletonMapperFilenames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> retargetingSkeletonMapperFilenames;
    @XmlPath("hkparam[@name=\"retargetingSkeletonMapperFilenames\"]/@numelements")
    private Integer numretargetingSkeletonMapperFilenames;
    @XmlElement(name = "hkparam[@name=\"lodNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> lodNames;
    @XmlPath("hkparam[@name=\"lodNames\"]/@numelements")
    private Integer numlodNames;
    @XmlElement(name = "hkparam[@name=\"mirroredSyncPointSubstringsA\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> mirroredSyncPointSubstringsA;
    @XmlPath("hkparam[@name=\"mirroredSyncPointSubstringsA\"]/@numelements")
    private Integer nummirroredSyncPointSubstringsA;
    @XmlElement(name = "hkparam[@name=\"mirroredSyncPointSubstringsB\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> mirroredSyncPointSubstringsB;
    @XmlPath("hkparam[@name=\"mirroredSyncPointSubstringsB\"]/@numelements")
    private Integer nummirroredSyncPointSubstringsB;
    private String childname;
    private String rigName;
    private String ragdollName;
    private String behaviorFilename;

    public hkbCharacterStringData() {
        deformableSkinNames = new ArrayList<String>();
        numdeformableSkinNames = 0;
        rigidSkinNames = new ArrayList<String>();
        numrigidSkinNames = 0;
        animationNames = new ArrayList<String>();
        numanimationNames = 0;
        animationFilenames = new ArrayList<String>();
        numanimationFilenames = 0;
        characterPropertyNames = new ArrayList<String>();
        numcharacterPropertyNames = 0;
        retargetingSkeletonMapperFilenames = new ArrayList<String>();
        numretargetingSkeletonMapperFilenames = 0;
        lodNames = new ArrayList<String>();
        numlodNames = 0;
        mirroredSyncPointSubstringsA = new ArrayList<String>();
        nummirroredSyncPointSubstringsA = 0;
        mirroredSyncPointSubstringsB = new ArrayList<String>();
        nummirroredSyncPointSubstringsB = 0;
        setName("Character01");
        setRigName("CharacterAssets\\Skeleton.hkx");
        setRagdollName("\u2400");
        setBehaviorFilename("Behaviors\\Behavior00.hkx");
        setClazz("hkbCharacterStringData");
    }

    public Integer getNumDeformableSkinNames() {
        return numdeformableSkinNames;
    }

    public Iterable<String> getDeformableSkinNames() {
        return deformableSkinNames;
    }

    public String getDeformableSkinNamesAt(int index) {
        return deformableSkinNames.get(index);
    }

    public boolean addToDeformableSkinNames(String newDeformableSkinNames) {
        if (deformableSkinNames.add(newDeformableSkinNames)) {
            numdeformableSkinNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromDeformableSkinNames(String deformableSkinNamesToRemove) {
        if (deformableSkinNames.remove(deformableSkinNamesToRemove)) {
            numdeformableSkinNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromDeformableSkinNamesAt(int index) {
        String toRemove;
        toRemove = deformableSkinNames.remove(index);
        if (!(null == toRemove)) {
            numdeformableSkinNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumRigidSkinNames() {
        return numrigidSkinNames;
    }

    public Iterable<String> getRigidSkinNames() {
        return rigidSkinNames;
    }

    public String getRigidSkinNamesAt(int index) {
        return rigidSkinNames.get(index);
    }

    public boolean addToRigidSkinNames(String newRigidSkinNames) {
        if (rigidSkinNames.add(newRigidSkinNames)) {
            numrigidSkinNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromRigidSkinNames(String rigidSkinNamesToRemove) {
        if (rigidSkinNames.remove(rigidSkinNamesToRemove)) {
            numrigidSkinNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromRigidSkinNamesAt(int index) {
        String toRemove;
        toRemove = rigidSkinNames.remove(index);
        if (!(null == toRemove)) {
            numrigidSkinNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumAnimationNames() {
        return numanimationNames;
    }

    public Iterable<String> getAnimationNames() {
        return animationNames;
    }

    public String getAnimationNamesAt(int index) {
        return animationNames.get(index);
    }

    public boolean addToAnimationNames(String newAnimationNames) {
        if (animationNames.add(newAnimationNames)) {
            numanimationNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAnimationNames(String animationNamesToRemove) {
        if (animationNames.remove(animationNamesToRemove)) {
            numanimationNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromAnimationNamesAt(int index) {
        String toRemove;
        toRemove = animationNames.remove(index);
        if (!(null == toRemove)) {
            numanimationNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumAnimationFilenames() {
        return numanimationFilenames;
    }

    public Iterable<String> getAnimationFilenames() {
        return animationFilenames;
    }

    public String getAnimationFilenamesAt(int index) {
        return animationFilenames.get(index);
    }

    public boolean addToAnimationFilenames(String newAnimationFilenames) {
        if (animationFilenames.add(newAnimationFilenames)) {
            numanimationFilenames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAnimationFilenames(String animationFilenamesToRemove) {
        if (animationFilenames.remove(animationFilenamesToRemove)) {
            numanimationFilenames += -1;
            return true;
        }
        return false;
    }

    public String removeFromAnimationFilenamesAt(int index) {
        String toRemove;
        toRemove = animationFilenames.remove(index);
        if (!(null == toRemove)) {
            numanimationFilenames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumCharacterPropertyNames() {
        return numcharacterPropertyNames;
    }

    public Iterable<String> getCharacterPropertyNames() {
        return characterPropertyNames;
    }

    public String getCharacterPropertyNamesAt(int index) {
        return characterPropertyNames.get(index);
    }

    public boolean addToCharacterPropertyNames(String newCharacterPropertyNames) {
        if (characterPropertyNames.add(newCharacterPropertyNames)) {
            numcharacterPropertyNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromCharacterPropertyNames(String characterPropertyNamesToRemove) {
        if (characterPropertyNames.remove(characterPropertyNamesToRemove)) {
            numcharacterPropertyNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromCharacterPropertyNamesAt(int index) {
        String toRemove;
        toRemove = characterPropertyNames.remove(index);
        if (!(null == toRemove)) {
            numcharacterPropertyNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumRetargetingSkeletonMapperFilenames() {
        return numretargetingSkeletonMapperFilenames;
    }

    public Iterable<String> getRetargetingSkeletonMapperFilenames() {
        return retargetingSkeletonMapperFilenames;
    }

    public String getRetargetingSkeletonMapperFilenamesAt(int index) {
        return retargetingSkeletonMapperFilenames.get(index);
    }

    public boolean addToRetargetingSkeletonMapperFilenames(String newRetargetingSkeletonMapperFilenames) {
        if (retargetingSkeletonMapperFilenames.add(newRetargetingSkeletonMapperFilenames)) {
            numretargetingSkeletonMapperFilenames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromRetargetingSkeletonMapperFilenames(String retargetingSkeletonMapperFilenamesToRemove) {
        if (retargetingSkeletonMapperFilenames.remove(retargetingSkeletonMapperFilenamesToRemove)) {
            numretargetingSkeletonMapperFilenames += -1;
            return true;
        }
        return false;
    }

    public String removeFromRetargetingSkeletonMapperFilenamesAt(int index) {
        String toRemove;
        toRemove = retargetingSkeletonMapperFilenames.remove(index);
        if (!(null == toRemove)) {
            numretargetingSkeletonMapperFilenames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumLodNames() {
        return numlodNames;
    }

    public Iterable<String> getLodNames() {
        return lodNames;
    }

    public String getLodNamesAt(int index) {
        return lodNames.get(index);
    }

    public boolean addToLodNames(String newLodNames) {
        if (lodNames.add(newLodNames)) {
            numlodNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromLodNames(String lodNamesToRemove) {
        if (lodNames.remove(lodNamesToRemove)) {
            numlodNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromLodNamesAt(int index) {
        String toRemove;
        toRemove = lodNames.remove(index);
        if (!(null == toRemove)) {
            numlodNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumMirroredSyncPointSubstringsA() {
        return nummirroredSyncPointSubstringsA;
    }

    public Iterable<String> getMirroredSyncPointSubstringsA() {
        return mirroredSyncPointSubstringsA;
    }

    public String getMirroredSyncPointSubstringsAAt(int index) {
        return mirroredSyncPointSubstringsA.get(index);
    }

    public boolean addToMirroredSyncPointSubstringsA(String newMirroredSyncPointSubstringsA) {
        if (mirroredSyncPointSubstringsA.add(newMirroredSyncPointSubstringsA)) {
            nummirroredSyncPointSubstringsA += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromMirroredSyncPointSubstringsA(String mirroredSyncPointSubstringsAToRemove) {
        if (mirroredSyncPointSubstringsA.remove(mirroredSyncPointSubstringsAToRemove)) {
            nummirroredSyncPointSubstringsA += -1;
            return true;
        }
        return false;
    }

    public String removeFromMirroredSyncPointSubstringsAAt(int index) {
        String toRemove;
        toRemove = mirroredSyncPointSubstringsA.remove(index);
        if (!(null == toRemove)) {
            nummirroredSyncPointSubstringsA += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumMirroredSyncPointSubstringsB() {
        return nummirroredSyncPointSubstringsB;
    }

    public Iterable<String> getMirroredSyncPointSubstringsB() {
        return mirroredSyncPointSubstringsB;
    }

    public String getMirroredSyncPointSubstringsBAt(int index) {
        return mirroredSyncPointSubstringsB.get(index);
    }

    public boolean addToMirroredSyncPointSubstringsB(String newMirroredSyncPointSubstringsB) {
        if (mirroredSyncPointSubstringsB.add(newMirroredSyncPointSubstringsB)) {
            nummirroredSyncPointSubstringsB += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromMirroredSyncPointSubstringsB(String mirroredSyncPointSubstringsBToRemove) {
        if (mirroredSyncPointSubstringsB.remove(mirroredSyncPointSubstringsBToRemove)) {
            nummirroredSyncPointSubstringsB += -1;
            return true;
        }
        return false;
    }

    public String removeFromMirroredSyncPointSubstringsBAt(int index) {
        String toRemove;
        toRemove = mirroredSyncPointSubstringsB.remove(index);
        if (!(null == toRemove)) {
            nummirroredSyncPointSubstringsB += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"rigName\"]/text()")
    public String getRigName() {
        return rigName;
    }

    @XmlPath("hkparam[@name=\"rigName\"]/text()")
    public void setRigName(String newRigName) {
        this.rigName = newRigName;
    }

    @XmlPath("hkparam[@name=\"ragdollName\"]/text()")
    public String getRagdollName() {
        return ragdollName;
    }

    @XmlPath("hkparam[@name=\"ragdollName\"]/text()")
    public void setRagdollName(String newRagdollName) {
        this.ragdollName = newRagdollName;
    }

    @XmlPath("hkparam[@name=\"behaviorFilename\"]/text()")
    public String getBehaviorFilename() {
        return behaviorFilename;
    }

    @XmlPath("hkparam[@name=\"behaviorFilename\"]/text()")
    public void setBehaviorFilename(String newBehaviorFilename) {
        this.behaviorFilename = newBehaviorFilename;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        return visitor.getResults();
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
