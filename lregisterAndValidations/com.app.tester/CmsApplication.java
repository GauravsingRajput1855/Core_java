package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.util.CmsValidations;

public class CmsApplication {
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean  exit=false;
			List<Customer>customerList=new ArrayList<>();
			while(!exit)
			{
				System.out.println("options : 1. customer sign up\n  2.display all\n 0. exit");
				System.out.println("choose");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("enter : firstName , lastName , email , password , regAmount , birthDate , plan ");
						
						
						Customer customer=CmsValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println("customer registered");
						break;
						
					case 0:
						exit=true;
						break;
						
					}
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
			
			
			
		}
	}

}
