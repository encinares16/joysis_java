package day06.operators;

public class Activity3_OR_Operator {

    static boolean output;
    static byte inputA, inputB;
    public static void main(String[] args) {
        
        inputA = 0; 
        inputB = 1;
        
        System.out.println("OR Operator [&&]");
        System.out.println("[0] False, [1] True");
        
        System.out.println("[OR] Truth Table"); // or Logic gates
        System.out.println("Input A: " + inputA + " | Input B: " + inputA + " | Output: " + (output = false || false));
        System.out.println("Input A: " + inputA + " | Input B: " + inputB + " | Output: " + (output = false || true));
        System.out.println("Input A: " + inputB + " | Input B: " + inputA + " | Output: " + (output = true || false));
        System.out.println("Input A: " + inputB + " | Input B: " + inputB + " | Output: " + (output = true || true));
    }
}