// 4  Create a program that determines whether a given number is positive, negative, or zero.
import java.util.Scanner;

public class PositiveNegative {
    public static void main ( String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number");
        int n = scan.nextInt();

        if (n > 0){
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is Zero");
        }

        scan.close();

    }
}
