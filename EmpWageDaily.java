/* CALCULATE EMPLOYEE DAILY WAGE : ASSUME WAGE PER HOUR IS 20 & FULL DAY HOUR IS 8 
 * */
 
package com.empwage;

public class EmpWageDaily {
	public static void main(String[] args) {
		int isPresent=1;
		int empRatePerHr = 20;
		int empHrs = 8, salary;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if( empCheck == isPresent )
		{
			
			salary = empHrs * empRatePerHr;
			System.out.printf("if");
		}
		else
		{
			salary = 0;
			System.out.printf("else \n");
		}	
		System.out.printf("The salary is \t" +salary);
	}
}