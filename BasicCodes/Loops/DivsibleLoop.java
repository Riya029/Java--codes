// move from 1 to n and print only those number which r divisible by  6 and 11

import java.util.Scanner;
public class DivsibleLoop {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("enter the value of n:");
         int n = in.nextInt();

         //print numbers which r divisble bby 6 and 11
        
        for(int i = 1; i <=n; i = i+1){
            if(i %6 == 0 || i % 11 == 0){
                System.out.println("number divisible by 11 or 6 is:" +i); 
            }
           
        }
        in.close();  
   }
   
}
