package org.tes.hkx.model;

public class HkVariable {

	private String name;
	private String type;
	private String value;
	private String role;
	private String flags;

	public HkVariable(String name, String type, String value, String role, String flags) {
		this.name = name;
		this.type = type;
		this.value = value;
		this.flags = flags;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}
	
	@Override
	public String toString() {
		return getName()+"("+getType()+") = "+getValue()+" role: "+getRole()+" flags: "+getFlags();
	}

}
