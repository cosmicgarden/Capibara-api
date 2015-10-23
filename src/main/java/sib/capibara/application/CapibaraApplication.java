package sib.capibara.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import sib.capibara.health.TemplateHealthCheck;
import sib.capibara.resources.HierarchyResource;
import sib.capibara.resources.SynonymsAtomizedResource;
import sib.capibara.resources.TaxonRecordNameResource;
import sib.capibara.resources.TaxonRecordResource;

public class CapibaraApplication extends Application<CapibaraConfiguration> {
	public static void main(String[] args) throws Exception {
        new CapibaraApplication().run(args);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void initialize(Bootstrap<CapibaraConfiguration> bootstrap) {
        // nothing to do yet
    }

   
    
    @Override
    public void run(CapibaraConfiguration configuration,
            Environment environment){
    		
    		final TaxonRecordResource resource = new TaxonRecordResource();
    		final TaxonRecordNameResource resourceTrn = new TaxonRecordNameResource();
    		final SynonymsAtomizedResource resourceSyn = new SynonymsAtomizedResource();
    		final HierarchyResource resourceHier = new HierarchyResource();
    		
    		 
    		environment.jersey().register(resource);
    		environment.jersey().register(resourceTrn);
    		environment.jersey().register(resourceSyn);
    		environment.jersey().register(resourceHier);
    }
    
}
