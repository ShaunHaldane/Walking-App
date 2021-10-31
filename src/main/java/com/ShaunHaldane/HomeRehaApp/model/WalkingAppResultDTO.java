package com.ShaunHaldane.HomeRehaApp.model;

public class WalkingAppResultDTO {
	
	private int id;
	
	private Float successRate;
	
	private String sessionTime;
	
	private String sessionDate;
	
	public WalkingAppResultDTO() {
	}

	public WalkingAppResultDTO(int id, Float successRate, String sessionTime, String sessionDate) {
		this.id = id;
		this.successRate = successRate;
		this.sessionTime = sessionTime;
		this.sessionDate = sessionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Float getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(Float successRate) {
		this.successRate = successRate;
	}

	public String getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}

	public String getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(String sessionDate) {
		this.sessionDate = sessionDate;
	}

}
