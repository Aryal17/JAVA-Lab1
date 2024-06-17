// 2  Create a program that swaps the values of two variables without using a third variable.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second numbers");
        int num2 = scan.nextInt();


        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("number1  is  " + num1 + "\n" +
                "and number2 is " + num2 );
                
                scan.close();


    }
}
