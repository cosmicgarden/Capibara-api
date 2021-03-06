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
import sib.plinian.hierarchy.HierarchyVersion;
import sib.plinian.taxon_record.TaxonRecordVersion;

public class HierarchyDAO {
	
	
	public HierarchyVersion saveTestVersion(String id){
		HierarchyVersion hierVer = new HierarchyVersion();
		
		Date created = new Date();
		hierVer.setCreated(created);
		
		hierVer.setIdTaxonRecordVersion("001");
		
		List<Hierarchy> hierarchy = Lists.newArrayList();
		
		Hierarchy hie = new Hierarchy();
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
		ref2.setIdentifiers(identifiers);
		ref2.setInstitution("Instituto Humboldt");
		ref2.setIsbn("ISBN");
		ref2.setIssn("issn");
		ref2.setIssue("issue");
		keywords.add("Aniimal");
		keywords.add("Vegeta");
		ref2.setKeywords(keywords);
		ref2.setLast_modified(last_modified);
		ref2.setLink("www.hhodad.com");
		ref2.setPages("85");
		ref2.setProfile_id("7887dsad");
		ref2.setPublisher("Norma");
		ref2.setSeries("series");
		ref2.setSource("source");
		ref2.setTags("tags");
		ref2.setTaxonRecordId("0145");
		ref2.setTitle("DNA rtna");
		ref2.setType("type");
		ref2.setVolume("mds25");
		ref2.setWebsites("www.sib.com");
		ref2.setYear(year);
		referencesH.add(ref2);
		adH1.setReferences(referencesH);
		ancillaryDataH.add(adH1);
		//ancillaryDataH.add(adH2);
		hie2.setAncillaryData(ancillaryDataH);
		
		//---
		
		hie.setIdElement("Hier:01abc"+id);
		
		hie.setClassHierarchy("classHierarchy");
		hie.setClassification("classification");
		hie.setFamily("family");
		hie.setGenus("genus");
		hie.setHigherClassification("higherClassification");
		hie.setInfraspecificEpithet("infraspecificEpithet");
		hie.setKingdom("kingdom");
		hie.setOrder("order");
		hie.setParentTaxon("parentTaxon");
		hie.setPhylum("phylum");
		hie.setRecommended("recommended");
		hie.setSpecificEpithet("specificEpithet");
		hie.setSubgenus("subgenus");
		hie.setTaxonRank("taxonRank");
		
		
		
		
		
		hie.setAncillaryData(ancillaryDataH);
		
		hierarchy.add(hie2);
		
		hierarchy.add(hie);
		
		
		hierVer.setHierarchy(hierarchy);
		
		hierVer.setIdHierarchyVersion("001");
		
		hierVer.setIdUser("001");
		
		hierVer.setVersion(1);
		
		return hierVer;
	}

	
	
	
	//public String saveVersion(List<Hierarchy> hier, String id){
	public String saveVersion(HierarchyVersion hierVer){
		System.out.println("Id HierarchyVersion!: "+hierVer.getIdHierarchyVersion());
		
		System.out.println("Id Taxon record por buscar!: "+hierVer.getIdTaxonRecordVersion());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		TaxonRecordVersion taxRecVer = new TaxonRecordVersion();
		
		String idRec = hierVer.getIdHierarchyVersion();
		
		//find by id
		try{
			//Con el id del taxonRcordVersion al cual pertenece busco en la BD si existe
			taxRecVer = em.find(TaxonRecordVersion.class, hierVer.getIdTaxonRecordVersion());
			
		}catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
			
			for(int i=0;i<e.getStackTrace().length;i++){
				System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
		
		if(taxRecVer==null){
			//Si no existe el taxonRecordVersion lo creo
			System.out.println("Is null");
			taxRecVer = new TaxonRecordVersion();
			
			taxRecVer.setIdTaxonRecordVersion(hierVer.getIdTaxonRecordVersion());
			
			hierVer.setVersion(1);
			
			taxRecVer.getHierarchyVersionList().add(hierVer);
			
			System.out.println(taxRecVer.getHierarchyVersionList().size());
			
			em.persist(taxRecVer);
			em.close();
			
			System.out.println("Persisted: "+taxRecVer.getIdTaxonRecordVersion());
			
			return "Persisted";
			
			}else{
				System.out.println("Exist");
				
				System.out.println("El id del taxon record version: "+taxRecVer.getIdTaxonRecordVersion());
				
				int taxVer=taxRecVer.getVersion();
				System.out.println("Version de la ficha: "+taxRecVer.getVersion());
				
				int hVer=taxRecVer.getHierarchyVersionList().size();
				
				//Aumento la version del elemento, en 1 más el numero del elementos en el listado
				hierVer.setVersion(hVer+1);
				
				System.out.println("El id HierVersion: "+hierVer.getIdHierarchyVersion());
				System.out.println("Version del elemento hierarchy: "+hierVer.getVersion());
				
				//em.getTransaction().begin();
				taxRecVer.setVersion(taxVer+1);
				
				taxRecVer.getHierarchyVersionList().add(hierVer);
				
				//em.getTransaction().commit();
				
				List<HierarchyVersion> hierList=taxRecVer.getHierarchyVersionList();
				
				System.out.println("New size: "+taxRecVer.getHierarchyVersionList().size());
				
				//em.merge(taxRecVer);
				
				/*Query q = em.createQuery("UPDATE TaxonRecordVersion SET hierarchyVersionList = :hierList WHERE p.idTaxonRecordVersion = :id");
				
				q.setParameter("hierList", hierList);
				
				q.setParameter("id", taxRecVer.getIdTaxonRecordVersion());
				
				int total = q.executeUpdate();*/
				
				em.persist(hierVer);
				
				
				
				em.close();
				
				return "don't do that: "+"";
		}
	}
	
	public HierarchyVersion getVersion(String hvId){
		HierarchyVersion hierVer = new HierarchyVersion();
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("plinian_records");
		
		EntityManager em = emf.createEntityManager();
		
		hierVer = em.find(HierarchyVersion.class, hvId);
		
		return hierVer;
		
		/*//find by id
	    try{
	    	//Con el id del taxonRcordVersion al cual pertenece busco en la BD si existe
	    	hierVer = em.find(HierarchyVersion.class, hvId);
					
		}catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
					
			for(int i=0;i<e.getStackTrace().length;i++){
						System.out.println("Error: "+ e.getStackTrace()[i]);
			}
		}
	    
	    if(hierVer==null){
	    	System.out.println("Not in the db");
	    	return hierVer;
	    }else{
	    	return hierVer; 
	    }*/
		
		
		//return hierVer;
		
	}

	

}
