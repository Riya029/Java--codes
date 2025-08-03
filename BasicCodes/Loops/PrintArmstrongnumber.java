// program to find armstrong number btwn 1 to n
import java.util.Scanner;
public class PrintArmstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        // move feom 1 to n using for loop
        for(int i = 1; i <= n; i = i + 1){
            int originalnum = i;
            int temp = i;
            int count = 0;
            
            // count the numbers eg 153 ie 3 digits using while loop
            while(temp > 0){
                count = count + 1;
                temp = temp / 10;
            }

            // sum the number according to armstrong 
            temp = i;
            int sum = 0;

            while(temp > 0){
                int digit = temp % 10;
                int power = 1;
                for (int j = 1; j <= count; j = j + 1){
                    power =  power * digit ;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            // check it is armstrong or not
            if(sum == originalnum){
                System.out.println(i );
            } 

        }
        
    }
}
