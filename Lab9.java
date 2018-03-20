/* Adam Martinez
   Co Sci
   Lab9
   This program will sum up a # that is between 0-1000
   
*/

import java.util.Scanner;

public class Lab9{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      int lastdigit;
      int middledigit;
      int firstdigit;
      int quotient;
      int num; 
      int sum;
    
    System.out.println("Enter a number between 0 and 1000");
      num= input.nextInt();
    
    
    
    lastdigit = num % 10;
    quotient = num / 10;
    middledigit = quotient % 10;
    firstdigit = quotient / 10;     
    sum = firstdigit + middledigit + lastdigit;
    
    System.out.println(" ");
    System.out.println("The sum of all digits is " + sum);
    System.out.println(" ");
    
    
}

}