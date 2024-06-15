package com.app.populate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Stock;


public class PopulateList {
	public static List<Stock>populateList()
	{
//		public String toString() {
//			return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
//					+ price + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
//		}
//		
//		private String stockId;
//		private String stockName;
//		private String companyName;
//		private double price;
//		private LocalDate closingDate;
//		private int quantity;
		
		List<Stock>list=new ArrayList<>();
		list.add(new Stock("1","apple","apple",100,LocalDate.parse("2025-01-01"),100));
		list.add(new Stock("2","windows","microsoft",125,LocalDate.parse("2025-08-03"),100));
		list.add(new Stock("3","aws","amazob",176,LocalDate.parse("2025-04-07"),100));
		list.add(new Stock("4","spacelinl","tesla",197,LocalDate.parse("2025-03-06"),100));
		return list;
		
	}
	

}
