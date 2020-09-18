package chapter4;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) 
	{
		calculateHeight(getTime());
	}
	
	public static double getTime()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time less than 4.5 seconds: ");
		double time = input.nextDouble();
		input.close();
		return time;
		
	}
	
	public static void calculateHeight(double time)
	{
		double height = 100 - 4.9 * time * time;
		
		System.out.println("The height of your object is " + height);
		
	}

}
