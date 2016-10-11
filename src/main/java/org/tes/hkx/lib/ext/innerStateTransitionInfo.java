
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.FSMNode;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "triggerInterval", "initiateInterval", "transition", "condition", "eventId", "toStateId",
		"fromNestedStateId", "toNestedStateId", "priority", "flags" })
public class innerStateTransitionInfo extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private innerTriggerInfo triggerInterval;
	private innerTriggerInfo initiateInterval;
	private hkbBlendingTransitionEffect transition;
	private hkbExpressionCondition condition;
	private String eventId;
	private String toStateId;
	private String fromNestedStateId;
	private String toNestedStateId;
	private String priority;
	private String flags;

	public innerStateTransitionInfo() {
		setTriggerInterval(null);
		setInitiateInterval(null);
		setTransition(null);
		setCondition(null);
		setEventId("-1");
		setToStateId("-1");
		setFromNestedStateId("-1");
		setToNestedStateId("-1");
		setPriority("0");
		setFlags("FLAG_DISABLE_CONDITION");
	}

	@XmlElement(name = "hkparam[@name=\"triggerInterval\"]/hkobject")
	public innerTriggerInfo getTriggerInterval() {
		return triggerInterval;
	}

	public void setTriggerInterval(innerTriggerInfo newTriggerInterval) {
		this.triggerInterval = newTriggerInterval;
	}

	@XmlElement(name = "hkparam[@name=\"initiateInterval\"]/hkobject")
	public innerTriggerInfo getInitiateInterval() {
		return initiateInterval;
	}

	public void setInitiateInterval(innerTriggerInfo newInitiateInterval) {
		this.initiateInterval = newInitiateInterval;
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"transition\"]/text()")
	@ObjectLink
	public hkbBlendingTransitionEffect getTransition() {
		return transition;
	}

	public void setTransition(hkbBlendingTransitionEffect newTransition) {
		this.transition = newTransition;
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"condition\"]/text()")
	@ObjectLink
	public hkbExpressionCondition getCondition() {
		return condition;
	}

	public void setCondition(hkbExpressionCondition newCondition) {
		this.condition = newCondition;
	}

	@XmlPath("hkparam[@name=\"eventId\"]/text()")
	public String getEventId() {
		return eventId;
	}

	@XmlPath("hkparam[@name=\"eventId\"]/text()")
	public void setEventId(String newEventId) {
		this.eventId = newEventId;
	}

	@XmlPath("hkparam[@name=\"toStateId\"]/text()")
	public String getToStateId() {
		return toStateId;
	}

	@XmlPath("hkparam[@name=\"toStateId\"]/text()")
	public void setToStateId(String newToStateId) {
		this.toStateId = newToStateId;
	}

	@XmlPath("hkparam[@name=\"fromNestedStateId\"]/text()")
	public String getFromNestedStateId() {
		return fromNestedStateId;
	}

	@XmlPath("hkparam[@name=\"fromNestedStateId\"]/text()")
	public void setFromNestedStateId(String newFromNestedStateId) {
		this.fromNestedStateId = newFromNestedStateId;
	}

	@XmlPath("hkparam[@name=\"toNestedStateId\"]/text()")
	public String getToNestedStateId() {
		return toNestedStateId;
	}

	@XmlPath("hkparam[@name=\"toNestedStateId\"]/text()")
	public void setToNestedStateId(String newToNestedStateId) {
		this.toNestedStateId = newToNestedStateId;
	}

	@XmlPath("hkparam[@name=\"priority\"]/text()")
	public String getPriority() {
		return priority;
	}

	@XmlPath("hkparam[@name=\"priority\"]/text()")
	public void setPriority(String newPriority) {
		this.priority = newPriority;
	}

	@XmlPath("hkparam[@name=\"flags\"]/text()")
	public String getFlags() {
		return flags;
	}

	@XmlPath("hkparam[@name=\"flags\"]/text()")
	public void setFlags(String newFlags) {
		this.flags = newFlags;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getTriggerInterval())) {
			getTriggerInterval().accept(visitor);
		}
		if (!(null == getInitiateInterval())) {
			getInitiateInterval().accept(visitor);
		}
		if (!(null == getTransition())) {
			getTransition().accept(visitor);
		}
		if (!(null == getCondition())) {
			getCondition().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getTriggerInterval())) {
			getTriggerInterval().accept(visitor, this);
		}
		if (!(null == getInitiateInterval())) {
			getInitiateInterval().accept(visitor, this);
		}
		if (!(null == getTransition())) {
			getTransition().accept(visitor, this);
		}
		if (!(null == getCondition())) {
			getCondition().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getTriggerInterval())) {
			theseObjects.add(getTriggerInterval());
		}
		if (!(null == getInitiateInterval())) {
			theseObjects.add(getInitiateInterval());
		}
		if (!(null == getTransition())) {
			theseObjects.add(getTransition());
		}
		if (!(null == getCondition())) {
			theseObjects.add(getCondition());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getTriggerInterval() != null) && getTriggerInterval().equals(toRemove)) {
			setTriggerInterval(null);
			return true;
		}
		if ((getInitiateInterval() != null) && getInitiateInterval().equals(toRemove)) {
			setInitiateInterval(null);
			return true;
		}
		if ((getTransition() != null) && getTransition().equals(toRemove)) {
			setTransition(null);
			return true;
		}
		if ((getCondition() != null) && getCondition().equals(toRemove)) {
			setCondition(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		hkbBehaviorGraph root = findParentWithClass(hkbBehaviorGraph.class);
		hkbStateMachine fsmParent = findParentWithClass(hkbStateMachine.class);
		if (root != null) {
			return "Transition on "+root.getData().getStringData().getEventNamesAt(Integer.valueOf(getEventId()))+" to "+ fsmParent.findState(Integer.valueOf(getToStateId()))+" (nested "+getToNestedStateId()+")";
		}
		return "Transition on "+getEventId()+" to "+getToStateId()+" (nested "+getToNestedStateId()+")";
	}
}
