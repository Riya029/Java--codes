//convert the temperature from celsius to fahrenheit

import java.util.Scanner;
public class Temperatureconversion {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);

        System.out.println("enter the temperature in fahrenheit:");
        double a = n.nextDouble();

        double b = (((a - 32) * 5) / 9);// this 5.0 and 9.0 will provide value but 5/9 will give 0 
        System.out.println("The temperature in Celsius is : " +b);
   }
}
