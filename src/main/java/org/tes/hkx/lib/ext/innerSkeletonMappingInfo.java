
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = { "skeletonA", "skeletonB", "simpleMappings", "chainMappings", "unmappedBones",
		"extractedMotionMapping", "keepUnmappedLocal", "mappingType" })
public class innerSkeletonMappingInfo implements IHkContainer, IHkVisitable, IHkInnerObject {

	private hkaSkeleton skeletonA;
	private hkaSkeleton skeletonB;
	@XmlElement(name = "hkparam[@name=\"simpleMappings\"]/hkobject", required = true, nillable = true)
	private ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo> simpleMappings;
	@XmlPath("hkparam[@name=\"simpleMappings\"]/@numelements")
	private Integer numsimpleMappings;
	@XmlElement(name = "hkparam[@name=\"chainMappings\"]/hkobject", required = true, nillable = true)
	private ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo> chainMappings;
	@XmlPath("hkparam[@name=\"chainMappings\"]/@numelements")
	private Integer numchainMappings;
	@XmlElement(name = "hkparam[@name=\"unmappedBones\"]/hkobject", required = true, nillable = true)
	private ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo> unmappedBones;
	@XmlPath("hkparam[@name=\"unmappedBones\"]/@numelements")
	private Integer numunmappedBones;
	private String extractedMotionMapping;
	private String keepUnmappedLocal;
	private String mappingType;

	public innerSkeletonMappingInfo() {
		setSkeletonA(null);
		setSkeletonB(null);
		simpleMappings = new ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo>();
		numsimpleMappings = 0;
		chainMappings = new ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo>();
		numchainMappings = 0;
		unmappedBones = new ArrayList<org.tes.hkx.lib.ext.innerBoneMappingInfo>();
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

	public Iterable<org.tes.hkx.lib.ext.innerBoneMappingInfo> getSimpleMappings() {
		return simpleMappings;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo getSimpleMappingsAt(int index) {
		return simpleMappings.get(index);
	}

	public boolean addToSimpleMappings(org.tes.hkx.lib.ext.innerBoneMappingInfo newSimpleMappings) {
		if (simpleMappings.add(newSimpleMappings)) {
			numsimpleMappings += 1;
			return true;
		}
		return false;
	}

	@ObjectLink
	public boolean removeFromSimpleMappings(org.tes.hkx.lib.ext.innerBoneMappingInfo simpleMappingsToRemove) {
		if (simpleMappings.remove(simpleMappingsToRemove)) {
			numsimpleMappings += -1;
			return true;
		}
		return false;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo removeFromSimpleMappingsAt(int index) {
		org.tes.hkx.lib.ext.innerBoneMappingInfo toRemove;
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

	public Iterable<org.tes.hkx.lib.ext.innerBoneMappingInfo> getChainMappings() {
		return chainMappings;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo getChainMappingsAt(int index) {
		return chainMappings.get(index);
	}

	public boolean addToChainMappings(org.tes.hkx.lib.ext.innerBoneMappingInfo newChainMappings) {
		if (chainMappings.add(newChainMappings)) {
			numchainMappings += 1;
			return true;
		}
		return false;
	}

	@ObjectLink
	public boolean removeFromChainMappings(org.tes.hkx.lib.ext.innerBoneMappingInfo chainMappingsToRemove) {
		if (chainMappings.remove(chainMappingsToRemove)) {
			numchainMappings += -1;
			return true;
		}
		return false;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo removeFromChainMappingsAt(int index) {
		org.tes.hkx.lib.ext.innerBoneMappingInfo toRemove;
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

	public Iterable<org.tes.hkx.lib.ext.innerBoneMappingInfo> getUnmappedBones() {
		return unmappedBones;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo getUnmappedBonesAt(int index) {
		return unmappedBones.get(index);
	}

	public boolean addToUnmappedBones(org.tes.hkx.lib.ext.innerBoneMappingInfo newUnmappedBones) {
		if (unmappedBones.add(newUnmappedBones)) {
			numunmappedBones += 1;
			return true;
		}
		return false;
	}

	@ObjectLink
	public boolean removeFromUnmappedBones(org.tes.hkx.lib.ext.innerBoneMappingInfo unmappedBonesToRemove) {
		if (unmappedBones.remove(unmappedBonesToRemove)) {
			numunmappedBones += -1;
			return true;
		}
		return false;
	}

	public org.tes.hkx.lib.ext.innerBoneMappingInfo removeFromUnmappedBonesAt(int index) {
		org.tes.hkx.lib.ext.innerBoneMappingInfo toRemove;
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
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getSkeletonA())) {
			getSkeletonA().accept(visitor);
		}
		if (!(null == getSkeletonB())) {
			getSkeletonB().accept(visitor);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getSimpleMappings()) {
			child.accept(visitor);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getChainMappings()) {
			child.accept(visitor);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getUnmappedBones()) {
			child.accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getSkeletonA())) {
			getSkeletonA().accept(visitor, this);
		}
		if (!(null == getSkeletonB())) {
			getSkeletonB().accept(visitor, this);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getSimpleMappings()) {
			child.accept(visitor, this);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getChainMappings()) {
			child.accept(visitor, this);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getUnmappedBones()) {
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
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getSimpleMappings()) {
			theseObjects.add(child);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getChainMappings()) {
			theseObjects.add(child);
		}
		for (org.tes.hkx.lib.ext.innerBoneMappingInfo child : getUnmappedBones()) {
			theseObjects.add(child);
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getSkeletonA() != null) && getSkeletonA().equals(toRemove)) {
			setSkeletonA(null);
			return true;
		}
		if ((getSkeletonB() != null) && getSkeletonB().equals(toRemove)) {
			setSkeletonB(null);
			return true;
		}
		if ((toRemove instanceof org.tes.hkx.lib.ext.innerBoneMappingInfo)
				&& removeFromSimpleMappings(((org.tes.hkx.lib.ext.innerBoneMappingInfo) toRemove))) {
			return true;
		}
		if ((toRemove instanceof org.tes.hkx.lib.ext.innerBoneMappingInfo)
				&& removeFromChainMappings(((org.tes.hkx.lib.ext.innerBoneMappingInfo) toRemove))) {
			return true;
		}
		if ((toRemove instanceof org.tes.hkx.lib.ext.innerBoneMappingInfo)
				&& removeFromUnmappedBones(((org.tes.hkx.lib.ext.innerBoneMappingInfo) toRemove))) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "SkeletonMappingInfo";
	}
}
