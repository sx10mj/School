package chapter10;
import java.util.Scanner;
public class CountConsonants {

	public static void main(String[] args) {
		// literally just count the consonants of a user-inputted string
//		Enter text: spring flowers
//		the number of consonants in spring flowers is 10
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String string = input.nextLine();
		char[] consonants = "BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
		int consonantCounter = 0;
		for (int i = 0; i < string.length(); i++)
		{
			char letter = string.toUpperCase().charAt(i);
			
			for (int j = 0; j < consonants.length; j++)
			{
				if (letter == consonants[j])
				{
					consonantCounter++;
				}
			}
			
		}
		System.out.println("The number of consonants in " + string + " is " + consonantCounter);
		input.close();

	}

}
