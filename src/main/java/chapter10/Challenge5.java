package chapter10;
import java.util.ArrayList;
import java.util.Random;
public class Challenge5 {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		ArrayList<Integer> rnums = new ArrayList<Integer>();
		int sum = 0;
		int counter = 0;
		
		while (sum < 100)
		{
			int randNum = rand.nextInt(9)+1;
			sum += randNum;
			counter++;
			rnums.add(randNum);
		}
		
		for (int i = 0; i < rnums.size(); i++)
		{
			System.out.println(rnums.get(i));
		}
		
		System.out.println("Iterations: " + counter);
		
		int evens = 0;
		int odds = 0;
		
		for (int i = 0; i < rnums.size(); i++)
		{
			if (rnums.get(i) % 2 == 0)
			{
				System.out.println(rnums.get(i));
				evens++;
			}
		}
		System.out.println("Evens: " + evens);
		for (int i = 0; i < rnums.size(); i++)
		{
			if (rnums.get(i) % 2 != 0)
			{
				System.out.println(rnums.get(i));
				odds++;
			}
		}
		System.out.println("Odds: " + odds);
		
	}

}
