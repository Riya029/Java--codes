// print the data and find the last digit of the number

import java.util.Scanner;
public class Findlastdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int n = in.nextInt();

        // find last digit
        while(n>0){
            int lastDigit = n%10; // find the last digit
            System.out.println(lastDigit);
            n = n/10; // remove the last digit
        }

    }
}
