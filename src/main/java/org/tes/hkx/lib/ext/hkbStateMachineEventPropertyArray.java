
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
@XmlDiscriminatorValue("0xb07b4388")
@XmlType(propOrder = {
    "events"
})
public class hkbStateMachineEventPropertyArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"events\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed31> events;
    @XmlPath("hkparam[@name=\"events\"]/@numelements")
    private Integer numevents;

    public hkbStateMachineEventPropertyArray() {
        events = new ArrayList<org.tes.hkx.lib.ext.Unnamed31>();
        numevents = 0;
        setClazz("hkbStateMachineEventPropertyArray");
    }

    public Integer getNumEvents() {
        return numevents;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed31> getEvents() {
        return events;
    }

    public org.tes.hkx.lib.ext.Unnamed31 getEventsAt(int index) {
        return events.get(index);
    }

    public boolean addToEvents(org.tes.hkx.lib.ext.Unnamed31 newEvents) {
        if (events.add(newEvents)) {
            numevents += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromEvents(org.tes.hkx.lib.ext.Unnamed31 eventsToRemove) {
        if (events.remove(eventsToRemove)) {
            numevents += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed31 removeFromEventsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed31 toRemove;
        toRemove = events.remove(index);
        if (!(null == toRemove)) {
            numevents += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed31 child: getEvents()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed31 child: getEvents()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed31 child: getEvents()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed31)&&removeFromEvents(((org.tes.hkx.lib.ext.Unnamed31) toRemove))) {
            return true;
        }
        return false;
    }

}
