//print pattern
//  enter n: 5
// *****
//  *****
//   *****
//    *****
//     *****
// ---------------------------------------------------------------------------------------------------------
package Practice;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        // print pattern
        int spaces = 0;
        int star = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=spaces; j++){
                // spaces print
                System.out.print(" ");
            }
            for(int j = 1; j <= star; j++){
                // stars print 
                System.out.print("*");
            }
            // star--;
            spaces++;
            System.out.println();
        }
    }
}
