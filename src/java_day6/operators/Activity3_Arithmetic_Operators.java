package java_day6.operators;

public class Activity3_Arithmetic_Operators {
    
    static int x = 15;
    static int y = 2;
    
    public static void main(String[] args) {
        System.out.println("Arithmetic Operator, +, -, *, / ,% \n");
        System.out.println("X given value: " + x);
        System.out.println("Y given value: " + y);
        
        System.out.println("\nThe sum of " + x + " and " + y + " is " + (x + y));
        System.out.println("The difference of " + x + " and " + y + " is " + (x - y));
        
        int product = x * y;
        int dividend = x / y;
        System.out.println("The product of " + x + " and " + y + " is " + product); // much better
        System.out.println("The dividend of " + x + " and " + y + " is " + dividend);
        
        System.out.println("\n[%] Modulo Operator");
        byte even = 104;
        boolean checkNumber = even % 2 == 0; 
        
        System.out.println("Check number if odd or even");
        System.out.println("Given Number: " + even);
        System.out.println(!checkNumber ? "Number is : Odd " : "Given number is: Even\n");
        
        byte odd = 97;
        checkNumber = odd % 2 == 0; 
        System.out.println("Given Number: " + odd);
        System.out.println(checkNumber ? "Number is : Even " : "Given number is: Odd");
    }
}