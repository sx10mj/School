package print;

import java.util.Scanner;

//lets you convert from base 10 to any base between 1 and 36
//except in this one i go methodically: maxbase, maxbase - 1, maxbase - 2, etc. until we hit the bottom
public class NumberChanger2 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to base converter!");
		Scanner input = new Scanner(System.in);
		String q1 = "Please enter the base number you would like to convert to: ";
		String q2 = "Please enter your number: ";
		
		int numsys = input(input, q1);
		int number = input(input, q2);

		int firstBase = getFirstBase(numsys, number);
		
		System.out.print(number + " in base " + numsys + " is ");
		
		numberConversion(numsys, number, firstBase);
		input.close();

	}
	
	//gets base to be converted to and number to be converted
	public static int input(Scanner input, String q)
	{
		System.out.print(q);
		int num = input.nextInt();
	
		return num;
	}
	
	//calculates the highest possible exponent of the new base that is able to divide into the number
	public static int getFirstBase(int numsys, int number)
	{
		int base = 0;
		
		if (numsys == 1)
		{
			return 1;
		}
				
		while (number > Math.pow(numsys, base + 1) - 1) //compares 100 with 99 instead of 100 so that it works out to true for whole-exponents
		{
			base++;
		}
		return base;
	}
	
	//fun calculation and recursion to get the final number
	public static void numberConversion(int numsys, int number, int base)
	{
		char[] over9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); //characters for base >10
		
		int baseRaised = (int) Math.pow(numsys, base); //the base^intexponent directly below the number
		int maxBase = (int) (number / baseRaised); //how many times our number fits into the highest place value (calculated in getFirstBase)
		int remainder = number - maxBase * baseRaised; //what's left after the highest possible multiple of maxBase is subtracted from our number

		if (numsys == 1) //contingency for base 1 because the normal code doesn't work for it
		{
			for (int i = 0; i < number; i++)
			{
				System.out.print("1");
			}
		}
		else
		{
			if (maxBase > 9) //if a place value works out to be over 9 (in the case of base 11 and higher) replace that value to be a letter
			{
				System.out.print(over9[maxBase - 10]);
			}
			else
			{
				System.out.print(maxBase); //print place value
			}
			if (base == 0)
			{
				
			}
			
			else
			{
				numberConversion(numsys, remainder, base - 1);//do the same thing over again with the remainder until we run out of place values (i.e. if the remainder is 0)
			}
		}
		
	}
	
}

