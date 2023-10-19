package day15.methods;

public class Methods {
    public static void main(String[] args) {
        displayName("Summer");
        getProduct(5, 5, 5);
        getProduct(5, 10, 15);
    }
    
    static void displayName(String name){
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
    
    static void getProduct(int x, int y, int z){
        System.out.println(x * y * z);
    }
}

