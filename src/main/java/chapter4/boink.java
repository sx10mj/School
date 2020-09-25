package chapter4;

import java.text.NumberFormat;

public class boink 
{
	public static void main(String[] args)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(money.format(34));
		
		//1, 2, 3, 5, 6 (but ask for less than $ and include toonies and loonies in output), 9, 10, 11, 14
		
		
	}

}
