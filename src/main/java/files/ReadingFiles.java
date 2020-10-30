package files;
import java.io.*; //the 2 checked lines are all that's needed to set up
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFiles {
	
	public static void main(String[] args) 
	{
		 String phrase;
		 try 
		 {
			 FileReader in = new FileReader("marks.txt");
			 //create FileReader object
			 BufferedReader readFile = new BufferedReader(in);
			 
			 //create BufferedReader object "readFile" which buffers the data
			 //read new line
			 
			 int number = 0;
			 int sum = 0;
			 int counter = 0;
			 int[] marks = new int[8];
			 
			 while ((phrase = readFile.readLine()) != null) 
			 {
//				 System.out.println(phrase);
				 number = Integer.parseInt(phrase);
				 sum += number;
				 marks[counter] = number;
				 counter++;
			 }
			 
			 for (int i = 0; i < marks.length; i++)
			 {
				 System.out.print(marks[i] + "\t");
			 }
			 System.out.println("\nAverage: " + ((double)sum / counter));
			 System.out.println("Counter/Length of Data: " + counter);
		 
			 readFile.close();
			 in.close();
		 //this is the minimum catch syntax needed
		 }
		 catch (IOException e) 
		 {
			 System.out.println();
			 System.err.println();
		 }
	}

}
