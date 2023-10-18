package day11.activity;

import java.util.Scanner;

public class Act6_ControlFlowStatements {
    
    public static void main(String[] args) {
        
        String firstName = "Jerome";
        int favoriteNumber = 16;
        
        for( int i=1; i<=1; i++){
            System.out.println(i);
            for(int j=1; j<=i ;j++){
                System.out.println("First Name: " + firstName);
                System.out.println("First Name: " + favoriteNumber);
            }
        }
        
        System.out.println("\nFavorite Anime Characters: ");
        int x = 5;
        do {
            System.out.println("Monkey D. Luffy");
            x--;
        } while(x >= 1);
        
        // solution 1
        System.out.println("\nPrint odd numbers without 'continue keyword' ");
        for(int num=41; num<=49 ;num++){
            if(!(num % 2 == 0)){
                System.out.println(num);
            } 
        } 
        
        // solution 2
        System.out.println("\nPrint odd numbers with 'continue keyword'");
        for(int num=41; num<=49 ;num++){    
            if(num % 2 == 0){
                continue;
            }
        System.out.println(num);
        } System.out.println("");
        
        
         // Pyramid       
//        for(int i=1; i<=10; i++){
//            for(int space=1; space<=i ;space++){
//                System.out.print(space);
//            } 
//            for(int a=10; a>= i ;a--){
//                System.out.print("x");
//            } 
//            System.out.print("nl\n");
//        }

//        for(int i=1; i<=5; i++){
//            for(int a=5; a>= i ;a--){
//                System.out.print(" ");
//            } 
//            for(int space=1; space<=i ;space++){
//                System.out.print("*");
//            } 
//            System.out.print("\n");
//        }
//        

        System.out.println("Pyramid");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input number of lines pyramid: ");
        int getPyramid = scanner.nextInt();
        int getSpace = 2 + getPyramid;
        
        for(int i=1; i<=getPyramid; i++){
            for(int space=getSpace; space >= i; space--){
//                System.out.print("x");
                System.out.print(" ");
            }
//            for(int symbol=1; symbol<5; symbol++){
//                if(!(symbol % 1 == 0)){
//                    System.out.print("y");;
//                } 
//            }
//            System.out.print("*");
//            System.out.print(i); // 1
            for(int symbol=2; symbol<=i*2;symbol++){ // i = 1 * 2 //symbol == 2 -> 
//                System.out.print(symbol);
                System.out.print("*"); 
            }
            System.out.println("");
        }
    }
}
