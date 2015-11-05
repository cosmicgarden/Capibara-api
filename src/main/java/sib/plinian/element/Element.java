package sib.plinian.element;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import sib.plinian.additional.AncillaryData;

import com.google.common.collect.Lists;

@MappedSuperclass
public class Element {
	
	/*
	 * Obligatory
	 */
	@Id
	@Column(name="idElement")
	private String idElement;
	
	/*
	  * Optional element
	  */
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER, mappedBy="elementR")
	@JoinColumn(name="idElement")
	private List<AncillaryData> ancillaryData =Lists.newArrayList();

	public List<AncillaryData> getAncillaryData() {
		return ancillaryData;
	}

	public void setAncillaryData(List<AncillaryData> ancillaryData) {
		this.ancillaryData = ancillaryData;
	}
	
	public String getIdElement() {
		return idElement;
	}

	public void setIdElement(String idElement) {
		this.idElement = idElement;
	}
	
	
	
	

}
