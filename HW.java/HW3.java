/* Adam Martinez
   Co Sci 290
   Ch.2 (2-13)
   The purpose of this program is to calculate the savings of a entered amount at 5% for 6 months
*/
//import the Scanner to be used in program
   import java.util.Scanner;
 //name of class  
   public class HW3{
//start of the main method     
    public static void main(String[] args){
//      
      Scanner input = new Scanner(System.in);
//will display a message to the user      
      System.out.println("Please enter in a monthly savings amount.");
//declaring all variables and there fixed data      
      double S = input.nextDouble();
      double I = 1 + 0.00417;
      
      int one = S * I;
      int two = S + one * I; 
      int three = S + two * I;  
      int four = S + three * I;
      int five = S + four * I;
      int six = S + five * I;
      
     int total = one + two + three + four + five + six; 
       
       
 //println will display the answer for the data entered.
      System.out.println(" Here is your savings over six months " + total);
      
      
      
    
    
    }
    }
   