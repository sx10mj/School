package conditionals;
import java.util.Scanner;
public class PhoneCompany 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("Where do you live?");
		String areaCode = input.nextLine().toUpperCase();
		
		int firstThree = 0;
		
		switch (areaCode)
		{
		case "MISSISSAUGA":
			firstThree = 905;
			break;
		case "TORONTO":
			firstThree = 416;
			break;
		case "WATERLOO":
			firstThree = 226;
			break;
		case "BARRIE":
			firstThree = 705;
			break;
		case "VAUGHAN":
			firstThree = 289;
			break;
		default:
			System.out.println("I don't know that region. Check for typos and try again.");
			areaCode = input.nextLine().toUpperCase();
		}
		
		int secondThree = (int)(Math.random() * (1000));
		int thirdFour = (int)(Math.random() * (10000));
		
		System.out.println("Thank you, " + name + ", for choosing GFSS Phone Company.");
		System.out.format("Your new phone number is: " + firstThree + "-%03d-%04d", secondThree, thirdFour + ".");
		
		input.close();
	}

}
