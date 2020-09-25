package chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

//returns final college costs as expenses - offsets
public class CollegeExpenses 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String[] expenses = {"rent", "food", "books", "tuition", "transportation", "entertainment", "miscellaneous spending"};
		String[] offsets = {"scholarships", "grants", "student loans", "fee waivers", "your side gigs"};
		String message1 = "How much money are you allocating to ";
		String message2 = "How much money are you receiving from ";

		double totalexpense = sum(input, expenses, message1);
		double totaloffset = sum(input, offsets, message2);
		
		input.close();

		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Your total college costs this year are: " + money.format(totalexpense - totaloffset));
	}	
	public static double sum(Scanner input, String[] items, String message)
	{
		double total = 0;
		
//		loops through array, adding user-inputed value to the total
		for (int i = 0; i < items.length; i++)
		{
			System.out.println(message + items[i] + "?");
			total += input.nextDouble();		
		}
		return total;
	}
}
