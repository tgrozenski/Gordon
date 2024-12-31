package cards;
import java.util.ArrayList;
import java.util.Random;

public class Hand 
{
    // Array of cards in the hand    
    private ArrayList<Card> handOfCards;

    // Constructor
    public Hand(ArrayList<Card> handOfCards)
    {
        this.handOfCards = handOfCards;
    }


    // a method to pick a random card from the hand
    public Card pickCard()
    {
       Random randomCard = new Random(); //Creating a random object
       int randomIndex = (int) (Math.random() * handOfCards.size()); // Generating a random index
       return handOfCards.get(randomIndex); // Returning the card at the random index
    }

    // a method to return a card of some Rank if it is in the hand
    // method(7) returns a card of 7 or null
    public Card rankPresent(int rank)
    {
        for(int index = 0; index < handOfCards.size(); index++)
        {
            if(handOfCards.get(index).getRank() == rank)
            {
                return handOfCards.get(index);
            }
        }
        // otherwise return null
        return null;
    }

    // a method to remove a card if it is in the hand
    public void removeCard(Card cardToBeRemoved)
    {
        handOfCards.remove(cardToBeRemoved);
    }

    // a method to add a card to the hand
    public void addCard(Card cardToBeAdded)
    {
        handOfCards.add(cardToBeAdded);
    }

    // a method to check if a book is present in the hand
    public int bookPresent()
    {
        int books = 0;

        //Checking each rank
        for (int rank = 1; rank <= 13; rank++)
        {
            int count = 0;
            for(int i = 0; i < handOfCards.size(); i++)
            {
                if(handOfCards.get(i).getRank() == rank)
                {
                    count++;
                }
            }

            //If there are 4 cards of this rank, it's a book.
            if (count == 4)
            {
                books++;
            }
        }
        return books;
    }

    public void removeBooks()
    {
        for (int rank = 1; rank <= 13; rank++)
        {
            int count = 0;

            //Counting how many card of the current rank are in the hand
            for(int i = 0; i < handOfCards.size(); i++)
            {
                if (handOfCards.get(i).getRank() == rank)
                {
                    count++;
                }
            }
            //And if there are 4 cards of this rank, it's a book. 
            // All cards of that rank be removed
            if (count == 4)
            {
                for (int i = 0; i < handOfCards.size();)
                {
                    if (handOfCards.get(i).getRank() == rank)
                    {
                        handOfCards.remove(i);
                    }
                }
            }
        }
    }
}
