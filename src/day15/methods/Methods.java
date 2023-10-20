package day15.methods;

public class Methods {
    public static void main(String[] args) {
        displayName("Summer");
        displayName("Luffy");
        getProduct(1, 2, 3);
        getProduct(5, 10, 5);
        
//        System.out.println(multiply(5,100,10000));
        int number = 15;
        Methods methods = new Methods();
        System.out.println((methods.checkEven(number) == true) ? number +  " is even" : + number + " is odd");
    }
        
    public boolean checkEven(int a){ 
        return a % 2 == 0;
    }
    
     
    static void displayName(String name){
        for (int i = 1; i < 6; i++) {
            System.out.println(i +". " + name);
        }
        System.out.println("");
    }
    
    static void getProduct(int a, int b, int c){
        System.out.println("The result of " + a + " x " + b + " x " + c + " = " + ( a * b * c));
    }
    
//    public static int multiply(int a, int b, int c){ 
////        return  10 * 10 * 10;
//    }
    
    void b(){
        a();
    };
     void a(){
    };

}

