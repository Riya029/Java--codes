import java.util.Scanner;
public class Nestedloop1{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();

        // nested loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println("Hello");
            }
        }
    }
}


