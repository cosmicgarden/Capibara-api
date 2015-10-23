package sib.plinian.taxon_record_name;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "taxonRecordNameVersion", schema = "CapibaraDB@plinian_records")
public class TaxonRecordNameVersion {
	
	@Id 
	@Column(name="idRecordVersion")
	private String idRecordVersion;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="idUser")
	private String idUser;
	
	@Column(name="version")
	private int version;
	
	@Column(name="taxonRecordName")
	private TaxonRecordName taxonRecordName;

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

	public TaxonRecordName getTaxonRecordName() {
		return taxonRecordName;
	}

	public void setTaxonRecordName(TaxonRecordName taxonRecordName) {
		this.taxonRecordName = taxonRecordName;
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
