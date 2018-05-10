/* Adam Martinez
   Co Sci 290
   5/10/18
   This app will allow for usere to enter a name. The program will then scan the 
   name for vowels. The program will then count how many vowels are present in the 
   name.
*/
//This import will allow for user to input data
import java.util.Scanner;

//App will be public and is given a name
public class Quiz5 {

//Start of the program
    public static void main(String[] args){
//This wll get the user input
    Scanner reader = new Scanner (System.in);
    
//This will print out the prompt for user to enter their name.    
    System.out.println("Please enter your name");
    
      String input = reader.nextLine();
      char[] letters = input.toCharArray();
      
      //this will count the number of vowels
      int count = 0;
      
      //for loop will check for the following vowels
      for(char c : letters) {
        switch (c){
          case 'A':
          case 'a':
          case 'E':
          case 'e':
          case 'I':  
          case 'i':
          case 'O':
          case 'o':
          case 'U':  
          case 'u':
            count++;
            break;
              default:
            
        }
        
        
      }
//End of Loop
      
//This line will print out your name entered with a count of vowels.    
      System.out.println("Your name " + input +  " has " + count + " vowels");






}
}