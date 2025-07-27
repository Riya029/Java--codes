// print odd numbers from 1 to n 

import java.util.Scanner;
public class Oddnumberprint {
    public static void main(String[] args) {
    Scanner in = new Scanner( System.in);
    System.out.println("Enter the value of n: ");
    int n = in.nextInt();
    // int c = in.nextInt();
    
    for( int i = 1; i <=n; i = i+2){
        System.out.println(i);
    }
    }    
}
