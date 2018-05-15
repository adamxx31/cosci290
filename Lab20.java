/*
Adam Martinez
Co Sci 290
Lab20
Instructions:
Create an array of Strings with the size 5. Assign each index with five Strings of your choice. 
Use a for-loop to iterate through the loop and print each element. 
*/

  //name of class
public class Lab20{
  //start of program
public static void main(String[] args){
 
  String names[] = new String[5];
    
    names[0] = "Allen";
    names[1] = "Alice";
    names[2] = "Davie";
    names[3] = "Joann";
    names[4] = "Ellen";
  
  for (int i = 0; i < 5; i++){
  
  System.out.println(names[i] + " ");
}
  
  
  
  
  
  //End of main 
}
  //End of Class
}