package com.app.validations;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.app.cmsException.CustomException;
import com.app.core.Employee;
import com.app.core.JobProfile;
import com.app.sort.*;
import com.app.sort.Custom_sort;
import com.app.core.Employee;

public class Validations {

	
	public static Employee validateInput(String firstnames,
			String lastname, 
			String dateOfjoining,String jobprifile,
			String dateAftertoday,boolean active,List<Employee>list) throws CustomException
	{
		parseprofile(jobprifile);
		validatefirstname(firstnames);
		validateNameLength(firstnames);
		validatedate(dateAftertoday, list);
	
		return new Employee( firstnames, lastname,parsedate(dateOfjoining), parseprofile(jobprifile),parsedate(dateAftertoday), active);
		
	}
	//---------------------------------------------------------------------------------------------------------------------
	public static LocalDate parsedate(String dateofjoining )
	{
		return LocalDate.parse(dateofjoining);
	}
	//---------------------------------------------------------------------------------------------------------------------
	public static Employee diaplayAll( List<Employee> list)
	{
		for(Employee e: list)
		{
			System.out.println(e);
		}
		
		return null;
	}
	//----------------------------------------------------------------------------------------------------------------------
	public static JobProfile parseprofile(String profile)
	{
		JobProfile pro=JobProfile.valueOf(profile);
		return pro;
	}
	//-----------------------------------------------------
	public static void validatefirstname(String firstname)throws CustomException
	{
		if(firstname==null||firstname.isEmpty())
		{
			throw new CustomException("cannot be null or empty");
		}
		if(!Character.isUpperCase(firstname.charAt(0)))
		{
			throw new CustomException("first name must be capital");
		}
	}
	//-----------------------------------------------------------------------------------------------------------------------
	public static void validatedate(String date,List<Employee>list)throws CustomException
	{
		if(parsedate(date).isBefore(LocalDate.now()))
		{
			throw new CustomException("date must be future date");
		}
	}
	//-----------------------------------------------------------------------------------------------------------------------
	public static void validateNameLength(String name)throws CustomException
	{
		if((name.length()>=10))
		{
			throw new CustomException("name should within 10 letters ");	
		}
	}
	//------------------------------------------------------------------------------------------------------------------------
	//this method is not in the use 
	public static void validateAlphabates(String name )throws CustomException
	{
		if(name.matches(Employee.templete))
		{
			throw new CustomException("name should be within format");
		}
	}
	//--------------------------------------------------------------------------------------------------------------------------
	//==========================================================================================================================
	//from here calling functions are here
	public static Employee findByName(String name,List<Employee>list)
	{
		for(Employee e: list)
		{
			if(e.getFirstname().equalsIgnoreCase(name))
			{
				System.out.println(e);
			}
		}
		return null;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public static Employee findById(int id,List<Employee>list)
	{
		for(Employee i:list)
		{
			if(i.getId()==id)
			{
				System.out.println(i);
			}
		}
		return null;
	}
	//----------------------------------------------------------------------------------------------------------------------------
//	public static Employee removeByName(String name,List<Employee>list)
//	{
//		for(Employee e: list)
//		{
//			if(e.getFirstname().equals(name))
//			{
//				list.remove(e);
//				System.out.println("data removed");
//			}
//		}
//		return null;
//		
//	} this method is not working 
	
	public static Employee removeByName(String name,List<Employee>list)
	{
		Iterator<Employee>itrator=list.iterator();
		while(itrator.hasNext())
		{
			Employee e=itrator.next();
			if(e.getFirstname().equals(name))
			{
				itrator.remove();
				System.out.println("data removed");
			}
		}
		return null;
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	public static Employee updateName(String name,List<Employee>list,Scanner sc)
	{
		for(Employee e: list)
		{
			if(e.getFirstname().equals(name))
			{
				e.setFirstname(sc.next());
			}
		}
		return null;
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	//==============
	//sorting methods
	public static void sortByLastname(List<Employee>list)
	{
		Collections.sort(list, Custom_sort.compareByLastname);
		System.out.println("list sorted by last name");
		diaplayAll(list);
	}
	//------------------------------------------------------------------------------------------------------------------------------
	public static void sortByDate(List<Employee>list)
	{
		Collections.sort(list, Custom_sort.compareByDate);
		System.out.println("list sorted by date is ");
		diaplayAll(list);
		
	}
	//primary key  sorting 
	public static void sortByFirstname(List<Employee>list)
	{
		Collections.sort(list,Custom_sort.compareByFirstname);
		System.out.println("sort by first name ");
		diaplayAll(list);
		
	}
	
	
	
}
