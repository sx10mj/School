package chapter5;
import java.util.Scanner;
public class PerfectSquare 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int userInput = Integer.parseInt(input.nextLine());
		
		double sqrt = Math.sqrt(userInput);
		int sqrtInt = (int) Math.sqrt(userInput);
		
		if (sqrtInt == sqrt)
		{
			System.out.println(userInput + " is a perfect square!");
		}
		else
		{
			System.out.println(userInput + " is not a perfect square!");
		}
		input.close();
	}

}
