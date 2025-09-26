// enter n value: 
// 5
// take input and then print the loop which is present below
//---------------------------------------------------
// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1



import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n value: ");
        int n = in.nextInt();

        // loop apply
        // upper loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // lower loop
        for(int i = n-1; i >= 1; i--){
            for( int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
