import java.util.*;
public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPartTime=1;
		int isFullTime=2;
		int empRatePerHr=20;
		int salary,empHrs;
		Random rand=new Random();
		int empCheck=rand.nextInt(3);
		if ( empCheck == isFullTime ){
		   empHrs=16;
		   System.out.println("Employee is Present");
		}
		else if ( empCheck == isPartTime ){
			empHrs=8;
			System.out.println("Employee is Present Part-Time");
		}
		else {
			System.out.println("Employee is Absent");
			empHrs=0;
		}
		salary=empHrs*empRatePerHr;
		System.out.println("Salary is: "+salary);
	}
}
