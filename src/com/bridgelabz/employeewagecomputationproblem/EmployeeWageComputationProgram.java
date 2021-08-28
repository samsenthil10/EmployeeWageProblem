package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static final int FULL_TIME_HRS = 8;
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int ABSENT = 0;

	private final String companyName;
	private final int wagePerHour;
	private final int noOfDays;
	private final int maxHrs;

	public EmployeeWageComputationProgram(String companyName, int wagePerHour, int noOfDays, int maxHrs) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxHrs = maxHrs;
		this.noOfDays = noOfDays;
	}

	public static void main(String[] args) {
		EmployeeWageComputationProgram dMart = new EmployeeWageComputationProgram("DMart", 20,2,10);
		EmployeeWageComputationProgram reliance = new EmployeeWageComputationProgram("Reliance", 10,4,20);
		dMart.calculateWage();
		reliance.calculateWage();
	}

	public void calculateWage() {
		int totalHrs = 0, day = 0;
		while (totalHrs < maxHrs && day < noOfDays) {
			int hours = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case FULL_TIME:
				hours = FULL_TIME_HRS;
				break;

			case PART_TIME:
				hours = FULL_TIME_HRS / 2;
				break;

			case ABSENT:
				hours = 0;
			}
			totalHrs += hours;
			day++;
			System.out.println("Day " + day + ": " + hours + " hours");
		}
		totalHrs = totalHrs > 100 ? 100 : totalHrs;
		System.out.println("Monthly Wage at " + companyName + " = " + (totalHrs * wagePerHour));
	}
}