package chapter5;
import java.util.Scanner;
import java.text.NumberFormat;
public class Printing {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many copies would you like to print? ");
		String strCopies = input.nextLine();
		int copies = Integer.parseInt(strCopies);
		double ppc = 0;
		
		if (copies < 100)
		{
			ppc = 0.3;
		}
		else if (copies < 500)
		{
			ppc = 0.28;
		}
		else if (copies < 750)
		{
			ppc = 0.27;
		}
		else if (copies < 1000)
		{
			ppc = 0.26;
		}
		else
		{
			ppc = 0.25;
		}
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("Price per copy is: " + money.format(ppc));
		System.out.print("\nTotal cost is: " + money.format(ppc * copies));
		
		input.close();
	}

}
