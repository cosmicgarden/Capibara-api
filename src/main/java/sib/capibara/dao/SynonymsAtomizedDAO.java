package sib.capibara.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.common.collect.Lists;


import sib.plinian.additional.AncillaryData;
import sib.plinian.additional.Reference;
import sib.plinian.eml.Agent;
import sib.plinian.hierarchy.Hierarchy;
import sib.plinian.synonyms.SynonymsAtomized;
import sib.plinian.taxon_record.TaxonRecord;
import sib.plinian.taxon_record_name.ScientificName;


public class SynonymsAtomizedDAO {
	
	public SynonymsAtomized save(String id){
		
		SynonymsAtomized sysNomMod = new SynonymsAtomized();
		
		SynonymsAtomized sysNom = new SynonymsAtomized();
		
		sysNom.setIdElement("Syn:01"+id);
		
		
		List<AncillaryData> ancillaryDataE = Lists.newArrayList();
		AncillaryData adE1 = new AncillaryData();
		AncillaryData adE2 = new AncillaryData();
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
		adE1.setAgent(agentE);
		adE2.setAgent(agentE);
		List<String> audienceE=Lists.newArrayList();
		audienceE.add("sasa");
		adE1.setAudience(audienceE);
		audienceE.add("audience2");
		adE2.setAudience(audienceE);
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
		adE1.setIdAncillary("SynAD:01"+id);
		adE2.setIdAncillary("SynAD:02"+id);
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
		ref1.setIdReference("SynIdRef:01"+id);
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
		references.add(ref1);
		ref2.setIdReference("SynIdRef02:"+id);
		references.add(ref2);
		adE1.setReferences(references);
		ancillaryDataE.add(adE1);
		ancillaryDataE.add(adE2);
		sysNom.setAncillaryData(ancillaryDataE);
		
		ScientificName scientificNameE = new ScientificName();
		scientificNameE.setAnamorphic(true);
		scientificNameE.setNomenclaturalCode("nomenclaturalCode");
		scientificNameE.setRank("rank");
		scientificNameE.setSimple("simple Scientific Name");
		Date yearE=new Date();
		scientificNameE.setYear(yearE);
		sysNom.setSynonymName(scientificNameE);
		sysNom.setSynonymStatus("synonymStatus");
		sysNom.setIdRecord("idRecord:"+id);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();	
		
		
		try{
			em.persist(sysNom);
		
			em.close();
			sysNomMod.setSynonymStatus("Status: "+id);
			return sysNomMod;
		
		}catch(Exception e){
			//this.message="error";
			System.out.println("Error: "+ e.getMessage());
			
			for(int i=0;i<e.getStackTrace().length;i++){
				System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
		
		return sysNomMod;
		
	}

	public SynonymsAtomized get(String id) {
		System.out.println("IDHierarchy!!: "+id);
		SynonymsAtomized syna = new SynonymsAtomized();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		syna = em.find(SynonymsAtomized.class, "TaxidElSyn:02010");
		
		System.out.println("SynonymStatus: "+syna.getSynonymStatus());
		
		em.close();
		
		emf.close();
		
		return syna;
	}

}
