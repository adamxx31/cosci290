/* Adam Martinez
   Co Sci 290 
   
    Demo Topics on:
    -increment 
    
    
*/

public class DemoBoolean {

public static void main(String[] args){
  
  // line 17 and line 18 are equivalent
  int num = 1;
  num = num = 1; // increment num by 1
  num++; //post-increment
  
  num = 1;
    int count = ++num; // pre-increment, count 2, num 2
  System.out.println("count " + count + "num" + num);
  num = 1;
  count = num++; // post-increment, count 1, num 2
  System.out.println("count" + count + " num " + num);
  
  count = num--; // post-decrement
  count = --num; //pre-decrement
  
  //examples of augmented assignment operators
  num += 2; // euivalent to => num = num = 2;
  //num *= 2; // num = num * 2 ;
  //num / = 2; // num = num /2;
  num -= 2; // num = num - 2;
  
  num=2; 
  double num2 = 3.0 * count;
  System.out.println ("Double wins: " + num * num2);
  System.out.println ("Casting a double to int: " + (int) num2);  
  System.out.println ("Casting an int to a double" + (double) num);
  System.out.println ("Casting a char to an int" + (int) 'c');
  
  int numberofZombies = 3;
  if (numberofZombies < 5){
     System.out.println ("You might survive this apocalypse.");
  }
else {
  System.out.println("You might NOT survive this apocalypse.");
}
  //Generating a random number 
  //Math.pow(3 , 2); 3^2
 System.out.println (Math.random()); // random number between  0 and 1
  
  //minimum + Math.random() * maxium
  System.out.println(5 + (int)(Math.random() * (10-5)));
  
  int chanceOFSurviving = 1 + (int)(Math. random());
}
}