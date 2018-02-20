/* Adam Martinez
   Co Sci 290
   Date 2/20/18

Topics;
  -mutli-way if -else
  -logical operators
  -Symbolic logic

*/

import java.util.Scanner;
public class TestLogic{

  //entry point of application
  public static void main(String[] args){
  
    //setting up Scanner for user input
    Scanner input= new Scanner(System.in);
  
    
   System.out.println("Enter in a grade: ");
   
    int grade = 90;
    
    //simple if 
    if(grade >= 90)
      System.out.println("A");
  
    
    //if two-way if-else
    if(grade < 90){
      System.out.println("grade is not an A");
    }  
     else{
       System.out.println("grade is an A");
        }
       
                          
 // multi if-else if-else                         
    else if (grade >= 80){
      System.out.println("B");
   } 
        else if(grade >= 70){
          System.out.println("C");
        }
      else{
        System.out.println("F");
      }
       /*logical operators 
        ! - NOT
        != - NOT Equal to
        
    
    
    */
    
    //using if-else, write code that checks whether 
    //a student grade is good, or averagae, or bad
    if(grade >= 80){
      System.out.println("That is a good grade.");
    }
    //nested-if
    if(grade >= 90){
      System.out.println("Wow, you got an A!");
    }
    
    
    else if (grade < 80 && grade >= 70){
      System.out.println("This grade is average.");
    }
    else{
      System.out.println("This is a bad grade");
      
    }
    
    
    
    
    
    
      }
}