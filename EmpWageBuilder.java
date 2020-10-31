import java.util.*;
public class EmpWageBuilder {
	public static final int isPartTime=1;
	public static final int isFullTime=2;

	public static int computeEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs){
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
		System.out.println("Total Employee Wage for Company: "+company+" is: "+totalSalary);
		return totalSalary;
	}
	public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation Program");
		computeEmpWage("DMart",20,30,60);
		computeEmpWage("Reliance",10,40,80);
	}
}
