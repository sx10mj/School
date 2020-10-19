package chapter5;

import java.util.Scanner;

//gets volume of user-requested 3D shape
public class Volumes 
{
	public static void main(String[] args)
	{
		double volume = 0;
		
		Scanner input = new Scanner(System.in);
		
//		gets the type of shape user would like calculated, then proceeds to calculate it
		String shape = shapeInput(input);
		if (shape.equals("1"))
		{
			volume = prismCalc(input);
		}
		else if (shape.equals("2"))
		{
			volume = sphereCalc(input);
		}
		else if (shape.equals("3"))
		{
			volume = cubeCalc(input);
		}

		input.close();
		int intVolume = (int) (volume * 1000);
		volume = intVolume / 1000.0;
		System.out.println("The volume of your shape is: " + volume);
	}
	
//	gets user selection of shape
	public static String shapeInput(Scanner input)
	{
		
		System.out.print("What shape's volume would you like calculated: rectangular prism (1), sphere (2), or cube (3)? ");
		String shape = input.nextLine();
		if (!shape.equals("1") && !shape.equals("2") && !shape.equals("3"))
		{
			System.out.print("Please enter the number corresponding to a shape: prism (1), sphere (2), or cube (3).");
		}
		
		return shape;
	}
	
//	calculates volume for rectangular prism based on user input
	public static double prismCalc(Scanner input)
	{
		System.out.print("Enter length: ");
		double l = Double.parseDouble(input.nextLine());
		System.out.print("Enter width: ");
		double w = Double.parseDouble(input.nextLine());
		System.out.print("Enter height: ");
		double h = Double.parseDouble(input.nextLine());
		
		double volume = l * w * h;
		return volume;
	}
	
//	calculates volume for sphere based on user input
	public static double sphereCalc(Scanner input)
	{
		System.out.print("Enter radius: ");
		double r = Double.parseDouble(input.nextLine());
		double d = r * 2;
		
		double volume = (3.14159265359 * d * d * d)/6;
		return volume;
	}
	
//	calculates volume for cube based on user input
	public static double cubeCalc(Scanner input)
	{
		System.out.print("Enter sidelength: ");
		double s = Double.parseDouble(input.nextLine());
		
		double volume = s * s * s;
		return volume;
	}
}
