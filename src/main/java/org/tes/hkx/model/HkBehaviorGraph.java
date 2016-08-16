package org.tes.hkx.model;

import java.util.HashSet;
import java.util.Set;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.ext.hkbBehaviorGraphData;
import org.tes.hkx.lib.ext.hkbBehaviorGraphStringData;
import org.tes.hkx.lib.ext.hkbStateMachine;
import org.tes.hkx.model.files.HkBehaviorFile;

public class HkBehaviorGraph {

	private hkbBehaviorGraphStringData stringData = null;
	private hkbBehaviorGraphData data = null;

	private HkVariableSet variables;
	private HkEventSet events;
	
	private Set<FSMNode> fsms = new HashSet<>();
	
	public HkBehaviorGraph(HkBehaviorFile root) {
		setEvents(new HkEventSet(root.getGraph().getData().getStringData()));
		setVariables(new HkVariableSet(root.getGraph().getData()));
		for (HkobjectType obj :root.getObjects()) {
			if (obj instanceof hkbStateMachine) {
				FSMNode smNode = new FSMNode((hkbStateMachine)obj); 
				fsms.add(smNode);
			}
		}
		data = root.getGraph().getData();
	}

	public HkEventSet getEvents() {
		return events;
	}

	public void setEvents(HkEventSet events) {
		this.events = events;
	}

	public HkVariableSet getVariables() {
		return variables;
	}

	public void setVariables(HkVariableSet variables) {
		this.variables = variables;
	}
}
