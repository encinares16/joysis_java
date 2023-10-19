package day14.math;

import java.util.Scanner;
import java.lang.Thread;
public class Bingo {

    public static void main(String[] args) {

        int[][][][][] card = new int[1][1][1][5][5];
        System.out.println("Reference: ");
        card[0][0][0][0][0] = 14;
        card[0][0][0][1][0] = 11;
        card[0][0][0][2][0] = 13;
        card[0][0][0][3][0] = 10;
        card[0][0][0][4][0] = 15;

        card[0][0][0][0][1] = 16;
        card[0][0][0][1][1] = 25;
        card[0][0][0][2][1] = 17;
        card[0][0][0][3][1] = 28;
        card[0][0][0][4][1] = 30;

        card[0][0][0][0][2] = 31;
        card[0][0][0][1][2] = 32;
        card[0][0][0][2][2] = 99; // Free
        card[0][0][0][3][2] = 58;
        card[0][0][0][4][2] = 45;

        card[0][0][0][0][3] = 46;
        card[0][0][0][1][3] = 50;
        card[0][0][0][2][3] = 55;
        card[0][0][0][3][3] = 50;
        card[0][0][0][4][3] = 60;

        card[0][0][0][0][4] = 61;
        card[0][0][0][1][4] = 64;
        card[0][0][0][2][4] = 65;
        card[0][0][0][3][4] = 70;
        card[0][0][0][4][4] = 75;

        System.out.print("B  I  N  G  O");

        for (int i = 0; i < card.length; i++) {
            System.out.println();
            for (int j = 0; j < card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][i].length; m++) {
                            System.out.print(card[i][j][k][l][m] + " ");
                        }
                        System.out.println("");
                    }
                }
            }
        }
        System.out.println("");

        int reset = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Type 'G' to Generate: ");
            String gen = scan.nextLine().toLowerCase();

            if (gen.equals("g")) {
                reset = 1;
                generate();
            }
        } while (reset == 1);
        
        System.exit(0);
    }
    
        public static void delay(int milliseconds)
        {
            try
            {
                Thread.sleep(milliseconds);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    
        static void generate() {
        int[][][][][] card = new int[1][1][1][5][5];

        System.out.println("\n[Bingo Generator]\n");

        for (int i = 0; i < 5; i++) {

/*       
            Letter B Array Reference
            card[0][0][0][0][0] = 14;
            card[0][0][0][1][0] = 11;
            card[0][0][0][2][0] = 13;
            card[0][0][0][3][0] = 10;
            card[0][0][0][4][0] = 15;
*/
            card[0][0][0][i][0] = ((int) (Math.random() * 15) + 1);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][0] == card[0][0][0][j][0]) {
                    i--;
                    break;
                }
            }

/*         
            Letter I Array Reference
            card[0][0][0][0][1] = 16;
            card[0][0][0][1][1] = 25;
            card[0][0][0][2][1] = 17;
            card[0][0][0][3][1] = 28;
            card[0][0][0][4][1] = 30;
*/
            //  System.out.println((int) (Math.random() * (30 - 16 + 1)) + 16); get random number from range 16 -30
            card[0][0][0][i][1] = ((int) (Math.random() * (30 - 16 + 1)) + 16);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][1] == card[0][0][0][j][1]) {
                    i--;
                    break;
                }
            }

/*         
            Letter N Array Reference
            card[0][0][0][0][2] = 31;
            card[0][0][0][1][2] = 32;
            card[0][0][0][2][2] = 99; Free substitute of bingo card
            card[0][0][0][3][2] = 58;
            card[0][0][0][4][2] = 45;
*/
            card[0][0][0][i][2] = ((int) (Math.random() * (45 - 31 + 1)) + 31);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][2] == card[0][0][0][j][2]) {

                    i--;
                    break;
                }
                card[0][0][0][2][2] = 99;
            }

/*         
            Letter G Array Reference
            card[0][0][0][0][3] = 46;
            card[0][0][0][1][3] = 50;
            card[0][0][0][2][3] = 55;
            card[0][0][0][3][3] = 50;
            card[0][0][0][4][3] = 60;
*/
            card[0][0][0][i][3] = ((int) (Math.random() * (60 - 46 + 1)) + 46);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][3] == card[0][0][0][j][3]) {
                    i--;
                    break;
                }
            }

/*         
            Letter O Array Reference
            card[0][0][0][0][4] = 61;
            card[0][0][0][1][4] = 64;
            card[0][0][0][2][4] = 65;
            card[0][0][0][3][4] = 70;
            card[0][0][0][4][4] = 75;
*/
            card[0][0][0][i][4] = ((int) (Math.random() * (75 - 61 + 1)) + 61);
            for (int j = 0; j < i; j++) {
                if (card[0][0][0][i][4] == card[0][0][0][j][4]) {
                    i--;
                    break;
                }
            }
        }

        System.out.print("B  I  N  G  O");
        for (int i = 0; i < card.length; i++) {
            System.out.println(); 
            for (int j = 0; j < card[i].length; j++) { 
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][i].length; m++) {
                            delay(550);
                            if (card[0][0][0][l][0] < 10) {
                                System.out.print(" " + card[i][j][k][l][m]);
                            } else {
                                System.out.print(card[i][j][k][l][m] + " ");
                            }
                        }
                        System.out.println(""); 
                    }
                }
            }                                    
        }
        System.out.println("");
    }
}
