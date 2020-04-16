/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JASHAN GOYAL
 */
public class Player extends Hand{
    protected String name;
    protected ArrayList<Card> playerdeck;
    
    
    

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCards(ArrayList<Card> deck){
        this.playerdeck.addAll(deck);
    }
    public void addCard(Card deck){
        this.playerdeck.add(deck);
    }
    public ArrayList getPlayerdeck() {
        return playerdeck;
    }

    public void setPlayerdeck(ArrayList playerdeck) {
        this.playerdeck = playerdeck;
    }
    

  
}
