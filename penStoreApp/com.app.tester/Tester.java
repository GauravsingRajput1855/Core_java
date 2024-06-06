package com.app.tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.PenStore;
import com.app.populate.PopulateList;
import com.app.validations.Validations;
import static com.app.functionalities.Functionalities.setDiscount;
import static com.app.functionalities.Functionalities.removeNeverSold;
public class Tester {
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			
			boolean exit=false;
			List<PenStore>store=PopulateList.populateStore();
			while(!exit)
			{
				System.out.println("options : 1. add the data \n2.display data \n3.add stovck \n4.stock discount \n5.remove stock \n6.exir");
				System.out.println("choose an option");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("enter a/c details as per : brand, inkColor, material, stock, stockUpdate, stockListing, price, discount");
						PenStore data=Validations.validateInputes(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
						store.add(data);
						System.out.println("data inserted successfully");
						break;
					case 2:
						System.out.println("all account details are ");
						for(PenStore p: store)
							System.out.println(p);
						break;
					case 3:
						System.out.println("put id no and new stock quantity");
						PenStore update=com.app.functionalities.Functionalities.updateStock(sc.nextInt(), sc.nextInt(), store);
						System.out.println("updated details "+update);	
							
						break;
					case 4:
						System.out.println("stock discount is ");
						PenStore discount=setDiscount(store);
						
						break;
					case 5:
						System.out.println("remove unsold pens ");
						PenStore removed=removeNeverSold(store);
						break;
					case 6:
						exit=true;
						break;
					
					}
					
					
					
					
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
				
			}
			
			
			
		}
	}
	
}
