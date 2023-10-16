package day05.datatypes;

public class DataTypes{
    
    static boolean bool;
    static byte bit;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static String string; 
    public static void main(String[] args) {
        defaultValue();
    }
    
    static void defaultValue(){
        System.out.println("Primitive Data Types Default Value");
        System.out.println("boolean:    " + bool);
        System.out.println("byte:       " + bit);
        System.out.println("short:      " + s);
        System.out.println("int:        " + i);
        System.out.println("long:       " + l);
        System.out.println("float:      " + f);
        System.out.println("double:     " + d);
        System.out.println("\nNon-Primitive");
        System.out.println("String:     " + string);
    }
}

/*      
        Minimum                                      Maximum
        byte    = -128                               byte    = 127 
        short   = -32,768                            short   = 32,767 
        int     = 2,147,483,648 (-2^31)              int     = 2,147,483,647 (2^31 -1)
        long    = -9,223,372,036,854,775,808(-2^63)  long    = 9,223,372,036,854,775,807(2^63 -1)
        char    = \u0000' (or 0)                     char    = '\uffff'(or 65,535 inclusive)
        double  = unlimited
*/
