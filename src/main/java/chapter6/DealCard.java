package chapter6;
import java.util.Random;
public class DealCard 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int index = rand.nextInt(52);
		
		int suitID = index / 13;
		String suit = "";
		
		switch (suitID)
		{
		case 0: suit = "Clubs"; break;
		case 1: suit = "Diamonds"; break;
		case 2: suit = "Hearts"; break;
		case 3: suit = "Spades"; break;
		}
		
		int cardTypeID = index % 13;
		String cardType = "";
		
		switch(cardTypeID)
		{
		case 12: cardType = "Ace"; break;
		case 11: cardType = "King"; break;
		case 10: cardType = "Queen"; break;
		case 9: cardType = "Jack"; break;
		default: cardType = String.valueOf(cardTypeID + 2);
		}
		
		System.out.println(cardType + " of " + suit + "\t" + index);
		
		

	}

}
