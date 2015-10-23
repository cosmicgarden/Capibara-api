package sib.capibara.resources;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;

import sib.capibara.dao.TaxonRecordDAO;
import sib.plinian.taxon_record.TaxonRecord;


@Path("/taxon-record")
public class TaxonRecordResource {
	
	private TaxonRecordDAO dao;
	
	public TaxonRecordResource(){
		this.dao=new TaxonRecordDAO();
	}
	
	
    //public void save(TaxonRecordDAO dao){
	@GET
	@Path("/get-test")
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public TaxonRecord saveTest(@QueryParam("id") String id){
		return this.dao.saveTest(id);
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public TaxonRecord getTaxonRecord(@QueryParam("id") String id){
		System.out.println("TaxonRecord Id: "+id);
		TaxonRecord taxRec = new TaxonRecord();
		taxRec = this.dao.get(id);
		
		return taxRec;
	}
	
	
	
	
	

}
