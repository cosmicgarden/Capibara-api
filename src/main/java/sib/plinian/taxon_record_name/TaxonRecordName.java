package sib.plinian.taxon_record_name;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Lists;

import sib.plinian.element.*;

@Embeddable
public class TaxonRecordName extends Element{

	/*
	 * Obligatory 
	 */
	
	@Column(name="TaxonRecordNameVersion")
	private String TaxonRecordNameVersion;
	
	
	/*
	 * Obligatory
	 */
	 
	@Column(name="userId")
	private String userId;
	
	
	/*
	 * Obligatory
	 */
	 
	@Column(name="taxonRecordId")
	private String taxonRecordId;
	
	
	/*
	 * Obligatory
	 */
	@Column(name="dateSave")
	private Date dateSave;
	
	
	
	 /** Obligatory element
	 * http://tdwg.napier.ac.uk/tcs_doc100/#complexType_ScientificName_Link03E58FE8
	 */	 
	@Embedded
	private ScientificName scientificName;
	
	
	 

	public String getTaxonRecordNameVersion() {
		return TaxonRecordNameVersion;
	}

	public void setTaxonRecordNameVersion(String taxonRecordNameVersion) {
		TaxonRecordNameVersion = taxonRecordNameVersion;
	}


	/*public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTaxonRecordId() {
		return taxonRecordId;
	}

	public void setTaxonRecordId(String taxonRecordId) {
		this.taxonRecordId = taxonRecordId;
	}*/

	public Date getDateSave() {
		return dateSave;
	}

	public void setDateSave(Date dateSave) {
		this.dateSave = dateSave;
	}

	public ScientificName getScientificName() {
		return scientificName;
	}

	public void setScientificName(ScientificName scientificName) {
		this.scientificName = scientificName;
	}
	
	

	
	
	
}
