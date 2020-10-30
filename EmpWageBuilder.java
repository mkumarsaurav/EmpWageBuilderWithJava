public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent=1;
		double empCheck = Math.floor(Math.random() * 10) % 2 ;
		if ( empCheck == isPresent )
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
