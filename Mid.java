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
public class Mid{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    //identifying all every digit individually 
    //palin the number enter
    int palin;
    int ldigit; 
    int fdigit; 
    int quote;
    int mdigit;
    int secdigit;
    int fourth;
    //prompt user for a five digit number
    System.out.println("Enter in a five digit number");
      palin = input.nextInt();
   
    ldigit = palin % 10; //get the remainder - which is the last digit
    palin = palin / 10; //cut off the last digit
    
   
    fourth = palin % 10; //get the remainder - which is the last digit
    palin = palin / 10; //cut off the last digit
    
    mdigit = palin % 10; //get the remainder- which is fourth
    palin = palin / 10; //cut off the last digit
    
    secdigit = palin % 10; //get the remainder- which is third digit
    palin = palin /10;  // 
    
    fdigit =palin % 10;
    palin = palin / 10;
    
    
    if(fdigit == ldigit && secdigit == fourth){
      System.out.println("the number is palindrome");
    }   // you will get one of two answers for your digit 
    else 
      System.out.println("the number  is not palindrome");
  
 
  }

}