package day11.activity;

public class Pyramid {
    public static void main(String[] args) {
        
        System.out.println("\nReference");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******\n");
        
        for (int i = 1; i <= 4; i++) {
            for (int space = 0; space <= i-2; space++) {
                System.out.print(" ");
            }
            
            for(int symbol=8; symbol>=i*2 ;symbol--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
        
        System.out.println("\nReference");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*\n");
        
        for (int i = 1; i <= 4; i++) {
            for (int symbol = 1; symbol <= i; symbol++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        System.out.println("\nReference");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*\n");
        
        for (int i = 1; i <= 4; i++) {
            for (int symbols=4; symbols >= i; symbols--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
