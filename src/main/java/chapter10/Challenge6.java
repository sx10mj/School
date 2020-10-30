package chapter10;
import java.util.ArrayList;
import java.util.Random;
public class Challenge6 {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		ArrayList<Integer> rnums = new ArrayList<Integer>();
		int elevenCounter = 0;
		int randNum = rand.nextInt(101) - 50;
		while (randNum > -45)
		{
			if (randNum % 11 == 0)
			{
				elevenCounter++;
			}
			randNum = rand.nextInt(101) - 50;
			rnums.add(randNum);
			
		}
		if (randNum % 11 == 0)
		{
			elevenCounter++;
		}
		
		for (int i = 0; i < rnums.size(); i++)
		{
			System.out.println(rnums.get(i));
		}
		int L = rnums.size();
		for (int i = L; i > 0; i--)
		{
			System.out.println(rnums.get(i));
		}
		System.out.println("Multiples of 11: " + elevenCounter);
	}

}
