package conditionals;
import java.util.Scanner;
import java.text.NumberFormat;
public class ChairOrder {

	public static void main(String[] args) 
	{
//		create objects to be used
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
//		create variables for calculations
		double bill = 0;
		double chairCost = 0;
		double tax = 0;
		double coupon = 0;
		
//		create messages for input method
		String m1 = "What is your name?";
		String m2 = "How many chairs would you like to purchase?";
		String m3 = "Are these covered chairs (please enter true or false)?";
		String m4 = "Do you live in Newfoundland (1) or Quebec (2)?";
		String m5 = "Which coupon would you like to redeem?";
		
//		collect information from user using input method, Scanner, messages
		String name = input(input, m1);
		int chairCount = Integer.parseInt(input(input, m2));
		boolean seatCover = Boolean.parseBoolean(input(input, m3));
		String province = input(input, m4);
		String couponCode = input(input, m5).toUpperCase();
		String seatString = "", provinceString = "";
		
//		find the cost of each chair based on whether there are seat coverings or not
		if (seatCover)
		{
			chairCost = 185;
			seatString = " Covered Chairs";
		}
		else
		{
			chairCost = 124;
			seatString = " Uncovered Chairs";
		}
		
//		find the tax based on which province user lives in
		if (province.equals("1") || province.toUpperCase().charAt(0) == 'N')
		{
			tax = 0.15;
			provinceString = "Newfoundland";
		}
		else if (province.equals("2") || province.toUpperCase().charAt(0) == 'Q')
		{
			tax = 0.05;
			provinceString = "Quebec";
		}
		
//		find discount amount based on user-inputted coupon code
		switch (couponCode.toUpperCase())
		{
		case "A": coupon = 0.02; break;
		case "B": coupon = 0.03; break;
		case "C": coupon = 0.05; break;
		case "D": coupon = 0.1; break;
		default: coupon = 0;
		}

//		final calculation of bill
		bill = chairCost * chairCount * (tax + (1 - coupon));
		
//		variables to facilitate printing in money format
		String printBill = money.format(bill);
		String printSub = money.format(chairCost * chairCount);
		String printTax = money.format(chairCount * chairCost * tax);
		String printCoupon = money.format(chairCount * chairCost * coupon);
		
//		output
		System.out.println("*************************************");
		System.out.println("Sales Order");
		System.out.print("\nCustomer: " + name);
		System.out.print("\n" + chairCount + seatString);
		System.out.print("\nTotal Cost: " +  printSub);
		System.out.print("\nSales Tax for " + provinceString + ": " + printTax);
		System.out.print("\nDiscount for Coupon " + couponCode.toUpperCase() + ": " + printCoupon);
		System.out.format("\n\n%s %14s", "Bill of Sales: ", printSub);
		System.out.format("\n%30s %s", printTax, "tax");
		System.out.format("\n%30s %s", printCoupon, "discount");
		System.out.format("\n%30s", "___________________");
		System.out.format("\n%30s", printBill);
		System.out.println("\n*************************************");
		
//		close Scanner
		input.close();
	}

//	gets an input from the user to save a little space at the top
	public static String input(Scanner input, String m)
	{
		System.out.println(m);
		String result = input.nextLine();
		return result;
	}

}
