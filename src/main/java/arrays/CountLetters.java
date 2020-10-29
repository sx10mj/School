package arrays;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String userWord = input.nextLine();
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] letters = alphabet.toCharArray();
		int[] occurrence = new int[26];
		
		for (int i = 0; i < userWord.length(); i++)
		{
			char letter = userWord.charAt(i);
			
			for (int j = 0; j < 26; j++)
			{
				if (letters[j] == letter)
				{
					occurrence[j] += 1;
				}
			}
			for (int k = 0; k < 26; k ++)
			{
				System.out.println(letters[k] + " : " + occurrence[k]);
			}
		}
		
		input.close();

	}

}
