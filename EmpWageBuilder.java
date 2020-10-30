public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent=1;
		int salary;
		double empCheck = Math.floor(Math.random() * 10) % 2 ;
		if ( empCheck == isPresent ){
			System.out.println("Employee is Present");
			int empRatePerHr=20;
		   int empHrs=8;
		   salary=empHrs*empRatePerHr;
			System.out.println("Salary is: "+salary);
		}
		else{
			System.out.println("Employee is Absent");
			salary=0;
			System.out.println("Salary is: "+salary);
		}
	}
}
