
package org.tes.hkx.lib.ext;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "trackName", "annotations" })
public class innerTrackInfo extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String trackName;
	//@XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
	//@XmlPath("hkparam[@name=\"annotations\"]/text()")
	@XmlElement(name = "hkparam[@name=\"annotations\"]/hkobject", required = true, nillable = true)
	@XmlList
	private ArrayList<org.tes.hkx.lib.ext.innerAnnotation> annotations;
	@XmlPath("hkparam[@name=\"annotations\"]/@numelements")
	private Integer numannotations;

	public innerTrackInfo() {
		setTrackName("NPC Root [Root]");
		annotations = new ArrayList<org.tes.hkx.lib.ext.innerAnnotation>();
		numannotations = 0;
	}

	@XmlPath("hkparam[@name=\"trackName\"]/text()")
	public String getTrackName() {
		return trackName;
	}

	@XmlPath("hkparam[@name=\"trackName\"]/text()")
	public void setTrackName(String newTrackName) {
		this.trackName = newTrackName;
	}

	public Integer getNumAnnotations() {
		return numannotations;
	}

	public Iterable<org.tes.hkx.lib.ext.innerAnnotation> getAnnotations() {
		return annotations;
	}

	public org.tes.hkx.lib.ext.innerAnnotation getAnnotationsAt(int index) {
		return annotations.get(index);
	}

	public boolean addToAnnotations(org.tes.hkx.lib.ext.innerAnnotation newAnnotations) {
		if (annotations.add(newAnnotations)) {
			numannotations += 1;
			return true;
		}
		return false;
	}

	public boolean removeFromAnnotations(String annotationsToRemove) {
		if (annotations.remove(annotationsToRemove)) {
			numannotations += -1;
			return true;
		}
		return false;
	}

	public org.tes.hkx.lib.ext.innerAnnotation removeFromAnnotationsAt(int index) {
		org.tes.hkx.lib.ext.innerAnnotation toRemove;
		toRemove = annotations.remove(index);
		if (!(null == toRemove)) {
			numannotations += -1;
			return toRemove;
		}
		return null;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		return visitor.getResults();
	}

	@Override
	public String toString() {
		return "TrackInfo";
	}
}
