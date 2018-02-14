/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/

import java.util.Random;

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   
   private String name;
   private double value;
   private int face;
   private double amount;
   private char type;

   /**-----------------------------------------------------------------
   *  Sets up the coin by assigning it a value and a name depending on input
   *  @param characer of p n d or q corresponding to 4 coins
   *  @return nothing
   */
   public Coin (char coin)
   {
      type = coin;
      if (type == 'p'){ 
            name = "Penny";
            value = .01;}
      if (type == 'n'){
           name = "Nickel";
           value = .05;}
      if (type == 'd'){
           name = "Dime";
           value = .1;}
      if (type == 'q'){
           name = "Quarter";
           value = .25;}
      flip();
   }
   public double getValue ()
   {
       return this.value;
   }
   public char getType ()
   {
       return this.type;
    }
   
   public String getName ()
   {
       return this.name;
   }
   
   /**-----------------------------------------------------------------
   *  Flips the coin by randomly choosing a face value.
   */
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   /**-----------------------------------------------------------------
   *  Returns true if the current face of the coin is heads.
        @return boolean, true if heads
   */
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   /**-----------------------------------------------------------------
   *  Returns the current face of the coin as a string.
        @return String
   */
   public String toString()
   {
      String myString = new String("");
      
      myString += this.name + " ";
      myString += this.value;
      return myString;
      /*
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      */
   }
}
