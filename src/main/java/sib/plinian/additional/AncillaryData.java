package sib.plinian.additional;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sib.plinian.element.Element;
import sib.plinian.eml.*;
import sib.plinian.hierarchy.Hierarchy;

import com.google.common.collect.Lists;

@Entity
@Table(name = "ancillaryData", schema = "CapibaraDB@plinian_records")
public class AncillaryData {
	//op
	@Id 
	@Column(name="idAncillary")
	private String idAncillary;
	
	//ob
	@Column(name="dataType")
	private String dataType;
	
	//op
	@Column(name="mimeType")
	private String mimeType;
	
	//op
	@ElementCollection
	@CollectionTable(name = "agent")
	private List<Agent> agent =Lists.newArrayList();
	
	//op
	@Column(name="created")
	private Date created;
	
	//op
	@Column(name="modified")
	private Date modified;
	
	//op
	@Column(name="title")
	private String title;
	
	//op
	//License type?**
	@Column(name="license")
	private String license;
	
	//op
	@Column(name="rights")
	private String rights;
	
	//op
	@Column(name="rightsHolder")
	private String rightsHolder;
	
	//op //es String? **
	@Column(name="bibliographicCitation")
	private String bibliographicCitation;
	
	//op // Lenguaje controlado
	@Column(name="audience")
	private List<String> audience =Lists.newArrayList();
	
	//op
	@Column(name="source")
	private String source;
	
	//op // Lista donde cada valor está basado en un lenguaje controlado **
	@Column(name="subject")
	private List<String> subject = Lists.newArrayList();
	
	//op 
	@Column(name="description")
	private String description;
	
	//op //URL
	@Column(name="mediaURL")
	private List<String> mediaURL = Lists.newArrayList();
	
	//op //URL
	@Column(name="thumbnailURL")
	private String thumbnailURL;
	
	//op //**
	@Column(name="location")
	private String location;
	
	//op  //decimal WGS84 latitude and longitude (and optional altitude) as defined by the W3C Basic Geo Vocabulary
	@Column(name="geoPoint")
	private String geoPoint;
	
	//op //** En lugar de String (p.e DOI), se usa lista referenceEntity?
	@Column(name="reference")
	private List<String> reference = Lists.newArrayList();
	
	//op
	@Column(name="additionalInformation")
	private String additionalInformation;
	
	//op //** Este no está en la documentación: A text description or multimedia resource which describes the taxon
	@Column(name="dataObject")
	private String dataObject;
	
	/*
	  * Optional element
	  */
	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="idAncillary")
	private List<Reference> References =Lists.newArrayList();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	protected Hierarchy hierarchyR;

	public String getIdAncillary() {
		return idAncillary;
	}

	public void setIdAncillary(String identifier) {
		this.idAncillary = identifier;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public List<Agent> getAgent() {
		return agent;
	}

	public void setAgent(List<Agent> agent) {
		this.agent = agent;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public String getRightsHolder() {
		return rightsHolder;
	}

	public void setRightsHolder(String rightsHolder) {
		this.rightsHolder = rightsHolder;
	}

	public String getBibliographicCitation() {
		return bibliographicCitation;
	}

	public void setBibliographicCitation(String bibliographicCitation) {
		this.bibliographicCitation = bibliographicCitation;
	}

	public List<String> getAudience() {
		return audience;
	}

	public void setAudience(List<String> audience) {
		this.audience = audience;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getMediaURL() {
		return mediaURL;
	}

	public void setMediaURL(List<String> mediaURL) {
		this.mediaURL = mediaURL;
	}

	public String getThumbnailURL() {
		return thumbnailURL;
	}

	public void setThumbnailURL(String thumbnailURL) {
		this.thumbnailURL = thumbnailURL;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGeoPoint() {
		return geoPoint;
	}

	public void setGeoPoint(String geoPoint) {
		this.geoPoint = geoPoint;
	}

	public List<String> getReference() {
		return reference;
	}

	public void setReference(List<String> reference) {
		this.reference = reference;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getDataObject() {
		return dataObject;
	}

	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

	public List<Reference> getReferences() {
		return References;
	}

	public void setReferences(List<Reference> references) {
		References = references;
	}

	public Hierarchy getHierarchyR() {
		return hierarchyR;
	}

	public void setHierarchyR(Hierarchy hierarchyR) {
		this.hierarchyR = hierarchyR;
	}
	
	
	
	
}
