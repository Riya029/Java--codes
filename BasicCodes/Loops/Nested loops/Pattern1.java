import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = obj.nextInt();
        

        // pattern print
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n-1; j++){
                System.out.print("*");
            }
            System.out.println(); // used to change the line
        }
        
    }
}
