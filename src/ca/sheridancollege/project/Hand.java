package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.List;

public class Hand {

   private List hand;   // The cards in the hand.

  
   public Hand() {
      hand = new ArrayList();
   }
   
  
   public boolean clear() {
       if(hand.isEmpty())
      {
          return false;
      }
       else{
      hand.clear();
      if(hand.isEmpty())
      {
          return true;
      }
      return false;
       }
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

   public boolean removeCard(Object c) {
      hand.remove(c);
      boolean bool=false;
      if(!(hand.get(0)==c))
      {
          bool= true;
      }
      else {
      bool= false;
      }
      return bool;
   }
   public boolean continuePlay(int a){
    boolean bool=false;
    if(a==1)
    {
        bool= true;
    }
    else
    {
        bool=false;
    }
    return  bool;
   }
  
   public void removeCard(int position) {
      if (position < 0 || position >= hand.size())
         throw new IllegalArgumentException("Position does not exist in hand: "
               + position);
      hand.remove(position);
   }
    
  
   public Card getCard(int position) {
     
       return (Card) hand.get(position);
   }
    public void setCard(int index , Card card) {
     
    hand.add(index, card);
    }
   
  
   
}