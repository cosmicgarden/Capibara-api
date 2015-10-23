package sib.plinian.hierarchy;

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
@Table(name = "hierarchyVersion", schema = "CapibaraDB@plinian_records")
public class HierarchyVersion {
		@Id 
		@Column(name="idRecordVersion")
		private String idRecordVersion;
		
		@Column(name="version")
		private int version;
		
		@Column(name="created")
		private Date created;
		
		@Column(name="idUser")
		private String idUser;
		
		@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
		@JoinColumn(name="idRecordVersion")
		private List<Hierarchy> hierarchy = Lists.newArrayList();
		
		public HierarchyVersion(){
		
		}

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
		
		

}
