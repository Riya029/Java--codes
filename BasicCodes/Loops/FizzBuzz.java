// print "fizzbuzz " if i is divisible ny 3 and 5
//print "fizz " if i is divisible by 3
// print "buzz" if i is divisible by 5

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = in.nextInt();

        // print 
        for(int i = 1; i <= n; i = i+1){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

}
