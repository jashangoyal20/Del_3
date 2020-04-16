package ca.sheridancollege.project;

 class Card {

   
    private int Card;
    private int Suit;
    private int Value;
    private static String[] Cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    
    Card(int suit, int values) {
        this.Card = values;
        this.Suit = suit;
    }

     
    public String toString() {
        return Cards[Card] + " of " + SUITS[Suit];
    }

 
    public int getRank() {
        return Card;
    }

    
    public int getSuit() {
        return Suit;
    }

    
    public int getValue() {
        if (Card > 10) {
            Value = 10;
        } else if (Card == 1) {
            Value = 11;
        } else {
            Value = Card;
        }
        return Value;
    }

    
    public void setValue(int set) {
        Value = set;
    }
    public static int compareRank(int rank1, int rank2)
	{
		 int num = 0;
		
		 if (rank1 > rank2)
		    num = 1;
		 else
		      if (rank1 < rank2)
			       num = -1;
	   	   else
		          num = 2;
		
		 return num;
	}
}
