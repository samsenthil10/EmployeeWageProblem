package com.bridgelabz.employeewagecomputationproblem;

public class CompanyEmployeeWage {
	public final String companyName;
	public final int wagePerHour;
	public final int noOfDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmployeeWage(String companyName,int wagePerHour, int noOfDays, int maxHoursPerMonth) {
		this.companyName=companyName;
		this.wagePerHour=wagePerHour;
		this.noOfDays=noOfDays;
		this.maxHoursPerMonth=maxHoursPerMonth;

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company "+companyName+" is "+totalEmpWage;
	}
}

