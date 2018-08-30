package ec.gob.agness.placetopay.comun.dto;

import java.math.BigDecimal;

public class AmountBase {

	private String currency;
	private BigDecimal total;
	
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
}
