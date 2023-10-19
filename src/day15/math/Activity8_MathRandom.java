package day15.math;

import java.lang.Math;
import java.util.Scanner;

public class Activity8_MathRandom {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int lotto[] = new int[7];
        int lotto2[] = new int[7]; 
        
        System.out.println("PCSO Lotto Generator");
        System.out.println("[1] Ultra Lotto 6/58");
        System.out.println("[2] Grand Lotto 6/55");
        System.out.println("[3] Super Lotto 6/49");
        System.out.println("[4] Mega  Lotto 6/45");
        System.out.println("Check Duplicate 6/5\n");

        int getRange = 0;
        int restart = 1;
        do {
            System.out.print("Please input ranges of lotto games to generate: 6/");
            getRange = scan.nextInt();

            // user input validation 
            if (!(getRange == 45 || getRange == 49 || getRange == 55 || getRange == 58 || getRange == 5 )) {
                System.out.println("Invalid Input. \nAcceptable Number: [45, 49, 55, 58]\n");
                //  System.exit(0); 
            }
            
            // outer loop 
            for (int i=1; i < lotto.length; i++) {
                int draw = (int) (Math.random() * getRange) + 1; 
                lotto[i] = draw;
                lotto2[i] = draw;
                
                // inner loop 
                for (int j = 1; j < i; j++) {
                    // 1st inner loop iteration condition false,  j=1, first outer loop ite, i=1; 
                    // draw == lotto 
                    if (lotto[j] == draw ) {
                        draw = (int) (Math.random() * 7);
                        j=-1; // reset j = -1;
                        // System.out.println((restart++) + " inner loop restart, new random: " + draw ); // uncomment to check iteration
                    }
                }               
                //  System.out.println("draw: "+ draw); // uncomment to check iteration
                lotto[i] = draw;
            }
            
        } while (!(getRange == 45 || getRange == 49 || getRange == 55 || getRange == 58 || getRange == 5)); // user input validation
        
        
        // print selected games
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
        
        // 10-41-18-26-34-23
        // foreach loop, formating output
        System.out.print("Generated Combination: ");
        
        // i=0; print 1st element 0
        for (int i = 1; i < lotto.length; i++) {
            // lotto.length - 7
            // 6th iteration, i = 6; condition istrue, execute the body
            if(i < lotto.length - 1){
                System.out.print(lotto[i] + "-");
                
            // 7th iteration, i = 7; condition isfalse, execute line 83, last element of index, with no "-" sign
            } else {
                System.out.print(lotto[i]);
            }
        }
        
        System.out.println("\n");
        
        // traversing before, lotto2 array
        System.out.print("Before:              ");
        for(int data : lotto2){
            System.out.print(data + "-");
        } 
        
        // traversing lotto array
        System.out.print("\nAfter:               ");
        for(int data : lotto){
            System.out.print(data + "-");
        } 
        
        System.out.println( "\nArray length: " + lotto.length);
        System.exit(0);
    }
}

