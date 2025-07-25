package problems;
// here take 2 input and perform the operations like + / - * on them

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a = in.nextInt();

        System.out.println("Enter the second value:");
        int b = in.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
         System.out.println(a % b);

    }
}
