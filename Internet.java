import java.util.Scanner;

public class Internet{
  public static void main(String[] args){
  
  System.out.println("Enter in a digit beteween 0 and 1000");
  Scanner input = new Scanner(System.in);
      number = input.nextInt();
    int number = 333;
    int sum = 0;
    int num = number;
    while (num > 0) {
        int lastDigit = num % 10;
        sum += lastDigit;
        num /= 10;
  

    
 
  }
System.out.println("Sum of digits : "+sum);
  }
}
