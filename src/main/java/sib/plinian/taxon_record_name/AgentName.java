package sib.plinian.taxon_record_name;

import sib.plinian.additional.*;

public class AgentName extends SimpleReference{
	private String name;
	/*
	 * Optional
	 * Value ex or sanctioning
	 */
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
