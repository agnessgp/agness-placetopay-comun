package ec.gob.agness.placetopay.comun.type;

public enum DocumentTypeEnum {

	CC("CC",1), 
	CE("CE",2),
	TI("TI",3), 
	RC("RC",4),
	NIT("NIT",5), 
	PPN("PPN",6),
	SSN("SSN",7), 
	LIC("LIC",8), 
	TAX("TAX",9), 
	CIP("CIP",10),
	DNI("DNI",11), 
	DUI("DUI",12),
	DPI("DPI",13),
	INE("INE",14),
	CI("CI",15);
	
	private String tipoDocumento;
	private int id;
	
	private DocumentTypeEnum(String tipoDocumento, int id) {
		this.tipoDocumento = tipoDocumento;
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public int getId() {
		return id;
	}
	
}
