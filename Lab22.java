/* Adam Martinez
   Co Sci 208 
   Lab#22
   Description: This will program will be an array of 15 numbers that will print out the numbers 15 random numbers from 0 to 14.
                The count of each numbers will be analyzed for max min and average
*/

//name of class
public class Lab22{
//start of main method
public static void main(String[] args){
 //start of the array
  int[] counts = new int[15];
    int num = 0;
  
   //declaring the for loop
   for (int i = 0; i < 200; i++){
     num = (int)(Math.random() * 14) + 0;
     System.out.println(num);
     counts[num] = counts[num] + 1;
   }
  //this line will count how many times each int is randomly displayed every 
   for (int i = 0; i < 15; i++){
  System.out.print(counts[i] + " ");
   }
  //this is a loop to find the max number for the counts
    int max = counts[0];
     for (int i = 1; i < counts.length; i++) {
       if (counts[i] > max) {
        max = counts[i]; 
       }
     }//end of loop
       System.out.println(" ");
       System.out.println("MAX NUMBER =" + max + ".");
     
      max = counts[0];
     int indexOfMax = 0;
     for (int i = 1; i < counts.length; i++){
       if(counts[i] > max) {
         max = counts[i];
         indexOfMax = i;
       }
     }//end of loop
  System.out.println("MIN NUMBER =" + indexOfMax);
  
}
}
