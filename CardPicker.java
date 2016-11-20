// Importing necessary utilities for this program.
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.*;

public class CardPicker {
	
	// Pre-Defining necessary variables.
	static int[] Cards;
	static String[] cardsDefined;
	static int[] cardsValued;
	static int undefinedCard;
	static String definedCard;
	static int cardValue;

		public static void main(String[] args) {
			
			// Defining necessary memory space for this array.
			Cards = new int[4];
			
			// Assigning "cards" (integer values) to this array.
			for (int i = 0; i < 4; i++) {
				Cards[i] = CardsPicker();
			}
			
			// Informing the user of the randomly generated integer values that were entered into the array.
			System.out.format("Your numbers are: %d, %d, %d, and %d.\n\n", Cards[0], Cards[1], Cards[2], Cards[3]);
			
			// Defining necessary memory space for this array.
			cardsDefined = new String[4];
			
			// Assigning names for the card numbers (that were gathered and put within the previous array) and putting the names into this array.
			for (int i = 0; i < 4; i++) {
				cardsDefined[i] = Definer(Cards[i]);
			}
			
			// Informing the user of the names of the cards that were randomly generated.
			System.out.println("Your First card is:  The " + cardsDefined[0]);
			System.out.println("Your Second card is: The " + cardsDefined[1]);
			System.out.println("Your Third card is:  The " + cardsDefined[2]);
			System.out.println("Your Fourth card is: The " + cardsDefined[3] + "\n");
			
			// Defining necessary memory space for this array.
			cardsValued = new int[4];
			
			// Giving a value of 1 - 13 to the cards chosen in the first array, depending on their ranking in poker. (except the Aces beating all other cards as a high-card as a number).
			for (int i = 0; i < 4; i++) {
				cardsValued[i] = CardValuer(Cards[i]);
			}
			
			// Informing the user of the values of the randomly generated cards.
			System.out.println("The value of your First card is:  " + cardsValued[0]);
			System.out.println("The value of your Second card is: " + cardsValued[1]);
			System.out.println("The value of your Third card is:  " + cardsValued[2]);
			System.out.println("The value of your Fourth card is: " + cardsValued[3] + "\n");
			
			// Adding all of the card values up.
			int totalCardsValue = IntStream.of(cardsValued).sum();
			
			// Informing the user of the total value of all of the cards combined.
			System.out.println("The total value of all your cards is: " + totalCardsValue);
			
		}
		
		// This function picks four random cards.
		public static int CardsPicker() {
			
			int Number = ThreadLocalRandom.current().nextInt(1, 52 + 1);
			return Number;
			
		}
		
		// This function initiates another function that gives the randomly generated cards string names.
		public static String Definer(int cardToDefine) {
			
			String definedCard = CardDefiner(cardToDefine);
			return definedCard;
			
		}
		
