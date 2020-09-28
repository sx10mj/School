package chapter5;
import java.util.Scanner;
public class Grade 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		int grade = Integer.parseInt(input.nextLine());
		char lettergrade = '0';
		
		if (grade > 89)
		{
			lettergrade = 'A';
		}
		else if (grade > 79)
		{
			lettergrade = 'B';
		}
		else if (grade > 69)
		{
			lettergrade = 'C';
		}
		else if (grade > 69)
		{
			lettergrade = 'D';
		}
		else
		{
			lettergrade = 'F';
		}
		
		System.out.println("The corresponding letter grade is: " + lettergrade);
		
		input.close();
	}

}
