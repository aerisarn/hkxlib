package org.tes.hkx.model;

import org.tes.hkx.lib.ext.hkbBehaviorGraphStringData;

public class HkEventSet {
	
	hkbBehaviorGraphStringData myData;
	
	public HkEventSet(hkbBehaviorGraphStringData data) {
		myData = data;
	}
	
	public String getEvent(int id) {
		return myData.getEventNamesAt(id);
	}
	
	public boolean addEvent(String event) {
		return myData.addToEventNames(event);
	}
	
	public boolean removeEvent(String event) {
		return myData.removeFromEventNames(event);
	}
	
	public String toString() {
		String out = "";
		int id = 0;
		out+="Events: " +myData.getNumEventNames()+"\n";
		for (String event : myData.getEventNames()) {
			out += "id: " + id++ + " event: "+event+"\n";
		}
		return out;
	}
}
