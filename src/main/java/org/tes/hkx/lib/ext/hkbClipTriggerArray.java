
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
@XmlDiscriminatorValue("0x59c23a0f")
@XmlType(propOrder = {
    "triggers"
})
public class hkbClipTriggerArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"triggers\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerTrigger> triggers;
    @XmlPath("hkparam[@name=\"triggers\"]/@numelements")
    private Integer numtriggers;

    public hkbClipTriggerArray() {
        triggers = new ArrayList<org.tes.hkx.lib.ext.innerTrigger>();
        numtriggers = 0;
        setClazz("hkbClipTriggerArray");
    }

    public Integer getNumTriggers() {
        return numtriggers;
    }

    public Iterable<org.tes.hkx.lib.ext.innerTrigger> getTriggers() {
        return triggers;
    }

    public org.tes.hkx.lib.ext.innerTrigger getTriggersAt(int index) {
        return triggers.get(index);
    }

    public boolean addToTriggers(org.tes.hkx.lib.ext.innerTrigger newTriggers) {
        if (triggers.add(newTriggers)) {
            numtriggers += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromTriggers(org.tes.hkx.lib.ext.innerTrigger triggersToRemove) {
        if (triggers.remove(triggersToRemove)) {
            numtriggers += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerTrigger removeFromTriggersAt(int index) {
        org.tes.hkx.lib.ext.innerTrigger toRemove;
        toRemove = triggers.remove(index);
        if (!(null == toRemove)) {
            numtriggers += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerTrigger child: getTriggers()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerTrigger child: getTriggers()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerTrigger child: getTriggers()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerTrigger)&&removeFromTriggers(((org.tes.hkx.lib.ext.innerTrigger) toRemove))) {
            return true;
        }
        return false;
    }

}
