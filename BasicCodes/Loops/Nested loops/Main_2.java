// Enter n: 10
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
----------------------------------------------
import java.util.Scanner; 
public class Main_2 {
	public static void main(String[] args) {
		// write your code here
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();
		// first upper portion
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			// lower half
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}

