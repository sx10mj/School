package loops;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) throws InterruptedException 
	{
		String word = "";
		System.out.println("Length: " + word.length());
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
			Thread.sleep(600);
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String userWord = input.nextLine();
		
		int counter = 0;
		while(!userWord.equals("done"))
		{
			System.out.println("Your word is: " + userWord);
			System.out.print("Enter a word: ");
			userWord = input.nextLine();
			counter++;
		}
		System.out.println("You inputted " + counter + "words.");
		input.close();

	}

}
