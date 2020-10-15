package conditionals;
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
public class DiscountApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * Ask user for their name
		 * ask user for price range:
		 * 1 - 1 - 10
		 * 2 - 15 - 90
		 * 3 - 200 - 500
		 * 
		 * tell user how much their secret item costs
		 * ask for discount code
		 * based on first letter's uppercase ASCII value, apply a discount code
		 * 
		 * print: name, price of item, discount applied, final price
		 */
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		int priceRange, price = 0, discount = 0;
		double finPrice;
		
		do
		{
			System.out.println("What is your price range: Cheap(1), Reasonable(2), or Pricey(3)?");
			priceRange = Integer.parseInt(input.nextLine());	
		} while (priceRange > 3 || priceRange < 0);
		
		
		switch (priceRange)
		{
		case 1: price = random.nextInt(10) + 1; break;
		case 2: price = random.nextInt(75) + 15; break;
		case 3: price = random.nextInt(300) + 200; break;
		}
		
		System.out.println("Your secret item costs: $" + price);
		Thread.sleep(1200);
		System.out.println("Please input a coupon code (type N/A if not applicable): ");
		String code = input.nextLine();
		
		if (code.toUpperCase().equals("N/A"))
		{
			
		}
		else
		{
			discount = (int)(code.toUpperCase().charAt(0));
		}
		
		finPrice = price * (discount / 100.0);
		
		System.out.println(name + "'s Receipt");
		System.out.format("%15s %s", "Item Price:", money.format(price));
		System.out.format("\n%15s %s", "Discount:", (discount) + "%");
		System.out.format("\n%15s %s", "Final Price:", money.format(finPrice));
		
		input.close();
		
		
	}

}
