package day15.methods;

public class Methods {
    public static void main(String[] args) {
        displayName("Summer");
        getProduct(5, 5, 5);
        getProduct(5, 10, 5);
        
        System.out.println(Methods.sum(1, 2));
    }
    
    static void displayName(String name){
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
    
    public static int sum(int a, int b){ 
        return a + b;
    }
    
    static void getProduct(int x, int y, int z){
        System.out.println(x * y * z);
    }
}

