package sib.capibara.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.common.collect.Lists;


import sib.plinian.additional.AncillaryData;
import sib.plinian.additional.Reference;
import sib.plinian.additional.SimpleReference;
import sib.plinian.eml.Agent;
import sib.plinian.taxon_record_name.CanonicalName;
import sib.plinian.taxon_record_name.Epithet;
import sib.plinian.taxon_record_name.ScientificName;
import sib.plinian.taxon_record_name.TaxonRecordName;

public class TaxonRecordNameDAO {
	
	//public TaxonRecordNameModel save(TaxonRecordNameModel taxonRecordNameModel){
	public TaxonRecordName save(String id){
		
		TaxonRecordName taxon_r_name_model = new TaxonRecordName();
		TaxonRecordName taxon_r_name = new TaxonRecordName();
		
		List<AncillaryData> ancillaryData = Lists.newArrayList();
		AncillaryData adM1 = new AncillaryData();
		adM1.setAdditionalInformation("additionalInformation1");
		AncillaryData adM2 = new AncillaryData();
		adM2.setAdditionalInformation("additionalInformation1");
		List<Agent> agent = Lists.newArrayList();
		Agent ang = new Agent();
		Agent ang2 = new Agent();
		taxon_r_name_model.setAncillaryData(ancillaryData);
		List<String> address = Lists.newArrayList();
		address.add("calle28");
		ang.setAddress(address);
		List<String> email = Lists.newArrayList();
		email.add("dasdas");
		ang.setEmail(email);
		ang.setFirstName("Oscar");
		List<String> homepage = Lists.newArrayList();
		homepage.add("wwww");
		ang.setHomepage(homepage);
		ang.setLastName("Duque");
		ang.setOrganisation("organisation");
		List<String> phone = Lists.newArrayList();
		phone.add("4864");
		ang.setPhone(phone);
		ang.setPosition("position");
		ang.setRole("role");
		agent.add(ang);
		ang2.setFirstName("Javier");
		ang2.setLastName("Ballesteros");
		agent.add(ang2);
		adM1.setAgent(agent);
		adM2.setAgent(agent);
		List<String> audience=Lists.newArrayList();
		audience.add("sasa");
		adM1.setAudience(audience);
		audience.add("audience2");
		adM2.setAudience(audience);
		adM1.setBibliographicCitation("bibliographicCitation1");
		adM2.setBibliographicCitation("bibliographicCitation2");
		Date created1 = new Date();
		adM1.setCreated(created1);
		Date created2 = new Date();
		adM2.setCreated(created2);
		adM1.setDataObject("dataObject");
		adM2.setDataObject("dataObject2");
		adM1.setDataType("dataType");
		adM2.setDataType("dataType2");
		adM1.setDescription("description");
		adM2.setDescription("description2");
		adM1.setGeoPoint("41.89");
		adM2.setGeoPoint("58.89");
		adM1.setIdentifier("01");
		adM2.setIdentifier("02");
		adM1.setLicense("license");
		adM2.setLicense("license2");
		adM1.setLocation("location");
		adM2.setLocation("location2");
		List<String> mediaURL= Lists.newArrayList();
		mediaURL.add("erwrwer");
		adM1.setMediaURL(mediaURL);
		mediaURL.add("www.sasa.com");
		adM2.setMediaURL(mediaURL);
		adM1.setMimeType("mimeType");
		adM2.setMimeType("mimeType2");
		Date modified = new Date();
		adM1.setModified(modified);
		Date modified2 = new Date();
		adM2.setModified(modified2);
		List<String> reference= Lists.newArrayList();
		reference.add("dsadasd");
		adM1.setReference(reference);
		reference.add("xsxsxsxs");
		adM2.setReference(reference);
		adM1.setRights("rights");
		adM2.setRights("rights2");
		adM1.setRightsHolder("rightsHolder");
		adM2.setRightsHolder("rightsHolder2");
		adM1.setSource("source");
		adM2.setSource("source2");
		List<String> subject= Lists.newArrayList();
		subject.add("aqowerw");
		adM1.setSubject(subject);
		subject.add("subject");
		adM2.setSubject(subject);
		adM1.setThumbnailURL("thumbnailURL1");
		adM2.setThumbnailURL("thumbnailURL2");
		adM1.setTitle("title");
		adM2.setTitle("title2");
		ancillaryData.add(adM1);
		ancillaryData.add(adM2);
		//----
		taxon_r_name_model.setAncillaryData(ancillaryData);
		Date dateSave=new Date();
		taxon_r_name_model.setDateSave(dateSave);
		ScientificName scientificName = new ScientificName();
		scientificName.setAnamorphic(true);
		CanonicalName canonicalName = new CanonicalName();
		canonicalName.setCultivarNameGroup("cultivarNameGroup");
		//--
		Epithet epithet = new Epithet();
		epithet.setInfragenericEpithet("infragenericEpithet");
		epithet.setInfraspecificEpithet("infraspecificEpithet");
		epithet.setSpecificEpithet("specificEpithet");
		//--
		
		//---
		SimpleReference genus = new SimpleReference();
		genus.setLinkType("dsadsadcs");
		genus.setRef("dsadasdasdasxew");
		//---
		
		canonicalName.setSimple("simple");
		canonicalName.setUninomial("uninomial");
		//---
		//scientificName.setCanonicalName(canonicalName);
		scientificName.setNomenclaturalCode("nomenclaturalCode");
		scientificName.setRank("rank");
		scientificName.setSimple("simple");
		Date year=new Date();
		scientificName.setYear(year);
		taxon_r_name_model.setTaxonRecordNameVersion(id);
		taxon_r_name_model.setScientificName(scientificName);
		taxon_r_name_model.setTaxonRecordNameVersion("256");
		
		
		List<AncillaryData> ancillaryDataE = Lists.newArrayList();
		AncillaryData adE1 = new AncillaryData();
		adM1.setAdditionalInformation("additionalInformation1");
		AncillaryData adE2 = new AncillaryData();
		adM2.setAdditionalInformation("additionalInformation1");
		List<Agent> agentE = Lists.newArrayList();
		Agent angE = new Agent();
		Agent angE2 = new Agent();
		taxon_r_name_model.setAncillaryData(ancillaryData);
		List<String> addressE = Lists.newArrayList();
		addressE.add("calle28");
		angE.setAddress(addressE);
		List<String> emailE = Lists.newArrayList();
		emailE.add("dasdas");
		angE.setEmail(email);
		angE.setFirstName("Oscar");
		List<String> homepageE = Lists.newArrayList();
		homepageE.add("wwww");
		angE.setHomepage(homepage);
		angE.setLastName("Duque");
		angE.setOrganisation("organisation");
		List<String> phoneE = Lists.newArrayList();
		phoneE.add("4864");
		angE.setPhone(phoneE);
		angE.setPosition("position");
		angE.setRole("role");
		agentE.add(angE);
		angE2.setFirstName("Javier");
		angE2.setLastName("Ballesteros");
		agentE.add(angE2);
		adE1.setAgent(agentE);
		adE2.setAgent(agentE);
		List<String> audienceE=Lists.newArrayList();
		audienceE.add("sasa");
		adE1.setAudience(audienceE);
		audienceE.add("audience2");
		adE2.setAudience(audience);
		adE1.setBibliographicCitation("bibliographicCitation1");
		adE2.setBibliographicCitation("bibliographicCitation2");
		Date createdE1 = new Date();
		adE1.setCreated(createdE1);
		Date createdE2 = new Date();
		adE2.setCreated(createdE2);
		adE1.setDataObject("dataObject");
		adE2.setDataObject("dataObject2");
		adE1.setDataType("dataType");
		adE2.setDataType("dataType2");
		adE1.setDescription("description");
		adE2.setDescription("description2");
		adE1.setGeoPoint("41.89");
		adE2.setGeoPoint("58.89");
		adE1.setIdentifier("03"+id);
		adE2.setIdentifier("04"+id);
		adE1.setLicense("license");
		adE2.setLicense("license2");
		adE1.setLocation("location");
		adE2.setLocation("location2");
		List<String> mediaURLE= Lists.newArrayList();
		mediaURLE.add("erwrwer");
		adE1.setMediaURL(mediaURLE);
		mediaURLE.add("www.sasa.com");
		adE2.setMediaURL(mediaURLE);
		adE1.setMimeType("mimeType");
		adE2.setMimeType("mimeType2");
		Date modifiedE = new Date();
		adE1.setModified(modifiedE);
		Date modifiedE2 = new Date();
		adE2.setModified(modifiedE2);
		List<String> referenceE= Lists.newArrayList();
		referenceE.add("dsadasd");
		adE1.setReference(referenceE);
		referenceE.add("xsxsxsxs");
		adE2.setReference(referenceE);
		adE1.setRights("rights");
		adE2.setRights("rights2");
		adE1.setRightsHolder("rightsHolder");
		adE2.setRightsHolder("rightsHolder2");
		adE1.setSource("source");
		adE2.setSource("source2");
		List<String> subjectE= Lists.newArrayList();
		subjectE.add("aqowerw");
		adE1.setSubject(subjectE);
		subjectE.add("subject");
		adE2.setSubject(subjectE);
		adE1.setThumbnailURL("thumbnailURL1");
		adE2.setThumbnailURL("thumbnailURL2");
		adE1.setTitle("title");
		adE2.setTitle("title2");
		List<Reference> references = Lists.newArrayList();
		Reference ref1= new Reference();
		ref1.setAbstractText("abstractText");
		ref1.setAccesed("accesed");
		List<String> authors = Lists.newArrayList();
		authors.add("Oscar Duque");
		authors.add("Camila Toncel");
		ref1.setAuthors(authors);
		ref1.setChapter("1577");
		ref1.setCity("Bogota");
		Date created = new Date();
		ref1.setCreated(created);
		ref1.setDoi("8489468768787");
		ref1.setEdition("edition");
		List<String> editors = Lists.newArrayList();
		editors.add("sasas");
		editors.add("dsaewr");
		ref1.setEditors(editors);
		ref1.setGroup_id("group_id");
		List<String> identifiers =Lists.newArrayList();
		identifiers.add("01");
		identifiers.add("02");
		ref1.setIdentifiers(identifiers);
		ref1.setIdReference("01"+id);
		ref1.setInstitution("Instituto Humboldt");
		ref1.setIsbn("ISBN");
		ref1.setIssn("issn");
		ref1.setIssue("issue");
		List<String> keywords =Lists.newArrayList();
		keywords.add("Aniimal");
		keywords.add("Vegeta");
		ref1.setKeywords(keywords);
		Date last_modified = new Date();
		ref1.setLast_modified(last_modified);
		ref1.setLink("www.hhodad.com");
		ref1.setPages("85");
		ref1.setProfile_id("7887dsad");
		ref1.setPublisher("Norma");
		ref1.setSeries("series");
		ref1.setSource("source");
		ref1.setTags("tags");
		ref1.setTaxonRecordId("0145");
		ref1.setTitle("DNA rtna");
		ref1.setType("type");
		ref1.setVolume("mds25");
		ref1.setWebsites("www.sib.com");
		ref1.setYear(year);
		Reference ref2= new Reference();
		references.add(ref1);
		ref2.setIdReference("178"+id);
		references.add(ref2);
		adE1.setReferences(references);
		ancillaryDataE.add(adE1);
		ancillaryDataE.add(adE2);
		//----
		//taxon_r_name.setAncillaryData(ancillaryDataE);
		Date dateSaveE=new Date();
		taxon_r_name.setDateSave(dateSaveE);
		ScientificName scientificNameE = new ScientificName();
		scientificNameE.setAnamorphic(true);
		/*CanonicalName canonicalNameE = new CanonicalName();
		canonicalNameE.setCultivarNameGroup("cultivarNameGroup");
		//--
		Epithet epithetE = new Epithet();
		epithetE.setInfragenericEpithet("infragenericEpithet");
		epithetE.setInfraspecificEpithet("infraspecificEpithet");
		epithetE.setSpecificEpithet("specificEpithet");
		//--
		//canonicalNameE.setEpithet(epithetE);
		//---
		//---
		SimpleReference genusE = new SimpleReference();
		genusE.setLinkType("dsadsadcs");
		genusE.setRef("dsadasdasdasxew");
		//---
		//canonicalNameE.setGenus(genusE);
		canonicalNameE.setSimple("simple");
		canonicalNameE.setUninomial("uninomial");*/
		//---
		//scientificNameE.setCanonicalName(canonicalNameE);
		scientificNameE.setNomenclaturalCode("nomenclaturalCode");
		scientificNameE.setRank("rank");
		scientificNameE.setSimple("simple Scientific Name");
		Date yearE=new Date();
		scientificNameE.setYear(yearE);
		taxon_r_name.setTaxonRecordNameVersion(id);
		taxon_r_name.setScientificName(scientificNameE);
		taxon_r_name.setAncillaryData(ancillaryDataE);
		taxon_r_name.setIdElement(id);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();	
		
		
		try{
			em.persist(taxon_r_name);
		
			em.close();
			return taxon_r_name_model;
		
		}catch(Exception e){
			//this.message="error";
			System.out.println("Error: "+ e.getMessage());
			
			for(int i=0;i<e.getStackTrace().length;i++){
				System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
		
		
		return taxon_r_name_model;
	}

}
