// check number is armstong or not

import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        // check number is armstrong or not
        int lm = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }
        if(sum == lm){
            System.out.println("this is a armstrong number" + lm);
        }
        else{
            System.out.println("Not a armstrong number");
        }
        
    }
}
