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
		final int NUM_OF_WORKING_DAYS = 20;
		final int NUM_OF_WORKING_HOURS = 100;

		int totalWage = 0;
		int dayWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;

		while ((totalWorkingDays < NUM_OF_WORKING_DAYS) && (totalWorkingHours < NUM_OF_WORKING_HOURS)) {
			totalWorkingDays++;
			double employeeCheck = Math.floor(Math.random() * 10) % 3;
			switch((int)employeeCheck) {
			case EMPLOYEE_PRESENT_FULL_TIME: if((totalWorkingHours+FULL_TIME) <= NUM_OF_WORKING_HOURS) {
				dayWage = FULL_TIME * WAGE_PER_HOUR;
				totalWorkingHours+=FULL_TIME;
			}
			else {
				dayWage = (NUM_OF_WORKING_HOURS-totalWorkingHours) * WAGE_PER_HOUR;
				totalWorkingHours+=(NUM_OF_WORKING_HOURS-totalWorkingHours);
			}
			break;
			case EMPLOYEE_PRESENT_PART_TIME: if((totalWorkingHours+PART_TIME) <= NUM_OF_WORKING_HOURS) {
				dayWage = PART_TIME * WAGE_PER_HOUR;
				totalWorkingHours+=PART_TIME;
			}
			else {
				dayWage = (NUM_OF_WORKING_HOURS-totalWorkingHours) * WAGE_PER_HOUR;
				totalWorkingHours+=(NUM_OF_WORKING_HOURS-totalWorkingHours);
			}
			break;
			case EMPLOYEE_ABSENT: dayWage = ABSENT * WAGE_PER_HOUR;
			break;
			}
			totalWage= totalWage+dayWage;
		}
		System.out.println("Total Number of Days Employee has Worked for this month : "+totalWorkingDays);
		System.out.println("Total Number of Hours Employee has Worked for this month : "+totalWorkingHours);
		System.out.println("Total Employee Wage for this month : "+totalWage);
	}
}