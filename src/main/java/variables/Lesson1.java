package variables;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) 
	{
		/*String name = "SpongeBob";
		int age = 21;
		double kpatty = 2.99;
		char initial = 'g';
		boolean jfishing = true;
		
		System.out.println("Your name is " + name + "\n" + name + " is " + age + " years old.");
		System.out.println("A Krabby Patty costs: $" + kpatty + "\nFavourite letter: " + initial);
		System.out.println("True/False: Spongebob's favourite hobby is jellyfishing. " + jfishing);
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("Hello, " + name + "!");
		
		input.close();

	}

}
