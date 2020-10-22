package chapter6;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.print("Enter a second number: ");
		int num2 = Integer.parseInt(input.nextLine());
		
		int larger = num1;
		int smaller = num2;
		if (num2 > num1)
		{
			larger = num2;
			smaller = num1;
		}
		
		int r = larger % smaller;
		
		System.out.print("Your GCD is ");
		while (r > 0)
		{
			if (larger % smaller == 0)
			{
				System.out.println(r);
				break;
			}
			r = larger % smaller;
			larger = smaller;
			smaller = r;
		}
		
		input.close();

	}

}
