// program to check whether a number is even or odd

import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int a = in.nextInt();

        // check even or odd
        if(a %2 ==0){
            System.out.println("number is even \n" +a);
        }
        else{
            System.out.println("Number is odd\n" + a);
        }
}
}