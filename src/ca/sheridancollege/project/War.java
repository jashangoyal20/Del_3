/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JASHAN GOYAL
 */
public class War {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card card;
        Deck d = new Deck();

        List<Card> list = new ArrayList();
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card = new Card(i, j);
                list.add(card);
            }
        }
        System.out.println("In this game the player who have bigger  card wins the game,\nif you want to stop in between then you can type any int other than 1 to see the result of game");
        System.out.println("How many times you want to shuffle your deck");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            d.shuffleCards(list);
        }

        Hand P1H = new Hand();
        Hand P2H = new Hand();

        ArrayList<Card> Player1List = new ArrayList<Card>();
        ArrayList<Card> Player2List = new ArrayList<Card>();
        
        Player1List.addAll(list.subList(0, 26));
        d.shuffleCards(Player1List);
        Player2List.addAll(list.subList(26, list.size()));
        d.shuffleCards(Player2List);

        sc.nextLine();

        System.out.println("Enter Player 1 Name: ");
        String name1 = sc.nextLine().toUpperCase();

        System.out.println("Enter Player 2 Name: ");
        String name2 = sc.nextLine().toUpperCase();

        Player p1 = new Player(name1);
        Player p2 = new Player(name2);

        p1.setName(name1.toUpperCase());
        p2.setName(name2.toUpperCase());

        System.out.println("Name of Player 1 is " + p1.getName() + "\nName of Player 2 is " + p2.getName());
        System.out.println("Game start");

        P1H.setHand(Player1List);
        P2H.setHand(Player2List);
        System.out.println(P1H.getHand().size() +" "+ P2H.getHand().size());
        int play = 1;
        do {
            int val1 = (int) (1+(Math.random() * 10));

            System.out.println(name1+"'s card is " + P1H.getCard(val1));
//            System.out.println(P1H.getCard(val1).getRank());        
// index value of the cards
            int val2 = (int) (1+(Math.random() * 10));
            System.out.println(name2+"'s card is " + P2H.getCard(val2));
//            System.out.println(P2H.getCard(val2).getRank());        
// index value of the cards

            if (P1H.getCard(val1).getRank() > P2H.getCard(val2).getRank()) {

                System.out.println(name1+" has won two cards");
                Player1List.add(Player2List.get(val2));
                Player2List.remove(val2);
                d.shuffleCards(Player1List);

                P1H.setHand(Player1List);
                P2H.setHand(Player2List);

               

            } else if (P1H.getCard(val1).getRank() < P2H.getCard(val2).getRank()) {
                System.out.println(name2+" has won two cards");
                Player2List.add(Player1List.get(val1));
                Player1List.remove(val1);
                
                d.shuffleCards(Player2List);

                P1H.setHand(Player1List);
                P2H.setHand(Player2List);

//                System.out.println(P1H.getHand());
//                System.out.println(P1H.getCardCount());
//                
//                System.out.println(P2H.getHand());
//                System.out.println(P2H.getCardCount());
            }
            
            else {
                System.out.println("It's a tie. Now it's time for war!!!");
                ArrayList<Card> WarOne = new ArrayList<Card>();
                ArrayList<Card> WarTwo = new ArrayList<Card>();
                  
                    System.out.println("War");   
                for(int x=0;x<3;x++){
                    if(Player1List.isEmpty() || Player2List.isEmpty()){
                        break;
                    }
                    
                    WarOne.add(P1H.getCard((int)(1+Math.random()*10)));
                    WarTwo.add(P2H.getCard(val2));
                    if(WarOne.size()==3 || WarTwo.size()==3){
                        System.out.println("Player one's war card : "+ WarOne.get(0).toString());
                        System.out.println("Player two's war card : "+ WarTwo.get(0).toString());
                        if(WarOne.get(2).getRank() > WarTwo.get(2).getRank()){
                            System.out.println("woohooo\n"+name1+" wins the War");
//                            Player1List.addAll(WarOne);
                            Player1List.addAll(WarTwo);
                            Player2List.removeAll(WarTwo);
                            P1H.setHand(Player1List);
                            P2H.setHand(Player2List);
                            
                        }
                        if(WarOne.get(2).getRank() < WarTwo.get(2).getRank()){
                            System.out.println("Woohooo\n"+name2+" wins the War");
                            Player2List.addAll(WarOne);
//                            Player2List.addAll(WarTwo);
                            Player1List.removeAll(WarOne);
                             P1H.setHand(Player1List);
                            P2H.setHand(Player2List);
                        }
                    }
                
                }
                }
    System.out.println("Press 1 to continue");
    
            if(Player1List.size() == 0)
            {
            System.out.println("GameOver!\n"+name2+" wins the Game.");
            break;
            }
    
            else if(Player2List.size() == 0)
            {
                System.out.println("GameOver!\n"+name1+" wins the Game.");
                break;
            }

            play = sc.nextInt();
        } while (play == 1);
        
        if(P1H.getHand().size()>P2H.getHand().size()){
            System.out.println(name1+" has won");
            System.out.println(name1+" has "+P1H.getHand().size()+" Cards");
            System.out.println(name2+" has "+P2H.getHand().size()+" Cards");

        }
        else {
            System.out.println(name2+" has won");
            System.out.println(name2+" has "+P2H.getHand().size()+" Cards");
            System.out.println(name1+" has "+P1H.getHand().size()+" Cards");


        }
        
    }

}
