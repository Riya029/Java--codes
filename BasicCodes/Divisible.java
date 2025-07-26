// Program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = in.nextInt();

        // check
        if(a % 5==0 && a %11==0){
            System.out.println("number is divisible by 5 and 11 \n" +a);
        }
        else{
            System.out.println("Number is not divisible \n" + a);
        }
    }    
}
