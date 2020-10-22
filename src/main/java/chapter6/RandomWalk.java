package chapter6;
import java.util.Random;
public class RandomWalk {

	public static void main(String[] args) 
	{
		Random walk = new Random();
		int total = 0;
		int greatest = 0;
		for (int i = 0; i < 50; i++)
		{
			int pos = 4;
			int counter = 0;
			while (pos > -1 && pos < 8)
			{
				int move = walk.nextInt(2);
				if (move == 0)
				{
					pos--;
				}
				else
				{
					pos++;
				}
				counter++;
			}
			
			total += counter;
			if (counter > greatest)
			{
				greatest = counter;
			}
		}
		System.out.println("Average Number of Steps: " + total / 50.0);
		System.out.println("Greatest Number of Steps: " + greatest);
			

	}

}
