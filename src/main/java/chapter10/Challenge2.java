package chapter10;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] unitsSold = new int[12];
	
		
		for (int i = 0; i < unitsSold.length; i++)
		{
			System.out.println("Enter units sold for month " + (i + 1));
			unitsSold[i] = Integer.parseInt(input.nextLine());	
		}
		
		int sum = 0;
		
		for (int i = 0; i < unitsSold.length; i++)
		{
			sum += unitsSold[i];
		}
		
		int growth = unitsSold[11] - unitsSold[0];
		
		System.out.println("You sold " + sum + " number of units this year, and " + growth + " more in December than January.");
		input.close();
	}

}