
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "keyFrameHierarchyControlData",
    "durationToBlend"
})
public class Unnamed82 implements IHkContainer, IHkVisitable
{

    private Unnamed83 keyFrameHierarchyControlData;
    private String durationToBlend;

    public Unnamed82() {
        setKeyFrameHierarchyControlData(null);
        setDurationToBlend(null);
    }

    @XmlElement(name = "hkparam[@name=\"keyFrameHierarchyControlData\"]/hkobject")
    public Unnamed83 getKeyFrameHierarchyControlData() {
        return keyFrameHierarchyControlData;
    }

    public void setKeyFrameHierarchyControlData(Unnamed83 newKeyFrameHierarchyControlData) {
        this.keyFrameHierarchyControlData = newKeyFrameHierarchyControlData;
    }

    @XmlPath("hkparam[@name=\"durationToBlend\"]/text()")
    public String getDurationToBlend() {
        return durationToBlend;
    }

    @XmlPath("hkparam[@name=\"durationToBlend\"]/text()")
    public void setDurationToBlend(String newDurationToBlend) {
        this.durationToBlend = newDurationToBlend;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getKeyFrameHierarchyControlData())) {
            getKeyFrameHierarchyControlData().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getKeyFrameHierarchyControlData())) {
            getKeyFrameHierarchyControlData().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getKeyFrameHierarchyControlData())) {
            theseObjects.add(getKeyFrameHierarchyControlData());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getKeyFrameHierarchyControlData()!= null)&&getKeyFrameHierarchyControlData().equals(toRemove)) {
            setKeyFrameHierarchyControlData(null);
            return true;
        }
        return false;
    }

}
