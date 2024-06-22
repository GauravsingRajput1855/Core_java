package com.app.core;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate date;
	private ServicePlans plan;
	
	private static int idGenerator;
	//----------------------------------

	public Customer(int customerId, String firstName, String lastName, String email, String password, double regAmount,
			LocalDate date, ServicePlans plan) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.date = date;
		this.plan = plan;
	}
	//--------------------------------------------------------------

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", regAmount=" + regAmount + ", date=" + date + ", plan=" + plan
				+ "]";
	}
	//----------------------------------------------------------------
	public Customer(String email)
	{
		this.email=email;
	}
	//-----------------------------------------------------------------
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customers equals ");
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}

}
