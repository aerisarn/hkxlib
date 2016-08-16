package org.tes.hkx.model;

import java.util.HashSet;
import java.util.Set;

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
			parent = ((IHkParented) parent).getParent();
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
		if (fsm.getWildcardTransitions() != null) {
			Set<innerStateTransitionInfo> toRemoveWSet = new HashSet<>();
			for (innerStateTransitionInfo info : fsm.getWildcardTransitions().getTransitions()) {
				if (actualState.getStateId().equals(info.getToStateId()))
					toRemoveWSet.add(info);
			}
			for (innerStateTransitionInfo transition : toRemoveWSet) {
				fsm.getWildcardTransitions().removeFromTransitions(transition);
			}
		}
		for (hkbStateMachineStateInfo state : fsm.getStates()) {
			if (state.getTransitions() != null) {
				Set<innerStateTransitionInfo> toRemoveSet = new HashSet<>();
				for (int transition = 0; transition < state.getTransitions().getNumTransitions(); transition++) {
					if (actualState.getStateId()
							.equals(state.getTransitions().getTransitionsAt(transition).getToStateId())) {
						// state.getTransitions().removeFromTransitionsAt(transition);
						toRemoveSet.add(state.getTransitions().getTransitionsAt(transition));
					}
				}
				for (innerStateTransitionInfo transition : toRemoveSet) {
					state.getTransitions().removeFromTransitions(transition);
				}
			}
		}
		// return true;
		return fsm.removeFromStates(actualState);
	}

	private void unlinkLowerState(hkbStateMachine parent, hkbStateMachineStateInfo actualState) {
		for (hkbStateMachineStateInfo state : parent.getStates()) {
			if (state.getTransitions() != null)
				for (innerStateTransitionInfo transition : state.getTransitions().getTransitions()) {
					if (transition.getToNestedStateId().equals(actualState.getStateId())) {
						transition.setToNestedStateId(fsm.getStartStateId());
					}
					if (transition.getFromNestedStateId().equals(actualState.getStateId())) {
						transition.setFromNestedStateId(fsm.getStartStateId());
					}
				}

		}
		if (parent.getWildcardTransitions() != null)
			for (innerStateTransitionInfo transition : parent.getWildcardTransitions().getTransitions()) {
				if (transition.getToNestedStateId().equals(actualState.getStateId())) {
					transition.setToNestedStateId(fsm.getStartStateId());
				}
				if (transition.getFromNestedStateId().equals(actualState.getStateId())) {
					transition.setFromNestedStateId(fsm.getStartStateId());
				}
			}
	}

	public String toString(HkEventSet eventMap) {
		String out = "";
		for (hkbStateMachineStateInfo state : getStates()) {
			out += "State " + state + " id: " + state.getStateId() + "\n";
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
