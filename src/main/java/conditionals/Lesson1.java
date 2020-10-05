package conditionals;
import java.util.Scanner;
import java.text.NumberFormat;

//an RPG for fry-craving Roberto
public class Lesson1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("\"Hey. Wanna buy me some fries?\"");
		char response = input.nextLine().toUpperCase().charAt(0);
		int fries = 0;
		double balance = 0.0;
		
		if (response == 'Y')
		{
			System.out.println("\"Gee, thanks, man!\"\nHow many fries would you like to buy Roberto?");
			fries = Integer.parseInt(input.nextLine());
			System.out.println("Your total for Roberto's fries is " + money.format(Math.round(fries * 20)/100.0) + ".");
			while (balance < fries * 0.2)
			{
				System.out.println("You don't have enough money to fund Roberto's fry addiction (current balance: " + money.format(balance) + ").\nWould you like to work?");
				char workChoice = input.nextLine().toUpperCase().charAt(0);
				if (workChoice == 'Y')
				{
					balance += Math.round(work(input, money) * 100) / 100.0;
					
				}
				else if (workChoice == 'N')
				{
					System.out.println("\"Wow. Way to lead me on, or whatever.\"");
					break;
				}
				else
				{
					System.out.println("Look, don't try to play games with me. I am a simple program; I recognize only yes or no. Your mockery is frankly quite hurtful. I'm leaving now.");
				}
			}
			if (balance > fries * 0.2)
			{
	
				System.out.println("\"Appreciate it, bro.\"\nRoberto snarfs down his " + fries + " fries and promptly walks away.");
			}
		}
		else if (response == 'N')
		{
			System.out.println("\"Aww, okay. Guess you don't need help with your math homework then... >.>\"");
		}
		else
		{
			System.out.println("Look, don't try to play games with me. I am a simple program; I recognize only yes or no. Your mockery is frankly quite hurtful.");
		}
		input.close();
	}
	
	public static double work(Scanner input, NumberFormat money)
	{
		System.out.println("How many times would you like to work?");
		String times = input.nextLine();
		double balance = Math.log(Double.parseDouble(times)) * (Math.random() * 14) + 1;
		String[] oddJobs = {"cleaning the neighbour's porta-potties", "selling your body on the Internet", "babysitting Tyler the hamster", "helping your prodigy little sister with her calculus homework", "crafting homemade vomit for a Halloween party", "watering plants with your tears", "playing Candy Crush in a police cruiser", "professionally laughing because Donald Trump has COVID", "diving headfirst into an abandoned swimming pool"};
		System.out.println("You make " + money.format(balance) + " from " + oddJobs[(int)(Math.random() * 9)] + ".");
		return balance;
	}

}
