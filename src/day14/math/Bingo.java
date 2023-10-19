package day14.math;
import java.util.Random;  
public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][][][][] card = new int[1][1][1][5][5];
        System.out.println("Your Card: ");
        card[0][0][0][0][0] = 22;
        card[0][0][0][1][0] = 11;
        card[0][0][0][2][0] = 99;
        card[0][0][0][3][0] = 77;
        card[0][0][0][4][0] = 15;

        card[0][0][0][0][1] = 16;
        card[0][0][0][1][1] = 25;
        card[0][0][0][2][1] = 17;
        card[0][0][0][3][1] = 28;
        card[0][0][0][4][1] = 30;

        card[0][0][0][0][2] = 31;
        card[0][0][0][1][2] = 32;
        card[0][0][0][2][2] = 45;
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
//        for (int i = 0; i < bingo.length; i++) {
//            
//            int getNumber = random.nextInt(11)+1;
//            System.out.println(getNumber);
//            if (getNumber < 11) {
//                bingo[0][0] = getNumber;
//            }
            
        for(int i=0; i < card.length; i++){
            System.out.println();
            for (int j=0; j<card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][i].length; m++) {
                            System.out.print(card[i][j][k][l][m] +" ");
                        } System.out.println("");
                    }
                }
            } 
        }
        System.out.println("");
        random();
//shuffle();
    }

    static void shuffle(){
        Random random = new Random();
        int[][][][][] card = new int[1][1][1][5][5];
//        card[0][0][0][0][0] = 22;
//        card[0][0][0][1][0] = 11;
//        card[0][0][0][2][0] = 99;
//        card[0][0][0][3][0] = 77;
//        card[0][0][0][4][0] = 15;
        
        for (int i = 0; i < 5; i++) {
            
            int getNumber = random.nextInt(11)+1;
            System.out.println(getNumber);
            if (getNumber < 11 ) {
                card[0][0][0][i][0] = getNumber;
            }
            
            if (getNumber > 10 && getNumber < 31 ) {
                card[0][0][0][i][1] = getNumber;
            }
         }
        
        for(int i=0; i < card.length; i++){
            System.out.println();
            for (int j=0; j<card[i].length; j++) {
                for (int k = 0; k < card[i][j].length; k++) {
                    for (int l = 0; l < card[i][j][k].length; l++) {
                        for (int m = 0; m < card[i][j][k][i].length; m++) {
                            System.out.print(card[i][j][k][l][m] +" ");
                        } System.out.println("");
                    }
                }
            } 
        }
    }
    
    static void random(){
        for (int i = 1; i < 6; i++) {
            int random = (int) (Math.random() * 100) + 1;
            System.out.println(random);
        }
    }
}