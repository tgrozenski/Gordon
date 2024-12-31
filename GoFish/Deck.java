package cards;
import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	//add the two instance variables, deck and discard
	private ArrayList<Card> deck; 
	private ArrayList<Card> discard;


	//add a default constructor that fills in a standard deck
	public Deck() {

		//initialize the ArrayLists
		deck = new ArrayList<>();
		discard = new ArrayList<>();

		//initialize list of suits
		ArrayList<String> suitList = new ArrayList<>();
		suitList.add("Hearts");
		suitList.add("Spades");
		suitList.add("Diamonds");
		suitList.add("Clubs");

		for (int i = 0; i < suitList.size(); i++) {
			//Current suit
			String currentSuit = suitList.get(i);
			for (int index = 1; index <= 13; index++)
			{
				// Make current card object
				Card currentCard =  new Card(currentSuit, index);
				// Add it to the deck
				deck.add(currentCard);
			}
		
		}

	} 

    //add a constructor that takes an ArrayList of Card objects and assigns that to the desk instance variable 
	public Deck(ArrayList<Card> cardList) 
	{
		this.deck = cardList;
		this.discard = new ArrayList<>();
	}

	//write a shuffle method to randomize the order of the cards
	public void shuffle()
	{
		Random rand = new Random();

		// make a new arraylist of shuffled cards
		ArrayList<Card> shuffled = new ArrayList<>();

		//iterate over every card in the deck
		while (this.deck.size() > 1) {

			// System.out.println(currentCard);

			//get a random card from the deck
			int randomIndex = this.randomNumber(0, this.deck.size() - 1);
			// int randomIndex = rand.ints(0, this.deck.size() - 1).findFirst().getAsInt();
			Card randomCard = deck.get(randomIndex);
			deck.remove(randomIndex);

			//add the random card into new shuffled deck
			shuffled.add(randomCard);
		}
		shuffled.add(deck.get(0));
		deck.remove(0);

		//set the deck to the shuffled deck
		deck = shuffled;
		
	}

	// get the number of cards currently in the deck
	public int numberOfCards()
	{
		return this.deck.size();
	}
	
	//write a drawCard method that returns null if there are no cards in the deck, otherwise it removes the first on the deck and returns it
	public Card drawCard()
	{
		if (deck.size() == 0)
		{
			return null;
		}
		else  
		{
			Card card = deck.get(0);
			deck.remove(card);
			return card;
		}
	}

    // a method to get a random number within a range
    public int randomNumber(int first, int last) {

		Random rand = new Random();
        int chooseNumber = rand.ints(first, last).findFirst().getAsInt();
        return chooseNumber;
    }

	//write a discard method that takes a Card object and adds it to the discard pile
	public void discard(Card card)
	{
		discard.add(card);
	}
}