package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.List;

public class Hand {

   private List hand;   // The cards in the hand.

  
   public Hand() {
      hand = new ArrayList();
   }
   
  
   public void clear() {
      hand.clear();
   }

    public List getHand() {
        return hand;
    }

    public void setHand(List hand) {
        this.hand = hand;
    }
   
   /**
    * Add a card to the hand.  It is added at the end of the current hand.
    * @param c the non-null card to be added.
    * @throws NullPointerException if the parameter c is null.
    */
   public void addCard(Object c) {
          hand.add(c);
   }

   public void removeCard(Object c) {
      hand.remove(c);
   }
   
  
   public void removeCard(int position) {
      if (position < 0 || position >= hand.size())
         throw new IllegalArgumentException("Position does not exist in hand: "
               + position);
      hand.remove(position);
   }

   
   public int getCardCount() {
      return hand.size();
   }
   
  
   public Card getCard(int position) {
     
       return (Card) hand.get(position);
   }
   
  
   
}