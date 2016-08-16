
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0xed7f9d0")
@XmlType(propOrder = {
    "variableBindingSet",
    "listeners",
    "enterNotifyEvents",
    "exitNotifyEvents",
    "transitions",
    "generator",
    "name",
    "stateId",
    "probability",
    "enable"
})
public class hkbStateMachineStateInfo
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"listeners\"]/text()")
    @XmlList
    private ArrayList<hkbVariableBindingSet> listeners;
    @XmlPath("hkparam[@name=\"listeners\"]/@numelements")
    private Integer numlisteners;
    private hkbStateMachineEventPropertyArray enterNotifyEvents;
    private hkbStateMachineEventPropertyArray exitNotifyEvents;
    private hkbStateMachineTransitionInfoArray transitions;
    private HkobjectType generator;
    private String childname;
    private String stateId;
    private String probability;
    private String enable;

    public hkbStateMachineStateInfo() {
        setVariableBindingSet(null);
        listeners = new ArrayList<hkbVariableBindingSet>();
        numlisteners = 0;
        setEnterNotifyEvents(null);
        setExitNotifyEvents(null);
        setTransitions(null);
        setGenerator(null);
        setName("GetUpFromRagdoll");
        setStateId("-1");
        setProbability("1.000000");
        setEnable("true");
        setClazz("hkbStateMachineStateInfo");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableBindingSet\"]/text()")
    @ObjectLink
    public hkbVariableBindingSet getVariableBindingSet() {
        return variableBindingSet;
    }

    public void setVariableBindingSet(hkbVariableBindingSet newVariableBindingSet) {
        this.variableBindingSet = newVariableBindingSet;
    }

    public Integer getNumListeners() {
        return numlisteners;
    }

    public Iterable<hkbVariableBindingSet> getListeners() {
        return listeners;
    }

    public hkbVariableBindingSet getListenersAt(int index) {
        return listeners.get(index);
    }

    public boolean addToListeners(hkbVariableBindingSet newListeners) {
        if (listeners.add(newListeners)) {
            numlisteners += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromListeners(hkbVariableBindingSet listenersToRemove) {
        if (listeners.remove(listenersToRemove)) {
            numlisteners += -1;
            return true;
        }
        return false;
    }

    public hkbVariableBindingSet removeFromListenersAt(int index) {
        hkbVariableBindingSet toRemove;
        toRemove = listeners.remove(index);
        if (!(null == toRemove)) {
            numlisteners += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"enterNotifyEvents\"]/text()")
    @ObjectLink
    public hkbStateMachineEventPropertyArray getEnterNotifyEvents() {
        return enterNotifyEvents;
    }

    public void setEnterNotifyEvents(hkbStateMachineEventPropertyArray newEnterNotifyEvents) {
        this.enterNotifyEvents = newEnterNotifyEvents;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"exitNotifyEvents\"]/text()")
    @ObjectLink
    public hkbStateMachineEventPropertyArray getExitNotifyEvents() {
        return exitNotifyEvents;
    }

    public void setExitNotifyEvents(hkbStateMachineEventPropertyArray newExitNotifyEvents) {
        this.exitNotifyEvents = newExitNotifyEvents;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"transitions\"]/text()")
    @ObjectLink
    public hkbStateMachineTransitionInfoArray getTransitions() {
        return transitions;
    }

    public void setTransitions(hkbStateMachineTransitionInfoArray newTransitions) {
        this.transitions = newTransitions;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"generator\"]/text()")
    @ObjectLink
    public HkobjectType getGenerator() {
        return generator;
    }

    public void setGenerator(HkobjectType newGenerator) {
        this.generator = newGenerator;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"stateId\"]/text()")
    public String getStateId() {
        return stateId;
    }

    @XmlPath("hkparam[@name=\"stateId\"]/text()")
    public void setStateId(String newStateId) {
        this.stateId = newStateId;
    }

    @XmlPath("hkparam[@name=\"probability\"]/text()")
    public String getProbability() {
        return probability;
    }

    @XmlPath("hkparam[@name=\"probability\"]/text()")
    public void setProbability(String newProbability) {
        this.probability = newProbability;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public String getEnable() {
        return enable;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public void setEnable(String newEnable) {
        this.enable = newEnable;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        for (hkbVariableBindingSet child: getListeners()) {
            child.accept(visitor);
        }
        if (!(null == getEnterNotifyEvents())) {
            getEnterNotifyEvents().accept(visitor);
        }
        if (!(null == getExitNotifyEvents())) {
            getExitNotifyEvents().accept(visitor);
        }
        if (!(null == getTransitions())) {
            getTransitions().accept(visitor);
        }
        if (!(null == getGenerator())) {
            getGenerator().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        for (hkbVariableBindingSet child: getListeners()) {
            child.accept(visitor, this);
        }
        if (!(null == getEnterNotifyEvents())) {
            getEnterNotifyEvents().accept(visitor, this);
        }
        if (!(null == getExitNotifyEvents())) {
            getExitNotifyEvents().accept(visitor, this);
        }
        if (!(null == getTransitions())) {
            getTransitions().accept(visitor, this);
        }
        if (!(null == getGenerator())) {
            getGenerator().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        for (hkbVariableBindingSet child: getListeners()) {
            theseObjects.add(child);
        }
        if (!(null == getEnterNotifyEvents())) {
            theseObjects.add(getEnterNotifyEvents());
        }
        if (!(null == getExitNotifyEvents())) {
            theseObjects.add(getExitNotifyEvents());
        }
        if (!(null == getTransitions())) {
            theseObjects.add(getTransitions());
        }
        if (!(null == getGenerator())) {
            theseObjects.add(getGenerator());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((toRemove instanceof hkbVariableBindingSet)&&removeFromListeners(((hkbVariableBindingSet) toRemove))) {
            return true;
        }
        if ((getEnterNotifyEvents()!= null)&&getEnterNotifyEvents().equals(toRemove)) {
            setEnterNotifyEvents(null);
            return true;
        }
        if ((getExitNotifyEvents()!= null)&&getExitNotifyEvents().equals(toRemove)) {
            setExitNotifyEvents(null);
            return true;
        }
        if ((getTransitions()!= null)&&getTransitions().equals(toRemove)) {
            setTransitions(null);
            return true;
        }
        if ((getGenerator()!= null)&&getGenerator().equals(toRemove)) {
            setGenerator(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+": "+getStateId()+"]";
    }

}
