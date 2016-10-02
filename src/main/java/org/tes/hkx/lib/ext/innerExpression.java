
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "expression", "assignmentVariableIndex", "assignmentEventIndex", "eventMode" })
public class innerExpression extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String expression;
	private String assignmentVariableIndex;
	private String assignmentEventIndex;
	private String eventMode;

	public innerExpression() {
		setExpression("");
		setAssignmentVariableIndex("-1");
		setAssignmentEventIndex("-1");
		setEventMode("EVENT_MODE_SEND_ONCE");
	}

	@XmlPath("hkparam[@name=\"expression\"]/text()")
	public String getExpression() {
		return expression;
	}

	@XmlPath("hkparam[@name=\"expression\"]/text()")
	public void setExpression(String newExpression) {
		this.expression = newExpression;
	}

	@XmlPath("hkparam[@name=\"assignmentVariableIndex\"]/text()")
	public String getAssignmentVariableIndex() {
		return assignmentVariableIndex;
	}

	@XmlPath("hkparam[@name=\"assignmentVariableIndex\"]/text()")
	public void setAssignmentVariableIndex(String newAssignmentVariableIndex) {
		this.assignmentVariableIndex = newAssignmentVariableIndex;
	}

	@XmlPath("hkparam[@name=\"assignmentEventIndex\"]/text()")
	public String getAssignmentEventIndex() {
		return assignmentEventIndex;
	}

	@XmlPath("hkparam[@name=\"assignmentEventIndex\"]/text()")
	public void setAssignmentEventIndex(String newAssignmentEventIndex) {
		this.assignmentEventIndex = newAssignmentEventIndex;
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
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		return visitor.getResults();
	}
	
	@Override
	public String toString() {
		return "Expression: "+getExpression();
	}

}
