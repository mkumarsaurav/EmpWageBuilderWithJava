import java.util.*;
public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		final int isPartTime=1;
		final int isFullTime=2;
		int empRatePerHr=20;
		int numWorkingDays=0,workingHrs=0;
		int salary,empHrs,empCheck,totalSalary=0;
		Random rand=new Random();
		while(numWorkingDays<20 && workingHrs<100){
			empCheck=(int)rand.nextInt(3);
			switch(empCheck){
				case isFullTime: {
				   empHrs=16;
		   		System.out.println("Employee is Present");
					break;
					}
				case isPartTime:{
					empHrs=8;
					System.out.println("Employee is Present Part-Time");
					break;
					}
				default: {
					System.out.println("Employee is Absent");
					empHrs=0;
					break;
					}
			}
			numWorkingDays++;
			workingHrs=workingHrs+empHrs;
			salary=empHrs*empRatePerHr;
			totalSalary=totalSalary+salary;
		}
			System.out.println("Salary for a Month is: "+totalSalary);
	}
}
