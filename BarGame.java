import java.util.Scanner;

public class BarGame {
  public static void main(String[] args) {
    System.out.println("Here is your check");
    Scanner input = new Scanner (System.in);
    
    System.out.println("What is your total?");
    double check ;
    double tiptotal ;
    
    check=100.00 ;
    tiptotal = check * check * .25;
    //Display results
    System.out.println("Tiptotal for the drink Check " +
                      check + " is " + tiptotal);
        
   }
}