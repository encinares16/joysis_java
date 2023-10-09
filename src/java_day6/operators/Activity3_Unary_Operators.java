package java_day6.operators;

public class Activity3_Unary_Operators {
    
    static int increment = 10;
    static int decrement = 10;
    
    public static void main(String[] args) {
       
        System.out.println("Unary Operator, ++ -- ! \n");
        increment();
        decrement();
        negate();
        not();
    }
    
    static void increment(){
        System.out.println("[ ++ operator ] Increment");
        System.out.println("Initial Value: " + increment);
        System.out.println("Pre-increment Value: " + (++increment)); 
        System.out.println("Value hanging in background: " + increment);
        increment--; // decrease value
        System.out.println("\nInitial Value: " + increment);
        System.out.println("Post-increment Value: " + (increment++)); 
        System.out.println("Value hanging in background: " + increment + "\n");
    }
    
    static void decrement(){
        System.out.println("[ -- operator ] Decrement");
        System.out.println("Initial Value: " + decrement);
        System.out.println("Pre-decrement Value: " + (--decrement)); 
        System.out.println("Value hanging in background: " + decrement);
        decrement++; // decrease value
        System.out.println("\nInitial Value: " + decrement);
        System.out.println("Post-decrement Value: " + (decrement++)); 
        System.out.println("Value hanging in background: " + decrement + "\n");
    }
    
    static void negate(){
        int positive = 100;
        System.out.println("Negating an expression: [before] " + positive + " , [after] " + (-positive));
    }
    
    static void not(){
        System.out.println("\n[ ! operator ] Unary NOT operator");
        boolean T = true;
        System.out.println("Given boolean balue: " + T);
        System.out.println("Inverting the value: " + !T);
    }
}