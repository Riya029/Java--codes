// third example

public class TypecastingThree {
    public static void main(String[] args) {
        
        // implicit type casting 
         // smaller data type  ---> bigger datatype
        // java automatically store decimal values as double so we have to present the float value by adding f at the end
        float a = 4.8f;
        double b = a; 
        
        System.out.println(b);


        // explicit type cating 
        // bigger data type ----> smaller data type
        double c = 3.8;
        float d = (float)c; // this is double value can't store in float so to store in float we have to convert it forcefully
        // we can't write f at the end of c as we can't write at the end of the variable, we can just write f at the end of the values not variables
        
        System.out.println(d);
    }   
}
