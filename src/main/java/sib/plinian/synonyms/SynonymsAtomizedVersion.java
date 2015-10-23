package sib.plinian.synonyms;

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

import com.google.common.collect.Lists;

@Entity
@Table(name = "synonymsAtomizedVersion", schema = "CapibaraDB@plinian_records")
public class SynonymsAtomizedVersion {
	
	//*
	@Id 
	@Column(name="idRecordVersion")
	private String idRecordVersion;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="idUser")
	private String idUser;
	
	@Column(name="version")
	private int version;
	
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idRecordVersion")
	private List<SynonymsAtomized> SynonymsAtomized = Lists.newArrayList();

	public String getIdRecordVersion() {
		return idRecordVersion;
	}

	public void setIdRecordVersion(String idRecordVersion) {
		this.idRecordVersion = idRecordVersion;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<SynonymsAtomized> getSynonymsAtomized() {
		return SynonymsAtomized;
	}

	public void setSynonymsAtomized(List<SynonymsAtomized> synonymsAtomized) {
		SynonymsAtomized = synonymsAtomized;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
	

	
}
