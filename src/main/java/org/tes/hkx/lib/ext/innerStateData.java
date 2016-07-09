
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = { "PStateMachine", "stateID", "IStateToSetAs" })
public class innerStateData implements IHkContainer, IHkVisitable, IHkInnerObject {

	private hkbStateMachine pStateMachine;
	private String StateID;
	private String iStateToSetAs;

	public innerStateData() {
		setPStateMachine(null);
		setStateID("-1");
		setIStateToSetAs("0");
	}

	@XmlIDREF
	@XmlPath("hkparam[@name=\"pStateMachine\"]/text()")
	@ObjectLink
	public hkbStateMachine getPStateMachine() {
		return pStateMachine;
	}

	public void setPStateMachine(hkbStateMachine newPStateMachine) {
		this.pStateMachine = newPStateMachine;
	}

	@XmlPath("hkparam[@name=\"StateID\"]/text()")
	public String getStateID() {
		return StateID;
	}

	@XmlPath("hkparam[@name=\"StateID\"]/text()")
	public void setStateID(String newStateID) {
		this.StateID = newStateID;
	}

	@XmlPath("hkparam[@name=\"iStateToSetAs\"]/text()")
	public String getIStateToSetAs() {
		return iStateToSetAs;
	}

	@XmlPath("hkparam[@name=\"iStateToSetAs\"]/text()")
	public void setIStateToSetAs(String newIStateToSetAs) {
		this.iStateToSetAs = newIStateToSetAs;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		if (!(null == getPStateMachine())) {
			getPStateMachine().accept(visitor);
		}
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		if (!(null == getPStateMachine())) {
			getPStateMachine().accept(visitor, this);
		}
		return visitor.getResults();
	}

	@Override
	public Collection<IHkVisitable> objects() {
		Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
		if (!(null == getPStateMachine())) {
			theseObjects.add(getPStateMachine());
		}
		return theseObjects;
	}

	@Override
	public boolean remove(Object toRemove) {
		if ((getPStateMachine() != null) && getPStateMachine().equals(toRemove)) {
			setPStateMachine(null);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "StateData";
	}
}
