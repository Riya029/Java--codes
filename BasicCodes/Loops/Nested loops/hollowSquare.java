//  MAKE PATTERN WHICH IS HOLLOW SQUARE
// *****
// *   *
// *   *
// *   *
// *****

import java.util.Scanner;
public class hollowSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of rows i.e. n:");
        int n = in.nextInt();

        // make hollow sqaure pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }
    }
}
