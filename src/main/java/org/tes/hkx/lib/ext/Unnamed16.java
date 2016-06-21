
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
    "localTime",
    "event",
    "relativeToEndOfClip",
    "acyclic",
    "isAnnotation"
})
public class Unnamed16 implements IHkContainer, IHkVisitable
{

    private String localTime;
    private Unnamed17 event;
    private String relativeToEndOfClip;
    private String acyclic;
    private String isAnnotation;

    public Unnamed16() {
        setLocalTime("0.000000");
        setEvent(null);
        setRelativeToEndOfClip("false");
        setAcyclic("false");
        setIsAnnotation("false");
    }

    @XmlPath("hkparam[@name=\"localTime\"]/text()")
    public String getLocalTime() {
        return localTime;
    }

    @XmlPath("hkparam[@name=\"localTime\"]/text()")
    public void setLocalTime(String newLocalTime) {
        this.localTime = newLocalTime;
    }

    @XmlElement(name = "hkparam[@name=\"event\"]/hkobject")
    public Unnamed17 getEvent() {
        return event;
    }

    public void setEvent(Unnamed17 newEvent) {
        this.event = newEvent;
    }

    @XmlPath("hkparam[@name=\"relativeToEndOfClip\"]/text()")
    public String getRelativeToEndOfClip() {
        return relativeToEndOfClip;
    }

    @XmlPath("hkparam[@name=\"relativeToEndOfClip\"]/text()")
    public void setRelativeToEndOfClip(String newRelativeToEndOfClip) {
        this.relativeToEndOfClip = newRelativeToEndOfClip;
    }

    @XmlPath("hkparam[@name=\"acyclic\"]/text()")
    public String getAcyclic() {
        return acyclic;
    }

    @XmlPath("hkparam[@name=\"acyclic\"]/text()")
    public void setAcyclic(String newAcyclic) {
        this.acyclic = newAcyclic;
    }

    @XmlPath("hkparam[@name=\"isAnnotation\"]/text()")
    public String getIsAnnotation() {
        return isAnnotation;
    }

    @XmlPath("hkparam[@name=\"isAnnotation\"]/text()")
    public void setIsAnnotation(String newIsAnnotation) {
        this.isAnnotation = newIsAnnotation;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getEvent())) {
            getEvent().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getEvent())) {
            getEvent().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getEvent())) {
            theseObjects.add(getEvent());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getEvent()!= null)&&getEvent().equals(toRemove)) {
            setEvent(null);
            return true;
        }
        return false;
    }

}
