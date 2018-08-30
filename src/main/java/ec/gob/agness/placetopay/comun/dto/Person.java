package ec.gob.agness.placetopay.comun.dto;

import ec.gob.agness.placetopay.comun.type.DocumentTypeEnum;

public class Person {

	private DocumentTypeEnum documentType;
	private String document;
	private String name;
	private String surname;
	private String company;
	private String email;
	private Address address;
	private String mobile;
	
	
	public DocumentTypeEnum getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentTypeEnum documentType) {
		this.documentType = documentType;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
