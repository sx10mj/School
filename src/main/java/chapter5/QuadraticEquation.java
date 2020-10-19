package chapter5;
import java.util.Scanner;

//solves for quadratic equation using formula
public class QuadraticEquation {

	public static void main(String[] args) 
	{
//		user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		double a = Double.parseDouble(input.nextLine());
		System.out.print("Enter the value for b: ");
		double b = Double.parseDouble(input.nextLine());
		System.out.print("Enter the value for c: ");
		double c = Double.parseDouble(input.nextLine());
		
		double discriminant = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		double root2 = (-b - Math.sqrt(discriminant)) /(2 * a);
		
//		output
		System.out.println("Your roots are " + root1 + " and " + root2);
		
//		closing Scanner
		input.close();

	}

}
