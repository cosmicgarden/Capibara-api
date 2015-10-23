package sib.capibara.resources;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import sib.capibara.dao.TaxonRecordNameDAO;
import sib.plinian.taxon_record_name.TaxonRecordName;


@Path("/taxon-record-name")
@Produces(MediaType.APPLICATION_JSON)
public class TaxonRecordNameResource {
	
	private TaxonRecordNameDAO dao;
	
	public TaxonRecordNameResource (){
		this.dao=new TaxonRecordNameDAO();
	}
	
	@GET
    @Timed
    public TaxonRecordName saveJson(@QueryParam("id") String id){
		return this.dao.save(id);
	}

}
