package chapter6;
import java.util.Scanner;
public class Necklace {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting Number 1: ");
		int num1 = Integer.parseInt(input.nextLine());
				
		System.out.println("Enter starting Number 2: ");
		int num2 = Integer.parseInt(input.nextLine());
		
		while (num1 / 10 > 0.9 || num2 / 10 > 0.9)
		{
			System.out.println("Enter a 1-digit number for Number 1: ");
			num1 = Integer.parseInt(input.nextLine());
			
			
			System.out.println("Enter a 1-digit number for Number 2: ");
			num2 = Integer.parseInt(input.nextLine());
		}
		
		int original = num1;
		int original2 = num2;
		int before = num1;

		int num3 = 0;
		System.out.print(num1 + " " + num2 + " ");
		while (before != original || num3 != original2)
		{
			before = num3;
			num3 = (num1 + num2) % 10;
			System.out.print(num3 + " ");
			
			num1 = num2;
			num2 = num3;
		}
		
		input.close();

	}

}
