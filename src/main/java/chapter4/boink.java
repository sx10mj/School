package chapter4;

import java.text.NumberFormat;

public class boink 
{
	public static void main(String[] args)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(money.format(34));
		
		
	}

}
