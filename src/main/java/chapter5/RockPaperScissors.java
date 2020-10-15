package chapter5;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random(3);
		System.out.print("Choose your fighter: Rock(1), Paper(2), or Scissors(3)? ");
		int player = Integer.parseInt(input.nextLine());
		
		int computer = rand.nextInt(3) + 1;
		
		int[] choices = {player, computer};
		String[] side = {"Player", "Computer"};
		
		for (int i = 0; i < 2; i++)
		{
			System.out.print(side[i] + " throws ");
			switch (choices[i])
			{
			case 1: System.out.println("Rock!"); break;
			case 2: System.out.println("Paper!"); break;
			case 3: System.out.println("Scissors!"); break;
			}
		}
		
		switch (player)
		{
		case 1:
			switch (computer)
			{
			case 1: System.out.println("It's a draw!"); break;
			case 2: System.out.println("Computer wins!"); break;
			case 3: System.out.println("Player wins!"); break;
			}
			break;
		case 2:
			switch (computer)
			{
			case 1: System.out.println("Player wins!"); break;
			case 2: System.out.println("It's a draw!"); break;
			case 3: System.out.println("Computer wins!"); break;
			}
			break;
		case 3:
			switch (computer)
			{
			case 1: System.out.println("Computer wins!"); break;
			case 2: System.out.println("Player wins!"); break;
			case 3: System.out.println("It's a draw!"); break;
			}
			break;
		}
		input.close();
	}
}

