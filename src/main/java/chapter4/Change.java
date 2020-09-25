package chapter4;

import java.util.Scanner;

public class Change 
{
	public static void main(String[] args)
	{
		
		String [] cointypes = {"Toonies: ", "Loonies: ", "Quarters: ", "Dimes: ", "Nickels: ", "Pennies: "};
		int[] coinvalues = {200, 100, 25, 10, 5, 1};
		int[] coins = coinCalc(centInput(), coinvalues);
		print(coins, cointypes);
		
	}

	public static int centInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your change in cents: ");
		int cents = input.nextInt();
		input.close();
		return cents;
	}
	
	public static int[] coinCalc(int cents, int[] coinvalues) 
	{
		int[] coins = new int[coinvalues.length + 1];
		for (int i = 0; i < coinvalues.length; i++)
		{
			coins[i] = cents / coinvalues[i];
			cents %= coinvalues[i];
		}
		return coins;
	}
	
	public static void print(int[] coins, String[] cointypes)
	{
		System.out.println("The minimum number of coins is:");
		for (int i = 0; i < cointypes.length; i++)
		{
			System.out.println("\t" + cointypes[i] + coins[i]);
		}
	}
	
	
	
	

}
