package sib.plinian.taxon_record_name;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import sib.plinian.additional.*;

@Embeddable
public class CanonicalName {
	
	@Column(name = "simple")
	private String simple;
	
	//choice
	/*
	 * 
	 */
	@Column(name = "uninomial")
	private String uninomial;
	
	//--
	/*
	 * SimpleReferenceType
	 */
	/*@Column(name = "genus")
	private SimpleReference genus;*/
	
	//--
	
	/*
	 * Clase creada para los epitetos
	 */
	/*@Embedded
	private Epithet epithet;
	*/
	//end choice
	
	/*
	 * 	
	 */
	@Column(name = "CultivarNameGroup")
	private String CultivarNameGroup;
	
	

	/*public Epithet getEpithet() {
		return epithet;
	}

	public void setEpithet(Epithet epithet) {
		this.epithet = epithet;
	}*/

	public String getUninomial() {
		return uninomial;
	}

	public void setUninomial(String uninomial) {
		this.uninomial = uninomial;
	}

	/*
	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}
	*/

	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public String getCultivarNameGroup() {
		return CultivarNameGroup;
	}

	public void setCultivarNameGroup(String cultivarNameGroup) {
		CultivarNameGroup = cultivarNameGroup;
	}

	/*public SimpleReference getGenus() {
		return genus;
	}

	public void setGenus(SimpleReference genus) {
		this.genus = genus;
	}	*/
	
	
		
}
