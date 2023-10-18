
package day11.activity;

public class Triangle {
    public static void main(String[] args) {
        // Reference
        System.out.println("Reference");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*\n");
        
        for (int i=1; i<=4; i++) {
            for (int symbol=4; symbol>=i; symbol--) { 
                System.out.print("*"); 
            }
            System.out.println(""); 
        }
        
        // Numbers
        for (int i=1; i<=4; i++) {
            for (int symbol=4; symbol>=i; symbol--) { 
                System.out.print(i); 
            }
            System.out.println(""); 
        }
        
        
        
    }
}
