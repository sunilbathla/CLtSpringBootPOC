package com.angularpoc.model;

import java.util.Date;

public class BatchRequestModel {
	private int rqstId;
	private Date rqstDate;	
	private Boolean status;
	
	public int getRqstId() {
		return rqstId;
	}
	public void setRqstId(int rqstId) {
		this.rqstId = rqstId;
	}
	public Date getRqstDate() {
		return rqstDate;
	}
	public void setRqstDate(Date rqstDate) {
		this.rqstDate = rqstDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
