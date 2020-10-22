package chapter6;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int number = rand.nextInt(100) + 1;
		
		System.out.print("Enter a number between 1 and 100: ");
		int guess = Integer.parseInt(input.nextLine());
		
		while (guess != number)
		{
			System.out.print("Try again.\nEnter a number between 1 and 100: ");
			guess = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("You won!");
		input.close();
	}

}
