
public class employeewage {
	public static void main(String[] args)

	{
		System.out.println( "Welcome to employee wage computation!" );
        int IS_FULL_TIME = 1 ;
        double empCheck = Math.floor(Math.random() * 10) % 2 ;

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
	}
}
