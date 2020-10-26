package arrays;
import java.util.Scanner;
public class HighestGrade {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in your class?");
		int studentPop = Integer.parseInt(input.nextLine());
		
		int greatest = 0;
		int[] grades = new int[studentPop];
		
		for (int i = 0; i < grades.length; i++)
		{
			System.out.print("Enter Grade #" + (i + 1) + ": ");
			grades[i] = Integer.parseInt(input.nextLine());
			if (grades[i] > greatest)
			{
				greatest = grades[i];
			}
		}
		System.out.println("The highest-achieving student in your class got a " + greatest);
		
		input.close();
	}
}
