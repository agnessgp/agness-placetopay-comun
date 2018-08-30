package ec.gob.agness.placetopay.comun.request;

import javax.sound.midi.Instrument;
import ec.gob.agness.placetopay.comun.dto.Person;

public class CollectRequest {

	private Person payer;
	private PaymentRequest payment;
	private Instrument instrument;
	
	
	public Person getPayer() {
		return payer;
	}
	public void setPayer(Person payer) {
		this.payer = payer;
	}
	public PaymentRequest getPayment() {
		return payment;
	}
	public void setPayment(PaymentRequest payment) {
		this.payment = payment;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
