import java.util.Scanner;

// 10  Write a program that reverses the digits of a given number.
public class Reverse {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n1  = scan.nextInt();



        int number = 0;
        while (n1 != 0){
            int res = n1 % 10 ;
            number = number * 10 + res;
            n1 /= 10;
        }
        System.out.println("The reverse number is "+ number );
        scan.close();
    }
}
