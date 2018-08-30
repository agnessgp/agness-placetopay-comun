package ec.gob.agness.placetopay.comun.dto;

import java.math.BigDecimal;

public class Amount {

	private String currency;
	private BigDecimal total;
	private TaxDetail taxes;
	private AmountDetail details;
	
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
	public TaxDetail getTaxes() {
		return taxes;
	}
	public void setTaxes(TaxDetail taxes) {
		this.taxes = taxes;
	}
	public AmountDetail getDetails() {
		return details;
	}
	public void setDetails(AmountDetail details) {
		this.details = details;
	}
	
}
