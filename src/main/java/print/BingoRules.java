package print;

public class BingoRules {
	
	public static void main(String[] args)
	{
		String[] rules = {"Bingo Card", "1. The caller randomly pulls a numbered bingo ball.", "2. The number is placed on the bingo board and called out.", "3. Playeres look for the called number on their bingo card.", "4. If the number is located, it is marked off.", "5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.", "6. The winning player yells BINGO."};
		for (int i = 0; i < 7; i++)
		{
			System.out.println(rules[i] + "\n");
		}
	}

}
