package day15.math;

import java.lang.Math;

public class Activity8_MathRandom1 {
    public static void main(String[] args) {
        
//        draw();
        
        int lotto[] = new int[6];
        
        for (int i=1; i < 6; i++) {
            int draw = (int) (Math.random() * 55) + 1; // Grand Lotto 6/55
//            lotto2[i] = draw;
            lotto[i] = draw;
            for (int j = 1; j < i; j++) {
                if (lotto[j] == draw ) {
                   draw = (int) (Math.random() * 7);
                    j=-1;
                }
            }   
            lotto[i] = draw;
        }
        
        // Grand Lotto 6/55	55-37-09-26-10-43

        for(int data : lotto){
            System.out.print(data + "-");
        } 
        
        
        System.out.println("\n\nGrand Lotto 6/55");
        System.out.println("[Combination]");
        
        for (int i = 0; i < lotto.length; i++) {
            if(i < lotto.length - 1){
                System.out.print(lotto[i] + "-");
            } else {
                System.out.print(lotto[i]);
            }
        }
        System.out.println("");
    }
    
    
    static void draw(){
        int lotto[] = new int[6];
        
//        for (int i=0; i < lotto.length; i++) {
        for (int i=1; i < 6; i++) {
            int draw = (int) (Math.random() * 6) + 1;
            lotto[i] = draw;
            for (int j = 1; j < i; j++) {
                if (lotto[j] == draw ) {
                   draw = (int) (Math.random() * 7);
                    j=-1;
                }
            }   
            lotto[i] = draw;
//        System.out.println(random);
        }
        
        for(int data : lotto){
            System.out.println(data);
        }
    }
}
