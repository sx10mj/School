package chapter3;

public class BinaryNumbers 
{
	public static void main(String[] args)
	{
		String[] decimals = {"Decimal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		String[] binaries = {"Binary", "1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111", "10000", "10001", "10010", "10011", "10100"};
		String[] hexadecimals = {"Hexadecimal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "10", "11", "12", "13", "14"};	
		
		for (int j = 0; j < 21; j++)
		{
			System.out.format("%15s %15s %15s %10s", decimals[j], binaries[j], hexadecimals[j], "\n");
		}
	}
}
