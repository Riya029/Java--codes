// Check whether a value is character is alphabet or digit

// character ascaii value in integers:
// A-Z : 65-90 
      //values after the range 90 means special character
// a-z: 97-122
// 0 digit and '0' character wala zero
// 48-57 values means integers 0 to 9


import java.util.Scanner;
public class AlphabetorDigit{
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter character:");
            char ch = in.next().charAt(0);
            int value = ch ;// 'A' -->65 and 'a'--> 97

            // apply conditions
            if((65 <= value && value <=90) || (97 <= value && value <= 122)){
                  System.out.println("It is a alphabet" + value);
            }
            else if(90 < value && value < 122){
                  System.out.println("It is a special character" + value);
            }
            else{
                  System.out.println("It is a digit" +value);
            }

      }
}





