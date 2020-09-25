package chapter4;

import java.util.Scanner;

public class Energy {

	public static void main(String[] args) 
	{
		lightBulbs(energy(massInput()));

	}
	
	public static double massInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the mass in kilograms: ");
		double mass = input.nextDouble();
		input.close();
		return mass;
		
	}
	
	public static double energy(double mass)
	{
		double energy = mass * Math.pow(3 * Math.pow(10, 8), 2);
		
		System.out.println("The energy produced in Joules is: " + String.format("%.1E", energy));
		
		return energy;
	}
	
	public static void lightBulbs(double energy)
	{
		double lightBulbs = energy / 360000;
		
		System.out.println("The number of 100-watt light bulbs powered is: " + String.format("%.1E", lightBulbs));
	}

}
