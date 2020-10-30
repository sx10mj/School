package chapter10;

public class Problem5 {

	public static void main(String[] args) 
	{
		int[] array = new int[30];
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(i + "\t" + (i + i / 10 + i % 10));
		}

	}

}
