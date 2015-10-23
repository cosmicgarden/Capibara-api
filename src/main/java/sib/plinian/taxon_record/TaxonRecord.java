package sib.plinian.taxon_record;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Lists;

import sib.plinian.base_elements.BaseElements;
import sib.plinian.taxon_record_name.TaxonRecordName;
import sib.plinian.hierarchy.Hierarchy;
import sib.plinian.synonyms.SynonymsAtomized;



@Entity
@Table(name = "taxonRecord", schema = "CapibaraDB@plinian_records")
public class TaxonRecord {
	
	@Id 
	@Column(name="idRecord")
	private String idRecord;
	
	
	@Column(name="created")
	private Date created;
	
	
	/*
	 * Obligatory element
	 * BaseElements
	 */
	@Embedded
	private BaseElements baseElements;
	
	@Column(name="language")
	private List<String> language = Lists.newArrayList();
	
	@Column(name="version")
	private String version;
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecord")
	private List<SynonymsAtomized> SynonymsAtomized = Lists.newArrayList();
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecord")
	private List<Hierarchy> Hierarchy = Lists.newArrayList();
	
	@Embedded
	private TaxonRecordName taxonRecordName;
	
	public TaxonRecord(){
		this.baseElements=null;
		this.language=null;
		this.version="";
		this.SynonymsAtomized=null;
		this.Hierarchy=null;
		this.taxonRecordName=null;
		this.created=null;
	}
	
	

	public Date getCreated() {
		return created;
	}



	public void setCreated(Date created) {
		this.created = created;
	}



	public BaseElements getBaseElements() {
		return baseElements;
	}

	public void setBaseElements(BaseElements baseElements) {
		this.baseElements = baseElements;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(String idRecord) {
		this.idRecord = idRecord;
	}

	public List<SynonymsAtomized> getSynonymsAtomized() {
		return SynonymsAtomized;
	}

	public void setSynonymsAtomized(List<SynonymsAtomized> synonymsAtomized) {
		SynonymsAtomized = synonymsAtomized;
	}

	public List<Hierarchy> getHierarchy() {
		return Hierarchy;
	}

	public void setHierarchy(List<Hierarchy> hierarchy) {
		Hierarchy = hierarchy;
	}


	public List<String> getLanguage() {
		return language;
	}


	public void setLanguage(List<String> language) {
		this.language = language;
	}


	public TaxonRecordName getTaxonRecordName() {
		return taxonRecordName;
	}


	public void setTaxonRecordName(TaxonRecordName taxonRecordName) {
		this.taxonRecordName = taxonRecordName;
	}
	
	

	
}
