package chapter6;
import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int vowelCounter = 0;
		System.out.print("Enter a String: ");
		String string = input.nextLine();
		for (int i = 0; i < string.length(); i++)
		{
			char letter = string.toUpperCase().charAt(i);
			if (letter == 'A' || letter == 'E' || letter == 'I' ||  letter == 'O' || letter == 'U')
			{
				vowelCounter++;
			}
		}
		System.out.println("The number of vowels in " + string + " is " + vowelCounter);
		input.close();

	}

}
