package conditionals;
import java.util.Scanner;

public class MathGame {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Welcome to Math Game, Player 1!");
		
		//create variables
		int sum, product, modulus, points = 0;
		
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		int dice1 = (int)(Math.random() * (6)) + 1;
		int dice2 = (int)(Math.random() * (6)) + 1;
		int dice3 = (int)(Math.random() * (6)) + 1;
		
		sum = dice1 + dice2 + dice3;
		product = dice1 * dice2 * dice3;
		modulus = dice1 * dice2 % dice3;
		
		Thread.sleep(1700);
		System.out.println("Roll the dice!\n");
		Thread.sleep(1700);
		System.out.format("%8s %8s %8s", "Dice 1", "Dice 2", "Dice 3\n");
		System.out.format("%8s %8s %8s", dice1, dice2, dice3 + "\n");
		
		points = question(points, "What is the sum of all three dice?", sum, input);
		points = question(points, "What is the product of all three dice?", product, input);
		points = question(points, "What is the remainder of Dice 1 * Dice 2 / Dice 3?", modulus, input);
		
		Thread.sleep(1700);
		System.out.println("\nYou finished the game with " + points + "!");
		Thread.sleep(1700);
		System.out.println("Thanks for playing!");
		
		input.close();

	}
	
	public static int question(int points, String message, int correct, Scanner input)
	{
		System.out.println("\n" + message);
		int answer = Integer.parseInt(input.nextLine());
		if (answer == correct)
		{
			points++;
			System.out.print("Correct! Total points: " + points);
		}
		else
		{
			points--;
			System.out.println("That ain't right. Total points: " + points);
		}
		return points;
	}

}
