// find the cube of the positive number 

import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int n = in.nextInt();

        // find
        int sum = 0;
        while(n > 0){
            int f = n % 10;
            sum = sum + f * f * f; 
            n = n / 10;

        }
        System.out.println("the cube of the number is :" + sum);
    }
}
