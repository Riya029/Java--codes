// find sum of all odd numbers from 1 to n 

import java.util.Scanner;
public class OddSumloop {
    public static void main(String[] args) {
        Scanner in =  new Scanner( System.in);
        System.out.println("Enter th evalue of n:");
        int n = in.nextInt();
        int sum = 0;

        // for loop
        for(int i = 1; i <= n; i = i +2 ){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
    
}
