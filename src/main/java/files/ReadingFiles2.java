package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles2 
{

	public static void main(String[] args) 
	{
		String phrase;
		//create three arrays to store data
		String[] items = new String[5];
		double[] price = new double[5];
		int[] quantity = new int[5];
		
		String[] temp = new String[3];

		try
		{
			FileReader in = new FileReader("schoolfile.txt");
			BufferedReader readFile = new BufferedReader(in);
			int i = 0;
			while ((phrase = readFile.readLine()) != null)
			{
//				System.out.println(phrase);
				temp = phrase.split(",");
				items[i] = temp[0];
				price[i] = Double.parseDouble(temp[1]);
				quantity[i] = Integer.parseInt(temp[2]);
				i++;
				
			}
			for (int j = 0; j < 5; j++)
			{
				System.out.println(items[j]);
				System.out.format("%10s: %s\n", "Price", price[j]);
				System.out.format("%10s: %s\n", "Quantity", quantity[j]);
			}
			
			readFile.close();
			in.close();
		}catch (IOException e)
		{
			System.out.println("Problem Reading File");
			System.err.println("IOException " + e.getMessage());
		}
		double totalPrice = 0;
		for (int i = 0; i < 5; i++)
		{
			totalPrice = totalPrice + (price[i] * quantity[i]);
		}
		System.out.println("Subtotal: " + totalPrice);
		
		bubbleSort(items);
		for (int i = 0; i < items.length; i++)
		{
			System.out.println(items[i]);
		}
	}
	
	public static String[] bubbleSort(String[] data) 
	{
		boolean flag = true;
		String temp;
		while (flag) 
		{
			flag = false;
			for (int j = 0; j < data.length - 1; j++) 
			{
				if (data[j].compareToIgnoreCase(data[j + 1]) > 0) 
				{
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					flag = true;
				}
			}
		}
		return data;
	}
	

}
