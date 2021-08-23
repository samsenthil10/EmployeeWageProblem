package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static void main(String[] args) {

		final int EMPLOYEE_PRESENT = 1;
		final int WAGE_PER_HOUR = 20;
		final int FULL_TIME = 8;
		final int ABSENT = 0;

		int totalWage =0;
		int totalHours=0;

		double employeeCheck = Math.floor(Math.random() * 10) % 2;

		if(employeeCheck == EMPLOYEE_PRESENT) {
			totalHours= FULL_TIME;
		}
		else {
			totalHours= ABSENT;
		}
		totalWage= totalHours * WAGE_PER_HOUR;
		System.out.println("Employee Wage: "+totalWage);
	}
}
