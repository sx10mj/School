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








//array[i] = formula applied to index value
//0 = 0 + 10s digit + 1s digit = 0
//29 = 29 + 2 + 9 = 40


































