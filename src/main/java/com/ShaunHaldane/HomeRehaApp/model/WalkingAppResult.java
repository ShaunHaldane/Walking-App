package com.ShaunHaldane.HomeRehaApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="walking_app_results")
public class WalkingAppResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="success_rate")
	private Float successRate;
	
	@Column(name="session_time")
	private String sessionTime;
	
	@Column(name="session_date")
	private String sessionDate;

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

