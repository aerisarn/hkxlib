
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0x66eac971")
@XmlType(propOrder = {
    "originalSkeletonName",
    "animation",
    "transformTrackToBoneIndices",
    "floatTrackToFloatSlotIndices",
    "blendHint"
})
public class hkaAnimationBinding
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String originalSkeletonName;
    private hkaSplineCompressedAnimation animation;
    @XmlList
    @XmlPath("hkparam[@name=\"transformTrackToBoneIndices\"]/text()")
    private ArrayList<String> transformTrackToBoneIndices;
    @XmlPath("hkparam[@name=\"transformTrackToBoneIndices\"]/@numelements")
    private Integer numtransformTrackToBoneIndices;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"floatTrackToFloatSlotIndices\"]/text()")
    private ArrayList<String> floatTrackToFloatSlotIndices;
    @XmlPath("hkparam[@name=\"floatTrackToFloatSlotIndices\"]/@numelements")
    private Integer numfloatTrackToFloatSlotIndices;
    private String blendHint;

    public hkaAnimationBinding() {
        setOriginalSkeletonName("NPC Root [Root]");
        setAnimation(null);
        transformTrackToBoneIndices = new ArrayList<String>();
        numtransformTrackToBoneIndices = 0;
        floatTrackToFloatSlotIndices = new ArrayList<String>();
        numfloatTrackToFloatSlotIndices = 0;
        setBlendHint("NORMAL");
        setClazz("hkaAnimationBinding");
    }

    @XmlPath("hkparam[@name=\"originalSkeletonName\"]/text()")
    public String getOriginalSkeletonName() {
        return originalSkeletonName;
    }

    @XmlPath("hkparam[@name=\"originalSkeletonName\"]/text()")
    public void setOriginalSkeletonName(String newOriginalSkeletonName) {
        this.originalSkeletonName = newOriginalSkeletonName;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"animation\"]/text()")
    @ObjectLink
    public hkaSplineCompressedAnimation getAnimation() {
        return animation;
    }

    public void setAnimation(hkaSplineCompressedAnimation newAnimation) {
        this.animation = newAnimation;
    }

    public Integer getNumTransformTrackToBoneIndices() {
        return numtransformTrackToBoneIndices;
    }

    public Iterable<String> getTransformTrackToBoneIndices() {
        return transformTrackToBoneIndices;
    }

    public String getTransformTrackToBoneIndicesAt(int index) {
        return transformTrackToBoneIndices.get(index);
    }

    public boolean addToTransformTrackToBoneIndices(String newTransformTrackToBoneIndices) {
        if (transformTrackToBoneIndices.add(newTransformTrackToBoneIndices)) {
            numtransformTrackToBoneIndices += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromTransformTrackToBoneIndices(String transformTrackToBoneIndicesToRemove) {
        if (transformTrackToBoneIndices.remove(transformTrackToBoneIndicesToRemove)) {
            numtransformTrackToBoneIndices += -1;
            return true;
        }
        return false;
    }

    public String removeFromTransformTrackToBoneIndicesAt(int index) {
        String toRemove;
        toRemove = transformTrackToBoneIndices.remove(index);
        if (!(null == toRemove)) {
            numtransformTrackToBoneIndices += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumFloatTrackToFloatSlotIndices() {
        return numfloatTrackToFloatSlotIndices;
    }

    public Iterable<String> getFloatTrackToFloatSlotIndices() {
        return floatTrackToFloatSlotIndices;
    }

    public String getFloatTrackToFloatSlotIndicesAt(int index) {
        return floatTrackToFloatSlotIndices.get(index);
    }

    public boolean addToFloatTrackToFloatSlotIndices(String newFloatTrackToFloatSlotIndices) {
        if (floatTrackToFloatSlotIndices.add(newFloatTrackToFloatSlotIndices)) {
            numfloatTrackToFloatSlotIndices += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromFloatTrackToFloatSlotIndices(String floatTrackToFloatSlotIndicesToRemove) {
        if (floatTrackToFloatSlotIndices.remove(floatTrackToFloatSlotIndicesToRemove)) {
            numfloatTrackToFloatSlotIndices += -1;
            return true;
        }
        return false;
    }

    public String removeFromFloatTrackToFloatSlotIndicesAt(int index) {
        String toRemove;
        toRemove = floatTrackToFloatSlotIndices.remove(index);
        if (!(null == toRemove)) {
            numfloatTrackToFloatSlotIndices += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"blendHint\"]/text()")
    public String getBlendHint() {
        return blendHint;
    }

    @XmlPath("hkparam[@name=\"blendHint\"]/text()")
    public void setBlendHint(String newBlendHint) {
        this.blendHint = newBlendHint;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getAnimation())) {
            getAnimation().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getAnimation())) {
            getAnimation().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getAnimation())) {
            theseObjects.add(getAnimation());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getAnimation()!= null)&&getAnimation().equals(toRemove)) {
            setAnimation(null);
            return true;
        }
        return false;
    }

}
