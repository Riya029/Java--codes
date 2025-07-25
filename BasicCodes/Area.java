//take input and find area and perimeter


import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the length:");
        int a = n.nextInt();

        System.out.println("Enter the breadth:");
        int b = n.nextInt();

        int c = a * b;
        int d = 2*(a + b);
        System.out.println("The area is : " +c);
        System.out.println("The perimeter is : " +d);

    }
}
