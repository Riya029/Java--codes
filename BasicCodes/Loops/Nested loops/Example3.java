//print pattern 
// 1
// 12
// 123
// 1234
// 12345
//----------------------------------------------------------------------------------------------------------
package Practice;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = in.nextInt();
        // int num = 1;
        // print pattern 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            // num++;
            System.out.println();
        }
    }
}
