package com.app.tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.app.core.Stock;
import com.app.custom_exceptions.InsufficiantQuantityExc;
import com.app.populate.PopulateList;
import com.app.utils.UtilsClassforstk;

public class Tester {
	public static void main(String[]args)
	{
		boolean exit=false;
		List<Stock>list=PopulateList.populateList();

		try(Scanner sc=new Scanner(System.in))
		{
			
			while(!exit)
			{
				try {
					System.out.println("1 for adding stock");
					System.out.println("2. for search by company");
					System.out.println("3. for display all ");
					
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("is name cname price date  qty");
						try {
							Stock inputs=com.app.utils.UtilsClassforstk.validateInputes(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextInt());
							com.app.utils.UtilsClassforstk.validateStocks(inputs, list);
							if(inputs!=null)
							{
								list.add(inputs);
								System.out.println("stored successfully");
							}else
							{
								System.out.println("invalid inputs");
							}
						}catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 2:
						System.out.println("enter company name ");
						com.app.utils.UtilsClassforstk.getStockBycompany(sc, list);
						
						break;
					case 3:
						com.app.utils.UtilsClassforstk.diaplayAll(sc, list);
						break;
					case 4:
						com.app.utils.UtilsClassforstk.searchByid(sc, list);
						break;
					case 5:
						System.out.println("enetr id and quntity");
					com.app.utils.UtilsClassforstk.purchaseStock1(sc.next(), sc.nextInt(), list);
						break;
					case 6:
						System.out.println("enter a stock id and quantity");
//						int stockId=sc.nextInt();
//						int quantity=sc.nextInt();
						double stockId=sc.nextDouble();
						double quantity=sc.nextDouble();
						for(Stock s: list)
						{
							if(s.getStockId().equals(stockId))
							{
								if(s.getQuantity()<quantity)
								{
									throw new InsufficiantQuantityExc("insufficiant quantity");
									
								
								
							}
								s.setQuantity((int) (s.getQuantity()-quantity));
						}
						System.out.println("purchase successfully");
						}
						break;
					case 7:
						System.out.println("enter a id and qty");
						UtilsClassforstk.sellStock1(sc.next(),sc.nextInt(), list);
						break;
						
					case 8:
						System.out.println("enter a file name");
						String fileName=sc.next();
						try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))){
							   for(Stock s:list)
                                 out.writeObject(s);
							   
							   UtilsClassforstk.diaplayAll(sc, list);
						}
					break;
					case 0:
						break;
					}
					
					
					
					
					} catch (Exception e) 
						{
						}
				
			}
		}
	}

}
