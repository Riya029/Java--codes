// print odd number from 1 to n using loop

import java.util.Scanner;
public class Oddnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        // apply loop
        for(int i = 1; i <= n; i = i+1){
            System.out.println(i );
        }
    }
}
