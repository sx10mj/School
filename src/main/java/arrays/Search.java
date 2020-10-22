package arrays;

public class Search {

	public static void main(String[] args) 
	{
		int[] data = {0, 3, 4, 5, 8, 7, 6, 9, 1};
		int searchFor = 2;
		boolean found = false;
		int i = 0;
		
		for (i = 0; i < data.length; i++)
		{
			if (data[i] == searchFor)
			{
				found = true;
				break;
			}
			
		}
		if (found)
		{
			System.out.println("We found " + searchFor + " on index " + i);
		}
		else
		{
			System.out.println(searchFor + " does not exist");
		}
	}
}
