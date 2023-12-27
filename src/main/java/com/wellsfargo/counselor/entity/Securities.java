package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import com.wellsfargo.counselor.entity.Portfolio;

public class Securities {

	@Id
	@GeneratedValue()
	private long securityID;
	
	@Column(nullable = false)
	private String securityName;
	
	@Column(nullable = false)
	private String purchaseDate;
	
	@Column(nullable = false)
	private Double purchasePrice;
	
	@Column(nullable = false)
	private int quantity;
	
	private Portfolio portfolio;
	
	protected Securities () {
		
	}
	
	public Securities(String securityName, String purchaseDate, Double purchasePrice, int quantity, Portfolio portfolio) {
		this.securityName = securityName;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
		this.portfolio = portfolio;
	}
	
	public long getSecurityID() {
		return securityID;
	}
	
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	
	
	public String getSecurityName() {
		return securityName;
	}
	
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	
	public void SetPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public Double GetPurchasePrice() {
		return purchasePrice;
	}
	
	public void SetQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Portfolio getPortfolio() {
		return portfolio;
	}
}
