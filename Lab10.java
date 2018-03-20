/* Adam Martinez
   Co Sci 290
   Lab 10: Problem 3.8
  Purpose: This program will prompt user to enter three integers and display the integers in ascending order. 
 */ 
//allows for user input to be used
import java.util.Scanner;
//name of class
public class Lab10 {
//main method start of program
  public static void main(String[] args){
 //this will allow the data to received 
    Scanner input = new Scanner(System.in);
    //the int being inserted to be used in the program
   
      
// this print line will prompt user to enter thew different integers.
      System.out.println("Enter three different integers");
       int number1 = input.nextInt();
       int number2 = input.nextInt();
       int number3 = input.nextInt();
    // if condtions to have integers display in lowest to highest numbers
      if(number1 > number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
      }
    if (number2 > number3) {
      int temp = number2;
        number2 = number3;
        number3 = temp;
    }
   if (number1 > number2) {
     int temp = number1;
     number1 = number2;
     number2 =temp; 
   }
    //last line will place the numbers you entered in the order designed.
      System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3);
  
  }
  }