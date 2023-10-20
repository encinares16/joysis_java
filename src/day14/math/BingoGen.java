package day14.math;

import java.util.Scanner;

public class BingoGen {
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
        card[0][0][0][3][0] = 9;
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
        
        System.out.println("Reference: ");
        System.out.println("B  I  N  G  O");
        // iterate, traverse card array
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][l].length; m++) {
                            
                             // card[0][0][0][3][0] = 9;
                            if (card[0][0][0][l][0] < 10) {
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
            Thread.currentThread().interrupt();
        }
    }
    
    //throws InterruptedException
    static void generate() {
        int card[][][][][] = new int[1][1][1][5][5];
        
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            
            // row B
            //downcast double to int
            card[0][0][0][i][0] = (int) (Math.random() * 15) + 1; // randomize number 1-15
            
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][0] == card[0][0][0][j][0]) {
                    i--;
                }
            }
                                // System.out.println((30 - 16 + 1) + 16); -> 31
            // row I         if Math random generate 30 - 16 = (14 + 1 = 15) + 16 (max - min + 1) + max
            card[0][0][0][i][1] = (int) (Math.random() * (30 - 16 + 1) + 16); // randomize number 16-30
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][1] == card[0][0][0][j][1]) {
                    i--;
                }
            }
            
            // row N
            card[0][0][0][i][2] = (int) (Math.random() * (45 - 31 + 1) + 31); // randomize number 31-45
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][2] == card[0][0][0][j][2]) {
                    i--;
                } 
                card[0][0][0][2][2] = 99;
            }
            
            // row G
            card[0][0][0][i][3] = (int) (Math.random() * (60 - 46 + 1) + 46); // randomize number 46-60
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][3] == card[0][0][0][j][3]) {
                    i--;
                }
            }    
            
            // row O
            card[0][0][0][i][4] = (int) (Math.random() * (75 - 61 + 1) + 61); // randomize number 61-75
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

/*
Output:
        Reference: 
        B  I  N  G  O
         1 16 31 46 61 
         2 25 33 50 64 
         5 17 99 55 65 
         9 28 58 48 60 
        15 30 45 60 75  

        Type 'G' to generate: g

        B  I  N  G  O
         7 26 38 60 67 
        13 22 39 54 71  
         8 20 99 57 65 
         4 19 41 48 74 
         3 25 31 52 63 

        Type 'G' to generate: x
        Program Terminated
*/
