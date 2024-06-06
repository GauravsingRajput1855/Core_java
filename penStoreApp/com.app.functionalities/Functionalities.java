package com.app.functionalities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.app.tester.*;

import com.app.core.PenStore;
import com.app.populate.PopulateList;

public class Functionalities {

	
	public static PenStore updateStock(int id ,int stock,List<PenStore>store)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter pen id ");
//		id=sc.nextInt();
//		System.out.println("enter ne-w stock quantity");
//		stock=sc.nextInt();
//		
		for(PenStore p: store )
		{
			if(p.getId()==id)
				p.setStock(stock);
				p.setStockUpdatedate(LocalDate.now());
			System.out.println("stock updated");
		}
		System.out.println("stock was not updated");
		return null;
	}

	public static PenStore setDiscount(List<PenStore>store)
	{
		LocalDate currentDate=LocalDate.now();
		for(PenStore p: store)
		{
			if(ChronoUnit.MONTHS.between(p.getStockUpdatedate(), currentDate)>=3);
			p.setDiscount(20.0);
		}
		System.out.println("stock update successfully");
		return null;
	}
	
	public static PenStore removeNeverSold(List<PenStore>store)
	{
		 LocalDate currentDate = LocalDate.now();
	      Iterator<PenStore> iterator=store.iterator();
	      while(iterator.hasNext())
	      {
	    	  PenStore pen=iterator.next();
	    	  if(ChronoUnit.MONTHS.between(pen.getStockListingDate(), currentDate)>=9)
	    	  {
	    		  iterator.remove();
	    	  }
	      }
	      System.out.println("removed pen that never sold");
		return null;
	}
	
	
	
}
