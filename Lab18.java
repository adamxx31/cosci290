/* Author: Adam Martinez
   Lab 18: Problem 5.10 and 5.16
   Date: 5/2/18
   Description: Running loop to display numbers divisible by 5 & 6
*/   

//name of class
public class Lab18{
//start of program
public static void main(String[] args){
int counter = 0;// counter
     //conditions for to perform
     for(int i = 100; i <= 1000;i+=10){ 
       
       if(i % 5 == 0 || i % 6 == 0){
        counter++;
        System.out.print(i + " ");
       }
       
       if(counter % 10 == 0){
         System.out.println();
       }
     }
  
  System.out.println("");
  System.out.println("");  
    
  //start of probem 5.16
  java.util.Scanner input = new java.util.Scanner(System.in);
  
  System.out.println("Enter in a integer");
  int number = input.nextInt();
  
  System.out.print("The factors for " + number + " is ");
  int factor = 2;

}
}//end of class