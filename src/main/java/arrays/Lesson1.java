package arrays;

public class Lesson1 {

	public static void main(String[] args) 
	{
		char[] specChar = new char[10];
		char[] transfers = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
		for (int i = 0; i < 10; i++)
		{
			specChar[i] = transfers[i];
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(specChar[i]);
		}
		

	}

}
