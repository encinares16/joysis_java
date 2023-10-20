package day15.methods;

public class Methods {
    public static void main(String[] args) {
        
        displayName("Summer");
        displayName("Luffy");
        
        product(1, 2, 3);
        product(5, 10, 5);
        
        int result = sum();
        System.out.println("\nResult: " + result);
        
        int first = 16;
        int second = 39;
        Methods methods = new Methods();
        System.out.println((methods.checkEven(first) == true) ? first +  " is even number" : + first + " is odd number");
        System.out.println((methods.checkEven(second) == true) ? second +  " is even number" : + second + " is odd number");
    }
        
    boolean checkEven(int a){ 
        System.out.println("\nCheck Odd or Even");
        return a % 2 == 0;
    }
    
    static void displayName(String name){
        System.out.println("Print name 5 times");
        for (int i = 1; i < 6; i++) {
            System.out.println(i +". " + name);
        }
        System.out.println("");
    }
    
    static void product(int a, int b, int c){
        //parameterized methods
        System.out.println("The result of " + a + " x " + b + " x " + c + " = " + ( a * b * c));
    }
    
    static int sum(){
        //parameterized methods
        return 10 + 10;
    }
}

/*
        run:
        Print name 5 times
        1. Summer
        2. Summer
        3. Summer
        4. Summer
        5. Summer

        Print name 5 times
        1. Luffy
        2. Luffy
        3. Luffy
        4. Luffy
        5. Luffy

        The result of 1 x 2 x 3 = 6
        The result of 5 x 10 x 5 = 250

        Result: 20

        Check Odd or Even
        16 is even number

        Check Odd or Even
        39 is odd number
*/

