//     *
//    **
//   ***
//  ****
// ***** print this pattern

public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = 4;
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= space; j ++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("*");
            }
            System.out.println();
            star = star + 1;
            space = space - 1;
        }
    }    
}
