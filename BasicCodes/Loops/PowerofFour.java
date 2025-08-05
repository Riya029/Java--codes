// checkpower of 4 or not
import java.util.Scanner;
public class PowerofFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();

        //
        
        while(n > 1){
            if(n % 4== 0){
                n = n / 4;
            }
            else{
                break;
            }
        }System.out.println(n + "is power of 4");
    }
}
