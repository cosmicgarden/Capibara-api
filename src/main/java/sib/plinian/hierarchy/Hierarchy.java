package sib.plinian.hierarchy;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import sib.plinian.element.Element;


@Entity
@Table(name = "hierarchy", schema = "CapibaraDB@plinian_records")
public class Hierarchy extends Element{
	
	/*
	 * Optional attribute
	 */
	@Column(name = "classification")
	private String classification;
	
	/*
	 * Optional attribute
	 */
	@Column(name = "recommended")
	private String recommended;
	//-----
	
	/*
	 * Optional element
	 */
	@Column(name = "kingdom")
	private String kingdom;
	
	/*
	 * Optional element
	 */
	@Column(name = "phylum")
	private String phylum;
	
	/*
	 * Optional element
	 */
	@Column(name = "classHierarchy")
	private String classHierarchy;
	
	/*
	 * Optional element
	 */
	@Column(name = "order")
	private String order;
	
	/*
	 * Optional element
	 */
	@Column(name = "family")
	private String family;
	
	/*
	 * Optional element
	 */
	@Column(name = "genus")
	private String genus;
	
	/*
	 * Optional element
	 */
	@Column(name = "subgenus")
	private String subgenus;
	
	/*
	 * Optional element
	 */
	@Column(name = "taxonRank")
	private String taxonRank;
	
	/*
	 * Optional element
	 */
	@Column(name = "specificEpithet")
	private String specificEpithet;
	
	/*
	 * Optional element
	 */
	@Column(name = "infraspecificEpithet")
	private String infraspecificEpithet;
	
	/*
	 * Optional element
	 */
	@Column(name = "higherClassification")
	private String higherClassification;
	
	/*
	 * Optional element
	 */
	@Column(name = "parentTaxon")
	private String parentTaxon;
	
	@Column(name = "idRecord")
	private String idRecord;
	
	
	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getRecommended() {
		return recommended;
	}

	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public String getPhylum() {
		return phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String getClassHierarchy() {
		return classHierarchy;
	}

	public void setClassHierarchy(String classHierarchy) {
		this.classHierarchy = classHierarchy;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSubgenus() {
		return subgenus;
	}

	public void setSubgenus(String subgenus) {
		this.subgenus = subgenus;
	}

	public String getTaxonRank() {
		return taxonRank;
	}

	public void setTaxonRank(String taxonRank) {
		this.taxonRank = taxonRank;
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

	public String getHigherClassification() {
		return higherClassification;
	}

	public void setHigherClassification(String higherClassification) {
		this.higherClassification = higherClassification;
	}

	public String getParentTaxon() {
		return parentTaxon;
	}

	public void setParentTaxon(String parentTaxon) {
		this.parentTaxon = parentTaxon;
	}

	public String getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(String idRecord) {
		this.idRecord = idRecord;
	}
	
	

	

}
