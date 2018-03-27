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
      double I = 0.00417 + 1 ;
      
      double one = S * I; 
      double two = S + one *  I;
      double three = S + two *  I;
      double four = S + three *  I;
      double five = S + four * I;
      double six = S + five * I;
      
    
 //println will display the answer for the data entered.
      System.out.println("Here is your savings over six months " + six);
      
      
      
    
    
    }
    }
   