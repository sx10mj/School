package loops;
import java.util.Random;
public class DiceFactors {

	public static void main(String[] args) 
	{
//		makes a Random object
		Random rand = new Random();
		
//		multiple of 6 counter
		int multiplesOf6 = 0;
		
//		rolls and prints 15 random numbers
		for (int i = 0; i < 15; i++)
		{
			int randNum = rand.nextInt(91) + 10;
			if (randNum % 6 == 0)
			{
				System.out.println(randNum + "*");
//				counts multiples of 6
				multiplesOf6++;
			}
			else
			{
				System.out.println(randNum);
			}
		}
		System.out.println("There are " + multiplesOf6 + " numbers that are multiples of 6.\n\n");
		

//		new array to store each row of rolled dice
		int[] rolled = new int[3];
		
//		while rolled values are less than twelve, roll more
		while (rolled[0] + rolled[1] + rolled[2] <= 12)
		{
//			rolls 3 times for each row, replacing each array value accordingly
			for (int j = 0; j < 3; j++)
			{
				rolled[j] = rand.nextInt(6) + 1;
				System.out.print(rolled[j] + "\t");
			}
//			checks whether an asterisk is needed at the end
			if (rolled[0] == rolled[1])
			{
				System.out.println("*");
			}
			else
			{
				System.out.println();
			}
		}

	}

}
