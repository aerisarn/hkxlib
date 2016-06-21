
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlDiscriminatorValue("0x6d85e445")
@XmlType(propOrder = {
    "up",
    "forward",
    "duration",
    "referenceFrameSamples"
})
public class hkaDefaultAnimatedReferenceFrame
    extends HkobjectType
    implements IHkVisitable
{

    private String up;
    private String forward;
    private String duration;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"referenceFrameSamples\"]/text()")
    private ArrayList<String> referenceFrameSamples;
    @XmlPath("hkparam[@name=\"referenceFrameSamples\"]/@numelements")
    private Integer numreferenceFrameSamples;

    public hkaDefaultAnimatedReferenceFrame() {
        setUp("(0.000000 0.000000 1.000000 0.000000)");
        setForward("(0.000000 1.000000 0.000000 0.000000)");
        setDuration("4.000000");
        referenceFrameSamples = new ArrayList<String>();
        numreferenceFrameSamples = 0;
        setClazz("hkaDefaultAnimatedReferenceFrame");
    }

    @XmlPath("hkparam[@name=\"up\"]/text()")
    public String getUp() {
        return up;
    }

    @XmlPath("hkparam[@name=\"up\"]/text()")
    public void setUp(String newUp) {
        this.up = newUp;
    }

    @XmlPath("hkparam[@name=\"forward\"]/text()")
    public String getForward() {
        return forward;
    }

    @XmlPath("hkparam[@name=\"forward\"]/text()")
    public void setForward(String newForward) {
        this.forward = newForward;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public String getDuration() {
        return duration;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public void setDuration(String newDuration) {
        this.duration = newDuration;
    }

    public Integer getNumReferenceFrameSamples() {
        return numreferenceFrameSamples;
    }

    public Iterable<String> getReferenceFrameSamples() {
        return referenceFrameSamples;
    }

    public String getReferenceFrameSamplesAt(int index) {
        return referenceFrameSamples.get(index);
    }

    public boolean addToReferenceFrameSamples(String newReferenceFrameSamples) {
        if (referenceFrameSamples.add(newReferenceFrameSamples)) {
            numreferenceFrameSamples += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromReferenceFrameSamples(String referenceFrameSamplesToRemove) {
        if (referenceFrameSamples.remove(referenceFrameSamplesToRemove)) {
            numreferenceFrameSamples += -1;
            return true;
        }
        return false;
    }

    public String removeFromReferenceFrameSamplesAt(int index) {
        String toRemove;
        toRemove = referenceFrameSamples.remove(index);
        if (!(null == toRemove)) {
            numreferenceFrameSamples += -1;
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
