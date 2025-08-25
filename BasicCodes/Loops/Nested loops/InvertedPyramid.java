import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();

        // inverted pyramid
        for(int i = n; i >= 1; i++){
            // print spaces
            for(int j = n ; j <= n-i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
