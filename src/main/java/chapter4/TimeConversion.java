package chapter4;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) 
	{
		timeCalc(timeInput());

	}
	public static int timeInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time in minutes: ");
		int time = input.nextInt();
		input.close();
		return time;
	}
	
	public static void timeCalc(int time)
	{
		int hours = time / 60;
		int minutes = time % 60;
		System.out.format("The time in hours is: %02d:%02d", hours, minutes);
	}

}
