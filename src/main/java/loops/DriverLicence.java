package loops;
import java.util.Scanner;
import java.util.Random;
public class DriverLicence 
{
	public static void main(String[] args)
	{
		String first, second, userAnswer = "";
		String year = "1", month = "1", day = "1";
		String[] userBirthday = {"1", "1", "1"};
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		do 
		{
			first = "" + (char)(rand.nextInt(26) + 65)  + (rand.nextInt(9001) + 1000);
			second = String.valueOf(rand.nextInt(100000));
			
			while (Integer.parseInt(year) > 2010 || Integer.parseInt(year) < 1900 || Integer.parseInt(month) > 12 || Integer.parseInt(month) < 0 || Integer.parseInt(day) > 31 || Integer.parseInt(day) < 1)
			{
				String[] birthdayPrompts = {"birth year: ", "birth month: ", "birth day: "};
				for(int i = 0; i < birthdayPrompts.length; i++)
				{
					System.out.print("Enter your " + birthdayPrompts[i]);
					userBirthday[i] = input.nextLine();
				}
				year = userBirthday[0];
				month = userBirthday[1];
				day = userBirthday[2];
			}
			year = "" + year.charAt(2) + year.charAt(3);
			
			System.out.format("%s %s-%05d-%s%02d%02d\n", "Your driver's licence is: ", first, Integer.parseInt(second), year, Integer.parseInt(month), Integer.parseInt(day));
			System.out.println("Would you like another one? (Y/N)");
			userAnswer = input.nextLine();
		} while (userAnswer.toUpperCase().charAt(0) != 'N');
		
		input.close();
		
		
	}

}
