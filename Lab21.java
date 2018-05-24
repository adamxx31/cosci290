/* Adam Martinez
   Co Sci 290
   5/17/18
   Description: 7.7
   This program will count single digits. The program will
   generate 10-0 random numbers between 0 and 9 and displays count for each number. 
   
*/


public class Lab21{

public static void main(String[] args){
  
 //declare an array of integers
    int[] counts = new int[10];
    int num = 0;
  
   //declaring the for loop
   for (int i = 0; i < 100; i++){
     num = (int)(Math.random() * 10) + 0;
     System.out.println(num);
     counts[num] = counts[num] + 1;
   }
  //this line will count how many times each int is randomly displayed every 
   for (int i = 0; i < 10; i++){
  System.out.print(counts[i] + " ");
}
  
}
  
}