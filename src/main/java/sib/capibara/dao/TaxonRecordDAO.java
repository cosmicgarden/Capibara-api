package sib.capibara.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.core.Response;

import sib.plinian.additional.AncillaryData;
import sib.plinian.additional.Reference;
import sib.plinian.base_elements.BaseElements;
import sib.plinian.eml.Agent;
import sib.plinian.hierarchy.Hierarchy;
import sib.plinian.hierarchy.HierarchyVersion;
import sib.plinian.synonyms.SynonymsAtomized;
import sib.plinian.taxon_record.TaxonRecord;
import sib.plinian.taxon_record.TaxonRecordVersion;
import sib.plinian.taxon_record_name.ScientificName;
import sib.plinian.taxon_record_name.TaxonRecordName;
import sib.plinian.taxon_record_name.TaxonRecordNameVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;

public class TaxonRecordDAO {
	
	public TaxonRecord saveTest(String id){
		
		TaxonRecord taxonRecord = new TaxonRecord();
		
		
		Date created = new Date();
		taxonRecord.setCreated(created);
		
		
		List<Hierarchy> hierarchy = Lists.newArrayList();
		
		Hierarchy hie = new Hierarchy();
		
		hie.setIdElement("TaxidElH:01"+id);
		
		hierarchy.add(hie);
		
		Hierarchy hie2 = new Hierarchy();
		
		hie2.setIdElement("Hier:02"+id);
		
		hie2.setClassHierarchy("classHierarchy");
		hie2.setClassification("classification");
		hie2.setFamily("family");
		hie2.setGenus("genus");
		hie2.setHigherClassification("higherClassification");
		hie2.setInfraspecificEpithet("infraspecificEpithet");
		hie2.setKingdom("kingdom");
		hie2.setOrder("order");
		hie2.setParentTaxon("parentTaxon");
		hie2.setPhylum("phylum");
		hie2.setRecommended("recommended");
		hie2.setSpecificEpithet("specificEpithet");
		hie2.setSubgenus("subgenus");
		hie2.setTaxonRank("taxonRank");
		
		List<AncillaryData> ancillaryDataH = Lists.newArrayList();
		AncillaryData adH1 = new AncillaryData();
		AncillaryData adH2 = new AncillaryData();
		List<Agent> agentE = Lists.newArrayList();
		Agent angE = new Agent();
		Agent angE2 = new Agent();
		List<String> addressE = Lists.newArrayList();
		addressE.add("calle28");
		angE.setAddress(addressE);
		List<String> emailE = Lists.newArrayList();
		emailE.add("dasdas");
		angE.setEmail(emailE);
		angE.setFirstName("Oscar");
		List<String> homepageE = Lists.newArrayList();
		homepageE.add("wwww");
		angE.setHomepage(homepageE);
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
		adH1.setAgent(agentE);
		adH2.setAgent(agentE);
		List<String> audienceE=Lists.newArrayList();
		audienceE.add("sasa");
		adH1.setAudience(audienceE);
		audienceE.add("audience2");
		adH2.setAudience(audienceE);
		adH1.setBibliographicCitation("bibliographicCitation1");
		adH2.setBibliographicCitation("bibliographicCitation2");
		Date createdE1 = new Date();
		adH1.setCreated(createdE1);
		Date createdE2 = new Date();
		adH2.setCreated(createdE2);
		adH1.setDataObject("dataObject");
		adH2.setDataObject("dataObject2");
		adH1.setDataType("dataType");
		adH2.setDataType("dataType2");
		adH1.setDescription("description");
		adH2.setDescription("description2");
		adH1.setGeoPoint("41.89");
		adH2.setGeoPoint("58.89");
		adH1.setIdAncillary("TaxidElH_AD:01"+id);
		adH2.setIdAncillary("TaxidElH_AD:02"+id);
		adH1.setLicense("license");
		adH2.setLicense("license2");
		adH1.setLocation("location");
		adH2.setLocation("location2");
		List<String> mediaURLE= Lists.newArrayList();
		mediaURLE.add("erwrwer");
		adH1.setMediaURL(mediaURLE);
		mediaURLE.add("www.sasa.com");
		adH2.setMediaURL(mediaURLE);
		adH1.setMimeType("mimeType");
		adH2.setMimeType("mimeType2");
		Date modifiedE = new Date();
		adH1.setModified(modifiedE);
		Date modifiedE2 = new Date();
		adH2.setModified(modifiedE2);
		List<String> referenceE= Lists.newArrayList();
		referenceE.add("dsadasd");
		adH1.setReference(referenceE);
		referenceE.add("xsxsxsxs");
		adH2.setReference(referenceE);
		adH1.setRights("rights");
		adH2.setRights("rights2");
		adH1.setRightsHolder("rightsHolder");
		adH2.setRightsHolder("rightsHolder2");
		adH1.setSource("source");
		adH2.setSource("source2");
		List<String> subjectE= Lists.newArrayList();
		subjectE.add("aqowerw");
		adH1.setSubject(subjectE);
		subjectE.add("subject");
		adH2.setSubject(subjectE);
		adH1.setThumbnailURL("thumbnailURL1");
		adH2.setThumbnailURL("thumbnailURL2");
		adH1.setTitle("title");
		adH2.setTitle("title2");
		List<Reference> referencesH = Lists.newArrayList();
		Reference ref1= new Reference();
		ref1.setAbstractText("abstractText");
		ref1.setAccesed("accesed");
		List<String> authors = Lists.newArrayList();
		authors.add("Oscar Duque");
		authors.add("Camila Toncel");
		ref1.setAuthors(authors);
		ref1.setChapter("1577");
		ref1.setCity("Bogota");
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
		ref1.setIdReference("HAR:01"+id);
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
		Date year = new Date();
		ref1.setYear(year);
		Reference ref2= new Reference();
		referencesH.add(ref1);
		ref2.setIdReference("HAR:03"+id);
		referencesH.add(ref2);
		adH1.setReferences(referencesH);
		ancillaryDataH.add(adH1);
		ancillaryDataH.add(adH2);
		hie2.setAncillaryData(ancillaryDataH);
		
		hierarchy.add(hie2);
		
		taxonRecord.setHierarchy(hierarchy);
		
		List<SynonymsAtomized> synonymsAtomized = Lists.newArrayList();
		SynonymsAtomized syn1 = new SynonymsAtomized();
		syn1.setIdElement("TSA:01"+id);
		synonymsAtomized.add(syn1);
		SynonymsAtomized syn2 = new SynonymsAtomized();
		syn2.setIdElement("TSA:02"+id);
		
		
		addressE.add("calle28");
		angE.setAddress(addressE);
		emailE.add("dasdas");
		angE.setEmail(emailE);
		angE.setFirstName("Oscar");
		homepageE.add("wwww");
		angE.setHomepage(homepageE);
		angE.setLastName("Duque");
		angE.setOrganisation("organisation");
		phoneE.add("4864");
		angE.setPhone(phoneE);
		angE.setPosition("position");
		angE.setRole("role");
		agentE.add(angE);
		angE2.setFirstName("Javier");
		angE2.setLastName("Ballesteros");
		agentE.add(angE2);
		
		AncillaryData adS1=new AncillaryData();
		adS1.setAgent(agentE);
		AncillaryData adS2= new AncillaryData();
		adS2.setAgent(agentE);
		audienceE.add("sasa");
		adS1.setAudience(audienceE);
		audienceE.add("audience2");
		adS2.setAudience(audienceE);
		adS1.setBibliographicCitation("bibliographicCitation1");
		adS2.setBibliographicCitation("bibliographicCitation2");
		adS1.setCreated(createdE1);
		adS2.setCreated(createdE2);
		adS1.setDataObject("dataObject");
		adS2.setDataObject("dataObject2");
		adS1.setDataType("dataType");
		adS2.setDataType("dataType2");
		adS1.setDescription("description");
		adS2.setDescription("description2");
		adS1.setGeoPoint("41.89");
		adS2.setGeoPoint("58.89");
		adS1.setIdAncillary("TSAD:01"+id);
		adS2.setIdAncillary("TSAD:002"+id);
		adS1.setLicense("license");
		adS2.setLicense("license2");
		adS1.setLocation("location");
		adS2.setLocation("location2");
		mediaURLE.add("erwrwer");
		adS1.setMediaURL(mediaURLE);
		mediaURLE.add("www.sasa.com");
		adS2.setMediaURL(mediaURLE);
		adS1.setMimeType("mimeType");
		adS2.setMimeType("mimeType2");
		adS1.setModified(modifiedE);
		adS2.setModified(modifiedE2);
		referenceE.add("dsadasd");
		adS1.setReference(referenceE);
		referenceE.add("xsxsxsxs");
		adS2.setReference(referenceE);
		adS1.setRights("rights");
		adS2.setRights("rights2");
		adS1.setRightsHolder("rightsHolder");
		adS2.setRightsHolder("rightsHolder2");
		adS1.setSource("source");
		adS2.setSource("source2");
		subjectE.add("aqowerw");
		adS1.setSubject(subjectE);
		subjectE.add("subject");
		adS2.setSubject(subjectE);
		adS1.setThumbnailURL("thumbnailURL1");
		adS2.setThumbnailURL("thumbnailURL2");
		adS1.setTitle("title");
		adS2.setTitle("title2");
		Reference refS1 = new Reference();
		refS1.setAbstractText("abstractText");
		refS1.setAccesed("accesed");
		authors.add("Oscar Duque");
		authors.add("Camila Toncel");
		refS1.setAuthors(authors);
		refS1.setChapter("1577");
		refS1.setCity("Bogota");
		refS1.setCreated(created);
		refS1.setDoi("8489468768787");
		refS1.setEdition("edition");
		editors.add("sasas");
		editors.add("dsaewr");
		refS1.setEditors(editors);
		refS1.setGroup_id("group_id");
		identifiers.add("01");
		identifiers.add("02");
		refS1.setIdentifiers(identifiers);
		refS1.setIdReference("TRSA:001"+id);
		refS1.setInstitution("Instituto Humboldt");
		refS1.setIsbn("ISBN");
		refS1.setIssn("issn");
		refS1.setIssue("issue");
		keywords.add("Aniimal");
		keywords.add("Vegeta");
		refS1.setKeywords(keywords);
		refS1.setLast_modified(last_modified);
		refS1.setLink("www.hhodad.com");
		refS1.setPages("85");
		refS1.setProfile_id("7887dsad");
		refS1.setPublisher("Norma");
		refS1.setSeries("series");
		refS1.setSource("source");
		refS1.setTags("tags");
		refS1.setTaxonRecordId("0145");
		refS1.setTitle("DNA rtna");
		refS1.setType("type");
		refS1.setVolume("mds25");
		refS1.setWebsites("www.sib.com");
		refS1.setYear(year);
		List<Reference> referencesS = Lists.newArrayList();
		referencesS.add(ref1);
		Reference refS2 = new Reference();
		refS2.setIdReference("TRSA:004"+id);
		referencesS.add(refS2);
		adS1.setReferences(referencesS);
		List<AncillaryData> ancillaryDataS = Lists.newArrayList();
		ancillaryDataS.add(adS1);
		ancillaryDataS.add(adS2);
		syn2.setAncillaryData(ancillaryDataS);
		
		ScientificName scientificNameE = new ScientificName();
		scientificNameE.setAnamorphic(true);
		scientificNameE.setNomenclaturalCode("nomenclaturalCode");
		scientificNameE.setRank("rank");
		scientificNameE.setSimple("simple Scientific Name");
		Date yearE=new Date();
		scientificNameE.setYear(yearE);
		syn2.setSynonymName(scientificNameE);
		syn2.setSynonymStatus("synonymStatus");
		synonymsAtomized.add(syn2);
		taxonRecord.setSynonymsAtomized(synonymsAtomized);
		
		BaseElements baseElements = new BaseElements();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		taxonRecord.setIdRecord(id);
		
		baseElements.setAbstract("El resumen");
		
		baseElements.setGlobalUniqueIdentifier("02");
		
		baseElements.setTaxonConceptID("Concepto taxonomico");
		
		baseElements.setTaxonRecordID("ID del taxon record");
		
		taxonRecord.setBaseElements(baseElements);
		
		taxonRecord.setVersion("Version:01");
		
		TaxonRecordName taxonRecordName = new TaxonRecordName();
		
		Date dateSave =new Date();
		
		taxonRecordName.setDateSave(dateSave);
		
		taxonRecordName.setIdElement("trn:01"+id);
		
		ScientificName scientificNameT = new ScientificName();
		
		scientificNameT.setAnamorphic(true);
		
		scientificNameT.setNomenclaturalCode("1115");
		
		scientificNameT.setRank("rank");
		
		scientificNameT.setSimple("simple");
		
		scientificNameT.setYear(yearE);
		
		taxonRecordName.setScientificName(scientificNameT);
		
		
		
		List<AncillaryData> ancillaryDataTN= Lists.newArrayList();
		
		AncillaryData adT2 = new AncillaryData();
		adT2.setIdAncillary("hTrn02:"+id);
		ancillaryDataTN.add(adT2);
		taxonRecordName.setAncillaryData(ancillaryDataTN);
		
		//taxonRecordName.setTaxonRecordId(taxonRecordId);
		
		taxonRecordName.setTaxonRecordNameVersion("taxonRecordNameVersion");
		
		//taxonRecordName.setUserId("usr:01"+id);
		
		taxonRecord.setTaxonRecordName(taxonRecordName);
		
		
		
				
		List<String> language = Lists.newArrayList();
		language.add("ES");
		language.add("EN");
		taxonRecord.setLanguage(language);
		
		try{
			em.persist(taxonRecord);
		
			em.close();
			
			System.out.println("Persisted!!");
		
			return taxonRecord;
		
		}catch(Exception e){
			//this.message="error";
			System.out.println("Error: "+ e.getMessage());
			
			for(int i=0;i<e.getStackTrace().length;i++){
				System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
		
		return taxonRecord;
	}

	public TaxonRecord get(String id) {
		System.out.println("IDTaxonRecord!!: "+id);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		TaxonRecord taxRec = new TaxonRecord();
		
		taxRec = em.find(TaxonRecord.class, id);
		
		System.out.println("Version: "+taxRec.getLanguage());
		
		em.close();
		
		emf.close();
		
		return taxRec;
	}

	public TaxonRecordVersion getAllVersions(String id) {
	    TaxonRecordVersion taxVer = new TaxonRecordVersion();
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		//find by id
	    try{
	    	//Con el id del taxonRcordVersion al cual pertenece busco en la BD si existe
	    	taxVer = em.find(TaxonRecordVersion.class, id);
					
		}catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
					
			for(int i=0;i<e.getStackTrace().length;i++){
						System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
	    
	    if(taxVer==null){
	    	System.out.println("Not in the db");
	    	return taxVer;
	    }else{
	    	return taxVer; 
	    }
		
		
		//return null;
	}

	

	

}
