// Program to find LCM of two numbers

import java.util.Scanner;
public class LCM{

// calculat hcf by making function
public static int findHCF (int a, int b){
    while(b!=0){
        int temp = b;
        b =a % b;
        a = temp;
    }
    return a;
}
// calculate lcm
public static int findLCM(int a, int b){
    return(a * b)/ findHCF(a, b);
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number1:");
        int a = in.nextInt();
        
        System.out.println("enter number 2:");
        int b = in.nextInt();

        int lcm = findLCM(a, b);
        System.out.println("The lcm of 4" + a +"and" + b +  "is:" +lcm);
        

    }
}
