package loops;
import java.util.Scanner;
public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Integer.parseInt(input.nextLine());
		int product = 1;
		for (int i = 0; i < number; i++)
		{
			product *= i + 1;
		}
		System.out.println(number + "! = " + product);
		
		input.close();

	}

}
