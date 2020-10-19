package conditionals;
import java.util.Scanner;
public class ChildProfile 
{
//	gets an overview of a user's child
	public static void main(String[] args)
	{
//		makes a Scanner
		Scanner input = new Scanner(System.in);
		
//		gets name and age via input method
		String name = input(input, "Enter your child's name: ");
		int age = Integer.parseInt(input(input, "Enter your child's age: "));
		
//		initializes some preliminary variables to be changed within if statements
		String status = "";
		String toiletTrained = "";
		String diet = "";
		
//		makes sure age is in range
		while (age > 6 || age < 0)
		{
			age = Integer.parseInt(input(input, "Please enter an age between 0 and 6: "));
		}
		
//		assigns toilet-training and age statuses
		if (age > 3)
		{
			toiletTrained = "Complete";
			status = "Child";
		}
		else if (age < 4)
		{
			status = "Toddler";
			char response = input(input, "Is your child toilet-trained? ").toUpperCase().charAt(0);
			
//			ensures yes or no answer to "is your child toilet-trained?"
			while (response != 'Y' && response != 'N')
			{
				response = input(input, "I didn't get that. Please enter yes or no: ").toUpperCase().charAt(0);
			}
			
//			assigns toilet training status for those 3 and under
			if (response == 'Y')
			{
				toiletTrained = "Complete";
			}
			else if (response == 'N')
			{
				toiletTrained = "Incomplete";
			}
		}
		
//		gets diet (and ensures it's either vegetarian or regular)
		diet = input(input, "Enter your child's diet (Vegetarian or Regular): ");
		while (diet.toUpperCase().charAt(0) != 'V' && diet.toUpperCase().charAt(0) != 'R')
		{
			diet = input(input, "Please enter either Vegetarian or Regular: ");
		}
		
		if (diet.toUpperCase().charAt(0) == 'V')
		{
			diet = "Vegetarian";
		}
		else if (diet.toUpperCase().charAt(0) == 'R')
		{
			diet = "Regular";
		}
		
//		output
		System.out.println("\n============================");
		System.out.println(name + "'s Profile\n");
		
		String[] subtitles = {"Age", "Status", "Diet", "Toilet Training"};
		String[] results = {String.valueOf(age), status, diet, toiletTrained};
		
		for (int i = 0; i < subtitles.length; i++)
		{
			System.out.format("%16s %s", subtitles[i] + ":", results[i] + "\n");
		}
		
//		closes Scanner
		input.close();
	}
	
//	turns two lines of code into one (consequently adding 6 more on the bottom but shhhh)
	public static String input(Scanner input, String ask)
	{
		System.out.print(ask);
		String response = input.nextLine();
		return response;
	}
}
