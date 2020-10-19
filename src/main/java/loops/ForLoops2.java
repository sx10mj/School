package loops;
import java.util.Scanner;
public class ForLoops2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userNum = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= userNum; i++)
		{
			System.out.println("Hello " + i);
		}
		input.close();

	}

}
