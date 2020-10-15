package loops;
import java.util.Scanner;
public class NumberSum 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Integer.parseInt(input.nextLine());
		int sum = 0;
		for (int i = 0; i < number; i++)
		{
			System.out.println(i + 1);
			sum += i + 1;
		}
		System.out.println("Sum: " + sum);
		
		input.close();
	}

}
