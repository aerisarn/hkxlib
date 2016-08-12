package org.tes.hkx.model;

import org.tes.hkx.lib.ext.hkbStateMachine;
import org.tes.hkx.lib.ext.hkbStateMachineStateInfo;
import org.tes.hkx.lib.ext.hkbStateMachineTransitionInfoArray;
import org.tes.hkx.lib.ext.innerStateTransitionInfo;

public class FSMNode {

	hkbStateMachine fsm;

	public FSMNode(hkbStateMachine fsm) {
		this.fsm = fsm;
	}

	public hkbStateMachine getFSM() {
		return fsm;
	}

	public hkbStateMachineStateInfo getStateFromName(String stateName) {
		for (hkbStateMachineStateInfo state : fsm.getStates()) {
			if (state.getName().equals(stateName)) {
				return state;
			}
		}
		return null;
	}

	public hkbStateMachineStateInfo getState(String id) {
		for (hkbStateMachineStateInfo state : fsm.getStates()) {
			if (state.getStateId().equals(id)) {
				return state;
			}
		}
		return null;
	}

	public Iterable<hkbStateMachineStateInfo> getStates() {
		return fsm.getStates();
	}

	public hkbStateMachineTransitionInfoArray getTransitions(hkbStateMachineStateInfo actualState) {
		for (hkbStateMachineStateInfo state : fsm.getStates()) {
			if (state.equals(actualState)) {
				return state.getTransitions();
			}
		}
		return null;
	}

	private hkbStateMachine findFSMParent(hkbStateMachine fsm) {
		IHkVisitable parent = fsm.getParent();
		while (parent != null && parent instanceof IHkParented) {
			if (parent instanceof hkbStateMachine) {
				return (hkbStateMachine) parent;
			}
			parent = ((IHkParented)parent).getParent();
		}
		return null;
	}
	
	public hkbStateMachine getParent() {
		return findFSMParent(fsm);
	}

	public boolean removeState(hkbStateMachineStateInfo actualState) {
		// unlink from parent
		if (getState(actualState.getStateId()) == null)
			return false;
		hkbStateMachine parent = findFSMParent(fsm);
		if (parent != null)
			unlinkLowerState(parent, actualState);
		// remove same state transition
		for (hkbStateMachineStateInfo state : fsm.getStates()) {
			for (int transition = 0; transition < state.getTransitions().getNumTransitions(); transition++) {
				if (actualState.getStateId()
						.equals(state.getTransitions().getTransitionsAt(transition).getToStateId())) {
					state.getTransitions().removeFromTransitionsAt(transition);
				}
			}
		}
		return false;
	}

	private void unlinkLowerState(hkbStateMachine parent, hkbStateMachineStateInfo actualState) {
		for (hkbStateMachineStateInfo state : parent.getStates()) {
			for (innerStateTransitionInfo transition : state.getTransitions().getTransitions()) {
				if (transition.getToNestedStateId().equals(actualState.getStateId())) {
					transition.setToNestedStateId("-1");
				}
				if (transition.getFromNestedStateId().equals(actualState.getStateId())) {
					transition.setFromNestedStateId("-1");
				}
			}
		}
	}

	public String toString(HkEventSet eventMap) {
		String out = "";
		for (hkbStateMachineStateInfo state : getStates()) {
			out += "State " + state + " id: "+state.getStateId()+"\n";
			if (state.getTransitions() != null)
				for (innerStateTransitionInfo transition : state.getTransitions().getTransitions()) {
					out += "\t to " + getState(transition.getToStateId()).toString() + "#"
							+ transition.getToNestedStateId() + " on event: "
							+ eventMap.getEvent(Integer.parseInt(transition.getEventId())) + "\n";
				}
		}
		return out;
	}

}
