package ec.gob.agness.placetopay.comun.request;

import ec.gob.agness.placetopay.comun.dto.Person;
import java.util.Date;
import java.util.List;



public class RedirectRequest {

	private String locale;
	private Person payer;
	private PaymentRequest payment;
	private SubscriptionRequest subscription;
	private List<String> fields;
	private String paymentMethod;
	private Date expiration;
	private String returnUrl;
	private String cancelUrl;
	private String ipAddress;
	private String userAgent;
	private boolean skipResult;
	private boolean noBuyerFill;
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public Person getPayer() {
		return payer;
	}
	public void setPayer(Person payer) {
		this.payer = payer;
	}
	public PaymentRequest getPayment() {
		return payment;
	}
	public void setPayment(PaymentRequest payment) {
		this.payment = payment;
	}
	public SubscriptionRequest getSubscription() {
		return subscription;
	}
	public void setSubscription(SubscriptionRequest subscription) {
		this.subscription = subscription;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getCancelUrl() {
		return cancelUrl;
	}
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public boolean isSkipResult() {
		return skipResult;
	}
	public void setSkipResult(boolean skipResult) {
		this.skipResult = skipResult;
	}
	public boolean isNoBuyerFill() {
		return noBuyerFill;
	}
	public void setNoBuyerFill(boolean noBuyerFill) {
		this.noBuyerFill = noBuyerFill;
	}
	
	
	
}
