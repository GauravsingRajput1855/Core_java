package com.app.core;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private LocalDate dateOfJoining;
	private JobProfile jobprofile;
	private LocalDate dateaftertoday;
	private boolean active;
	private static int counter=0;
	public static String templete="^[A-Za-Z]*$";
	//-----------------------------------
	public Employee(String firstname, String lastname, LocalDate dateOfJoining, JobProfile jobprofile,
			LocalDate dateaftertoday, boolean active) {
		super();
		counter++;
		this.id=counter;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfJoining = dateOfJoining;
		this.jobprofile = jobprofile;
		this.dateaftertoday = dateaftertoday;
		this.active = active;
	}
	//------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public JobProfile getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(JobProfile jobprofile) {
		this.jobprofile = jobprofile;
	}
	public LocalDate getDateaftertoday() {
		return dateaftertoday;
	}
	public void setDateaftertoday(LocalDate dateaftertoday) {
		this.dateaftertoday = dateaftertoday;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Employee.counter = counter;
	}
	//-----------------------------------------------
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfJoining="
				+ dateOfJoining + ", jobprofile=" + jobprofile + ", dateaftertoday=" + dateaftertoday + ", active="
				+ active + "]";
	}
	//------------------------------------------------
	public boolean equals(Object o )
	{
	if(o instanceof Employee)
		{
		Employee emp=(Employee)o;
		return this.jobprofile.equals(emp.jobprofile);
		}
	return false;
	}
	//-------------------------------------------------
	//=========================
	//this is for primary key comparison 
	public int compareTo(Employee other) {
		return this.firstname.compareTo(other.firstname);
		
	}

}
