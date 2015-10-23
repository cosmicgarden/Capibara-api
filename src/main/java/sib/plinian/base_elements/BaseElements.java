package sib.plinian.base_elements;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BaseElements {
	
	/*
	 * Obligatory element
	 */
	@Column(name = "taxonRecordID")
	private String taxonRecordID;
	
	/*
	 * Optional element
	 * http://rs.tdwg.org/dwc/terms/taxonConceptID
	 */
	@Column(name = "taxonRecordID")
	private String taxonConceptID;
	
	/*
	 * Optional element
	 */
	@Column(name = "globalUniqueIdentifier")
	private String globalUniqueIdentifier;
	
	/*
	 * Optional element
	 */
	@Column(name = "abstractBaseElement")
	private String abstractBaseElement;

	public String getTaxonRecordID() {
		return taxonRecordID;
	}

	public void setTaxonRecordID(String taxonRecordID) {
		this.taxonRecordID = taxonRecordID;
	}

	public String getTaxonConceptID() {
		return taxonConceptID;
	}

	public void setTaxonConceptID(String taxonConceptID) {
		this.taxonConceptID = taxonConceptID;
	}

	public String getGlobalUniqueIdentifier() {
		return globalUniqueIdentifier;
	}

	public void setGlobalUniqueIdentifier(String globalUniqueIdentifier) {
		this.globalUniqueIdentifier = globalUniqueIdentifier;
	}

	public String getAbstract() {
		return abstractBaseElement;
	}

	public void setAbstract(String abstract1) {
		abstractBaseElement = abstract1;
	}
	
}
