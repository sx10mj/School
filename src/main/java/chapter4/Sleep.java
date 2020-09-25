package chapter4;

import java.util.Scanner;

public class Sleep 
{
	public static void main(String[] args)
	{
		String[] questions = {"Year: ", "Month: ", "Day: "};
		sleepCalc(dateInput(questions));

	}
	public static int[] dateInput(String[] questions)
	{
		Scanner input = new Scanner(System.in);
		
		int[] inputs = new int[questions.length * 2];
		System.out.println("Enter your birthdate: ");
		for (int i = 0; i < questions.length; i++)
		{
			System.out.print(questions[i]);
			inputs[i] = input.nextInt();
		}
		
		System.out.println("Enter today's date: ");
		for (int i = 0; i < questions.length; i++)
		{
			System.out.print(questions[i]);
			inputs[i + questions.length] = input.nextInt();
		}
		
		input.close();
		return inputs;
		
	}
	
	public static void sleepCalc(int[] inputs)
	{
		int days1 = inputs[0] * 365 + inputs[1] * 30 + inputs[2];
		int days2 = inputs[3] * 365 + inputs[4] * 30 + inputs[5];
		
		int daydiff = days2 - days1;
		System.out.println("You have been alive for " + String.format("%,d", daydiff) + " days.");
		System.out.println("You have slept for " + String.format("%,d", daydiff * 8) + " hours.");
	}

}
