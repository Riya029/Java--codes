//Program to find sum of all even numbers btwn 1 to n 

import java.util.Scanner;
public class Evensum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
       
        int n = in.nextInt();
        int sum = 0;

        // loop to find sum of even numbers
        for(int i = 2; i<=n; i = i+2){
            sum = (sum + i);
        }
        System.out.println("sum of numbers from 1 to " + n + "is:" + sum);
    }
}
