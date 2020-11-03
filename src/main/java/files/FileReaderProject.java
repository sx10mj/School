package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProject {

	public static void main(String[] args) 
	{
		String[][] dataPacks = readFile("10MJ");
		for (int j = 0; j < 26; j++)
		{
			System.out.println(dataPacks[0][j]);
			System.out.format("%15s: %s\n", "Student Number", dataPacks[1][j]);
			System.out.format("%15s: %s\n", "Initials", dataPacks[2][j]);
			System.out.format("%15s: %s\n", "Cohort", dataPacks[3][j]);
		}
	}
	
	public static String[][] readFile(String textfile)
	{
		String phrase; 
		
		String[] names = new String[26];
		String[] studentNum = new String[26];
		String[] initials = new String[26];
		String[] cohort = new String[26];
		
		String[] temp = new String[4];
		
		String[][] dataPacks = {names, studentNum, initials, cohort};

		try
		{
			FileReader in = new FileReader(textfile);
			BufferedReader readFile = new BufferedReader(in);
			int i = 0;
			while ((phrase = readFile.readLine()) != null)
			{
				temp = phrase.split("/");
				names[i] = temp[0];
				studentNum[i] = temp[1];
				initials[i] = temp[2];
				cohort[i] = temp[3];
				i++;
				
			}
			
			readFile.close();
			in.close();
		}catch (IOException e)
		{
			System.out.println("Problem Reading File");
			System.err.println("IOException " + e.getMessage());
		}
		
		return dataPacks;
	}

}
