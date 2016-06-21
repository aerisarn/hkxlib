
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
@XmlDiscriminatorValue("0x8dc20333")
@XmlType(propOrder = {
    "skeletons",
    "animations",
    "bindings",
    "attachments",
    "skins"
})
public class hkaAnimationContainer
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlIDREF
    @XmlPath("hkparam[@name=\"skeletons\"]/text()")
    @XmlList
    private ArrayList<hkaSkeleton> skeletons;
    @XmlPath("hkparam[@name=\"skeletons\"]/@numelements")
    private Integer numskeletons;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"animations\"]/text()")
    @XmlList
    private ArrayList<hkaSplineCompressedAnimation> animations;
    @XmlPath("hkparam[@name=\"animations\"]/@numelements")
    private Integer numanimations;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"bindings\"]/text()")
    @XmlList
    private ArrayList<hkaAnimationBinding> bindings;
    @XmlPath("hkparam[@name=\"bindings\"]/@numelements")
    private Integer numbindings;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"attachments\"]/text()")
    @XmlList
    private ArrayList<hkaAnimationBinding> attachments;
    @XmlPath("hkparam[@name=\"attachments\"]/@numelements")
    private Integer numattachments;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"skins\"]/text()")
    @XmlList
    private ArrayList<hkaAnimationBinding> skins;
    @XmlPath("hkparam[@name=\"skins\"]/@numelements")
    private Integer numskins;

    public hkaAnimationContainer() {
        skeletons = new ArrayList<hkaSkeleton>();
        numskeletons = 0;
        animations = new ArrayList<hkaSplineCompressedAnimation>();
        numanimations = 0;
        bindings = new ArrayList<hkaAnimationBinding>();
        numbindings = 0;
        attachments = new ArrayList<hkaAnimationBinding>();
        numattachments = 0;
        skins = new ArrayList<hkaAnimationBinding>();
        numskins = 0;
        setClazz("hkaAnimationContainer");
    }

    public Integer getNumSkeletons() {
        return numskeletons;
    }

    public Iterable<hkaSkeleton> getSkeletons() {
        return skeletons;
    }

    public hkaSkeleton getSkeletonsAt(int index) {
        return skeletons.get(index);
    }

    public boolean addToSkeletons(hkaSkeleton newSkeletons) {
        if (skeletons.add(newSkeletons)) {
            numskeletons += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromSkeletons(hkaSkeleton skeletonsToRemove) {
        if (skeletons.remove(skeletonsToRemove)) {
            numskeletons += -1;
            return true;
        }
        return false;
    }

    public hkaSkeleton removeFromSkeletonsAt(int index) {
        hkaSkeleton toRemove;
        toRemove = skeletons.remove(index);
        if (!(null == toRemove)) {
            numskeletons += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumAnimations() {
        return numanimations;
    }

    public Iterable<hkaSplineCompressedAnimation> getAnimations() {
        return animations;
    }

    public hkaSplineCompressedAnimation getAnimationsAt(int index) {
        return animations.get(index);
    }

    public boolean addToAnimations(hkaSplineCompressedAnimation newAnimations) {
        if (animations.add(newAnimations)) {
            numanimations += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromAnimations(hkaSplineCompressedAnimation animationsToRemove) {
        if (animations.remove(animationsToRemove)) {
            numanimations += -1;
            return true;
        }
        return false;
    }

    public hkaSplineCompressedAnimation removeFromAnimationsAt(int index) {
        hkaSplineCompressedAnimation toRemove;
        toRemove = animations.remove(index);
        if (!(null == toRemove)) {
            numanimations += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumBindings() {
        return numbindings;
    }

    public Iterable<hkaAnimationBinding> getBindings() {
        return bindings;
    }

    public hkaAnimationBinding getBindingsAt(int index) {
        return bindings.get(index);
    }

    public boolean addToBindings(hkaAnimationBinding newBindings) {
        if (bindings.add(newBindings)) {
            numbindings += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromBindings(hkaAnimationBinding bindingsToRemove) {
        if (bindings.remove(bindingsToRemove)) {
            numbindings += -1;
            return true;
        }
        return false;
    }

    public hkaAnimationBinding removeFromBindingsAt(int index) {
        hkaAnimationBinding toRemove;
        toRemove = bindings.remove(index);
        if (!(null == toRemove)) {
            numbindings += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumAttachments() {
        return numattachments;
    }

    public Iterable<hkaAnimationBinding> getAttachments() {
        return attachments;
    }

    public hkaAnimationBinding getAttachmentsAt(int index) {
        return attachments.get(index);
    }

    public boolean addToAttachments(hkaAnimationBinding newAttachments) {
        if (attachments.add(newAttachments)) {
            numattachments += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromAttachments(hkaAnimationBinding attachmentsToRemove) {
        if (attachments.remove(attachmentsToRemove)) {
            numattachments += -1;
            return true;
        }
        return false;
    }

    public hkaAnimationBinding removeFromAttachmentsAt(int index) {
        hkaAnimationBinding toRemove;
        toRemove = attachments.remove(index);
        if (!(null == toRemove)) {
            numattachments += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumSkins() {
        return numskins;
    }

    public Iterable<hkaAnimationBinding> getSkins() {
        return skins;
    }

    public hkaAnimationBinding getSkinsAt(int index) {
        return skins.get(index);
    }

    public boolean addToSkins(hkaAnimationBinding newSkins) {
        if (skins.add(newSkins)) {
            numskins += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromSkins(hkaAnimationBinding skinsToRemove) {
        if (skins.remove(skinsToRemove)) {
            numskins += -1;
            return true;
        }
        return false;
    }

    public hkaAnimationBinding removeFromSkinsAt(int index) {
        hkaAnimationBinding toRemove;
        toRemove = skins.remove(index);
        if (!(null == toRemove)) {
            numskins += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (hkaSkeleton child: getSkeletons()) {
            child.accept(visitor);
        }
        for (hkaSplineCompressedAnimation child: getAnimations()) {
            child.accept(visitor);
        }
        for (hkaAnimationBinding child: getBindings()) {
            child.accept(visitor);
        }
        for (hkaAnimationBinding child: getAttachments()) {
            child.accept(visitor);
        }
        for (hkaAnimationBinding child: getSkins()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (hkaSkeleton child: getSkeletons()) {
            child.accept(visitor, this);
        }
        for (hkaSplineCompressedAnimation child: getAnimations()) {
            child.accept(visitor, this);
        }
        for (hkaAnimationBinding child: getBindings()) {
            child.accept(visitor, this);
        }
        for (hkaAnimationBinding child: getAttachments()) {
            child.accept(visitor, this);
        }
        for (hkaAnimationBinding child: getSkins()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (hkaSkeleton child: getSkeletons()) {
            theseObjects.add(child);
        }
        for (hkaSplineCompressedAnimation child: getAnimations()) {
            theseObjects.add(child);
        }
        for (hkaAnimationBinding child: getBindings()) {
            theseObjects.add(child);
        }
        for (hkaAnimationBinding child: getAttachments()) {
            theseObjects.add(child);
        }
        for (hkaAnimationBinding child: getSkins()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof hkaSkeleton)&&removeFromSkeletons(((hkaSkeleton) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkaSplineCompressedAnimation)&&removeFromAnimations(((hkaSplineCompressedAnimation) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkaAnimationBinding)&&removeFromBindings(((hkaAnimationBinding) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkaAnimationBinding)&&removeFromAttachments(((hkaAnimationBinding) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkaAnimationBinding)&&removeFromSkins(((hkaAnimationBinding) toRemove))) {
            return true;
        }
        return false;
    }

}
