package ec.gob.agness.placetopay.comun.dto;

import ec.gob.agness.placetopay.comun.request.RedirectRequest;
import ec.gob.agness.placetopay.comun.response.SubscriptionResponse;
import java.util.List;



public class RedirectInformation {
	private Status status;
	private RedirectRequest request;
	private List<Transaction> payment;
	private SubscriptionResponse subscription;
	
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RedirectRequest getRequest() {
		return request;
	}
	public void setRequest(RedirectRequest request) {
		this.request = request;
	}
	public List<Transaction> getPayment() {
		return payment;
	}
	public void setPayment(List<Transaction> payment) {
		this.payment = payment;
	}
	public SubscriptionResponse getSubscription() {
		return subscription;
	}
	public void setSubscription(SubscriptionResponse subscription) {
		this.subscription = subscription;
	}
	
	
	
	
	
}
