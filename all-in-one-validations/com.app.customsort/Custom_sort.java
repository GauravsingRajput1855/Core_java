package com.app.sort;

import java.util.Comparator;

import com.app.core.Employee;

public class Custom_sort {
	
	public static Comparator<Employee> compareByLastname=new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getFirstname().compareTo(o2.getFirstname());
		}
	};
	
	public static Comparator<Employee>compareByDate=new Comparator<Employee>() {
		@Override
		public int compare(Employee o1,Employee o2)
		{
			return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
		}
	};
	
	public static Comparator<Employee>compareByFirstname=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getFirstname().compareTo(o2.getFirstname());		}
	};
}
