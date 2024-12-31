package gofish;
import cards.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish 
{
	boolean playerTurn = true;

	public void play()
	{

	// There are two players, the human and the computer.  
	// To start, each player draws a hand containing 7 cards.  

	// Make a shuffled deck object
	Deck newDeck = new Deck();
	newDeck.shuffle();

	// Make an arraylist to store the cards that are drawn
	ArrayList<Card> humanCards = new ArrayList<Card>();
	ArrayList<Card> computerCards = new ArrayList<Card>();

	// Do this 7 times
	for (int count = 0; count < 7; count++)
	{
		// Grab a card, store it temporarily, put it into an arraylist
		Card hCard = newDeck.drawCard();
		humanCards.add(hCard);

		Card cCard = newDeck.drawCard();
		computerCards.add(cCard);
	}

	//Make a player hand object
	Hand humanHand = new Hand(humanCards);

	//Make a computer hand object
	Hand computerHand = new Hand(computerCards);

	int humanBooks = 0;
	int computerBooks = 0;

	Scanner scanner = new Scanner(System.in);
	while (humanBooks + computerBooks < 13)
	{
		// HUMAN'S TURN
		if (playerTurn)
		{
			int rank = scanner.nextInt();

			//ask if the computer has any cards of that rank.
			Card chosenCard = computerHand.rankPresent(rank);

			if(chosenCard != null)
			{
				// Collect all of the cards of that rank from the computer's hand
				while (chosenCard != null)
				{
					computerHand.removeCard(chosenCard);
					humanHand.addCard(chosenCard);
					chosenCard = computerHand.rankPresent(rank);
				}
			}
			else
			{
				System.out.println("Go fish.");
				Card cardDrawn = newDeck.drawCard();
				humanHand.addCard(cardDrawn);
			}
			// Add something here to change the turn to computer's turn
		}
		else // COMPUTER'S TURN
		{

		//The computer picks a card from their hand
		Card dCard = computerHand.pickCard();

		// The computer asks the human if they have a card of that rank
		Card aCard = humanHand.rankPresent(dCard.getRank());

		// And if the human dies have cards of that rank, the computer collects those cards
		if(aCard != null)
		{
			//So a card of the requested rank is found in the human's hand
			// That card can be collected

			// Collect all of the card of that rank from the human's hand
			while (aCard != null)
			{
				humanHand.removeCard(aCard);
				computerHand.addCard(aCard);
				aCard = humanHand.rankPresent(dCard.getRank());
			}
		}
		else
		{
			// So if no card of the requested rank is found
			{
				System.out.println("Go fish.");
				Card cardDrawn = newDeck.drawCard();
				computerHand.addCard(cardDrawn);
			}
		}
		// Check for completed books

		// Add something here to change the turn to computer's turn
		}
	} 
	// If the player does not then they print "Go fish.", the computer draws a card from the deck and it is the human's turn.  
	// Each time a player receives a card they should check their hand for completed books.  
	// A book is a collection of all 4 cards of the same rank (e.g. 4 Jacks).  
	// If a player has a book in their   then the book should be removed and counted.  
	// When all books have been collected (i.e. the total number of books is 13) then the game is over.  
	// The player with the most books is declared the winner and game play ends.  
	}
}
