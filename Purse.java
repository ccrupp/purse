
import java.util.ArrayList;

public class Purse
{
    //private ArrayList
    private int pennies, nickels, dimes, quarters;
    private double total = 0;
    private ArrayList <Coin> pocket = new ArrayList<Coin>();

    public Purse (){ };
        
    public Purse (Coin acoin)
    {
        pocket.add(acoin);  
    }
  /** precondition: Coin will be initialized (value and name) correctly
  *               each variable will have a value
      postcondition: Puts the Coin into the array list change
  */
    public void addCoin (Coin acoin)
    {
        pocket.add(acoin);
    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return ???
  */
    public double getTotal()
    {
        total = 0;
        for (int i = 0 ; i < pocket.size() ; i ++){
            
            total += pocket.get(i).getValue();
        }
        return total;

    }
    public int size(){
        return pocket.size();
    }
    public Coin get(int i){
        return (pocket.get(i));
    }
    public void removeCoin (int remover){
        pocket.remove(remover);
    }
    public int getNumberofPennies(){
        pennies = 0;
        for (int i = 0 ; i < pocket.size() ; i++){
            if ((pocket.get(i).getName()).equals("Penny"))
                pennies += 1;
            }
        return pennies;
    }
    public int getNumberofNickels(){
        nickels = 0;
        for (int i = 0 ; i < pocket.size() ; i++){
            if ((pocket.get(i).getName()) == "Nickel")
                nickels += 1;
            }
        return nickels;
        }
    public int getNumberofDimes(){
        dimes = 0;
        for (int i = 0 ; i < pocket.size() ; i++){
            if ((pocket.get(i).getName()) == "Dime")
                dimes += 1;
            }
        return dimes;
        }
            
    public int getNumberofQuarters(){
        quarters = 0;
        for (int i = 0 ; i < pocket.size() ; i++){
            if ((pocket.get(i).getName()) == "Quarter")
                quarters += 1;
            }
        return quarters;
         
        }
        
    public String toString()
    {
        String myString = new String("");
        myString += (this.getNumberofPennies() + " Penny " + ".01\n");
        myString += (this.getNumberofNickels() + " Nickels " + ".05\n");
        myString += (this.getNumberofDimes() + " Dimes " + ".1\n");
        myString += (this.getNumberofQuarters() + " Quarters " + ".25\n");
        myString += ("Total $" + this.getTotal());
        return myString;
    }
}
//end of purse
