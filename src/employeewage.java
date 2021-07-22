
public class employeewage {
	public static final int IS_PART_TIME = 0;
	public static final int IS_FULL_TIME = 1;

	public static int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth)

	{
		System.out.println("Welcome to employee wage computation!");
		//While Condition To Calculate Total EmpWage
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;

				totalEmpHrs += empHrs;
				System.out.println("Day# " + totalWorkingDays + "Emp Hr: " + empHrs);
			}
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage For Company: " + company + " is : " + totalEmpWage);
		return totalEmpWage;
	}

	/*
	 * Declaring Main Method Calling ComputeEmpWage Method Here
	 */
	public static void main(String[] args) {
		computeEmpWage("Dmart", 20, 20, 50);
		computeEmpWage("Relaince", 30, 40, 70);
	}

}
