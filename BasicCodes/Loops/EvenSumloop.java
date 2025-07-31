// find sum of all even numbers between 1 to n

import java.util.Scanner;
public class EvenSumloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int sum = 0;

        // for loop
        for(int i = 2; i <= n; i = i + 2){
            if(i % 2 == 0){
                sum = sum + i;
            }
            
        }
        System.out.println("Sum of even numbers from 2 to " + n + "is" + sum );
    }
}
