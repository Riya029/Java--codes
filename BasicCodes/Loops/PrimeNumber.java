// find prime factors of the number entered by the user eg: 60 = 2*2*3*5
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        long n = in.nextInt();

        // find
        System.out.println("The prime factors are:");
        int i = 2;
        while(n > 1){
            if(n % i == 0){
                 System.out.println(i);
                n = n / i;  
            }
            else{
                i = i + 1; 
            }
           

        }
        in.close();
    }
}