package org.tes.hkx.model;

import org.tes.hkx.lib.ext.hkbBehaviorGraphData;

public class HkVariableSet {
	
	hkbBehaviorGraphData myData;
	
	
	public HkVariableSet(hkbBehaviorGraphData data) {
		myData = data;		
	}
	
	public HkVariable getVariable(int id) {
		
		String type = myData.getVariableInfosAt(id).getType();
		String value = myData.getVariableInitialValues().getWordVariableValuesAt(id).getValue();
		String flags = myData.getVariableInfosAt(id).getRole().getFlags();
		String role = myData.getVariableInfosAt(id).getRole().getRole();

		if (type.equals("VARIABLE_TYPE_VECTOR4") || type.equals("VARIABLE_TYPE_QUATERNION")) {
			value = myData.getVariableInitialValues().getQuadVariableValuesAt(Integer.valueOf(value));
		} else if (type.equals("VARIABLE_TYPE_REAL")) {
			value = String.valueOf(Float.parseFloat(value));
		}
		
		return new HkVariable(
				myData.getStringData().getVariableNamesAt(id), 
				type,
				value,
				role,
				flags);
	}
	
	public String toString() {
		String out = "";
		out+="Variables: " +myData.getNumVariableInfos()+"\n";
		for (Integer id=0; id< myData.getNumVariableInfos(); id++) {
			out += "id: " + id + " variable: "+getVariable(id).toString()+"\n";
		}
		return out;
	}
	
}
