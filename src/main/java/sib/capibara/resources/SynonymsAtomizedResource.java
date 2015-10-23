package sib.capibara.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import sib.capibara.dao.SynonymsAtomizedDAO;
import sib.plinian.hierarchy.Hierarchy;
import sib.plinian.synonyms.SynonymsAtomized;



@Path("/synonyms-atomized")
@Produces(MediaType.APPLICATION_JSON)
public class SynonymsAtomizedResource {
	
private SynonymsAtomizedDAO dao;
	
	public SynonymsAtomizedResource (){
		this.dao=new SynonymsAtomizedDAO();
	}
	
	@GET
    @Timed
    public SynonymsAtomized saveJson(@QueryParam("id") String id){
		return this.dao.save(id);
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public SynonymsAtomized getSynonymsAtomized(@QueryParam("id") String id){
		System.out.println("SynonymsAtomized Id: "+id);
		SynonymsAtomized syn = new SynonymsAtomized();
		syn = this.dao.get(id);
		
		return syn;
	}

}
