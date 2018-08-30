package ec.gob.agness.placetopay.comun.response;

import ec.gob.agness.placetopay.comun.dto.Status;

public class RedirectResponse {
	private Status status;
	private int requestId;
	private String processUrl;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getProcessUrl() {
		return processUrl;
	}
	public void setProcessUrl(String processUrl) {
		this.processUrl = processUrl;
	}
	
	
	
}
