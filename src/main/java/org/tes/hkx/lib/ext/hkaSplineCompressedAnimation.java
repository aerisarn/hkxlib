
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
@XmlDiscriminatorValue("0x792ee0bb")
@XmlType(propOrder = {
    "type",
    "duration",
    "numberOfTransformTracks",
    "numberOfFloatTracks",
    "extractedMotion",
    "annotationTracks",
    "numFrames",
    "numBlocks",
    "maxFramesPerBlock",
    "maskAndQuantizationSize",
    "blockDuration",
    "blockInverseDuration",
    "frameDuration",
    "blockOffsets",
    "floatBlockOffsets",
    "transformOffsets",
    "floatOffsets",
    "data",
    "endian"
})
public class hkaSplineCompressedAnimation
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String type;
    private String duration;
    private String numberOfTransformTracks;
    private String numberOfFloatTracks;
    private hkaDefaultAnimatedReferenceFrame extractedMotion;
    @XmlElement(name = "hkparam[@name=\"annotationTracks\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerTrackInfo> annotationTracks;
    @XmlPath("hkparam[@name=\"annotationTracks\"]/@numelements")
    private Integer numannotationTracks;
    private String numFrames;
    private String numBlocks;
    private String maxFramesPerBlock;
    private String maskAndQuantizationSize;
    private String blockDuration;
    private String blockInverseDuration;
    private String frameDuration;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"blockOffsets\"]/text()")
    private ArrayList<String> blockOffsets;
    @XmlPath("hkparam[@name=\"blockOffsets\"]/@numelements")
    private Integer numblockOffsets;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"floatBlockOffsets\"]/text()")
    private ArrayList<String> floatBlockOffsets;
    @XmlPath("hkparam[@name=\"floatBlockOffsets\"]/@numelements")
    private Integer numfloatBlockOffsets;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"transformOffsets\"]/text()")
    private ArrayList<String> transformOffsets;
    @XmlPath("hkparam[@name=\"transformOffsets\"]/@numelements")
    private Integer numtransformOffsets;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"floatOffsets\"]/text()")
    private ArrayList<String> floatOffsets;
    @XmlPath("hkparam[@name=\"floatOffsets\"]/@numelements")
    private Integer numfloatOffsets;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"data\"]/text()")
    private ArrayList<String> data;
    @XmlPath("hkparam[@name=\"data\"]/@numelements")
    private Integer numdata;
    private String endian;

    public hkaSplineCompressedAnimation() {
        setType("HK_SPLINE_COMPRESSED_ANIMATION");
        setDuration("1.000000");
        setNumberOfTransformTracks("99");
        setNumberOfFloatTracks("0");
        setExtractedMotion(null);
        annotationTracks = new ArrayList<org.tes.hkx.lib.ext.innerTrackInfo>();
        numannotationTracks = 0;
        setNumFrames("31");
        setNumBlocks("1");
        setMaxFramesPerBlock("256");
        setMaskAndQuantizationSize("400");
        setBlockDuration("8.500000");
        setBlockInverseDuration("0.117647");
        setFrameDuration("0.033333");
        blockOffsets = new ArrayList<String>();
        numblockOffsets = 0;
        floatBlockOffsets = new ArrayList<String>();
        numfloatBlockOffsets = 0;
        transformOffsets = new ArrayList<String>();
        numtransformOffsets = 0;
        floatOffsets = new ArrayList<String>();
        numfloatOffsets = 0;
        data = new ArrayList<String>();
        numdata = 0;
        setEndian("0");
        setClazz("hkaSplineCompressedAnimation");
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public String getDuration() {
        return duration;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public void setDuration(String newDuration) {
        this.duration = newDuration;
    }

    @XmlPath("hkparam[@name=\"numberOfTransformTracks\"]/text()")
    public String getNumberOfTransformTracks() {
        return numberOfTransformTracks;
    }

    @XmlPath("hkparam[@name=\"numberOfTransformTracks\"]/text()")
    public void setNumberOfTransformTracks(String newNumberOfTransformTracks) {
        this.numberOfTransformTracks = newNumberOfTransformTracks;
    }

    @XmlPath("hkparam[@name=\"numberOfFloatTracks\"]/text()")
    public String getNumberOfFloatTracks() {
        return numberOfFloatTracks;
    }

    @XmlPath("hkparam[@name=\"numberOfFloatTracks\"]/text()")
    public void setNumberOfFloatTracks(String newNumberOfFloatTracks) {
        this.numberOfFloatTracks = newNumberOfFloatTracks;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"extractedMotion\"]/text()")
    @ObjectLink
    public hkaDefaultAnimatedReferenceFrame getExtractedMotion() {
        return extractedMotion;
    }

    public void setExtractedMotion(hkaDefaultAnimatedReferenceFrame newExtractedMotion) {
        this.extractedMotion = newExtractedMotion;
    }

    public Integer getNumAnnotationTracks() {
        return numannotationTracks;
    }

    public Iterable<org.tes.hkx.lib.ext.innerTrackInfo> getAnnotationTracks() {
        return annotationTracks;
    }

    public org.tes.hkx.lib.ext.innerTrackInfo getAnnotationTracksAt(int index) {
        return annotationTracks.get(index);
    }

    public boolean addToAnnotationTracks(org.tes.hkx.lib.ext.innerTrackInfo newAnnotationTracks) {
        if (annotationTracks.add(newAnnotationTracks)) {
            numannotationTracks += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromAnnotationTracks(org.tes.hkx.lib.ext.innerTrackInfo annotationTracksToRemove) {
        if (annotationTracks.remove(annotationTracksToRemove)) {
            numannotationTracks += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerTrackInfo removeFromAnnotationTracksAt(int index) {
        org.tes.hkx.lib.ext.innerTrackInfo toRemove;
        toRemove = annotationTracks.remove(index);
        if (!(null == toRemove)) {
            numannotationTracks += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"numFrames\"]/text()")
    public String getNumFrames() {
        return numFrames;
    }

    @XmlPath("hkparam[@name=\"numFrames\"]/text()")
    public void setNumFrames(String newNumFrames) {
        this.numFrames = newNumFrames;
    }

    @XmlPath("hkparam[@name=\"numBlocks\"]/text()")
    public String getNumBlocks() {
        return numBlocks;
    }

    @XmlPath("hkparam[@name=\"numBlocks\"]/text()")
    public void setNumBlocks(String newNumBlocks) {
        this.numBlocks = newNumBlocks;
    }

    @XmlPath("hkparam[@name=\"maxFramesPerBlock\"]/text()")
    public String getMaxFramesPerBlock() {
        return maxFramesPerBlock;
    }

    @XmlPath("hkparam[@name=\"maxFramesPerBlock\"]/text()")
    public void setMaxFramesPerBlock(String newMaxFramesPerBlock) {
        this.maxFramesPerBlock = newMaxFramesPerBlock;
    }

    @XmlPath("hkparam[@name=\"maskAndQuantizationSize\"]/text()")
    public String getMaskAndQuantizationSize() {
        return maskAndQuantizationSize;
    }

    @XmlPath("hkparam[@name=\"maskAndQuantizationSize\"]/text()")
    public void setMaskAndQuantizationSize(String newMaskAndQuantizationSize) {
        this.maskAndQuantizationSize = newMaskAndQuantizationSize;
    }

    @XmlPath("hkparam[@name=\"blockDuration\"]/text()")
    public String getBlockDuration() {
        return blockDuration;
    }

    @XmlPath("hkparam[@name=\"blockDuration\"]/text()")
    public void setBlockDuration(String newBlockDuration) {
        this.blockDuration = newBlockDuration;
    }

    @XmlPath("hkparam[@name=\"blockInverseDuration\"]/text()")
    public String getBlockInverseDuration() {
        return blockInverseDuration;
    }

    @XmlPath("hkparam[@name=\"blockInverseDuration\"]/text()")
    public void setBlockInverseDuration(String newBlockInverseDuration) {
        this.blockInverseDuration = newBlockInverseDuration;
    }

    @XmlPath("hkparam[@name=\"frameDuration\"]/text()")
    public String getFrameDuration() {
        return frameDuration;
    }

    @XmlPath("hkparam[@name=\"frameDuration\"]/text()")
    public void setFrameDuration(String newFrameDuration) {
        this.frameDuration = newFrameDuration;
    }

    public Integer getNumBlockOffsets() {
        return numblockOffsets;
    }

    public Iterable<String> getBlockOffsets() {
        return blockOffsets;
    }

    public String getBlockOffsetsAt(int index) {
        return blockOffsets.get(index);
    }

    public boolean addToBlockOffsets(String newBlockOffsets) {
        if (blockOffsets.add(newBlockOffsets)) {
            numblockOffsets += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBlockOffsets(String blockOffsetsToRemove) {
        if (blockOffsets.remove(blockOffsetsToRemove)) {
            numblockOffsets += -1;
            return true;
        }
        return false;
    }

    public String removeFromBlockOffsetsAt(int index) {
        String toRemove;
        toRemove = blockOffsets.remove(index);
        if (!(null == toRemove)) {
            numblockOffsets += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumFloatBlockOffsets() {
        return numfloatBlockOffsets;
    }

    public Iterable<String> getFloatBlockOffsets() {
        return floatBlockOffsets;
    }

    public String getFloatBlockOffsetsAt(int index) {
        return floatBlockOffsets.get(index);
    }

    public boolean addToFloatBlockOffsets(String newFloatBlockOffsets) {
        if (floatBlockOffsets.add(newFloatBlockOffsets)) {
            numfloatBlockOffsets += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromFloatBlockOffsets(String floatBlockOffsetsToRemove) {
        if (floatBlockOffsets.remove(floatBlockOffsetsToRemove)) {
            numfloatBlockOffsets += -1;
            return true;
        }
        return false;
    }

    public String removeFromFloatBlockOffsetsAt(int index) {
        String toRemove;
        toRemove = floatBlockOffsets.remove(index);
        if (!(null == toRemove)) {
            numfloatBlockOffsets += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumTransformOffsets() {
        return numtransformOffsets;
    }

    public Iterable<String> getTransformOffsets() {
        return transformOffsets;
    }

    public String getTransformOffsetsAt(int index) {
        return transformOffsets.get(index);
    }

    public boolean addToTransformOffsets(String newTransformOffsets) {
        if (transformOffsets.add(newTransformOffsets)) {
            numtransformOffsets += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromTransformOffsets(String transformOffsetsToRemove) {
        if (transformOffsets.remove(transformOffsetsToRemove)) {
            numtransformOffsets += -1;
            return true;
        }
        return false;
    }

    public String removeFromTransformOffsetsAt(int index) {
        String toRemove;
        toRemove = transformOffsets.remove(index);
        if (!(null == toRemove)) {
            numtransformOffsets += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumFloatOffsets() {
        return numfloatOffsets;
    }

    public Iterable<String> getFloatOffsets() {
        return floatOffsets;
    }

    public String getFloatOffsetsAt(int index) {
        return floatOffsets.get(index);
    }

    public boolean addToFloatOffsets(String newFloatOffsets) {
        if (floatOffsets.add(newFloatOffsets)) {
            numfloatOffsets += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromFloatOffsets(String floatOffsetsToRemove) {
        if (floatOffsets.remove(floatOffsetsToRemove)) {
            numfloatOffsets += -1;
            return true;
        }
        return false;
    }

    public String removeFromFloatOffsetsAt(int index) {
        String toRemove;
        toRemove = floatOffsets.remove(index);
        if (!(null == toRemove)) {
            numfloatOffsets += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumData() {
        return numdata;
    }

    public Iterable<String> getData() {
        return data;
    }

    public String getDataAt(int index) {
        return data.get(index);
    }

    public boolean addToData(String newData) {
        if (data.add(newData)) {
            numdata += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromData(String dataToRemove) {
        if (data.remove(dataToRemove)) {
            numdata += -1;
            return true;
        }
        return false;
    }

    public String removeFromDataAt(int index) {
        String toRemove;
        toRemove = data.remove(index);
        if (!(null == toRemove)) {
            numdata += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"endian\"]/text()")
    public String getEndian() {
        return endian;
    }

    @XmlPath("hkparam[@name=\"endian\"]/text()")
    public void setEndian(String newEndian) {
        this.endian = newEndian;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getExtractedMotion())) {
            getExtractedMotion().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.innerTrackInfo child: getAnnotationTracks()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getExtractedMotion())) {
            getExtractedMotion().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.innerTrackInfo child: getAnnotationTracks()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getExtractedMotion())) {
            theseObjects.add(getExtractedMotion());
        }
        for (org.tes.hkx.lib.ext.innerTrackInfo child: getAnnotationTracks()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getExtractedMotion()!= null)&&getExtractedMotion().equals(toRemove)) {
            setExtractedMotion(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerTrackInfo)&&removeFromAnnotationTracks(((org.tes.hkx.lib.ext.innerTrackInfo) toRemove))) {
            return true;
        }
        return false;
    }

}
