package day14.math;

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
    }
}
