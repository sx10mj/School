package chapter5;
import java.text.NumberFormat;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of eggs purchased: ");
		int eggs = Integer.parseInt(input.nextLine());
		double ppd = 0;
		
		if (eggs < 48)
		{
			ppd = 0.50;
		}
		else if (eggs < 72)
		{
			ppd = 0.45;
		}
		else if (eggs < 132)
		{
			ppd = 0.4;
		}
		else
		{
			ppd = 0.35;
		}
		
		double total = eggs * ppd / 12;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("The total bill is: " + money.format(total));
		
		input.close();

	}

}
