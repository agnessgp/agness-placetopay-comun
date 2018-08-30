package ec.gob.agness.placetopay.comun.dto;

public class SimpleToken {

	private String token;
	private String subtoken;
	private int installments;
	private String cvv;
	
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSubtoken() {
		return subtoken;
	}
	public void setSubtoken(String subtoken) {
		this.subtoken = subtoken;
	}
	public int getInstallments() {
		return installments;
	}
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
}
