package cards;

public class Card implements Comparable<Card>
{
	
	public static final String SPADE = "\u2660";
	public static final String DIAMOND = "\u2666";
	public static final String CLUB = "\u2663";
	public static final String HEART = "\u2665";
	//add the rank and suit instance variables
	private String suit;
	private int rank;
	
	//add the constructor
	public Card(String suit, int rank) 
	{
		this.suit = suit;
		this.rank = rank;
	}
	//add get methods for both instance variables
	public String getSuit()
	{
		return this.suit;
	}
	public int getRank()
	{
		return this.rank;
	}
	//add a toString() method

	@Override
	public String toString() {
		if (this.rank == 1)
		{
			return "Ace of " + this.suit;
		}
		else if (this.rank == 11) {
			return "Jack of " + this.suit;
		}
		else if (this.rank == 12)
		{
			return "Queen of " + this.suit;
		}
		else if (this.rank == 13) {
			return "King of " + this.suit;
		}
		else 
		{
			return this.rank + " of " + this.suit;
		}
	}

	@Override
	public int compareTo(Card card)
	{
		//ranked order is spades > hearts > diamonds > clubs
		if(card.getRank() == rank)
		{
			if(suit.equals(card.getSuit()))
			{
				return 0;
			}
			else if(suit.equals(SPADE))
			{
				return 1;
			}
			else if(card.getSuit().equals(SPADE))
			{
				return -1;
			}
			else if(suit.equals(HEART))
			{
				return 1;
			}
			else if(card.getSuit().equals(HEART))
			{
				return -1;
			}
			else if(suit.equals(HEART))
			{
				return 1;
			}
			else if(card.getSuit().equals(DIAMOND))
			{
				return -1;
			}
			else if(suit.equals(DIAMOND))
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return rank - card.getRank();
		}
	}
}
