package day15.math;

import java.lang.Math;
import java.util.Scanner;

public class Activity8_MathRandom {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int lotto[] = new int[7];
        int lotto2[] = new int[7];

        System.out.println("Lotto Games");
        System.out.println("[1] Ultra Lotto 6/58");
        System.out.println("[2] Grand Lotto 6/55");
        System.out.println("[3] Super Lotto 6/49");
        System.out.println("[4] Mega  Lotto 6/45\n");

        int getRange = 0;
        do {
            System.out.print("Please input ranges of lotto games to generate: 6/");
            getRange = scan.nextInt();
    //            System.out.println(getRange);
    
        for (int i=1; i < 7; i++) {
            int draw = (int) (Math.random() * getRange) + 1; // Grand Lotto 6/55
            lotto[i] = draw;
            lotto2[i] = draw;
            for (int j = 1; j < i; j++) {
                if (lotto[j] == draw ) {
                   draw = (int) (Math.random() * 7);
                    j=-1;
                }
            }                   
            lotto[i] = draw;
        }
            
            if (!(getRange == 45 || getRange == 49 || getRange == 55 || getRange == 58 )) {
                System.out.println("Invalid Input. \nAcceptable Number: [45, 49, 55, 58]\n");
            }
            
        } while (!(getRange == 45 || getRange == 49 || getRange == 55 || getRange == 58 || getRange == 5 ) );
        
        
        
//        for (int i=1; i < 6; i++) {
//            int draw = (int) (Math.random() * getRange) + 1; // Grand Lotto 6/55
//            lotto[i] = draw;
//            for (int j = 1; j < i; j++) {
//                if (lotto[j] == draw ) {
//                   draw = (int) (Math.random() * 7);
//                    j=-1;
//                    int restart = j=-1;
//                    System.out.println(restart);
//                }
//            }   
//            lotto[i] = draw;
//        }
        

//        for(int data : lotto){
//            System.out.print(data + "-");
//        } 
        
        switch(getRange){
            case 58:
                System.out.println("\nUltra Lotto 6/58");
                break;
            case 55:
                System.out.println("\nGrand Lotto 6/55");
                break;
            case 49:
                System.out.println("\nSuper Lotto 6/49");
                break;
            case 45:
                System.out.println("\nMega Lotto 6/45");
                break;
            default:
                System.out.println("Checked Combination");
        }
        

        System.out.print("Generated Combination: ");
        for (int i = 0; i < lotto.length; i++) {
            if(i < lotto.length - 1 ){
                System.out.print(lotto[i] + "-");
            } else {
                System.out.print(lotto[i]);
            }
        }
        System.out.println("");
        
        System.out.print("Before: ");
        for(int data : lotto2){
            System.out.print(data + "-");
        } 
        System.out.println(lotto.length);
    }
}

