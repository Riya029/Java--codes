// count the number of digits of a positive number

import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        
        //
        int count = 0;
        while( n > 0 ){
             n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
