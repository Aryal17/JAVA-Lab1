/*  12.	Pattern Printing: Implement a program that prints a
simple pattern (e.g., a triangle, square) using nested loops.*/

public class Pattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
       
        
    }
}