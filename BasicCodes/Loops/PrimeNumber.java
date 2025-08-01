// find number is prime or not
import java.util.Scanner;
public class PrimeNumber {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        // check
        if (n <= 1){
            System.out.println("not prime");
        }
        else{
            int i = 2;
            while(i < n ){
                if(n % i == 0){
                    System.out.println(n + "not prime number");
                }
                i = i + 1;
            }
            System.out.println(n + " prime number");
        }
    }
}
