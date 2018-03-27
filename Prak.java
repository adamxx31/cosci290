//this is practice 


import java.util.Scanner;

public class Prak{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter in a number greater than 25");
      double On = input.nextDouble();
    
      if(On > 25){
          System.out.println("the number is greater");
      }
      else {
        System.out.println("your number less than 25");
      }   
    }
  }