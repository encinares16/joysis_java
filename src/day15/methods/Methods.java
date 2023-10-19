package day15.methods;

public class Methods {
    public static void main(String[] args) {
        displayName("Summer");
        displayName("Luffy");
        getProduct(1, 2, 3);
        getProduct(5, 10, 5);
        
        Methods method = new Methods();
        System.out.println("Sum: " + method.sum(1, 2));
    }
    
    static void displayName(String name){
        for (int i = 1; i < 6; i++) {
            System.out.println(i +". " + name);
        }
        System.out.println("");
    }
    
    public static int sum(int a, int b){ 
        return a + b;
    }
    
    static void getProduct(int a, int b, int c){
        System.out.println("The result of " + a + " x " + b + " x " + c + " = " + ( a * b * c));
    }
}

