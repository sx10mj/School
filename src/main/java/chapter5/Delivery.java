package chapter5;
import java.util.Scanner;
public class Delivery 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double length = input(input, "length");
		double width = input(input, "width");
		double height = input(input, "height");
		
		if (length > 10 || width > 10 || height > 10)
		{
			System.out.println("ReJECT!!!!");
		}
		else
		{
			System.out.println("accept, i guess.");
		}
		input.close();
		
	}
	
	public static double input(Scanner input, String message)
	{
		System.out.print("Please enter the " + message + " of your package: ");
		double userInput = Double.parseDouble(input.nextLine());
		return userInput;
	}

}
