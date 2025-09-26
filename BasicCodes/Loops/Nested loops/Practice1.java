// enter the value of n: 
// 5
// -----------------------------------
// PRINT THW SERIES BELOW:-
// 12345
// 2345
// 345
// 45
// 5



import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = in.nextInt();

        // loop
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
