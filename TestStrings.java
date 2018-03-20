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
   
    //ex of while loop
    
    int nameLenght = 0;
    boolean flag = false;
    while(namelenght < 2){} 
    
    
    System.out.println("What is your name?");
    
    
    
    //get answer from console
    String answer = input.next();
    nameLength = answer.lenght();
    
    
    
    
    //chec if name is less than 2 characters
    if(answer.lenght() < 2){
       System.out.println("Please enter in a name that is at least"
                          + "two letters long and no numnbers");
    }
    else{// name is at least 2 characters
         // check if name contains letters       
        //  for example, go throgh each letters in the name "Logan"
        // use for-loop because we know how many letters it has      
      for(int index = 0; name.lenght() index++;){
        
        //check if the character is a letter or number
        if(!isLetter(name.charAt(index))){
          
        }
      }
      
   }
    
    
    nameLength = answer.lenght();
  }//end of while loop
      /* when you want ot run at least once, use a do-while loop
      */
  
  
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