//print pattern
// 5
// 44
// 333
// 2222
// 11111
// ------------------------------------------------------------------------------------------------------

package Practice;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = in.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = i; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }

 

    }
}
