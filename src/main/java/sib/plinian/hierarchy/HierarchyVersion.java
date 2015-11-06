package sib.plinian.hierarchy;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



import javax.persistence.Table;

import sib.plinian.taxon_record.TaxonRecordVersion;

import com.google.common.collect.Lists;

/**
 * @author Oscar Duque
 *
 */
@Entity
@Table(name = "hierarchyVersion", schema = "CapibaraDB@plinian_records")
public class HierarchyVersion {
		@Id 
		@Column(name="idHierarchyVersion")
		private String idHierarchyVersion;
		
		@Column(name="version")
		private int version;
		
		@Column(name="created")
		private Date created;
		
		@Column(name="idUser")
		private String idUser;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		protected TaxonRecordVersion taxonRecordVersion;
		
		@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
		@JoinColumn(name="idHierarchyVersion")
		private List<Hierarchy> hierarchy = Lists.newArrayList();
		
		@Column(name="idTaxonRecordVersion")
		String idTaxonRecordVersion;
		
		public HierarchyVersion(){
		
		}


		public String getIdHierarchyVersion() {
			return idHierarchyVersion;
		}



		public void setIdHierarchyVersion(String idHierarchyVersion) {
			this.idHierarchyVersion = idHierarchyVersion;
		}



		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public List<Hierarchy> getHierarchy() {
			return hierarchy;
		}

		public void setHierarchy(List<Hierarchy> hierarchy) {
			this.hierarchy = hierarchy;
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


		public TaxonRecordVersion getTaxonRecordVersion() {
			return taxonRecordVersion;
		}


		public void setTaxonRecordVersion(TaxonRecordVersion taxonRecordVersion) {
			this.taxonRecordVersion = taxonRecordVersion;
		}


		public String getIdTaxonRecordVersion() {
			return idTaxonRecordVersion;
		}


		public void setIdTaxonRecordVersion(String idTaxonRecordVersion) {
			this.idTaxonRecordVersion = idTaxonRecordVersion;
		}
		
		

}
