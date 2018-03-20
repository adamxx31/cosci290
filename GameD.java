/*Adam Martinez
  Co Sci 290
  HW#1

*/

//This scanner is to get user info
import java.util.Scanner;

//my class is public and is given the title to the app
  


public class GameD{
//This is the start    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int ageOfDriver = 0;
      

      
      System.out.println ("Welcome to ...");
      
      System.out.println
      ("    ________                           ________          .__                                \n"
      +"   /  _____/_____ _____   ____        \\______  \\_______|__|__    __ ___________           \n"
      +"  /   \\  ___\\__   \\  /     \\_/ __\\ |      | \\_  __\\    \\  \\/ //  __\\_  __ \\      \n"
      +"  \\    \\_\\  \\/ __\\|  Y Y  \\  ___/ |      `  \\  | \\/   |\\   /\\  ___/|  | \\/       \n"
      +"   \\______  (____  /__|_| /\\    ___  >  _______  /__|   |__ | \\_/  \\___  >__|           \n"
      +"          \\/    \\/          \\/   \\/         \\/                        \\/              \n");
                                                                                           
      
      System.out.println("How old are you driver?");
      ageOfDriver = input.nextInt();
      System.out.println("Wow! " +  ageOfDriver + " you are young.");
      
      System.out.println("You not old enough to Drive, Sorry");
      
      System.out.println("I'll just drive. Get in the passenger seat.");
      System.out.println("Do you want go North or South?");
     
      String direction = input.next();
      
      if(direction.equals("North")){
        System.out.println("You're heading North!");
        
       
          System.out.println( "     ________                           ________                     \n"
                             +"    /  _____/  _____     _____    ____ \\_____  \\___  __ ___________ \n"
                             +"   /   \\  ___\\__  \\  /     \\_/ __\\ /   |    \\ \\/  / __\\_  __\\\n"
                             +"   \\    \\_\\  \\/ __\\|  Y Y  \\  ___//    |     \\   /\\ ___/|  |\\/\n"
                             +"    \\______  (____  /__|_|  /   \\___  >_______  / \\_/  \\___  >__|   \n"
                             +"            \\/   \\/         \\/              \\/       \\/  \\/           \n");          

                           
                           
                           
                           
                           
                           
                           
                           
            
        
        
        
        
        
  
          
       }
       
    }   
 }