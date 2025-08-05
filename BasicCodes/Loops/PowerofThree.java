// check number is power of 3 or not

import java.util.Scanner;
public class PowerofThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = in.nextLong();

        int original = (int)n;
        // check power of 3 r = 9, 27, 81, .... so on
        while(n > 2){
            if(n % 3 == 0){
                n = n / 3;
            }
            else{
                break;
            }
        }
        if(n == 1){
            System.out.println(original + "is th epower of 3");
        }
        else{
            System.out.println( original + "number is not power of 3");
        }
    }
}
