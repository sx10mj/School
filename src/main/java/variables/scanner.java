package variables;
import java.util.*;

//age address phone number
public class scanner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String correct = "No";
		
		while (correct.charAt(0) == 'N' || correct.charAt(0) == 'n')
		{
			System.out.println("What name shalt thou choose? ");
			String name = input.nextLine();
			
			System.out.println("Hello, " + name + "! And how many twelve-moons have you lived? (Enter a number) ");
			String age = input.nextLine();
			
			snideAgeRemark(age);
			
			System.out.println("\nAnyway. Your location of residence is...? ");
			String address = input.nextLine();
			
			System.out.println("And what phone number can I use to contact you in case things go awry? ");
			String phone = input.nextLine();
			
			System.out.println("So, to recap: your name is " + name + " , you're " + age + " years old, you live at " +  address + " , and your phone number is "  + phone + ". Is that correct?");
			correct = input.nextLine();
			if (correct.charAt(0) == 'N' || correct.charAt(0) == 'n')
			{
				System.out.println("Very well. Here we go again!");
			}
			else 
			{	
				System.out.println("Wonderful. Time to go slay some dragons!");
			}
			
		}
		
	}
	
	public static void snideAgeRemark(String age)
	{
		int ha = Integer.parseInt(age);
		if (ha < 14)
		{
			System.out.println("Ah, barely out of the womb, are we?");
		}
		else if (ha < 29)
		{
			System.out.println("A young adventurer. I remember when I was your age. Full of fiery ambition and naivety. They all learn in the end.");
		}
		else if (ha < 40)
		{
			System.out.println("...well, you're not quite the protagonist they're looking for, but...no matter. I can work with you.");
		}
		else
		{
			System.out.println("Bingo club left three hours ago. Wait, you're looking for me? Ah... ");
		}
	}
	

}
