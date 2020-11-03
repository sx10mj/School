package chapter10;
import java.util.Scanner;
public class Coder {

	public static void main(String[] args) {
		// Create a Coder application that prompts the user for a string and then displays an encoded string.
//		The encoding should add 2 to the Unicode value of each letter to create a new letter. The application
//		should keep all spaces between the words in their original places and the letters x and y should
//		be converted to a and b, respectively. Coder application output should look similar to:
//		Enter a string: hello there
//		encoded message: jgnnq vjgtg
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		boolean[] letterCase = new boolean[string.length()];
		
		for (int i = 0; i < string.length(); i++)
		{
			if (string.toUpperCase().charAt(i) == string.charAt(i))
			{
				letterCase[i] = true;
			}
		}
		char[] letters = string.toLowerCase().toCharArray();
		string = "";
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < letters.length; i++)
		{
			for (int j = 0; j < alphabet.length; j++)
			{
				if (letters[i] == alphabet[j])
				{
					letters[i] = alphabet[(j + 2) % 26];
					break;
				}
			}
			string += letters[i];
		}
		
		System.out.print("Encoded message: ");
		
		for (int i = 0; i < string.length(); i++)
		{
			if (letterCase[i] == true)
			{
				System.out.print(string.toUpperCase().charAt(i));
			}
			else
			{
				System.out.print(string.charAt(i));
			}
		}
		input.close();
	}
}
