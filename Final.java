/* Adam Martinez
   Co Sci 290
   Date 5.29.18
   Assigment: Final
   Decscription: This program will generates 300 random integers between 0 and 14 and displays the count for each number.

                 This program will display the total counts for even numbers and Find the total counts for odd numbers 
*/


//name of Class is Final
public class Final{

//start of main method
public static void main(String[] args){
 //start of the array
  int[] counts = new int[15];
    int num = 0;
  
   //declaring the for loop
   for (int i = 0; i < 300; i++){
     num = (int)(Math.random() * 15) + 0;
     System.out.println(num);
     counts[num] = counts[num] + 1;
   }
  //this code will check to see if the number is even and divisible by 2
 int Even = counts[0];
     for (int i = 1; i < counts.length; i++) {
       if (counts[i] % 2 ==0) {
        Even = counts[i]; 
       }
     }//end of loop
       System.out.println(" ");
       System.out.println("Even =" + Even + ".");
 //this code will check for odd numbers 
  int Odd = counts[0];
    for (int i = 1; i < counts.length; i++) {
      if(counts[i] % 2 != 0) {
        Odd = counts[i];
      }
    }
  
   System.out.println(" Odd = " + Odd);
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     }
}
