package chapter6;
import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int greatest = 0;
		int threeCounter = 0;
		for (int i = 0; i < 20; i++)
		{
			int integ = rand.nextInt(100) + 1;
			System.out.println(integ);
			if (integ > greatest)
			{
				greatest = integ;
			}
			if (integ % 3 == 0)
			{
				threeCounter++;
			}
		}
		
		System.out.println(greatest + " was the greatest number");
		System.out.println(threeCounter + " numbers were multiples of 3");

	}

}
