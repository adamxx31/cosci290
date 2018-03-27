/* Adam Martinez
   Co Sci 290 
   Midterm
   
   The purpose of this program is to get five digit integer.
   We then take that five digit number and run through this program
   to determine if it is palindrome or not. 
   The examples of five digit palindrome numbers you can add are
   00100
   10001
   11011
   00000
   
   
*/

import java.util.Scanner;
//name of class
public class Lab11Midterm{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    //identifying all every digit individually 
    int palin;
    int ldigit; 
    int fdigit; 
    int quote;
    int mdigit;
    int secdigit;
    //prompt user for a five digit number
    System.out.println("Enter in a five digit number");
      palin = input.nextInt();
    
    ldigit = palin % 5;
    secdigit = ldigit;
    fdigit = ldigit;  
    
    // there are many different variations i can enter to get the program running to include short cuts.
    //I know this if the 1st digit is = to the 2nd , the 4th and the 5th it is pallinddrome
    //Also if 1st digit and last digit are same and 2nd digit and the fourth digit also equal one another you have
    //Palindrome numnber
    //The first and last digit can match and the inner three digit must all remain the same.
    //Also a five digit number all the dame digit will give you a palindrom
    //conditions to find out if number is palindrome
    //
    if(fdigit == ldigit && secdigit == ldigit){
      System.out.println("the number " + palin + " is palindrome");
    }   // you will get one of two answers for your digit 
    else 
      System.out.println("the number " + palin + " is not palindrome");
  
 
  }

}