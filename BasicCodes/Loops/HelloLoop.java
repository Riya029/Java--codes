// print hello repetively

import java.util.Scanner;
public class HelloLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = in.nextInt();
        // apply loop
        for(int i = 1; i<=n ; i++){
            System.out.println("Hola");
        }
    }    
}
