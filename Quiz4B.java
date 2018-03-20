/*  Adam Martinez
    Co Sci 290
    QuizB
    Problem2.19
    this program us usde to find the area of a triangle
    
*/
// To allow for user input
import java.util.Scanner;
//name of class
public class Quiz4B{
  //start of program:Main method
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
      System.out.println("Enter three points");
        Double Point1 = input.nextDouble();
        Double Point2 = input.nextDouble();
        Double Point3 = input.nextDouble();
        Double Area = Point1 + Point2 + Point3;
          
          
          
        System.out.println("The area of the triangel is " + Area);
  
  //Sina
    //This is what i have so far i know it is not quite right but i can figure this out just take me time to complete. 
    //I will have to hash out the math and how to write it out correctly. I can get you the area using the height and base of the 
    //triangle divided by 2. I can get the correct area but i need to do it the way the book wants it entered.
  }
  }