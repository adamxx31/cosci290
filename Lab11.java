/* Adam Martinez
   Co Sci 290 
   Lab11 Ch3.12 problem
   
   The purpose of this program is to get a three digit integer.
   We then take that three digit number and run through this program
   to determine if it is palindrome or not. 
   
*/

import java.util.Scanner;

public class Lab11{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    //identifying all every digit individually 
    int palin;
    int ldigit; 
    int fdigit; 
    int quote;
    int mdigit; 
    //prompt user for a three digit number
    System.out.println("Enter in a three digit number");
      palin = input.nextInt();
    
    ldigit = palin % 10;
    quote = palin /10;
    mdigit= quote % 10;
    fdigit = quote /10;
    
    //conditions to find out if number is palindrome
    if(fdigit == ldigit){
      System.out.println("the number " + palin + " is palindrome");
    }   // you will get one of two answers for your digit 
    else 
      System.out.println("the number " + palin + " is not palindrome");
  
 
  }

}