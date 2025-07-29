// print the sum of the positive numbers

import java.util.Scanner;
public class CountSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        // in digits we use while loop
        int sum = 0;
        while(n > 0 ){
            int f = n % 10;
            sum = sum + f;
            n = n / 10;
        }
         System.out.println("Sum is : " + sum);
    }
}
