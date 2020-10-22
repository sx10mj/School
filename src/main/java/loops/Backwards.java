package loops;
import java.util.Scanner;
public class Backwards {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String userWord = input.nextLine();
		String backwards = "";
		System.out.print("Your word backwards is: ");
		for (int i = 0; i < userWord.length(); i++)
		{
			backwards += userWord.charAt(userWord.length() - (i + 1));
		}
		
		System.out.println(backwards);
		input.close();
	}
}
