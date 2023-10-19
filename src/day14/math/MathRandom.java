package day14.math;

import java.lang.Math;

public class MathRandom {
    
    public static void main(String[] args) {
        
        int lottoNum[] = new int[7]; 
        
        for (int i = 1; i < lottoNum.length; i++) {
            lottoNum[i] = (int) (Math.random() * 6) + 1;  
            for (int j = 0; j < i; j++) { 
                if (lottoNum[i] == lottoNum[j]) {
                    i--;
                }
            }
        }
        
        for(int data : lottoNum){
            System.out.print((data + 1) + " ");
        }
        
        System.out.println("");
    }
}
