package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static final int FULL_TIME_HRS = 8;
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int ABSENT = 0;

	private int noOfCompany = 0;
	private CompanyEmployeeWage[] companyEmployeeWageArray;

	public EmployeeWageComputationProgram() {
		companyEmployeeWageArray = new CompanyEmployeeWage[5];
	}

	private void addCompanyEmployeeWage(String companyName, int wagePerHour, int noOfDays, int maxHoursPerMonth) {

		companyEmployeeWageArray[noOfCompany] = new CompanyEmployeeWage(companyName, wagePerHour, noOfDays, maxHoursPerMonth);
		noOfCompany++;
	}

	public void calculateCompanyEmployeeWage() {
		for(int index=0;index<noOfCompany;index++) {
			companyEmployeeWageArray[index].setTotalEmpWage(calculateEmpWage(companyEmployeeWageArray[index]));
			System.out.println(companyEmployeeWageArray[index]);
		}
	}

	public int calculateEmpWage(CompanyEmployeeWage companyEmpWage) {
		int totalHrs = 0, day = 0;
		while (totalHrs < companyEmpWage.maxHoursPerMonth && day < companyEmpWage.noOfDays) {
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
		return totalHrs * companyEmpWage.wagePerHour;
	}

	public static void main(String[] args) {

		EmployeeWageComputationProgram empWageCalculator = new EmployeeWageComputationProgram();
		empWageCalculator.addCompanyEmployeeWage("DMart", 20, 6, 10);
		empWageCalculator.addCompanyEmployeeWage("Reliance", 10, 5, 20);
		empWageCalculator.calculateCompanyEmployeeWage();
	}
}