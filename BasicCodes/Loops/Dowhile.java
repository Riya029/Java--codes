// implementation of do-while loop
import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = in.nextInt();

        //do-while loop use
        int i = 1;
        do{
            System.out.println("Hola");
            i = i + 1;
        }while(i <= n);
    }
}
