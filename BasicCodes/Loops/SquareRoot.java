public class SquareRoot {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        int answer = 0;
        
        // i = 1, 1*1 <= 9, answer = 1
        // i = 2, 2*2 <= 9, answer = 2
        // i = 3, 3*3 <= 9, answer = 3
        // i = 4, 4*4 <= 9,(false), stop  16 <= 15 no

        while(i * i <= n){
            answer = i;
            i = i + 1;
        }
        System.out.println(answer);
    }
}