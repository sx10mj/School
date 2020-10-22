package chapter6;
import java.util.Scanner;
public class ElapsedTimeCalculator {

	public static void main(String[] args) 
	{
		String M;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting hour: ");
		int start = Integer.parseInt(input.nextLine());
		
		do
			{
			System.out.print("Enter AM or PM: ");
			M = input.nextLine();
			} while (!M.equals("AM") && !M.equals("PM"));
		
		System.out.print("Enter the number of elapsed hours: ");
		int hours = Integer.parseInt(input.nextLine());
		
		if (M.equals("PM"))
		{
			start += 12;
		}
		
		M = "AM";
		start += hours;
		if (start > 24)
		{
			start %= 24;
		}
		if (start > 12)
		{
			start %= 12;
			M = "PM";
		}
		System.out.print("The time is: " + start + ":00 " + M);
		input.close();

	}

}
