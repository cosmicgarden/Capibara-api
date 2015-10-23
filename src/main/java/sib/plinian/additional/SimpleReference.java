package sib.plinian.additional;

import javax.persistence.CollectionTable;
import javax.persistence.Embeddable;


@Embeddable
public class SimpleReference {
	@CollectionTable(name = "agent")
	private String ref;
	
	//op
	@CollectionTable(name = "agent")
	private String linkType; //select between three types: local, external, other

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getLinkType() {
		return linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	
	
}
