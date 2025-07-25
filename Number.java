//Program is to check whether a number is negative, positive or zero

package Java_Basic_Codes;
import java.util.Scanner;
public class Number{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        double a = obj.nextDouble();

        // apply conditional statements
        if(a > 0){
            System.out.println("Number is positive:" + a);
        }
        else if(a<0){
            System.out.println("Number is negative:" + a);
        }
        else{
            System.out.println("NUmber is zero" + a);
        }
    }
}