package com.app.core;

public enum ServicePlans {
	SILVER(1000),GOLD(2000),DIAMOND(3000),PLATINUM(4000);

	private double planCost;
	ServicePlans(double cost) {
		
		this.planCost=cost;	
	}
	
	public double getplanCost()
	{
		return planCost;
	}

}
