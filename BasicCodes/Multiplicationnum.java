// print the multiplication table of the given input

import java.util.Scanner;
public class Multiplicationnum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();

        // print table using loop
        for(int i = 1; i <= 10; i=i+1){
            System.out.println( n + " * " + i +" = " + n * i);
        }
    }
}
