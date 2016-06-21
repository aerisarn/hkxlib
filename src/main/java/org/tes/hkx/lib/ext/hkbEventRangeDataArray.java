
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlDiscriminatorValue("0x330a56ee")
@XmlType(propOrder = {
    "eventData"
})
public class hkbEventRangeDataArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"eventData\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed3> eventData;
    @XmlPath("hkparam[@name=\"eventData\"]/@numelements")
    private Integer numeventData;

    public hkbEventRangeDataArray() {
        eventData = new ArrayList<org.tes.hkx.lib.ext.Unnamed3>();
        numeventData = 0;
        setClazz("hkbEventRangeDataArray");
    }

    public Integer getNumEventData() {
        return numeventData;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed3> getEventData() {
        return eventData;
    }

    public org.tes.hkx.lib.ext.Unnamed3 getEventDataAt(int index) {
        return eventData.get(index);
    }

    public boolean addToEventData(org.tes.hkx.lib.ext.Unnamed3 newEventData) {
        if (eventData.add(newEventData)) {
            numeventData += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromEventData(org.tes.hkx.lib.ext.Unnamed3 eventDataToRemove) {
        if (eventData.remove(eventDataToRemove)) {
            numeventData += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed3 removeFromEventDataAt(int index) {
        org.tes.hkx.lib.ext.Unnamed3 toRemove;
        toRemove = eventData.remove(index);
        if (!(null == toRemove)) {
            numeventData += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed3 child: getEventData()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed3 child: getEventData()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed3 child: getEventData()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed3)&&removeFromEventData(((org.tes.hkx.lib.ext.Unnamed3) toRemove))) {
            return true;
        }
        return false;
    }

}
