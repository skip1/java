/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deckofcards;

/**
 *
 * @author sk
 */
public class Cards  {
   /*     int[]deck = new int [52];
        
     String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
     String [] numbers = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
     public String suit;
     public String number;

     
    */
   
    private String number;
    private String suit;
    
    /*
     * @return the number
     */
   
    
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public  Cards (String number,String suit){
        this.number=number;
        this.suit=suit;
        
    }
    
}
