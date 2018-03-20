/* Adam Martinez
   Co Sci 290
   Lab7
Creating a string of questions and inputs from the user.   
*/
//import scanner is inserted to get user input
import java.util.Scanner;

//name of class given
public class Lab7Group1{

  //start of the program
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    
    
    
    
    
    //the start of output questions
      System.out.println("Welcome are you ready to play");
      //this where the end user will enter their answer
    input.next();
   
      System.out.println("Ok! lets start");
      System.out.println("Im going to start driving down the road. Tell me when to stop");
    
      input.next();                 
    
      System.out.println("ok looks like you know where we are");      
      System.out.println("Grab your gear we got to move on foot");
        
      System.out.println("which way do you want to go?");
      
      input.next();
    
      System.out.println("Are you sure this is the right way");
      input.next();
    
      System.out.println("Just dont get us...");
      
      System.out.println(".____   ________    ____________________ \n"
                        +"|    |  \\_____ \\  /   _____/\\__   ___/ \n"
                        +"|    |    /   |  \\\\_____ \\    |   |    \n" 
                        +"|    |___/    |   \\/      \\   |   |    \n"
                        +"|_______\\_______  /_______  / |___|    \n"
                        +"       \\/      \\/       \\/             \n");
                           
 }
  }
