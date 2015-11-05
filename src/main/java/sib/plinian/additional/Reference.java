package sib.plinian.additional;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reference", schema = "CapibaraDB@plinian_records")
public class Reference {
	
	@Id
	@Column(name="idReference")
	private String idReference;
	
	@Column(name="profile_id")
	private String profile_id;
	
	@Column(name="group_id")
	private String group_id;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="last_modified")
	private Date last_modified;
	
	@Column(name="identifiers")
	private List<String> identifiers;
	
	@Column(name="abstractText")
	private String abstractText;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="type")
	private String type;
	
	@Column(name="source")
	private String source;
	
	@Column(name="title")
	private String title;
	
	@Column(name="title")
	private List<String> authors;
	
	@Column(name="year")
	private Date year;
	
	@Column(name="volume")
	private String volume;
	
	@Column(name="issue")
	private String issue;
	
	@Column(name="pages")
	private String pages;
	
	@Column(name="series")
	private String series;
	
	@Column(name="chapter")
	private String chapter;
	
	@Column(name="websites")
	private String websites;
	
	@Column(name="accesed")
	private String accesed;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="city")
	private String city;
	
	@Column(name="edition")
	private String edition;
	
	@Column(name="institution")
	private String institution;
	
	@Column(name="editors")
	private List<String> editors;
	
	@Column(name="keywords")
	private List<String> keywords;
	
	@Column(name="doi")
	private String doi;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="issn")
	private String issn;
	
	@Column(name="link")
	private String link;
	
	@Column(name="taxonRecordId")
	private String taxonRecordId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	protected AncillaryData ancillaryDataR;

	public String getIdReference() {
		return idReference;
	}

	public void setIdReference(String idReference) {
		this.idReference = idReference;
	}

	public String getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}

	public List<String> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<String> identifiers) {
		this.identifiers = identifiers;
	}

	public String getAbstractText() {
		return abstractText;
	}

	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getWebsites() {
		return websites;
	}

	public void setWebsites(String websites) {
		this.websites = websites;
	}

	public String getAccesed() {
		return accesed;
	}

	public void setAccesed(String accesed) {
		this.accesed = accesed;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public List<String> getEditors() {
		return editors;
	}

	public void setEditors(List<String> editors) {
		this.editors = editors;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTaxonRecordId() {
		return taxonRecordId;
	}

	public void setTaxonRecordId(String taxonRecordId) {
		this.taxonRecordId = taxonRecordId;
	}
	

}
