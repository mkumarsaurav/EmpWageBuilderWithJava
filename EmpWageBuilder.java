import java.util.*;
public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		final int isPartTime=1;
		final int isFullTime=2;
		int empRatePerHr=20;
		int salary,empHrs;
		Random rand=new Random();
		int empCheck=(int)rand.nextInt(3);
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
		salary=empHrs*empRatePerHr;
		System.out.println("Salary is: "+salary);
	}
}
