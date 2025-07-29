// print numbers and their sum at every iteration

import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();

       
        for(int i = 1; i <= n; i = i + 1){
            
            // for every i we have to calculate sum of digits
            int copyofI = i;
            int sum = 0;
            while(copyofI > 0 ){
                int lastDigit  = copyofI % 10;
                sum =  sum + lastDigit;
                copyofI = copyofI / 10;
            }
            System.out.println(i + "-->" + sum);
        }
        
    }
}
