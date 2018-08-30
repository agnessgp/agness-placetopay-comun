package ec.gob.agness.placetopay.comun.dto;

import java.math.BigDecimal;

public class TaxDetail {

	private String kind;
	private BigDecimal amount;
	private BigDecimal base;
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
	public BigDecimal getBase() {
		return base;
	}
	public void setBase(BigDecimal base) {
		this.base = base;
	}
		
}
