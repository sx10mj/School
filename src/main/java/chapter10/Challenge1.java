package chapter10;
import java.util.Scanner;
public class Challenge1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String longest = "";
		int greatest = 0;
		
		String[] names = new String[8];
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Name Friend " + (i + 1));
			names[i] = input.nextLine();
			
			if (names[i].length() > greatest)
			{
				greatest = names[i].length();
				longest = names[i];
			}
		}
		
		System.out.println("The longest name is " + longest + " with " + greatest + " letters.");
		input.close();
	}
}
