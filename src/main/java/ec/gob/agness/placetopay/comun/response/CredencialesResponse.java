package ec.gob.agness.placetopay.comun.response;
/**
 *
 * @author ppilcoa
 */
public class CredencialesResponse {

    private String login;
    private String tranKey;
    private String seed;
    private String randomNonce;
    private String nonce;
    private String fechaExpira;
    
 	public CredencialesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CredencialesResponse(String login, String tranKey, String seed, String randomNonce, String nonce,
			String fechaExpira) {
		super();
		this.login = login;
		this.tranKey = tranKey;
		this.seed = seed;
		this.randomNonce = randomNonce;
		this.nonce = nonce;
		this.fechaExpira = fechaExpira;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTranKey() {
		return tranKey;
	}

	public void setTranKey(String tranKey) {
		this.tranKey = tranKey;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	public String getRandomNonce() {
		return randomNonce;
	}

	public void setRandomNonce(String randomNonce) {
		this.randomNonce = randomNonce;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getFechaExpira() {
		return fechaExpira;
	}

	public void setFechaExpira(String fechaExpira) {
		this.fechaExpira = fechaExpira;
	}
}

