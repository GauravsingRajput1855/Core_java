package com.app.core;

import java.time.LocalDate;

public class PenStore {
	
	private static int counter;
	private int id;
	private String brand;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate stockUpdatedate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	//-----------------------------------
	public PenStore(int id, String brand, String inkColor, String material, int stock, LocalDate stockUpdatedate,
			LocalDate stockListingDate, double price, double discount) {
		super();
		this.id = counter++;
		this.brand = brand;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdatedate = stockUpdatedate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}
	public String PenStore(int id2, String brand2, String inkColor2, String material2, int stock2, LocalDate stockUpdatedate ,
			LocalDate stockListingDate, int price2, int discount2) {
		return id2+" "+brand2+" "+inkColor2+" "+material2+" "+stock2+" "+stockUpdatedate+" "+stockListingDate+" "+price2+" "+discount2;
	}
	//------------------------------------
	@Override
	public String toString() {
		return "PenStore [id=" + id + ", brand=" + brand + ", inkColor=" + inkColor + ", material=" + material
				+ ", stock=" + stock + ", stockUpdatedate=" + stockUpdatedate + ", stockListingDate=" + stockListingDate
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	//-------------------------------------
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		PenStore.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getStockUpdatedate() {
		return stockUpdatedate;
	}
	public void setStockUpdatedate(LocalDate stockUpdatedate) {
		this.stockUpdatedate = stockUpdatedate;
	}
	public LocalDate getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	//------------------------
	public boolean isneverSoldinMonths(int months)
	{
		return stockListingDate.isBefore(LocalDate.now().minusMonths(months));
	}
	
	

}
