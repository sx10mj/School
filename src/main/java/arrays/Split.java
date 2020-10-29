package arrays;

public class Split {

	public static void main(String[] args) {

//		String sentence = "I have a dream that one day";
//		
//		String[] words = sentence.split(" ");
//		
//		for (int i = 0; i < words.length; i++)
//		{
//			System.out.print(words[i] + "\t");
//		}
//		
		String data1 = "student1.88";
		String data2 = "student2.95";
		String data3 = "student3.75";
		
		String[] student1 = data1.split("\\.");
		String[] student2 = data2.split("\\.");
		String[] student3 = data3.split("\\.");
		
		System.out.println(student1.length);
		String[] names = {student1[0], student2[0], student3[0]};
		String[] marks = {student1[1], student2[1], student3[1]};
		
		for (int i = 0; i < 3; i++)
		{
			System.out.print(names[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 3; i++)
		{
			System.out.print(marks[i] + "\t\t");
		}
		
		
		
		
	}

}
