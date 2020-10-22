package arrays;
import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in your class?");
		String[] students = new String[Integer.parseInt(input.nextLine())];
		
		for (int i = 0; i < students.length; i++)
		{
			System.out.println("State the name of Student " + (i + 1));
			students[i] = input.nextLine();
		}
		
		System.out.println("Class List: ");
		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
		input.close();

	}

}
