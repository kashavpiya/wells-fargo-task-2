package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import com.wellsfargo.counselor.entity.Clients;

public class Portfolio {

	@Id
	@GeneratedValue()
	private long portfolioID;
	
	@Column(nullable = false)
	private String portfolioName;
	
	@Column(nullable = false)
	private String creationDate;
	
	private Clients client;
	
	protected Portfolio () {
		
	}
	
	public Portfolio(String portfolioName, String creationDate, Clients client) {
		this.portfolioName = portfolioName;
		this.creationDate = creationDate;
		this.client = client;
	}
	
	public long getPortfolioID() {
		return  portfolioID;
		
	}
	
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	
	public String getPortfolioName() {
		return portfolioName;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	
	public Clients getClient() {
		return client;
	}
	
	
}
