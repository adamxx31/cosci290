/* Adam Martinez
   Co Sci 290 
   */
// This rpg is a dialogue of bartender(the computer program) and Customer (end user/player)
   import java.util.Scanner;

   public class ServeMe {
     Scanner input = new Scanner(System.in); //used for user input
      
     String customersDrink;
     String Enjoy;
     
     public static void main (String[] args) {
     //intro
     System.out.println("Hello.What can I get you?");
     //prompt the user to enter a response
      customersDrink= input.nextLine();
      System.out.println("Here is your + customersDrink");
        Enjoy = input.next();
     if (Enjoy.equals( "beer")){
       customerDrink = input.next();
       System.out.println("Enjoy your: " + customerDrink + ".");
       
     }
     
     
     
   }
   }