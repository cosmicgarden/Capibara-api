package sib.capibara.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import sib.capibara.dao.HierarchyDAO;
import sib.plinian.hierarchy.Hierarchy;
import sib.plinian.hierarchy.HierarchyVersion;

import com.codahale.metrics.annotation.Timed;

@Path("/hierarchy")
@Produces(MediaType.APPLICATION_JSON)
public class HierarchyResource {
	
	private HierarchyDAO dao;
	
	public HierarchyResource (){
		this.dao=new HierarchyDAO();
	}
	
	
	
	@GET
	@Path("/save-test-version")
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public HierarchyVersion saveJsonVersion(@QueryParam("id") String id){
		return this.dao.saveTestVersion(id);
	}
	
	
	
	@POST
	@Path("/save-version")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveHierarchyVersion(HierarchyVersion hierVer){
		System.out.println("ID de la ficha: "+hierVer.getIdHierarchyVersion());
		String res= this.dao.saveVersion(hierVer);
		return Response.status(200).entity(res).build();
	}
	
	@GET
	@Path("/get-version")
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public HierarchyVersion getHierarchyVersion(@QueryParam("id") String id){
		return this.dao.getVersion(id);
	}
	
	
	


}
