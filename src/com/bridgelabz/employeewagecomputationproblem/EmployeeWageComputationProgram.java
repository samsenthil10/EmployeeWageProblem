package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static void main(String[] args) {

		final int EMPLOYEE_PRESENT_FULL_TIME = 1;
		final int EMPLOYEE_PRESENT_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int FULL_TIME = 8;
		final int PART_TIME = 4;
		final int ABSENT = 0;

		int totalWage = 0;
		int totalHours = 0;

		double employeeCheck = Math.floor(Math.random() * 10) % 3;

		if(employeeCheck == EMPLOYEE_PRESENT_FULL_TIME) {
			totalHours = FULL_TIME;
		}
		else if (employeeCheck == EMPLOYEE_PRESENT_PART_TIME) {
			totalHours = PART_TIME;
		}
		else {
			totalHours = ABSENT;
		}
		totalWage= totalHours * WAGE_PER_HOUR;
		System.out.println("Employee Wage: "+totalWage);
	}
}