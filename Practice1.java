/*  Adam Martinez
    Co Sci 290     
    Group 1
    Input: was 5 and 4
      Please enter in a whole number...
      5
      Please enter in another whole number...
      4
    
    
    
    Output:Lets do some basic math
          Here are the numnbers you chose.
          operand1: 5 and operand2: 
          9
          20
          1
          1
    
    
    this program takes into two different whole numbers and then executes 4 different math operations and displays them on the lines 32-25. 
    // allows for us enter comments to the two forward slashes tells program to not run this parts in the app. 
    ; indicates a line termination
    
*/

import java.util.Scanner;//allows for us to get user input late in the class

public class Practice1{ // this is declared a public class and the given the name Practice1

  
  public static void main(String[] args){
  //this is main method the begining of the app  
    
    Scanner input = new Scanner(System.in); //allows for the input from end user
    
    int operand1;// indicator for first  number requested
    int operand2;// indicator for the second number requested
    
    System.out.println("Please enter in a whole number..."); // line displays text question
    
    operand1 = input.nextInt();//this where first digit of end user is entered
    
    System.out.println("Please enter in another whole number...");//second text asking for operand2 digit
    
    operand2 = input.nextInt();// allows for the digit to be taken in here
    
    System.out.println("Lets do some basic math \n"           // displays text with the print ln
                       +"Here are the numnbers you chose.");  // + allows to continue the text to another line. used to keep nice and formatted.
    System.out.println("operand1: " + operand1 + " and operand2: " + operand2);
    System.out.println(operand1 + operand2);// line executes addition for the numbers enter by end user
    System.out.println(operand1 * operand2);//line executes mutliplication
    System.out.println(operand1 / operand2);//line executes division
    System.out.println(operand1 - operand2);//line executes subtration
      
      
      
  }//end of method block
}// end of class block ends program