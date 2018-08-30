package ec.gob.agness.placetopay.comun.request;

import java.util.List;

public class SubscriptionRequest {

	private String reference;
	private String description;
	private List<String> fields;
	
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	} 
	
	
	
}
