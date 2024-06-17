// 3 Write a program that checks if a given number is odd or even.
import java.util.Scanner;
public class OddEven {
    public static void main( String[]  args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number");
        int n = scan.nextInt();


        if ( n % 2 ==0 ){
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is odd");
        }
        scan.close();

    }
}
