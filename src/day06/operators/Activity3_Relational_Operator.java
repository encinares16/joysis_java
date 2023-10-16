package day06.operators;

public class Activity3_Relational_Operator {
    
    static byte a, b ,c;
    public static void main(String[] args) {
       
        a = 10;
        b = 12;
        c = 15;

        System.out.println("Relational Operator  <,>, <=, >=, == ,!= \n");
        
        System.out.println("Given Values");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        System.out.println("\nLess Than [<]");
        System.out.println( "Is " + a + " is less than to " + b + " ? " + (a < b));
        System.out.println( "Is " + c + " is less than to " + b + " ? " + (c < b));
        
        System.out.println("\nGreater Than [>]");
        System.out.println( "Is " + a + " is greater than to " + b + " ? " + (a > b));
        System.out.println( "Is " + c + " is greater than to " + b + " ? " + (c > b));
        
        System.out.println("\nLess than Equal [<=]");
        System.out.println( "Is " + a + " is less than equal to " + b + " ? " + (a <= b));
        System.out.println( "Is " + a + " is less than equal to " + a + " ? " + (a <= a));
        System.out.println( "Is " + c + " is less than equal to " + a + " ? " + (c <= a));
        
        System.out.println("\nGreater than Equal [>=]");
        System.out.println( "Is " + a + " is greater than equal to " + b + " ? " + (a >= b));
        System.out.println( "Is " + a + " is greater than equal to " + a + " ? " + (a >= a));
        System.out.println( "Is " + c + " is greater than equal to " + a + " ? " + (c >= a));
                
        System.out.println("\nEqual To [==]");
        System.out.println( "Is " + a + " is equal to " + b + ": " + (a == b));
        System.out.println( "Is " + a + " is equal to " + a + ": " + (a == a));
        System.out.println( "Is " + c + " is equal to " + a + ": " + (c == a));
                        
        System.out.println("\nNot Equal To [!=]");
        System.out.println( "Is " + a + " is not equal to " + b + ": " + (a != b));
        System.out.println( "Is " + a + " is not equal to " + a + ": " + (a != a));
        System.out.println( "Is " + c + " is not equal to " + a + ": " + (c != a));
        
    }
}