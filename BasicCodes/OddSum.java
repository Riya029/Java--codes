// Program to find sum of all odd numbers btwn 1 to n

import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n:");
        
        int n = in.nextInt();
        int sum = 0;

        // apply loop
        for(int i = 1; i<=n ; i=i+2){
            sum = (sum + i);
        }
        System.out.println("the sum of odd numbers from 1 to"+ n +"is:" + sum);
    }
    
}
