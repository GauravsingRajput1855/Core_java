package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Serializable {
	
	private String itemCode;
	private String description;
	private double price;
	private LocalDate date;
	//-----------------------------------------
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	//----------------------------------------
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", description=" + description + ", price=" + price + ", date=" + date
				+ "]";
	}
	//-------------------------------------------
	public Item(String itemCode, String description, double price, LocalDate date) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.date = date;
	}
	
	

}
