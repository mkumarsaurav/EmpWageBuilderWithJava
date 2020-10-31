import java.util.*;
public class EmpWageBuilder {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHr=20;
	public static final int numWorkingDays=20;
	public static final int maxWorkingHrs=100;

	public static int computeEmpWage(){
		Random rand=new Random();
	//variables
		int totalWorkingDays=0,workingHrs=0;
		int salary,empHrs,empCheck,totalSalary=0;
	//computation
		while(totalWorkingDays<numWorkingDays && workingHrs<maxWorkingHrs){
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
			totalWorkingDays++;
			workingHrs=workingHrs+empHrs;
			salary=empHrs*empRatePerHr;
			totalSalary=totalSalary+salary;
		}
		System.out.println("Salary for a Month is: "+totalSalary);
		return totalSalary;
	}
	public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation Program");
		computeEmpWage();
	}
}
