package day14.math;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        
/*        Reference: 
         B  I  N  G  O
         1 16 31 46 61  
         2 25 33 50 64  
         5 17 99 55 65  
         8 28 58 48 60  
        15 30 45 60 75  5d array 
*/      
        // create 5d array
        int card[][][][][] = new int[1][1][1][5][5];
        
        // B
        card[0][0][0][0][0] = 1;
        card[0][0][0][1][0] = 2;
        card[0][0][0][2][0] = 5;
        card[0][0][0][3][0] = 8;        
        card[0][0][0][4][0] = 15;
        
        // I
        card[0][0][0][0][1] = 16;
        card[0][0][0][1][1] = 25;
        card[0][0][0][2][1] = 17;
        card[0][0][0][3][1] = 28;        
        card[0][0][0][4][1] = 30;
        
        // N
        card[0][0][0][0][2] = 31;
        card[0][0][0][1][2] = 33;
        card[0][0][0][2][2] = 99;
        card[0][0][0][3][2] = 58;        
        card[0][0][0][4][2] = 45;
        
        // G
        card[0][0][0][0][3] = 46;
        card[0][0][0][1][3] = 50;
        card[0][0][0][2][3] = 55;
        card[0][0][0][3][3] = 48;        
        card[0][0][0][4][3] = 60;
        
        // O
        card[0][0][0][0][4] = 61;
        card[0][0][0][1][4] = 64;
        card[0][0][0][2][4] = 65;
        card[0][0][0][3][4] = 60;        
        card[0][0][0][4][4] = 75;
        
        System.out.println("B  I  N  G  O");
        
        // iterate, traverse card array
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][l].length; m++) {

                            // card[0][0][0][3][0] = 9;   
                            if (card[0][0][0][l][0] <= 9) {
                                System.out.print(" " + card[i][j][k][l][m]);
                            } else {
                                System.out.print(card[i][j][k][l][m] + " ");
                            }
                        }
                        System.out.println(" ");
                    }
                }
            }
        }
        
        Scanner scan = new Scanner(System.in);
        int gen = 0;
        do {
            System.out.print("\nType 'G' to generate: ");
            String yes = scan.nextLine().toLowerCase();
            if (yes.equals("g")) {
                generate();
                gen = 1;
            } else {
                System.out.println("Program Terminated");
                System.exit(0);
            }
        } while (gen == 1);
    }
    
    public static void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
             Thread.currentThread().isInterrupted();
        }
    }
    
    // throws InterruptedException
    static void generate() {
        int card[][][][][] = new int[1][1][1][5][5];
        
        System.out.println("");
        for (int i = 0; i < 5 ; i++) {
            
            // row B
            card[0][0][0][i][0] = (int) (Math.random() * 15) + 1;
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][0] == card[0][0][0][j][0]) {
                    i--;
                }
            }   
                                // System.out.println((30 - 16 + 1) + 16); -> 31
            // row I         if Math random generate 30 - 16 = (14 + 1) + 16 (max - min) + max
            card[0][0][0][i][1] = (int) (Math.random()*(30 - 16 + 1) + 16);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][0] == card[0][0][0][j][0]) {
                    i--;
                }
            }
            
            // row N
            card[0][0][0][i][2] = (int) (Math.random()*(45 - 31 + 1) + 31);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][2] == card[0][0][0][j][2]) {
                    i--;
                } 
                card[0][0][0][2][2] = 99;
            }
            
            // row G
            card[0][0][0][i][3] = (int) (Math.random()*(60 - 46 + 1) + 46);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][3] == card[0][0][0][j][3]) {
                    i--;
                } 
            }
            
            // row O
            card[0][0][0][i][4] = (int) (Math.random()*(75 - 61 + 1) + 61);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][4] == card[0][0][0][j][4]) {
                    i--;
                } 
            }
        }
        
        System.out.println("B  I  N  G  O");
        // iterate, traverse card array
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][l].length; m++) {
                            delay(600);
                            if (card[0][0][0][l][0] < 10) {
                                // format b row spacing if < 10, add space before the number
                                System.out.print(" " + card[i][j][k][l][m]);
                            } else {
                                System.out.print(card[i][j][k][l][m] + " ");
                            }
                        }
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}
