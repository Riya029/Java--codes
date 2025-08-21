// print pyramid pattern
//   *
//  ***
// *****


import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        
        // print spaces 
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            // move to the next line
            System.out.println();
        }
    }
}
