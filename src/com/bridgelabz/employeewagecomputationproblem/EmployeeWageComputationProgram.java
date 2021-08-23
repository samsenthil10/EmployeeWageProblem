package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static void main(String[] args) {
		final int EMPLOYEE_ABSENT = 0;
		final int EMPLOYEE_PRESENT_FULL_TIME = 1;
		final int EMPLOYEE_PRESENT_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int FULL_TIME = 8;
		final int PART_TIME = 4;
		final int ABSENT = 0;

		int totalWage = 0;

		double employeeCheck = Math.floor(Math.random() * 10) % 3;

		switch((int)employeeCheck) {
		case EMPLOYEE_PRESENT_FULL_TIME: totalWage = FULL_TIME * WAGE_PER_HOUR;
		break;
		case EMPLOYEE_PRESENT_PART_TIME: totalWage = PART_TIME * WAGE_PER_HOUR;
		break;
		case EMPLOYEE_ABSENT: totalWage = ABSENT * WAGE_PER_HOUR;
		break;
		}
		System.out.println("Employee Wage: "+totalWage);
	}
}
