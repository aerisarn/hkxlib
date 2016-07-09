
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = { "eventFilter", "userFilter" })
public class innerSPUCollisionCallback implements IHkVisitable, IHkInnerObject {

	private String eventFilter;
	private String userFilter;

	public innerSPUCollisionCallback() {
		setEventFilter(null);
		setUserFilter(null);
	}

	@XmlPath("hkparam[@name=\"eventFilter\"]/text()")
	public String getEventFilter() {
		return eventFilter;
	}

	@XmlPath("hkparam[@name=\"eventFilter\"]/text()")
	public void setEventFilter(String newEventFilter) {
		this.eventFilter = newEventFilter;
	}

	@XmlPath("hkparam[@name=\"userFilter\"]/text()")
	public String getUserFilter() {
		return userFilter;
	}

	@XmlPath("hkparam[@name=\"userFilter\"]/text()")
	public void setUserFilter(String newUserFilter) {
		this.userFilter = newUserFilter;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		return visitor.getResults();
	}

	@Override
	public String toString() {
		return "SPUCollisionCallback";
	}
}
