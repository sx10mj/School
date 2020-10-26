package chapter6;
import java.util.Scanner;
public class Quotes {

	public static void main(String[] args) 
	{
		int charNum = 0;
		int withoutSpaces = 0;
		int wordNum = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your favourite quote?");
		String quoteWS = input.nextLine();
		String quote = quoteWS.trim();
		
		for (int i = 0; i < quote.length(); i++) 
		{
			if (quote.charAt(i) == ' ')
			{
				wordNum++;
				withoutSpaces--;
			}
			charNum++;
			withoutSpaces++;
		}
		
		double wordAverage = (double)(withoutSpaces) / wordNum;
		
		System.out.println("Characters: " + charNum);
		System.out.println("Words: " + wordNum);
		System.out.format("Average Word Length: %.1f", wordAverage);
		
		input.close();
	}

}
