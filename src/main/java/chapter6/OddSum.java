package chapter6;

import java.util.Scanner;

public class OddSum 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Integer.parseInt(input.nextLine());
		int sum = 0;
		for (int i = 0; i < number; i++)
		{
			if ((i + 1) % 2 == 1)
			{
				sum += i + 1;
			}
			
		}
		System.out.println("Sum: " + sum);
		
		input.close();
	}

}
