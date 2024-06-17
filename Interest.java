import java.util.Scanner;
// 7  Create a program to calculate simple interest based on user input for principal amount, rate, and time.

public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the Principal Amount");
        int p = scan.nextInt();
        System.out.println("Enter the time");
        int t = scan.nextInt();
        System.out.println("Enter the rate");
        int r = scan.nextInt();


        int interest = (p * t * r) / 100;
        System.out.println("The interest is" + interest);
        scan.close();

    }
}

