package java_day6.operators;

public class Activity3_AND_Operator {

    static boolean output;
    static byte inputA, inputB;
    public static void main(String[] args) {
        
        inputA = 0; 
        inputB = 1;
        
        System.out.println("AND Operator [&&]");
        System.out.println("[0] False, [1] True \n");
        
        System.out.println("[AND] Truth Table"); // or Logic gates
        System.out.println("Input A: " + inputA + " | Input B: " + inputA + " | Output: " + (output = false && false));
        System.out.println("Input A: " + inputA + " | Input B: " + inputB + " | Output: " + (output = false && true));
        System.out.println("Input A: " + inputB + " | Input B: " + inputA + " | Output: " + (output = true && false));
        System.out.println("Input A: " + inputB + " | Input B: " + inputB + " | Output: " + (output = true && true));
    }
}