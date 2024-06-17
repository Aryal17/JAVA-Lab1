//  5  Implement a program that prints the multiplication table of a given number.


import java.util.Scanner;
public class MultiplicationTable {
    public static void main ( String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number");
        int n = scan.nextInt();
        System.out.println("Up to ");
        int j = scan.nextInt();

        for (int i = 1 ; i <=j ; i++){
            System.out.println(n +"X" + i +"="+  n *i);
        }
        scan.close();

    }
}
