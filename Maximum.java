//Write a program that finds and prints the maximum of three numbers.
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter First Number");
        int a = scan.nextInt();
        System.out.println("Enter the Second Number");
        int b = scan.nextInt();
        System.out.println("Enter the Third Number");
        int c = scan.nextInt();



        if ( a > b && a > c){
            System.out.println("a is greatest" );
        } else if (b > a && b > c) {
            System.out.println("b is greatest" );

        }else if (c > a && c > b){
            System.out.println("c is greatest" );
        }else {
            System.out.println("All  same");
        }
        scan.close();

    }
}
