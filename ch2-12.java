/* Adam Martine
   Co Sci 290
   HW3 2.12
   Purpose: Physics: finding runway lenght 
*/   


import java.util.Scanner;

//name of class
public class ch2-12 {
//main method to start off program
  public static void main(String[] args){
//to obtain input from user
    Scanner input = new Scanner (System.in);
//Prompt user to enter in the data we need to compute
    System.out.println("enter in velocity and acceleration");
      //will set the variables and data will be accepted from user
      double v = input.nextDouble();
      double a = input.nextDouble();
//the math is written out to do the calculations    
      double lenght = v * v / (2 * a);
//the last line will display message along with data        
        System.out.println("The minimum runway lengt required is " + lenght + " meters");

}
}