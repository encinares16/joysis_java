package day06.operators;

public class Activity3_Assignment_Operator {
    
    static int containerA, containerB;
    public static void main(String[] args) {

        System.out.println("Assignment_Operator  =, +=, -=, *=, /=, %=\n");
        
        containerA = 8;
        containerB = 5; 
       
        System.out.println("Operator [=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("Container B [before assignment]: " +  containerB);
        System.out.println("Container B [[after assignment]: " + (containerB = containerA)); // 5 overwrite by 8
        System.out.println("Check container B: " + containerB + "\n");
        
        containerA = 8; // i re assign the containerA to 8.
        containerB = 5; // 
        System.out.println("Operator [+=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("Container B [before assignment]: " +  containerB);
        
        // containerB += containerA is a short hand for containerB = containerB + containerA
        System.out.println("Container B [[after assignment]: " + (containerB += containerA)); // given value now overwrite by 16
        System.out.println("Operation: containerB = containerB + containerA [shorthand] (containerB += containerA)");
        System.out.println("Check container B: " + containerB + "\n");
        
        containerA = 20; // change the value
        containerB = 100;
        System.out.println("Operator [-=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("container B [before assignment]: " +  containerB);
        System.out.println("Container B [[after assignment]: " + (containerB -= containerA));
        System.out.println("Operation: containerB = containerB - containerA [shorthand] (containerB -= containerA)");
        System.out.println("Check container B: " + containerB + "\n");
        
        containerA = 150; // change the value
        containerB = 0;
        System.out.println("Operator [*=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("Container B [before assignment]: " +  containerB);
        System.out.println("Container B [[after assignment]: " + (containerB *= containerA)); // return 0, 0 = 0 * 150
        System.out.println("Operation: containerB = containerB * containerA [shorthand] (containerB *= containerA)");
        System.out.println("Check container B: " + containerB + "\n");
        
        containerA = 81; // change the value
        containerB = 81;
        System.out.println("Operator [/=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("Container B [before assignment]: " +  containerB);
        System.out.println("Container B [[after assignment]: " + (containerB /= containerA)); // return 1, containerB = containerB / containerA;
        System.out.println("Operation: containerB = containerB / containerA [shorthand] (containerB /= containerA)");
        System.out.println("Check container B: " + containerB + "\n");
        
        containerA = 81; 
        containerB = 81;
        System.out.println("Operator [%=]");
        System.out.println("Container A: " +  containerA);
        System.out.println("Container B [before assignment]: " +  containerB);
        System.out.println("Container B [[after assignment]: " + (containerB %= containerA)); // return 0, containerB = containerB / containerA;
        System.out.println("Operation: containerB = containerB % containerA [shorthand] (containerB %= containerA)");
        System.out.println("Check container B: " + containerB + "\n");
    }
}