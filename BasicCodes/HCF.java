// program to find HCF of two numbers

import java.util.Scanner;
    public class HCF{
        public static int findHCF(int a, int b){
            while(b!= 0){                  
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter number 1:"); 
        int a = in.nextInt();
        
        System.out.println("enter number 2:");
        int b = in.nextInt();

        int hcf = findHCF(a, b);

        System.out.println("the hcf od "+a + "and" + b + "is:" + hcf);
    }
 }
