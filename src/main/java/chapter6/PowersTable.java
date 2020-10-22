package chapter6;

public class PowersTable 
{

	public static void main(String[] args) 
	{
		for (int j = 1; j <= 5; j++)
		{
			System.out.format("%5s", "x^" + j);
		}
		System.out.println();
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				System.out.format("%5s", (int) Math.pow(i, j));
			}
			System.out.println();
		}

	}

}
