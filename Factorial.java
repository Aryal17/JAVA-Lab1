import java.util.Scanner;
// 6  Write a program to calculate the factorial of a given number using a loop.
public class Factorial {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = scan.nextInt();

        int fact = 1;

        for (int i = 1; i <= a ; i++) {
         fact = fact * i;
        }
            System.out.println("Factorial of " + a + " is " + fact);
            scan.close();
    }
}
