package variables;
import java.util.Scanner;
import java.text.NumberFormat;
public class ChoChoBitCoin 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String message1 = "your name";
		String message2 = "the price of a single Bitcoin unit";
		String message3 = "the number of Bitcoin you would like to purchase";
		
		String name = input(input, message1);
		double cost = Double.parseDouble(input(input, message2));
		int unitsPurchased = Integer.parseInt(input(input, message3));
		
		double total = cost * unitsPurchased;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		String[] receiptMessage = {name + "'s Order:\n", "Cost: " + money.format(cost) + " / Bitcoin\n", "Quantity: " + unitsPurchased + "\n", "Total Cost: " + money.format(total)};
		
		System.out.println("\nReceipt:\n*******************************");
		for (int i = 0; i < 4; i++)
		{
			System.out.print("     " + receiptMessage[i]);
		}
		System.out.println("\n*******************************\nThank you for using ChoCho Bitcoin!");
	}
	
	public static String input(Scanner input, String message)
	{
		System.out.print("Please state " + message + ": ");
		String result = input.nextLine().replaceAll("[$]", "");
		return result;
	}
}
