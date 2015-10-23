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
	@Path("/save-test")
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Hierarchy saveJson(@QueryParam("id") String id){
		System.out.println("TIDR: "+id);
		return this.dao.saveTest(id);
	}
	
	@GET
	@Path("/save-test-version")
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public HierarchyVersion saveJsonVersion(@QueryParam("id") String id){
		System.out.println("TIDR: "+id);
		return this.dao.saveTestVersion(id);
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Hierarchy getHierarchy(@QueryParam("id") String id){
		System.out.println("Hierarchy Id: "+id);
		Hierarchy hier = new Hierarchy();
		hier = this.dao.get(id);
		return hier;
	}
	
	
	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveHierarchy(Hierarchy hier){
		System.out.println("Hierarchy Id to save: "+hier.getIdElement());
		String res= this.dao.save(hier);
		return Response.status(200).entity(res).build();
	}
	
	@POST
	@Path("/save-version")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveHierarchyVersion(HierarchyVersion hierVer){
		System.out.println("ID de la ficha: "+hierVer.getIdRecordVersion());
		String res= this.dao.saveVersion(hierVer);
		return Response.status(200).entity(res).build();
	}


}
