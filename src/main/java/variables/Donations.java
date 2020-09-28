package variables;
import java.util.Scanner;
import java.text.NumberFormat;
public class Donations 
{
	public static void main(String[] args)
	{
		//Task: Give the user two chances to donate to a charity.
		//At the end, state the total amount they have donated.
		
		Scanner input = new Scanner(System.in);
		System.out.print("State your first donation amount: ");
		String strMoney = input.nextLine().replaceAll("[$]", "");
		double donations = Double.parseDouble(strMoney);
		
		System.out.print("State second donation amount: ");
		strMoney = input.nextLine().replaceAll("[$]", "");
		donations += Double.parseDouble(strMoney);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Your total donations are " + money.format(donations) + ".");
		
//		if (donations < 20)
//		{
//			System.out.println("...cheapskate.");
//		}
//		else if (donations > 200)
//		{
//			System.out.println("Wow, can I have some?");
//		}
		
		input.close();
	}

}
