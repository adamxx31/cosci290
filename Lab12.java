/* Adam Martinez
   Co Sci 290
   Lab 12
  This code will allow for the analyzation of a whole number. 
	User will be prompted to enter in a number
	The number will be scanned by the code to determine 
	if it is odd or even

*/
import java.util.Scanner;
// this will allow for user import
public class Lab12{
//Name of Lab
	public static void main(String[] args){
//start of the program ( known as Main Method)
		
		Scanner input = new Scanner (System.in);
		//placing the scanner inside the program to accept input from the user
		
    int Chknum;
    //defining what type of input will be placed in the program and giving it a name
			
		System.out.println("This program will check if a number"
		                  +"  is even or odd...                ");
		//will output the instructions 
		System.out.println("Please enter in a whole number...");
			//another set of instructions will be 
		
		 Chknum = input.nextInt();
		//will allow the number obtaine to be placed below for the answer
		if(Chknum % 2 == 0){
		//this is statment with a given instruvction to execute the correct command based on the parameters
			
			System.out.println("The number " + Chknum + " is even...");
		// if it is even it will disply a even number
		}
		else
			System.out.println("The number"+ Chknum + " is odd...");
		//if the number the user entered is not even it will display text
		
	
}
}