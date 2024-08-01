package com.training.model;

import org.springframework.stereotype.Component;

@Component
public class Visitor {
	private int visitorId;
	private String visitorName;
	private String mobileNumber;
	private String purpose;
	
	
	public Visitor() {
	}

	
	public Visitor(int visitorId, String visitorName, String mobileNumber, String purpose) {
		super();
		this.visitorId = visitorId;
		this.visitorName = visitorName;
		this.mobileNumber = mobileNumber;
		this.purpose = purpose;
	}


	public int getVisitorId() {
		return visitorId;
	}


	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}


	public String getVisitorName() {
		return visitorName;
	}


	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	@Override
	public String toString() {
		return "Visitor [visitorId=" + visitorId + ", visitorName=" + visitorName + ", mobileNumber=" + mobileNumber
				+ ", purpose=" + purpose + "]";
	}
	
	
}
