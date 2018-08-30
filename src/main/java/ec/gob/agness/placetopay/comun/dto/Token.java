package ec.gob.agness.placetopay.comun.dto;

import java.util.Date;

public class Token {

	private Status status;
	private String token;
	private String subtoken;
	private String franchiseName;
	private String issuerName;
	private String lastDigits;
	private Date validUntil;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
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
	public String getFranchiseName() {
		return franchiseName;
	}
	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public String getLastDigits() {
		return lastDigits;
	}
	public void setLastDigits(String lastDigits) {
		this.lastDigits = lastDigits;
	}
	public Date getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	
}
