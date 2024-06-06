package com.app.validations;

import java.time.LocalDate;

import com.app.core.PenStore;

public class Validations {
	public static LocalDate parseDate(String date)
	{
		return LocalDate.parse(date);
	}
	//-----------------------------------------------

	public static LocalDate parseDate1(String date) {
		// TODO Auto-generated method stub
		return LocalDate.parse(date);
	}
	//------------------------------------------------
//	private int id;
//	private String brand;
//	private String inkColor;
//	private String material;
//	private int stock;
//	private LocalDate stockUpdatedate;
//	private LocalDate stockListingDate;
//	private double price;
//	private double discount;
	public static PenStore validateInputes(int id,String brand,String inkColor,
			String material,int stock,String stockUpdatedate,String stockListingDate,double price,double discount) {
		LocalDate  stockUpdate=parseDate(stockListingDate);
		LocalDate stockListing=parseDate(stockUpdatedate);
		return new PenStore(id, brand, inkColor, material, stock, stockUpdate, stockListing, price, discount);
	}

}
