import java.util.Scanner;
public class PatternByFormula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int spaces = n - 1; // if n = 10 then spaces will be 9
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }
}
