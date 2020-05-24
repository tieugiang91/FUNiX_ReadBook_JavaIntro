package package14;

public class Deck {

	public static void main(String[] args) {
		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
		String[] RANKS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}
		
		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String tmp = deck[i];
			deck[i] = deck[r];
			deck[r] = tmp;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}
	}

}
