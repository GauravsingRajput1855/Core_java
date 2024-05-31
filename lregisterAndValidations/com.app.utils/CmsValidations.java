package com.app.util;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlans;
import com.app.custom_exception.CmsException;

public class CmsValidations {
	
	public static void checkFordupCustomer(String email,List<Customer>customerList)throws CmsException
	{
		Customer newCust=new Customer(email);
		if(customerList.contains(newCust))
			throw new CmsException("duplicate email");
		
	}
	
	public static ServicePlans parseandValidatePlanandcharges(String plan,double regAmount)throws CmsException
	{
		ServicePlans serviceplan=ServicePlans.valueOf(plan.toUpperCase());
		if(serviceplan.getplanCost()==regAmount)
		return serviceplan;
		throw new CmsException("reg amount does not match with the plan cost");	
	}
	
	public static Customer validateCustomerInputs(String firstName,String lastName,String email,String password,
			double regAmount, String dob,String plan,List<Customer>customers)throws CmsException
	{
		checkFordupCustomer(email, customers);
		ServicePlans serPlans=parseandValidatePlanandcharges(plan, regAmount);
		LocalDate birthDate=LocalDate.parse(dob);
		return new Customer(0, firstName, lastName, email, password, regAmount, birthDate, serPlans);
	}

}
