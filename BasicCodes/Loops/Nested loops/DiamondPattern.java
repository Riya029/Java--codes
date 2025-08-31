import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter teh number:");
        int n = in.nextInt();

        // diamond pattern ----  upper half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j ++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  diamond ----- lower half
        for(int i = n-1; i >= 1; i--){
            // print spaces
            for(int j = 1 ; j <= n-i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
    }
}

