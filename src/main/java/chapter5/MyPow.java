package chapter5;
import java.util.Scanner;
import java.lang.Math;

public class MyPow 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for X: ");
		double base = Double.parseDouble(input.nextLine());
		System.out.print("Enter a value for Y: ");
		double exponent = Double.parseDouble(input.nextLine());
		
		double boink = Math.exp(exponent * Math.log(base));
		System.out.println("\nThe result from using the formula is: " + boink);
		System.out.println("\nThe result from using the Math.pow() method is: " + Math.pow(base, exponent));
		input.close();
	}

}
