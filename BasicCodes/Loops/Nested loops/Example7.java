//print pattern
// 55555
// 4444
// 333
// 22
// 1

package Practice;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n:");
        int n = in.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
