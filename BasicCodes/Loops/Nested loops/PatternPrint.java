//  print pattern 
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
import java.util.Scanner; 
public class PatternPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int spaces = 4;
        int star = 1;
        // print spaces
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");}

            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            
            }
            System.out.println();
            star++;
            spaces--;
        }
    }
}
