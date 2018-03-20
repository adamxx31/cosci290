/* Adam Maritnez
  CoSci 290
  
   Topics:
   functions/methods - what all the different parts are
   -access modifier
   -return type
   -function name
   -parameters
*/
   
   public class TestFunctions{
     
    //entry point of application
    public static void main(String[] args){
    
    /*  
      access modifiers
      public - anything can see/access
      private - only functions within a class can access
      default- same thing as no written/declared modifiers
      
      Return types
     -int
     -double
     -string
     -char
     -boolean
     -also can return differnt objects types
     -void- doesnt return anything
     
      function names
      -follow the same rules as any identifier
      -use the name of the function to call it
      
      fucntion parameters 
      -input that the function uses inside somewhere 
      in the function body
      -seperate multiple parameters with commas
      
    */
      
      //testing function calld findSum()
      
      System.out.println("The sum of 2 and 3 is: " + findSum(2, 3));
      printHello("Adam");
      
    }
     
     public static int findSum(int num1, int num2){
      int sum = num1 + num2;
       return sum;
       
       
     }
     
     public static void printHello(String name){
       System.out.println("Hello " + name);
       
     }
   
   
   }