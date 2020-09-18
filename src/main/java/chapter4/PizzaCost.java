package chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) 
	{
		calculateCost(getSize());

	}
	public static double getSize()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the diameter of the pizza in inches: ");
		double size = input.nextDouble();
		input.close();
		return size;
		
	}
	
	public static void calculateCost(double size)
	{
		double cost = 0.75 + 1 + 0.05 * size * size;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("The cost of your pizza is " + (money.format(cost)));
	}

}
