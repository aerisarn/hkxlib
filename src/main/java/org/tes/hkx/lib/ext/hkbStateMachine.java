
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlDiscriminatorValue("0x816c1dcb")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "eventToSendWhenStateOrTransitionChanges",
    "startStateChooser",
    "startStateId",
    "returnToPreviousStateEventId",
    "randomTransitionEventId",
    "transitionToNextHigherStateEventId",
    "transitionToNextLowerStateEventId",
    "syncVariableIndex",
    "wrapAroundStateId",
    "maxSimultaneousTransitions",
    "startStateMode",
    "selfTransitionMode",
    "states",
    "wildcardTransitions"
})
public class hkbStateMachine
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private innerEvent eventToSendWhenStateOrTransitionChanges;
    private String startStateChooser;
    private String startStateId;
    private String returnToPreviousStateEventId;
    private String randomTransitionEventId;
    private String transitionToNextHigherStateEventId;
    private String transitionToNextLowerStateEventId;
    private String syncVariableIndex;
    private String wrapAroundStateId;
    private String maxSimultaneousTransitions;
    private String startStateMode;
    private String selfTransitionMode;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"states\"]/text()")
    @XmlList
    private ArrayList<hkbStateMachineStateInfo> states;
    @XmlPath("hkparam[@name=\"states\"]/@numelements")
    private Integer numstates;
    private hkbStateMachineTransitionInfoArray wildcardTransitions;

    public hkbStateMachine() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Behavior00");
        setEventToSendWhenStateOrTransitionChanges(null);
        setStartStateChooser("null");
        setStartStateId("-1");
        setReturnToPreviousStateEventId("-1");
        setRandomTransitionEventId("-1");
        setTransitionToNextHigherStateEventId("-1");
        setTransitionToNextLowerStateEventId("-1");
        setSyncVariableIndex("-1");
        setWrapAroundStateId("-1");
        setMaxSimultaneousTransitions("32");
        setStartStateMode("START_STATE_MODE_DEFAULT");
        setSelfTransitionMode("SELF_TRANSITION_MODE_NO_TRANSITION");
        states = new ArrayList<hkbStateMachineStateInfo>();
        numstates = 0;
        setWildcardTransitions(null);
        setClazz("hkbStateMachine");
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

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlElement(name = "hkparam[@name=\"eventToSendWhenStateOrTransitionChanges\"]/hkobject")
    public innerEvent getEventToSendWhenStateOrTransitionChanges() {
        return eventToSendWhenStateOrTransitionChanges;
    }

    public void setEventToSendWhenStateOrTransitionChanges(innerEvent newEventToSendWhenStateOrTransitionChanges) {
        this.eventToSendWhenStateOrTransitionChanges = newEventToSendWhenStateOrTransitionChanges;
    }

    @XmlPath("hkparam[@name=\"startStateChooser\"]/text()")
    public String getStartStateChooser() {
        return startStateChooser;
    }

    @XmlPath("hkparam[@name=\"startStateChooser\"]/text()")
    public void setStartStateChooser(String newStartStateChooser) {
        this.startStateChooser = newStartStateChooser;
    }

    @XmlPath("hkparam[@name=\"startStateId\"]/text()")
    public String getStartStateId() {
        return startStateId;
    }

    @XmlPath("hkparam[@name=\"startStateId\"]/text()")
    public void setStartStateId(String newStartStateId) {
        this.startStateId = newStartStateId;
    }

    @XmlPath("hkparam[@name=\"returnToPreviousStateEventId\"]/text()")
    public String getReturnToPreviousStateEventId() {
        return returnToPreviousStateEventId;
    }

    @XmlPath("hkparam[@name=\"returnToPreviousStateEventId\"]/text()")
    public void setReturnToPreviousStateEventId(String newReturnToPreviousStateEventId) {
        this.returnToPreviousStateEventId = newReturnToPreviousStateEventId;
    }

    @XmlPath("hkparam[@name=\"randomTransitionEventId\"]/text()")
    public String getRandomTransitionEventId() {
        return randomTransitionEventId;
    }

    @XmlPath("hkparam[@name=\"randomTransitionEventId\"]/text()")
    public void setRandomTransitionEventId(String newRandomTransitionEventId) {
        this.randomTransitionEventId = newRandomTransitionEventId;
    }

    @XmlPath("hkparam[@name=\"transitionToNextHigherStateEventId\"]/text()")
    public String getTransitionToNextHigherStateEventId() {
        return transitionToNextHigherStateEventId;
    }

    @XmlPath("hkparam[@name=\"transitionToNextHigherStateEventId\"]/text()")
    public void setTransitionToNextHigherStateEventId(String newTransitionToNextHigherStateEventId) {
        this.transitionToNextHigherStateEventId = newTransitionToNextHigherStateEventId;
    }

    @XmlPath("hkparam[@name=\"transitionToNextLowerStateEventId\"]/text()")
    public String getTransitionToNextLowerStateEventId() {
        return transitionToNextLowerStateEventId;
    }

    @XmlPath("hkparam[@name=\"transitionToNextLowerStateEventId\"]/text()")
    public void setTransitionToNextLowerStateEventId(String newTransitionToNextLowerStateEventId) {
        this.transitionToNextLowerStateEventId = newTransitionToNextLowerStateEventId;
    }

    @XmlPath("hkparam[@name=\"syncVariableIndex\"]/text()")
    public String getSyncVariableIndex() {
        return syncVariableIndex;
    }

    @XmlPath("hkparam[@name=\"syncVariableIndex\"]/text()")
    public void setSyncVariableIndex(String newSyncVariableIndex) {
        this.syncVariableIndex = newSyncVariableIndex;
    }

    @XmlPath("hkparam[@name=\"wrapAroundStateId\"]/text()")
    public String getWrapAroundStateId() {
        return wrapAroundStateId;
    }

    @XmlPath("hkparam[@name=\"wrapAroundStateId\"]/text()")
    public void setWrapAroundStateId(String newWrapAroundStateId) {
        this.wrapAroundStateId = newWrapAroundStateId;
    }

    @XmlPath("hkparam[@name=\"maxSimultaneousTransitions\"]/text()")
    public String getMaxSimultaneousTransitions() {
        return maxSimultaneousTransitions;
    }

    @XmlPath("hkparam[@name=\"maxSimultaneousTransitions\"]/text()")
    public void setMaxSimultaneousTransitions(String newMaxSimultaneousTransitions) {
        this.maxSimultaneousTransitions = newMaxSimultaneousTransitions;
    }

    @XmlPath("hkparam[@name=\"startStateMode\"]/text()")
    public String getStartStateMode() {
        return startStateMode;
    }

    @XmlPath("hkparam[@name=\"startStateMode\"]/text()")
    public void setStartStateMode(String newStartStateMode) {
        this.startStateMode = newStartStateMode;
    }

    @XmlPath("hkparam[@name=\"selfTransitionMode\"]/text()")
    public String getSelfTransitionMode() {
        return selfTransitionMode;
    }

    @XmlPath("hkparam[@name=\"selfTransitionMode\"]/text()")
    public void setSelfTransitionMode(String newSelfTransitionMode) {
        this.selfTransitionMode = newSelfTransitionMode;
    }

    public Integer getNumStates() {
        return numstates;
    }

    public Iterable<hkbStateMachineStateInfo> getStates() {
        return states;
    }

    public hkbStateMachineStateInfo getStatesAt(int index) {
        return states.get(index);
    }

    public boolean addToStates(hkbStateMachineStateInfo newStates) {
        if (states.add(newStates)) {
            numstates += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromStates(hkbStateMachineStateInfo statesToRemove) {
        if (states.remove(statesToRemove)) {
            numstates += -1;
            return true;
        }
        return false;
    }

    public hkbStateMachineStateInfo removeFromStatesAt(int index) {
        hkbStateMachineStateInfo toRemove;
        toRemove = states.remove(index);
        if (!(null == toRemove)) {
            numstates += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"wildcardTransitions\"]/text()")
    @ObjectLink
    public hkbStateMachineTransitionInfoArray getWildcardTransitions() {
        return wildcardTransitions;
    }

    public void setWildcardTransitions(hkbStateMachineTransitionInfoArray newWildcardTransitions) {
        this.wildcardTransitions = newWildcardTransitions;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getEventToSendWhenStateOrTransitionChanges())) {
            getEventToSendWhenStateOrTransitionChanges().accept(visitor);
        }
        for (hkbStateMachineStateInfo child: getStates()) {
            child.accept(visitor);
        }
        if (!(null == getWildcardTransitions())) {
            getWildcardTransitions().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getEventToSendWhenStateOrTransitionChanges())) {
            getEventToSendWhenStateOrTransitionChanges().accept(visitor, this);
        }
        for (hkbStateMachineStateInfo child: getStates()) {
            child.accept(visitor, this);
        }
        if (!(null == getWildcardTransitions())) {
            getWildcardTransitions().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getEventToSendWhenStateOrTransitionChanges())) {
            theseObjects.add(getEventToSendWhenStateOrTransitionChanges());
        }
        for (hkbStateMachineStateInfo child: getStates()) {
            theseObjects.add(child);
        }
        if (!(null == getWildcardTransitions())) {
            theseObjects.add(getWildcardTransitions());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getEventToSendWhenStateOrTransitionChanges()!= null)&&getEventToSendWhenStateOrTransitionChanges().equals(toRemove)) {
            setEventToSendWhenStateOrTransitionChanges(null);
            return true;
        }
        if ((toRemove instanceof hkbStateMachineStateInfo)&&removeFromStates(((hkbStateMachineStateInfo) toRemove))) {
            return true;
        }
        if ((getWildcardTransitions()!= null)&&getWildcardTransitions().equals(toRemove)) {
            setWildcardTransitions(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
