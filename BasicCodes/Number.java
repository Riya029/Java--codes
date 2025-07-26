// program to check whether a number is negative, positive or zero

import java.util.Scanner; 
public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write number:");
        int a = in.nextInt();

        // apply conditions
        if(a>0){
            System.out.println("Positive" + a);
        }
        else if(a<0){
            System.out.println("Negative" + a);        }
        else{
            System.out.println("number is zero" + a);
        }
    }
}
