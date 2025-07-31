// Print fibonacci series upto n terms 
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till where you want fibonacci series:");
        long n = in.nextLong();

        //print fibonacci series
        int n1 = 0;
        int n2 = 1;
      
        for(int i = 1; i <= n; i = i + 1){
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
