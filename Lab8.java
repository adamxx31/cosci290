/* Adam Martinez
   Co Sci 290
   Lab8
   3/13/18
   
*/   
//to allow for user input
import java.util.Scanner;

//name of my class and Lab
public class Lab8 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    
    //Will intiate a respsonse from the user
   System.out.println("Enter in a Celsius temperature");
    double Celsius = input.nextDouble();  
    //allos for user to input a number
    double Fahrenheit = 9.0 / 5 * Celsius + 32;
// this is the formula to convert celsius to Fahrenheit
   
    System.out.println("43.5 Celsius is now "  + Fahrenheit +  " Fahrenheit");
    //here is the final answer converted to Fahrenheit
  }
}