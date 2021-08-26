package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static final int EMPLOYEE_ABSENT = 0;
	public static final int EMPLOYEE_PRESENT_FULL_TIME_HOURS = 1;
	public static final int EMPLOYEE_PRESENT_PART_TIME_HOURS = 2;
	public static final int FULL_TIME_HOURS = 8;
	public static final int PART_TIME_HOURS = 4;
	public static final int ABSENT = 0;


	public static void calculateWagePerMonth(int numberOfWorkingDays, int numberOfWorkingHours, int wagePerHour ) {

		int totalWage = 0;
		int dayWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		int presentft=0;
		int presentpt=0;
		int ab=0;
		while ((totalWorkingDays < numberOfWorkingDays) && (totalWorkingHours< numberOfWorkingHours)) {
			totalWorkingDays++;
			double employeeCheck = Math.floor(Math.random() * 10) % 3;
			switch((int)employeeCheck) {
			case EMPLOYEE_PRESENT_FULL_TIME_HOURS: if((totalWorkingHours+FULL_TIME_HOURS)<= numberOfWorkingHours) {
				dayWage = FULL_TIME_HOURS * wagePerHour;
				totalWorkingHours+=FULL_TIME_HOURS;
			}
			else {
				dayWage = (numberOfWorkingHours-totalWorkingHours) * wagePerHour;
				totalWorkingHours+=(numberOfWorkingHours-totalWorkingHours);
			}
			presentft++;
			break;
			case EMPLOYEE_PRESENT_PART_TIME_HOURS: if((totalWorkingHours+PART_TIME_HOURS)<= numberOfWorkingHours) {
				dayWage = PART_TIME_HOURS * wagePerHour;
				totalWorkingHours+=PART_TIME_HOURS;
			}
			else {
				dayWage = (numberOfWorkingHours-totalWorkingHours) * wagePerHour;
				totalWorkingHours+=(numberOfWorkingHours-totalWorkingHours);
			}
			presentpt++;
			break;
			case EMPLOYEE_ABSENT: dayWage = ABSENT * wagePerHour;
			ab++;
			break;
			}
			totalWage= totalWage+dayWage;
		}
		System.out.println("Total Number of days Employee was present for Full Time : "+presentft);
		System.out.println("Total Number of days Employee was present for Part Time : "+presentpt);
		System.out.println("Total Number of days Employee was Absent : "+ab);
		System.out.println();
		System.out.println("Total Number of Days Employee has Worked for this month : "+totalWorkingDays);
		System.out.println("Total Number of Hours Employee has Worked for this month : "+totalWorkingHours);
		System.out.println("Total Employee Wage for this month : "+totalWage);	
		System.out.println();
		System.out.println("----------------------------------------------------------------");
	}

	public static void main(String[] args) {

		System.out.println("----------Welcome To Employee Wage Computation Program----------");
		System.out.println();
		calculateWagePerMonth(20, 100, 20);
		calculateWagePerMonth(20, 10, 20);
		calculateWagePerMonth(2, 10, 20);
	}
}