// find greatest common divisor of thr numbers
// eg 21, 28 ----> gcd is 7

import java.util.Scanner;
public class GreatestCommondivisor  {
         public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the n1:");
        int a = in.nextInt();
        System.out.println("Enter the n 2:");
        int b = in.nextInt();
        int minimum = 0;
         
        if( a < b ){
            minimum =  minimum + a;
        }
        else{
             minimum = minimum + b;
        }
        for(int i = 1; i <= minimum; i++){
            if( a % i == 0 && b % i == 0){
                System.out.println(i);
            }
        }
    
    
    }

}

