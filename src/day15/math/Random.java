package day15.math;

import java.util.Scanner;

public class Random {
     public static void main(String[] args){

        double random;
        int guess = 0;
        Scanner scan = new Scanner(System.in);
        random = ( Bingo.random() * 10) + 1 ;    // -> random numbers 1 to 10
        System.out.println("\nRandom number: " + (int) random);

        while(guess != random){
            System.out.print("Guess a number: ");
            guess = scan.nextInt();
    
            System.out.println(guess);
            System.out.println(random);
        }
     }   
}
