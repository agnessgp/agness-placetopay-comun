package ec.agnessgp.seguridad.placetopay.type;

public enum LlaveTypeEnum {

	LOGIN("login", 1), SECRETKEY("secretKey", 2);

	private String nombreLlave;
	private int id;

	private LlaveTypeEnum(String nombreLlave, int id) {
		this.nombreLlave = nombreLlave;
		this.id = id;
	}

	public String getNombreLlave() {
		return nombreLlave;
	}

	public int getId() {
		return id;
	}
}
