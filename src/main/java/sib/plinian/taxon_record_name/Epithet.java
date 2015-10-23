package sib.plinian.taxon_record_name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Epithet {

	//choice
	/*
	 * 
	 */
	@Column(name = "infragenericEpithet")
	private String infragenericEpithet;
	
	//--
	/*
	 * 
	 */
	@Column(name = "specificEpithet")
	private String specificEpithet;
	
	/*
	 * 
	 */
	@Column(name = "infraspecificEpithet")
	private String infraspecificEpithet;
	// end choice

	public String getInfragenericEpithet() {
		return infragenericEpithet;
	}

	public void setInfragenericEpithet(String infragenericEpithet) {
		this.infragenericEpithet = infragenericEpithet;
	}

	public String getSpecificEpithet() {
		return specificEpithet;
	}

	public void setSpecificEpithet(String specificEpithet) {
		this.specificEpithet = specificEpithet;
	}

	public String getInfraspecificEpithet() {
		return infraspecificEpithet;
	}

	public void setInfraspecificEpithet(String infraspecificEpithet) {
		this.infraspecificEpithet = infraspecificEpithet;
	}
	
	
}
