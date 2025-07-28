// example two of typecasting

public class TypecastingTwo {
    public static void main(String[] args) {
        int a = 9;
        long d = a;
        // this is implicit typecasting as value is stored from lower datat type to higher data type   
        // this is done by default by the compiler
        
        System.out.println(d);
        
        long c = 10;
        int f = (int)c;
        
        System.out.println(f);
        
        // not done bydefault, done by the user as there can be data loss
        // this is explicit typecasting as the values stored 
        //converting from higher data type to lower data type 
        //done by Forcefully conversion method which convert the data from long to integer 
    
    }

}
