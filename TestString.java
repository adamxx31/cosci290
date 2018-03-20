/* 
  Adam Martinez
  Co Sci 290

Demo on String 
*/

import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args){

    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);

    //ask user a questtion
    System.out.println("Are you rich? Yes or No");
        
    //get answer from console
    String answer = input.next();
    //check if answer is specifically Yes or No
    
    /*
      Example below is to test for specific response
      answer.toLowerCase() - makes all letters lowercase
      answer.toUpperCase() - makes all letters uppercase
      answer equals("some other string")- checks if two Strings are
      
      */
                       
    if(answer.equals("no")){ // "no" != "No"
       System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }

  }

}