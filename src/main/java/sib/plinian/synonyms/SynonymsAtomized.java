package sib.plinian.synonyms;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import sib.plinian.element.Element;
import sib.plinian.taxon_record_name.ScientificName;

import com.google.common.collect.Lists;


@Entity
@Table(name = "synonymsAtomized", schema = "CapibaraDB@plinian_records")
public class SynonymsAtomized extends Element{
	/*
	 * Obligatory element
	 */
	@Embedded
	private ScientificName synonymName;
	
	/*
	 * Optional element
	 */
	@Column(name = "synonymStatus")
	private String synonymStatus;
	
	@Column(name = "idRecord")
	private String idRecord;
	

	public ScientificName getSynonymName() {
		return synonymName;
	}

	public void setSynonymName(ScientificName synonymName) {
		this.synonymName = synonymName;
	}

	public String getSynonymStatus() {
		return synonymStatus;
	}

	public void setSynonymStatus(String synonymStatus) {
		this.synonymStatus = synonymStatus;
	}

	public String getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(String idRecord) {
		this.idRecord = idRecord;
	}

		

}
