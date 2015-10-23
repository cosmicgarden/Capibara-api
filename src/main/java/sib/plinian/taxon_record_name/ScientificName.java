package sib.plinian.taxon_record_name;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;

import com.google.common.collect.Lists;



/*
 * http://tdwg.napier.ac.uk/tcs_doc100/#complexType_ScientificName_Link03E58FE8
 */
/**
 * @author Oscar Duque
 *
 */
@Embeddable
public class ScientificName {
	
	/*
	 * Obligatory element
	 */
	@Column(name="simple")
	private String simple;
	
	/*
	 *  From TaxonomicRank in v101.xsd,  VC
	 */
	//private TaxonomicRank rank;
	@Column(name="rank")
	private String rank;
	
	
	/*
	 * Obligatory element
	 */
	@Column(name="year")
	private Date year;
	
	/*
	 * Obligatory attribute Srtring sin espacios vacios 
	 */
	/*@Column(name="scientificNameVersion")
	private String id; //A
*/	
	/*
	 * Optional attribute
	 */
	@Column(name="isAnamorphic")
	private boolean isAnamorphic; //A
	
	/*
	 * Obligatory attribute
	 */
	@Column(name="nomenclaturalCode")
	private String nomenclaturalCode; //A
	
	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	public boolean isAnamorphic() {
		return isAnamorphic;
	}

	public void setAnamorphic(boolean isAnamorphic) {
		this.isAnamorphic = isAnamorphic;
	}

	public String getNomenclaturalCode() {
		return nomenclaturalCode;
	}

	public void setNomenclaturalCode(String nomenclaturalCode) {
		this.nomenclaturalCode = nomenclaturalCode;
	}

	
	
}
