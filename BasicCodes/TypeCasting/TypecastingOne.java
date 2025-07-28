// example one of typecasting

public class TypecastingOne{
    public static void main(String []args) {
       
       int a = 6;
       long d = a; // implicit typecasting easily store values
       long c = 10000000000000l;  // explicit typecasting  difficulty while storing the values so by using 
       //default assing l at the end can easily store this value
       
       System.out.println(d);
       System.out.println(c);
       
       double g  = 3.0;
       float y  = 3.0f; // this f will help to print the 
       //value in float as previously this value is treated as double so
       // at that time this value will not store in float
       
       System.out.println(y);
       System.out.println(g);
    }
}
