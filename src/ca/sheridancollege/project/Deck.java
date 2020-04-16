package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Creates and shuffles a deck of 52 playing cards.
 */
class Deck {

    private ArrayList<Card> Deck;

    Deck()
    {
        Deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 1; j <= 13; j++) 
            {
                Deck.add(new Card(i, j));
            } 
        }
    }

   
    public void shuffleCards(List deck) {
        Collections.shuffle(deck);
    }
        
    public Card draw() {
        return Deck.remove(0);
    }
}
