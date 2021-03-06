package chapter4;
import java.util.Scanner;

public class CircleCircumference 
{
	public static void main(String[] args)
	{
//		some constants
		final double pi = 3.14159265358979323;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		double radius = input.nextDouble();
		
		if (radius < 0)
		{
			System.out.println("Negative radii are illegal.");
		}
		double circumference = 2 * pi * radius;
		
		System.out.println("The circumference of your circle is " + Math.round(circumference * 100) / 100.0);
		
		
		input.close();
		
	}

}
