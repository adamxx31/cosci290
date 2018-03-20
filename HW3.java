/* Adam Martinez
   Co Sci 290
   Ch.2 (2-12)
   The purpose of this program is to calculate the savings of a entered amount at 5% for 6 months
*/

   import java.util.Scanner;
   
   public class HW3{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter in a monthly savings amount.");
      
      double S = input.nextDouble();
      double I = 0.00417 + 1;
      
      double Savings = S * 6 + I * 6;
      System.out.println("Here is your savings over six months " + Savings);
      
      
      
    
    
    }
    }
   