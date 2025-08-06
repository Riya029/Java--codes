// convert number form binary to decimal  0110 = 6

import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number in Binary digits( 0 or 1):");
        String binary = in.nextLine();

        // convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("the decimal is:" + decimal); 
    }
}
