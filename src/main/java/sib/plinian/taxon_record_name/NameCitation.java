package sib.plinian.taxon_record_name;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class NameCitation {
	
	private String simple;
	
	/*
	 * year
	 */
	private List<Date> year =Lists.newArrayList();
	
	/*
	 * agentNames
	 */
	private List<AgentName> authors;

	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	public List<Date> getYear() {
		return year;
	}

	public void setYear(List<Date> year) {
		this.year = year;
	}

	public List<AgentName> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AgentName> authors) {
		this.authors = authors;
	}
	
	
	
	

}
