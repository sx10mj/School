package chapter5;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a hurricane category from 1 to 5: ");
		int intensity = Integer.parseInt(input.nextLine());
		System.out.print("Wind speeds: ");
		switch (intensity)
		{
		case 1: 
			System.out.println("74-95 mph or 64-82 kt or 119-153 km/hr");
			break;
		case 2: 
			System.out.println("96-110 mph or 83-95 kt or 154-177 km/hr");
			break;
		case 3: 
			System.out.println("111-130 mph or 96-113 kt or 178-209 km/hr");
			break;
		case 4: 
			System.out.println("131-155 mph or 114-135 kt or 210-249 km/hr");
			break;
		case 5: 
			System.out.println("greater than 155 mph or 135 kt or 249 km/hr");
			break;
		default:
			System.out.print("That's not a hurricane category.");
				
		}
		
		input.close();

	}

}
