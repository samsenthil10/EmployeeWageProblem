package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputationProgram {

	public static void main(String[] args) {

		final int EMPLOYEE_PRESENT = 1;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if(employeeCheck == EMPLOYEE_PRESENT) {
			System.out.println("Employee Attendance Marked as Present");
		}
		else {
			System.out.println("Employee Attendance Marked as Absent");
		}
	}
}
