package chapter4;

import java.util.Scanner;
import java.text.NumberFormat;

public class Order {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		String[] foodItems = {"burgers: ", "fries: ", "sodas: "};
		double[] foodPrices = {1.69, 1.09, 0.99};
		getChange(priceCalc(foodItems(foodItems, input), foodPrices, money), input, money);
		input.close();
		

	}
	
	public static int[] foodItems(String[] foodItems, Scanner input)
	{
		
		int[] foodChoices = new int[foodItems.length + 1];
		
		for (int i = 0; i < foodItems.length; i++)
		{
			System.out.print("Enter the number of " + foodItems[i]);
			foodChoices[i] = input.nextInt();
		}
		
		return foodChoices;
	}
	
	public static double priceCalc(int[] foodChoices, double[] foodPrices, NumberFormat money)
	{
		double total = 0.0;
		for (int i = 0; i < foodChoices.length - 1; i++)
		{
			total += foodPrices[i] * foodChoices[i];
		}
		
		double finaltotal = total * 1.065; 
		
		System.out.println("Total before tax: " + money.format(total));
		System.out.println("Tax: " + money.format(total * 0.065));
		System.out.println("Final total: " + money.format(finaltotal));
		
		return finaltotal;
	}
	
	public static void getChange(double finaltotal, Scanner input, NumberFormat money)
	{
		System.out.print("Enter amount tendered: ");
		double amountTendered = input.nextDouble();
		System.out.print("Change: " + (money.format(amountTendered - finaltotal)));
		
	}

}
