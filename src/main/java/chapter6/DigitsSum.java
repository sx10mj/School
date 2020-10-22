package chapter6;
import java.util.Scanner;
public class DigitsSum 
{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		String integer = input.nextLine();
		for (int i = 0; i < integer.length(); i++)
		{
			String string = String.valueOf(integer.charAt(i));
			sum += Integer.parseInt(string);
		}
		System.out.print("The sum of the digits is: " + sum);
		input.close();
	}

}
