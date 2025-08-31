// print floyd's triangle using loops

import java.util.Scanner;
public class FloydTraingle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = in.nextInt();
        int num = 1;

        // floyd's triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
