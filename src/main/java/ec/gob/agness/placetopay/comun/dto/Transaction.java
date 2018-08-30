package ec.gob.agness.placetopay.comun.dto;

import java.util.List;

public class Transaction {

	private Status status;
	private int internalReference;
	private String reference;
	private String paymentMethod;
	private String paymentMethodName;
	private String issuerName;
	private AmountConversion amount;
	private String receipt;
	private String authorization;
	private List<String> processorFields;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getInternalReference() {
		return internalReference;
	}
	public void setInternalReference(int internalReference) {
		this.internalReference = internalReference;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public AmountConversion getAmount() {
		return amount;
	}
	public void setAmount(AmountConversion amount) {
		this.amount = amount;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public List<String> getProcessorFields() {
		return processorFields;
	}
	public void setProcessorFields(List<String> processorFields) {
		this.processorFields = processorFields;
	}
	
	
}
