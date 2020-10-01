package conditionals;
import java.util.Scanner;
 
public class Switch {
	public static void main(String[] args)
	{
//		String word = "hello";
		
//		switch (word)
//		{
//		case "hello":
//			System.out.println("The word is hello!");
//			break;
//		default:
//			System.out.println("it is not!");
//		}
//		
		System.out.println("Enter a letter!");
		Scanner input = new Scanner(System.in);
		char letter = input.nextLine().charAt(0);
		
		switch (letter)
		{
		case 'a':
			System.out.println("ammunition");
			break;
		case 'b':
			System.out.println("balustrade");
		case 'c':
			System.out.println("collegiate");
		case 'd':
			System.out.println("defenestration");
		}
		
		input.close();
		
		int quantity = 18;
		switch (quantity) {
	     case 10: 
	    	 System.out.println("Quantity is too low."); 
	    	 break;
	     case 11:
	     case 12:
	     case 13:
	     case 14:
	     case 15: 
	    	 System.out.println("Quantity is within the correct range."); 
	    	 break;
	     case 16:
	     case 17:
	     case 18:
	     case 19:
	     case 20: 
	    	 System.out.println("Quantity is too high."); 
	    	 break;
	}
	}

}
