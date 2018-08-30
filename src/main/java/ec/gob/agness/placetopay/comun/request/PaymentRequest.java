package ec.gob.agness.placetopay.comun.request;

import ec.gob.agness.placetopay.comun.dto.Amount;
import ec.gob.agness.placetopay.comun.dto.Item;
import ec.gob.agness.placetopay.comun.dto.Person;
import ec.gob.agness.placetopay.comun.dto.Recurring;
import java.util.List;



public class PaymentRequest {

	private String reference;
	private String description;
	private Amount amount;
	private boolean allowPartial;
	private Person shipping;
	private List<Item> items;
	private String fields;
	private Recurring recurring;
	
	
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
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public boolean isAllowPartial() {
		return allowPartial;
	}
	public void setAllowPartial(boolean allowPartial) {
		this.allowPartial = allowPartial;
	}
	public Person getShipping() {
		return shipping;
	}
	public void setShipping(Person shipping) {
		this.shipping = shipping;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public Recurring getRecurring() {
		return recurring;
	}
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}
	
}
