package chapter3;

public class TicTacToeRules 
{

	public static void main(String[] args) 
	{
		String[] rules = {"Tic Tac Toe Rules", "Tic Tac Toe is a game for 2 players.", "1. A grid of 9 squares is drawn.", "2. The first player draws an X in an empty square.", "3. The second player draws an O in an empty square.", "4. Steps 2 and 3 are repeated until a Tic Tac Pattern is created:"};
		for (int i = 0; i < 6; i++)
		{
			System.out.println(rules[i] + "\n");
		}
		
		System.out.format("%58s", "Patterns can be diagonal, horizontal, or vertical.\n\n");
		System.out.println("5. A winning pattern is completed by drawing a line through the pattern.");
		

	}

}
