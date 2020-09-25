package conditionals;
import java.util.Scanner;
public class randomNumbers 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter money: ");
		String strMoney = input.nextLine();
		
		//Parsing: string -> int/double
		double money = Double.parseDouble(strMoney);
		System.out.println(money);
		
		//Type casting: changing int -> double or double -> int/char
		int intMoney = (int)(money);
		System.out.println(intMoney);
		
		char charMoney = (char)(money);
		System.out.println(charMoney);
		
		
	}
	
}
