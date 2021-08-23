package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static void main(String[] args) {
		final int EMPLOYEE_ABSENT = 0;
		final int EMPLOYEE_PRESENT_FULL_TIME = 1;
		final int EMPLOYEE_PRESENT_PART_TIME = 2;
		final int NUM_OF_WORKING_DAYS = 20;
		final int WAGE_PER_HOUR = 20;
		final int FULL_TIME = 8;
		final int PART_TIME = 4;
		final int ABSENT = 0;

		int totalWage = 0;
		int dayWage=0;

		for (int i=1; i <= NUM_OF_WORKING_DAYS;i++) {
			double employeeCheck = Math.floor(Math.random() * 10) % 3;
			switch((int)employeeCheck) {
			case EMPLOYEE_PRESENT_FULL_TIME: dayWage = FULL_TIME * WAGE_PER_HOUR;
			break;
			case EMPLOYEE_PRESENT_PART_TIME:dayWage = PART_TIME * WAGE_PER_HOUR;
			break;
			case EMPLOYEE_ABSENT: dayWage = ABSENT * WAGE_PER_HOUR;
			break;
			}
			System.out.println("Employee Wage for day "+i+": "+dayWage);
			totalWage= totalWage+dayWage;
		}
		System.out.println("Total Employee Wage for this month : "+totalWage);
	}
}