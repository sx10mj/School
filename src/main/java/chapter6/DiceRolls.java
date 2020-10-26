package chapter6;
import java.util.Random;
public class DiceRolls {

	public static void main(String[] args) 
	{
		
		Random roll = new Random();
		int counter = 0;
		int[] rolled = new int[3];
		rolled[0] = 1;
		
		System.out.println("Dice1" + "\t" + "Dice2" + "\t" + "Dice3" + "\t" + "Sum");
		while (rolled[0] != rolled[1] || rolled[0] != rolled[2] || rolled[1] != rolled[2])
		{
			int sum = 0;
			for (int j = 0; j < 3; j++)
			{
				rolled[j] = roll.nextInt(6) + 1;
				System.out.print(rolled[j] + "\t");
				sum += rolled[j];
			}
			counter++;
			System.out.println(sum);
		}
		
		System.out.println("Iterations: " + counter);
		

	}

}
