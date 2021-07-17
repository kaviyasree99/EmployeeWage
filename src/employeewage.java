
public class employeewage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args)

	{
		System.out.println("Welcome to employee wage computation!");
		
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present ");
		else
			System.out.println("Employee is absent");

		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		if (empCheck == IS_FULL_TIME)
			empHrs = 8;

		else
			empHrs = 0;

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage: " + empWage);

		

		if (empCheck == IS_PART_TIME)
			empHrs = 4;

		else if (empCheck == IS_FULL_TIME)
			empHrs = 8;

		else
			empHrs = 0;

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage: " + empWage);
		int totalEmpWage = 0;
		int empCheckTest = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheckTest) {

		case IS_PART_TIME:
			empHrs = 4;

			break;

		case IS_FULL_TIME:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp wage: " + empWage);
		System.out.println("Total Emp Wage: " + totalEmpWage);

	}
}
