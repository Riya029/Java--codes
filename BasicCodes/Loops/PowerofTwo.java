// find that number is power of 2 or not
import  java.util.Scanner;
public class PowerofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        int power = n;
        if(n <= 0){
            System.out.println("not a power of 2 " + n);
        }
        else{
            while(n % 2 == 0){
                n = n / 2;
            }
            if (n == 1){
                System.out.println( power + " power of 2 " );
            }
            else {
                System.out.println(  power +  "not a power of 2 " );
            }
        }
    }
}
