// import the util package to acces the class Scanner

// package ChapterOne;
import java.util.Scanner;
public class InputExample{

    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        // enter the values by asking from the user 
        
        System.out.println("enter the number which is integer: ");
        int a = obj.nextInt();

        System.out.println("enter the second number integer:");
        int b = obj.nextInt();
        
        System.out.println("enter the thirs number double:");
        double c = obj.nextDouble();

        System.out.println("enter the fourth number which is character:");
        String d = obj.next();

        // if we want to print the character which is single then 
        System.out.println("enter the character:");
        char ch= obj.next().charAt(0);

        //  obj.nextLine();//consume leftover newline

        System.out.println("enter the fifth value which is sentence");
        String e = obj.nextLine();
        
        //printing the values on the screen
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(ch);
        System.out.println("the value of a is " + a);
    }
}