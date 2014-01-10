/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deckofcards;
import java.util.*;
/**
 *
 * @author sk
 */
public class DeckOfCards {
    private Cards card;
    private Cards number;
    private Cards suit;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Cards> cards = new ArrayList <Cards>();
     
     
     int[]deck = new int [52];
     String[]suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
     String [] numbers = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    
      for (int i= 0; i < deck.length; i++)   { deck[i] = i; 
        
        String suit = suits [deck[i] / 13];
        String number = numbers [deck[i] % 13];
        
        
        
        Cards card= new Cards(number, suit);
        cards.add(card);
      }
      
      for (Cards c: cards) {
          System.out.println(c.getNumber() + " " + c.getSuit());
      }
        
        }
    
    }


