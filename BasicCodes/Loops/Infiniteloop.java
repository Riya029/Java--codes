// print the even numbers from 1 to n using a loop but without doing initialisation / condition / updation in the loop

import java.util.Scanner;
public class Infiniteloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        
        long i = 2;

        for(  ;  ;  )// this is infinite loop 
        {
            System.out.println(i);
            i = i + 2;
            if(i > n){
                break;
            }
               
        }
    }
}
