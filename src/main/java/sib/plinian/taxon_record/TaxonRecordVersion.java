package sib.plinian.taxon_record;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sib.plinian.taxon_record_name.TaxonRecordNameVersion;
import sib.plinian.hierarchy.HierarchyVersion;
import sib.plinian.synonyms.SynonymsAtomizedVersion;

import com.google.common.collect.Lists;

@Entity
@Table(name = "taxonRecordVersion", schema = "CapibaraDB@plinian_records")
public class TaxonRecordVersion {
	public TaxonRecordVersion(){
		this.version=0;
		this.created= new Date();
	}
	//Elementos comunes a todas las versiones 
	@Id 
	@Column(name="idRecord")
	private String idRecord;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="language")
	private List<String> language = Lists.newArrayList();
	
	@Column(name="version")
	private int version;
	
	//----
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecord")
	private List<TaxonRecordNameVersion> taxonRecordNameVersionList = Lists.newArrayList();
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecord")
	private List<SynonymsAtomizedVersion> synonymsAtomizedVersionList = Lists.newArrayList();
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecord")
	private List<HierarchyVersion> hierarchyVersionList = Lists.newArrayList();

	public String getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(String idRecord) {
		this.idRecord = idRecord;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<TaxonRecordNameVersion> getTaxonRecordNameVersionList() {
		return taxonRecordNameVersionList;
	}

	public void setTaxonRecordNameVersionList(
			List<TaxonRecordNameVersion> taxonRecordNameVersionList) {
		this.taxonRecordNameVersionList = taxonRecordNameVersionList;
	}

	public List<SynonymsAtomizedVersion> getSynonymsAtomizedVersionList() {
		return synonymsAtomizedVersionList;
	}

	public void setSynonymsAtomizedVersionList(
			List<SynonymsAtomizedVersion> synonymsAtomizedVersionList) {
		this.synonymsAtomizedVersionList = synonymsAtomizedVersionList;
	}

	public List<HierarchyVersion> getHierarchyVersionList() {
		return hierarchyVersionList;
	}

	public void setHierarchyVersionList(List<HierarchyVersion> hierarchyVersionList) {
		this.hierarchyVersionList = hierarchyVersionList;
	}
	


}
