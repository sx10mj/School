package chapter10;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		String reverse = "";
		for (int i = 0; i < word.length(); i++)
		{
			reverse += word.charAt(word.length()-(i + 1));
		}
		if (reverse.toUpperCase().equals(word.toUpperCase()))
		{
			System.out.println(word + " is a palindrome!");
		}
		else
		{
			System.out.println(word + " is not a palindrome!");
		}
		
		input.close();
	}
}
