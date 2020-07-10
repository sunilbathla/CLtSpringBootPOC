package com.angularpoc.model;
import java.time.LocalDateTime;
import java.util.Optional;

public class BEDashBoardModel {

	private String batchName;
	private Optional<LocalDateTime> beginDateTime;
	private Optional<LocalDateTime> endDateTime;
	private String batchDescription;
	private String status;
		
	public BEDashBoardModel() {
		super();
		this.beginDateTime = Optional.empty();
		this.endDateTime = Optional.empty();
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Optional<LocalDateTime> getBeginDateTime() {
		return beginDateTime;
	}
	public void setBeginDateTime(Optional<LocalDateTime> beginDateTime) {
		this.beginDateTime = beginDateTime;
	}
	public Optional<LocalDateTime> getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Optional<LocalDateTime> endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getBatchDescription() {
		return batchDescription;
	}
	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
