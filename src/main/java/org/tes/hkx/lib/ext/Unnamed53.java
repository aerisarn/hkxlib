
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "trackName",
    "annotations"
})
public class Unnamed53 implements IHkVisitable
{

    private String trackName;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"annotations\"]/text()")
    private ArrayList<String> annotations;
    @XmlPath("hkparam[@name=\"annotations\"]/@numelements")
    private Integer numannotations;

    public Unnamed53() {
        setTrackName("NPC Root [Root]");
        annotations = new ArrayList<String>();
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

    public Iterable<String> getAnnotations() {
        return annotations;
    }

    public String getAnnotationsAt(int index) {
        return annotations.get(index);
    }

    public boolean addToAnnotations(String newAnnotations) {
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

    public String removeFromAnnotationsAt(int index) {
        String toRemove;
        toRemove = annotations.remove(index);
        if (!(null == toRemove)) {
            numannotations += -1;
            return toRemove;
        }
        return null;
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

}
