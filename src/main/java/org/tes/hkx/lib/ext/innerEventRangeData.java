
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "upperBound", "event", "eventMode" })
public class innerEventRangeData extends innerVisitable implements IHkContainer, IHkVisitable, IHkInnerObject {

	private String upperBound;
	private innerEvent event;
	private String eventMode;

	public innerEventRangeData() {
		setUpperBound("75.000000");
		setEvent(null);
		setEventMode("EVENT_MODE_SEND_ON_ENTER_RANGE");
	}

	@XmlPath("hkparam[@name=\"upperBound\"]/text()")
	public String getUpperBound() {
		return upperBound;
	}

	@XmlPath("hkparam[@name=\"upperBound\"]/text()")
	public void setUpperBound(String newUpperBound) {
		this.upperBound = newUpperBound;
	}

	@XmlElement(name = "hkparam[@name=\"event\"]/hkobject")
	public innerEvent getEvent() {
		return event;
	}

	public void setEvent(innerEvent newEvent) {
		this.event = newEvent;
	}

	@XmlPath("hkparam[@name=\"eventMode\"]/text()")
	public String getEventMode() {
		return eventMode;
	}

	@XmlPath("hkparam[@name=\"eventMode\"]/text()")
	public void setEventMode(String newEventMode) {
		this.eventMode = newEventMode;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getEvent())) {
			getEvent().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
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
		if ((getEvent() != null) && getEvent().equals(toRemove)) {
			setEvent(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "EventRangeData";
	}
}
