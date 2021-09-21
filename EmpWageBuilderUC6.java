/*Calculate Wages till a condition of total working hours of 100 or max days oF
20 is reached for a month
*/
package com.empwage;

public class EmpWageBuilderUC6 {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MNTH = 10;
	public static void main(String[] args){
     	//variables
		int totalEmpHrs=0, totalEmpWage =0;
		int totalWorkingDays = 0;
        //computation
		while(totalEmpHrs <= MAX_HRS_IN_MNTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) 
		{
			int empHrs = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("\t Emp check: " +empCheck);
			switch (empCheck) 
			{
				case IS_PART_TIME:
					empHrs = 4;
				case IS_FULL_TIME:
					empHrs = 8;			
				default:
					empHrs = 0;
			
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage:" +empWage);
			
			
		}
		System.out.println("Total Emp Wage: " +totalEmpWage);
	}
}
