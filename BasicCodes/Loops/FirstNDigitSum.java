// Print the first 5 numbers which give same sum after addition of those numbers

import java.util.Scanner;
public class FirstNDigitSum {    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first five numbers you want their particular digit sum is 6: ");
    int n = in.nextInt();

    int count = 0;
    int num = 1;
    while(count < n){

        if(digitSum(num) == 6){
            System.out.println(num);
            count = count + 1;
        }
        num = num + 1;
    }       
}

public static int digitSum(int number){
    int sum = 0;
    while(number != 0){
        sum = sum + (number % 10);
        number = number / 10;
    }
    return sum;
}
}

