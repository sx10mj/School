package arrays;

public class Lesson2 {

	public static void main(String[] args) 
	{
		String[] studentName = new String[5];
		int[] marks = new int[5];
		boolean[] pass = new boolean[5];
		
		studentName[0] = "Kim";
		studentName[1] = "Pop";
		studentName[2] = "Kevin";
		studentName[3] = "Emma";
		studentName[4] = "Mustafa";
		
		marks[0] = (int)(Math.random() * (99 - 50 + 1)) + 50;
		marks[1] = (int)(Math.random() * (99 - 50 + 1)) + 50;
		marks[2] = (int)(Math.random() * (99 - 50 + 1)) + 50;
		marks[3] = (int)(Math.random() * (99 - 50 + 1)) + 50;
		marks[4] = (int)(Math.random() * (99 - 50 + 1)) + 50;
		
		for (int i = 0; i < marks.length; i++)
		{
			if (marks[i] > 75)
			{
				pass[i] = true;
			}
			else
			{
				pass[i] = false;
			}
			
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print(studentName[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 5; i++)
		{
			System.out.print(marks[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 5; i++)
		{
			System.out.print(pass[i] + "\t");
		}
		

	}

}
