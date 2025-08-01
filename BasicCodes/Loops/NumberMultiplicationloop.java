// take number from user and the print the number multiplication eg 1234 = 24
import java.util.Scanner;
public class NumberMultiplicationloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        long n= in.nextLong();

        // use while loop when we deal with digits
        long sum = 1;
        while(n > 0){
            long digitsum = n % 10;
            sum = sum * digitsum;
            n = n / 10;

        } 
        System.out.println(sum);
    }
}
