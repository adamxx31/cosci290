




import java.util.Scanner;

public class Homework3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter in a monthly savings amount");
double S = input.nextDouble();
double I = 0.00417 + 1;

double MonthSavings = S * 6 + I * 6;

System.out.println("Your 6 months total savings will be " + MonthSavings);


}

}