package chapter5;
import java.util.Scanner;
public class Discriminant {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		double a = Double.parseDouble(input.nextLine());
		System.out.print("Enter the value for b: ");
		double b = Double.parseDouble(input.nextLine());
		System.out.print("Enter the value for c: ");
		double c = Double.parseDouble(input.nextLine());
		
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant > 0)
		{
			System.out.println("Two roots.");
		}
		else if (discriminant == 0)
		{
			System.out.println("One root.");
		}
		else
		{
			System.out.println("No roots.");
		}
		
		input.close();

	}

}
