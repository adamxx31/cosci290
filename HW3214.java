/* Adam Martinez
  CO Sci 290 
  HW3 CH 2.14 
  Purpose: to compute BMI 
  */
  
  
  import java.util.Scanner;
  
  public class HW3214{
  
    public static void main(String[] args){
  
      Scanner input = new Scanner(System.in);
      //prompt user for weight
      System.out.println(" Enter your weight ");
      //will take the weight entered by user
      double weight = input.nextDouble();
      //takes weight in pounds and converts to kilos
      double Kilo = weight * 0.45359237;
      
      //prompt user to enter height
      System.out.println( "Enter in your height");
      
      //takes height from user
      double height = input.nextDouble();
      //will take height and convert to meters
      double Meters = height * 0.0254;
      
     // will calculate the final BMI 
      double BMI = Kilo / (Meters * Meters);
      //Displays the BMI calculation
      System.out.println("Your BMI is " + BMI );
  //end of program
  }
  }