package sib.plinian.taxon_record_name;

public class CanonicalAuthorship {
	/*
	 * 
	 */
	private String simple;
	
	//choice
	/*
	 * 
	 */
	private NameCitation authorship;
	//--
	/*
	 * Clase creada para agrupar Authorship
	 * http://tdwg.napier.ac.uk/tcs_doc100/#element_CanonicalAuthorship_Link03E59F40
	 */
	//private SpecialAuthorship specialAuthorship;
	//end choice

	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public NameCitation getAuthorship() {
		return authorship;
	}

	public void setAuthorship(NameCitation authorship) {
		this.authorship = authorship;
	}

	
}
