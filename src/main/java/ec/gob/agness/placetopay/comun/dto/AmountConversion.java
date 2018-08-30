package ec.gob.agness.placetopay.comun.dto;

import java.math.BigDecimal;

public class AmountConversion {

	private AmountBase from;
	private AmountBase to;
	private BigDecimal factor;
	public AmountBase getFrom() {
		return from;
	}
	public void setFrom(AmountBase from) {
		this.from = from;
	}
	public AmountBase getTo() {
		return to;
	}
	public void setTo(AmountBase to) {
		this.to = to;
	}
	public BigDecimal getFactor() {
		return factor;
	}
	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}
	
	
}
