package print;
import java.util.Scanner;
//import java.io
public class NumberChanger 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Decimal to Binary/Hexadecimal number converter!");
		String numsys = getNumberSystem();
		//numberInput();
		//numberConversion();

	}
	
	public static String getNumberSystem()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What number system would you like to convert to?");
		String numsys = (input.nextLine()).toUpperCase();
		
		while (numsys.equals("BINARY") && numsys.equals("HEXADECIMAL"))
		{
			System.out.println("Please enter either binary or hexadecimal.");
			numsys = (input.nextLine()).toUpperCase();
			System.out.println(numsys);
		}
		
		input.close();
		return numsys;
	}

}
