//take input of numbera and find their average and percentage

import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the inputs:");
        float a = in.nextFloat();
        System.out.println("Enter the inputs:");
        float b = in.nextFloat();
        System.out.println("Enter the inputs:");
        float c = in.nextFloat();
        System.out.println("Enter the inputs:");
        float d = in.nextFloat();

        System.out.println("Enter the inputs:");
        float e = in.nextFloat();
        
        float sum = (a + b + c + d + e);

        float avg = sum / 5; 

        float per = (sum / 500) * 100;

        System.out.println("Total is :" +sum);
        System.out.println("Average is :" +avg);
        System.out.println("Percentage is :" +per);

    }
}
