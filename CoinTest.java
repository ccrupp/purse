import java.util.Scanner;
import java.util.ArrayList;
public class CoinTest
{
    public static void displaymenu (){
        System.out.println("------------------------------------");
        System.out.println("Please Select an option (e to end)");
        System.out.println("a - Add a Coin");
        System.out.println("r - Remove a Coin");
        System.out.println("d - Display purse");
    }
    public static void main (String[] args)
    {
        String choice = new String("");
        Scanner scanner = new Scanner(System.in);
        Purse purse = new Purse(new Coin('q')); 
        purse.addCoin(new Coin('q'));
        purse.addCoin(new Coin('q'));
        purse.addCoin(new Coin('q'));
        purse.addCoin(new Coin('q'));
        int flag = 0;
        while (flag == 0){
            displaymenu();
            choice = scanner.nextLine();
            
            
            if (choice.equals("a")){
                System.out.println("What type of coin would you like to add? p - Penny, n – Nickel , d - Dime, q - Quarter");
                String cointype = new String(scanner.nextLine());
                if (cointype.equals("p"))
                    purse.addCoin(new Coin('p'));
                if (cointype.equals("n"))
                    purse.addCoin(new Coin('n'));
                if (cointype.equals("d"))
                    purse.addCoin(new Coin('d'));
                if (cointype.equals("q"))
                    purse.addCoin(new Coin('q'));
                }
                
            if (choice.equals("r")){
                System.out.println("What type of coin would you like to remove? p - Penny, n – Nickel , d - Dime, q - Quarter");
                char cointype = scanner.next().charAt(0);
                for (int i = 0 ; i < purse.size() ; i++){
                    if ((purse.get(i).getType()) == cointype){
                        purse.removeCoin(i);
                        System.out.println("Coin: " +purse.get(i).getName() + " removed.");
                        break;}
           
            
                    }
                }
            if (choice.equals("d")){
                System.out.println(purse);  
                /*
                System.out.println(purse.getNumberofPennies() +" Pennies " + ".01");
                System.out.println(purse.getNumberofNickels() + " Nickels " + ".05");
                System.out.println(purse.getNumberofDimes() + " Dimes " + ".1");
                System.out.println(purse.getNumberofQuarters() + " Quarters " + ".25");
                */
            }
            if (choice.equals("e"))
                break;
                
            
            }
        System.out.println("Thank You!");
                       
                 
                        
                
        }
    }
            
            
            
            
            
            
            
                
                
                
                
                
                
                
                