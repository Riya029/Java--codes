// print pattern
// enter n: 5
// 1
// 21
// 321
// 4321
// 54321
// 654321

package Practice;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = in.nextInt();
        // print pattern 
        for(int i = 0; i <= n; i++){
            for(int j = i+1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
