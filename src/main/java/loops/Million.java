package loops;
public class Million {

	public static void main(String[] args) 
	{
		int counter = 1;
		double money = 0.01;
		
		while (money < 1000000)
		{
			money *= 2;
			counter++;
		}	
		System.out.println(counter);
	}
}