		// This function defines string names of the cards that were randomly generated.
		public static String CardDefiner(int Number) {
			
			if (Number == 1) {
				definedCard = "Ace of Spades";
				return definedCard;
			} else if (Number == 2) {
				definedCard = "King of Spades";
				return definedCard;
			} else if (Number == 3) {
				definedCard = "Queen of Spades";
				return definedCard;
			} else if (Number == 4) {
				definedCard = "Jack of Spades";
				return definedCard;
			} else if (Number == 5) {
				definedCard = "Ten of Spades";
				return definedCard;
			} else if (Number == 6) {
				definedCard = "Nine of Spades";
				return definedCard;
			} else if (Number == 7) {
				definedCard = "Eight of Spades";
				return definedCard;
			} else if (Number == 8) {
				definedCard = "Seven of Spades";
				return definedCard;
			} else if (Number == 9) {
				definedCard = "Six of Spades";
				return definedCard;
			} else if (Number == 10) {
				definedCard = "Five of Spades";
				return definedCard;
			} else if (Number == 11) {
				definedCard = "Four of Spades";
				return definedCard;
			} else if (Number == 12) {
				definedCard = "Three of Spades";
				return definedCard;
			} else if (Number == 13) {
				definedCard = "Two of Spades";
				return definedCard;
			} else if (Number == 14) {
				definedCard = "Ace of Hearts";
				return definedCard;
			} else if (Number == 15) {
				definedCard = "King of Hearts";
				return definedCard;
			} else if (Number == 16) {
				definedCard = "Queen of Hearts";
				return definedCard;
			} else if (Number == 17) {
				definedCard = "Jack of Hearts";
				return definedCard;
			} else if (Number == 18) {
				definedCard = "Ten of Hearts";
				return definedCard;
			} else if (Number == 19) {
				definedCard = "Nine of Hearts";
				return definedCard;
			} else if (Number == 20) {
				definedCard = "Eight of Hearts";
				return definedCard;
			} else if (Number == 21) {
				definedCard = "Seven of Hearts";
				return definedCard;
			} else if (Number == 22) {
				definedCard = "Six of Hearts";
				return definedCard;
			} else if (Number == 23) {
				definedCard = "Five of Hearts";
				return definedCard;
			} else if (Number == 24) {
				definedCard = "Four of Hearts";
				return definedCard;
			} else if (Number == 25) {
				definedCard = "Three of Hearts";
				return definedCard;
			} else if (Number == 26) {
				definedCard = "Two of Hearts";
				return definedCard;
			} else if (Number == 27) {
				definedCard = "Ace of Clubs";
				return definedCard;
			} else if (Number == 28) {
				definedCard = "King of Clubs";
				return definedCard;
			} else if (Number == 29) {
				definedCard = "Queen of Clubs";
				return definedCard;
			} else if (Number == 30) {
				definedCard = "Jack of Clubs";
				return definedCard;
			} else if (Number == 31) {
				definedCard = "Ten of Clubs";
				return definedCard;
			} else if (Number == 32) {
				definedCard = "Nine of Clubs";
				return definedCard;
			} else if (Number == 33) {
				definedCard = "Eight of Clubs";
				return definedCard;
			} else if (Number == 34) {
				definedCard = "Seven of Clubs";
				return definedCard;
			} else if (Number == 35) {
				definedCard = "Six of Clubs";
				return definedCard;
			} else if (Number == 36) {
				definedCard = "Five of Clubs";
				return definedCard;
			} else if (Number == 37) {
				definedCard = "Four of Clubs";
				return definedCard;
			} else if (Number == 38) {
				definedCard = "Three of Clubs";
				return definedCard;
			} else if (Number == 39) {
				definedCard = "Two of Clubs";
				return definedCard;
			} else if (Number == 40) {
				definedCard = "Ace of Diamonds";
				return definedCard;
			} else if (Number == 41) {
				definedCard = "King of Diamonds";
				return definedCard;
			} else if (Number == 42) {
				definedCard = "Queen of Diamonds";
				return definedCard;
			} else if (Number == 43) {
				definedCard = "Jack of Diamonds";
				return definedCard;
			} else if (Number == 44) {
				definedCard = "Ten of Diamonds";
				return definedCard;
			} else if (Number == 45) {
				definedCard = "Nine of Diamonds";
				return definedCard;
			} else if (Number == 46) {
				definedCard = "Eight of Diamonds";
				return definedCard;
			} else if (Number == 47) {
				definedCard = "Seven of Diamonds";
				return definedCard;
			} else if (Number == 48) {
				definedCard = "Six of Diamonds";
				return definedCard;
			} else if (Number == 49) {
				definedCard = "Five of Diamonds";
				return definedCard;
			} else if (Number == 50) {
				definedCard = "Four of Diamonds";
				return definedCard;
			} else if (Number == 51) {
				definedCard = "Three of Diamonds";
				return definedCard;
			} else if (Number == 52) {
				definedCard = "Two of Diamonds";
				return definedCard;
			}
			return definedCard;
		}

		// This function gives the randomly generated cards alternate values.
		public static int CardValuer(int Number) {
			
			if (Number == 1) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 2) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 3) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 4) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 5) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 6) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 7) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 8) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 9) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 10) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 11) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 12) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 13) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 14) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 15) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 16) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 17) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 18) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 19) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 20) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 21) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 22) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 23) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 24) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 25) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 26) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 27) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 28) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 29) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 30) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 31) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 32) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 33) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 34) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 35) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 36) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 37) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 38) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 39) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 40) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 41) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 42) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 43) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 44) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 45) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 46) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 47) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 48) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 49) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 50) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 51) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 52) {
				cardValue = 2;
				return cardValue;
			}
			return cardValue;
			}
}
