import java.util.*;

interface EmpWageBuilderInterface{
	public void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs);
	public void computeEmpWage();
	}

class CompanyEmpWage {
	public final String company;
   public final int empRatePerHr;
   public final int numWorkingDays;
   public final int maxWorkingHrs;
   public int totalSalary;

	public CompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs){
      this.company=company;
      this.empRatePerHr=empRatePerHr;
      this.numWorkingDays=numWorkingDays;
      this.maxWorkingHrs=maxWorkingHrs;
   }

	public void setTotalEmpWage(int totalSalary){
		this.totalSalary=totalSalary;
	}
	@Override
   public String toString() {
      return "Total Employee Wage for Company: " +company+ " is: " +totalSalary;
   }
}

public class EmpWageBuilder implements EmpWageBuilderInterface {
	public static final int isPartTime=1;
	public static final int isFullTime=2;

	ArrayList<CompanyEmpWage> companies;

	public EmpWageBuilder(){
		companies=new ArrayList<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		CompanyEmpWage companyob=new CompanyEmpWage(company,empRatePerHr,numWorkingDays,maxWorkingHrs);
		companies.add(companyob);
	}

	public void computeEmpWage(){
		int totalWage;
		for(CompanyEmpWage company: companies){
			totalWage=this.computeEmpWage(company);
			company.setTotalEmpWage(totalWage);
		}
	}

	int computeEmpWage(CompanyEmpWage companyEmpWage){
		Random rand=new Random();
	//variables
		int totalWorkingDays=0,workingHrs=0;
		int empHrs,empCheck;
	//computation
		System.out.println("Company: "+companyEmpWage.company);
		while(totalWorkingDays<companyEmpWage.numWorkingDays && workingHrs<companyEmpWage.maxWorkingHrs){
			empCheck=(int)rand.nextInt(3);
			switch(empCheck){
				case isFullTime:
				   empHrs=16;
					break;
				case isPartTime:
					empHrs=8;
					break;
				default:
					empHrs=0;
					break;
			}
			totalWorkingDays++;
			workingHrs=workingHrs+empHrs;
			System.out.println("Day#:"+totalWorkingDays+" Emp Hr: " +empHrs);
		}
		return (workingHrs*companyEmpWage.empRatePerHr);
	}

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("DMart",20,30,60);
		empWageBuilder.addCompanyEmpWage("Reliance",10,40,80);
		empWageBuilder.computeEmpWage();
	}
}
