// example four
public class TypecastingFour {
    public static void main(String[] args) {
        // out of range so we add l at end
        // now it will treat this value as long
        long a = 1000000000000L; 
        int b = (int)a ;  // a have long value so we convert it into integer adding (int) at the start
        
        System.out.println(a);

        // 1000000000000 this value is out of range 
        //there will be overflow and b will store garbage value
        // garbage value(useless value)
        
        System.out.println(b);
    }
}
