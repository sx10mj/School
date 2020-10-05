package chapter5;
import java.util.Scanner;
import java.util.Random;
public class randomNumbers 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter minimum: ");
		int min = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter maximum: ");
		int max = Integer.parseInt(input.nextLine());
		
		System.out.println(random.nextInt(max - min + 1) + min);
		
		input.close();
	}
	
}
