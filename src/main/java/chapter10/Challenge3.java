package chapter10;

import java.util.Scanner;
import java.util.Random;

public class Challenge3 {

	public static void main(String[] args) {
		
		//names:  A, B, C, D,  E,  F
		//numbers:60,80,70,100,80,150
		//index:  0  1  2  3   4   5
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int greatest = 0;
		
		String[] names = new String[6];
		int[] IQs = new int[6];
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Name Person " + (i + 1));
			names[i] = input.nextLine();
		}
		
		int index = 0;
		for (int i = 0; i < IQs.length; i++)
		{
			IQs[i] = rand.nextInt(101) + 60;
			System.out.println(IQs[i]);
			
			if (IQs[i] > greatest)
			{
				greatest = IQs[i];
				index = i;
			}
		}
		
		System.out.println("The greatest IQ is " + greatest + " and it belongs to " + names[index]);
		
		
		input.close();
	}

}
