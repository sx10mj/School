package chapter3;

public class TicTacToeBoard 
{

	public static void main(String[] args)
	{
		
		for (int j = 0; j < 3; j++)
		{
			System.out.format("%10s %10s", "|", "|\n");
		}
		
		System.out.println("-------------------------------");
		System.out.format("%10s %10s", "|", "|\n");
		System.out.format("%10s %4s %5s", "|", "x", "|\n");
		System.out.format("%10s %10s", "|", "|\n");
		System.out.println("-------------------------------");
		
		for (int j = 0; j < 3; j++)
		{
			System.out.format("%10s %10s", "|", "|\n");
		}

	}

}
