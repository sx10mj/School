package chapter6;

public class Investment {

	public static void main(String[] args) 
	{
		double principal = 2500;
		double annualInterest = 0.075;
		int years = 0;
		while (principal < 5000)
		{
			principal *= (1 + annualInterest);
			years++;
		}
		System.out.println("It'll take " + years + " years for your investment to reach over 5000.");

	}

}