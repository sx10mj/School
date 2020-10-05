package variables;
import java.util.Scanner;
//this program returns information about two user-inputed three-digit numbers
//this doesn't work for non-three digit numbers, alas and i still can't figure out why
public class ThreeDigit {

	public static void main(String[] args) 
	{
//		making a new scanner
		Scanner input = new Scanner(System.in);
		
//		storing user's name in variable
		String name = input(input, "name: ");
		
//		obtaining numbers in String form
		String firstr = input(input, "first Three-Digit Number: ");
		String secondstr = input(input, "second Three-Digit Number: ");
		
//		parsing them into integers
		int first = Integer.parseInt(firstr);
		int second = Integer.parseInt(secondstr);
		
//		finding the relevant information with math operations
		int sum = first + second;
		double average = sum / 2.0;
		int product = first * second;
		
//		output
		System.out.println("\nHi, " + name + ", here is your information:\n");
		System.out.println("The product of your numbers is: " + product);
		System.out.println("The sum of your numbers is: " + sum);
		System.out.println("The average of your numbers is: " + String.format("%.2f", average));
		System.out.println("The ones digits are: " + placeValue(firstr, 0) + " and " + placeValue(secondstr, 0) + ".");
		System.out.println("The tens digits are: " + placeValue(firstr, 1) + " and " + placeValue(secondstr, 1) + ".");
		System.out.println("The hundreds digits are: " + placeValue(firstr, 2) + " and " + placeValue(secondstr, 2) + ".");
		
		input.close();

	}
	
//	gets an input with choice of message
	public static String input(Scanner input, String ask)
	{
		System.out.print("Please enter your " + ask);
		String boink = input.nextLine();
		return boink;
	}
	
//	gets the digit at a power of ten (e.g. 10^0 would be ones place, and 0 would be passed as a parameter) for any number stored in a String
	public static char placeValue(String n, int baseTen)
	{
		baseTen++;
		char blink = n.charAt(n.length() - baseTen);
		return blink;
	}

}
