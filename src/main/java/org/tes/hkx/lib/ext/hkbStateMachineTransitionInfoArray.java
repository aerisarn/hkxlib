
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
@XmlDiscriminatorValue("0xe397b11e")
@XmlType(propOrder = {
    "transitions"
})
public class hkbStateMachineTransitionInfoArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"transitions\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerStateTransitionInfo> transitions;
    @XmlPath("hkparam[@name=\"transitions\"]/@numelements")
    private Integer numtransitions;

    public hkbStateMachineTransitionInfoArray() {
        transitions = new ArrayList<org.tes.hkx.lib.ext.innerStateTransitionInfo>();
        numtransitions = 0;
        setClazz("hkbStateMachineTransitionInfoArray");
    }

    public Integer getNumTransitions() {
        return numtransitions;
    }

    public Iterable<org.tes.hkx.lib.ext.innerStateTransitionInfo> getTransitions() {
        return transitions;
    }

    public org.tes.hkx.lib.ext.innerStateTransitionInfo getTransitionsAt(int index) {
        return transitions.get(index);
    }

    public boolean addToTransitions(org.tes.hkx.lib.ext.innerStateTransitionInfo newTransitions) {
        if (transitions.add(newTransitions)) {
            numtransitions += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromTransitions(org.tes.hkx.lib.ext.innerStateTransitionInfo transitionsToRemove) {
        if (transitions.remove(transitionsToRemove)) {
            numtransitions += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerStateTransitionInfo removeFromTransitionsAt(int index) {
        org.tes.hkx.lib.ext.innerStateTransitionInfo toRemove;
        toRemove = transitions.remove(index);
        if (!(null == toRemove)) {
            numtransitions += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerStateTransitionInfo child: getTransitions()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerStateTransitionInfo child: getTransitions()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerStateTransitionInfo child: getTransitions()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerStateTransitionInfo)&&removeFromTransitions(((org.tes.hkx.lib.ext.innerStateTransitionInfo) toRemove))) {
            return true;
        }
        return false;
    }

}
