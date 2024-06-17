// 9  Implement a program that checks if a given number is prime.


import java.util.Scanner;
public class Prime {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n1  = scan.nextInt();


        boolean prime = false;

        for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0 ){
                prime= true;
            }
        }


        if (prime  ) {

            System.out.println("The number is  prime" );
        }
        else {
            System.out.println("THe number is not prime");
        }
        scan.close();
    }
}
