  package com.app.utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;



import com.app.core.Stock;
import com.app.custom_exceptions.InsufficiantQuantityExc;
import com.app.custom_exceptions.Stock_exc;
import com.app.core.*;
public class UtilsClassforstk{
	
	
	public static Stock findStockByid(String stockId,List<Stock>list)
	{
		for(Stock s: list)
		{
			if(s.getStockId().equals(stockId))
				return s;
				
		}
		return null;
	}
	//---------------------------------------------------------------
	public static void validateStocks(Stock stock,List<Stock>list)throws Stock_exc
	{
	Stock existingStock=findStockByid(stock.getStockId(), list);
	if(existingStock!=null)
		{
		throw new Stock_exc("duplicate stock id");
		}
	if(stock.getClosingDate().isBefore(LocalDate.now())) 
		{
		throw new Stock_exc("closing date must be future date");
		
		}	
	}
	//----------------------------------------------------------------
	public static Stock getStockBycompany(Scanner sc,List<Stock>list)
	{
		System.out.println("enetr a company name u want to search");
		String name=sc.next();
		for(Stock s: list)
		{
			if(s.getCompanyName().equalsIgnoreCase(name))
			{
				System.out.println(s);
			}
			
		}
		return null;	
	}
	//-----------------------------------------------------------------
	public static Stock diaplayAll(Scanner sc,List<Stock>list)
	{
		System.out.println("all stock list are");
		for(Stock s: list)
		{
			System.out.println(s);
		}
		return null;	
	}
	
	public static Stock searchByid(Scanner sc,List<Stock>list)
	{
		System.out.println("enter the id ");
		String id=sc.next();
		System.out.println("search by id");
		for(Stock s: list)
		{
			if(s.getStockId().equals(id))
			{
				System.out.println(s);
			}
		}
		return null;
	}
	//---------------------------------------------------------------------
	
	
//	private String stockId;
//	private String stockName;
//	private String companyName;
//	private double price;
//	private LocalDate closingDate;
//	private int quantity;
	public static Stock validateInputes(String id,String name,String cname,double price,String date,int qty)
	{
		LocalDate stdate=LocalDate.parse(date);
		return new Stock(id, name, cname, price, stdate, qty);
	}
	
	//---------------------------------------------------------------
//	public static void purchaseStock( List<Stock>list,Scanner sc) throws InsufficiantQuantityExc
//	{
//		System.out.println("enter a stock id and quantity");
////		int stockId=sc.nextInt();
////		int quantity=sc.nextInt();
//		double stockId=sc.nextDouble();
//		double quantity=sc.nextDouble();
//		//Stock stock=searchByid(stockId, list);
//		if(stock.getQuantity()<quantity)
//		{
//			
//			throw new InsufficiantQuantityExc("insuffiiciant quantity");
//		}
//		stock.setQuantity((int) (stock.getQuantity()-quantity));
//	}
//	
	//---------------------------------------
	public static void purchaseStock1(String stockId,int qty, List<Stock>list) throws InsufficiantQuantityExc
	{
		//System.out.println("enter a stock id and quantity");
//		int stockId=sc.nextInt();
//		int quantity=sc.nextInt();
		// stockId=sc.nextDouble();
		//double quantity=sc.nextDouble();
		for(Stock s: list)
		{
			if(s.getStockId().equals(stockId))
			{
				
			
					s.setQuantity((int) (s.getQuantity()-qty));

					//throw new InsufficiantQuantityExc("insufficiant quantity");
					
			
			}
			//s.setQuantity((int) (s.getQuantity()-qty));
			
		}
		System.out.println("purchase successfully");
		
	}
	
	public static void sellStock1(String stockId,int qty, List<Stock>list) throws InsufficiantQuantityExc
	{
		//System.out.println("enter a stock id and quantity");
//		int stockId=sc.nextInt();
//		int quantity=sc.nextInt();
		// stockId=sc.nextDouble();
		//double quantity=sc.nextDouble();
		for(Stock s: list)
		{
			if(s.getStockId().equals(stockId))  
			{
				
			
					s.setQuantity((int) (s.getQuantity()+qty));

					//throw new InsufficiantQuantityExc("insufficiant quantity");
					
			
			}
			//s.setQuantity((int) (s.getQuantity()-qty));
			
		}
		System.out.println("purchase successfully");
		
	}
	
}