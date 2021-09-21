//Calculating Wages for a Month assuming 20 Working Days in a Month

package com.empwage;

public class EmpWageBuilderUC5 {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	
	public static void main(String[] args){
     	//variables
		int empWage = 0, totalEmpWage = 0;
		int empHrs = 0;
        //computation
		for(int day=0; day< NUM_OF_WORKING_DAYS; day++) {
		int empCheck;
        empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
        case IS_PART_TIME:
            empHrs = 4;
        case IS_FULL_TIME:
        	empHrs = 8;
        default:
                empHrs = 0;
        }
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " +empWage);
}
		System.out.println("Total Emp Wage: " +totalEmpWage);
}
}