package chapter5;

import java.util.Scanner;

public class Stages {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an age: ");
		int age = Integer.parseInt(input.nextLine());
		
		if (age > 18)
		{
			System.out.println("adult");
		}
		else if (age > 12)
		{
			System.out.println("teen");
		}
		else if (age > 10)
		{
			System.out.println("child");
		}
		else
		{
			System.out.println("toddler");
		}
		
		input.close();

	}

}
