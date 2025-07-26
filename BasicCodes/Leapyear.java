// check whether the year is leap year or not

import java.util.Scanner;
public class Leapyear{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        // take input from user
        System.out.println("enter the year:");
        int y = in.nextInt();

        // check
        if(y % 4 ==0 && y % 400 == 0  ||  y %100 !=0){
            System.out.println("year is leap year " + y);
        }
        else{
            System.out.println("Year is not leap year " + y);
        }

    }
}