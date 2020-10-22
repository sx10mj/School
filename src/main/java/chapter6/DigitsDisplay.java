package chapter6;
import java.util.Scanner;
public class DigitsDisplay {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String integer = input.nextLine();
		for (int i = 0; i < integer.length(); i++)
		{
			System.out.println(integer.charAt(i));
		}
		
		input.close();

	}

}
