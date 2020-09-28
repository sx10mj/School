package chapter5;
import java.util.Scanner;
public class PackageCheck 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String unit1 = "centimetres";
		String unit2 = "kilograms";
		
		String measure1 = "weight";
		String measure2 = "length";
		String measure3 = "width";
		String measure4 = "height";
		
		int weight = input(input, unit2, measure1);
		int length = input(input, unit1, measure2);
		int width = input(input, unit1, measure3);
		int height = input(input, unit1, measure4);
		
		boolean size = length * width * height > 100000;
		boolean heaviness = weight > 27;
		
		if (size && heaviness)
		{
			System.out.println("Too large and too heavy.");
		}
		
		else if (size)
		{
			System.out.println("Too large.");
		}
		
		else if (heaviness)
		{
			System.out.println("Too heavy.");
		}
		input.close();
	}
	
	public static int input(Scanner input, String unit, String measure)
	{
		System.out.print("Enter package " + measure + " in " + unit + ": ");
		int result = Integer.parseInt(input.nextLine());
		return result;
	}
}
