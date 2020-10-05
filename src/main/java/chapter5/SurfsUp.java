package chapter5;
import java.util.Scanner;
public class SurfsUp {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int waveHeight = Integer.parseInt(input.nextLine());
		
		if (waveHeight > 5)
		{
			System.out.println("Great day for surfing!");
		}
		else if (waveHeight > 2)
		{
			System.out.println("Go body boarding!");
		}
		else if (waveHeight > -1)
		{
			System.out.println("Go swimming!");
		}
		else
		{
			System.out.println("What kind of surf is that?");
		}
		
		input.close();

	}

}
