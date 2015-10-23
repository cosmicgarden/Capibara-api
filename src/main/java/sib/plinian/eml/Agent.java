package sib.plinian.eml;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.google.common.collect.Lists;

@Embeddable
public class Agent {
	
	/*
	 * Obligatory Element
	 */
	@Column(name = "firstName")
	private String firstName;
	
	/*
	 * Obligatory Element
	 */
	@Column(name = "lastName")
	private String lastName;
	
	/*
	 * Obligatory element
	 */
	@Column(name = "organisation")
	private String organisation;
	
	/*
	 * Obligatory element
	 */
	@Column(name = "position")
	private String position;
	
	/*
	 * Optional element
	 */
	@Column(name = "address")
	private List<String> address=Lists.newArrayList();
	
	/*
	 * Optional element
	 */
	@Column(name = "phone")
	private List<String> phone=Lists.newArrayList();
	
	/*
	 * Optional element
	 */
	@Column(name = "email")
	private List<String> email=Lists.newArrayList();
	
	/*
	 * Optional element
	 */
	@Column(name = "role")
	private String role;
	
	/*
	 * Optional element
	 */
	@Column(name = "homepage")
	private List<String> homepage =Lists.newArrayList();
	  
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getHomepage() {
		return homepage;
	}
	public void setHomepage(List<String> homepage) {
		this.homepage = homepage;
	}
	
	
	  
	  
}
