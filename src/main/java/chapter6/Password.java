package chapter6;
import java.util.Scanner;
public class Password {
	
		public static void main(String[] args) 
		{
			String password = "incorrect hahahaha get it because it says the password you typed is incorrect *kneeslap*";
			Scanner input = new Scanner(System.in);
			
			String guess = "";
			int counter = 0;
			
				while (counter < 3)
				{
					System.out.print("Please enter your password: ");
					guess = input.nextLine();
					counter++;
					if (guess.equals(password))
					{
						System.out.println("Welcome!");
						if (guess.contains("incorrect"))
						{
							System.out.println("Also, your sense of humour is garbage.");
						}
						break;
						
					}
					else if (counter == 3)
					{
						System.out.println("Access denied.");
						break;
					}
					System.out.println("The password you typed is incorrect.");
				}

			input.close();

		}

}
