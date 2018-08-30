package ec.gob.agness.placetopay.comun.dto;

import java.math.BigDecimal;

public class AmountDetail {

	private String kind;
	private BigDecimal amount;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
}
