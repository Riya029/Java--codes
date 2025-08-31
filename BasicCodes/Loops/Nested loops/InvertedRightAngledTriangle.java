// print ****
//       ***
//       **
  //     *

import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = obj.nextInt();

        // apply nested loops
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
