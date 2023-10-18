package day10.looping;

public class ForLoop {
    public static void main(String[] args) {
        
        String symbol = "*";
        for(int i=1; i<=5; i++){
            for(int j=5; j >= i; j--){
                System.out.print(" ");
            } 
            for(int z=1; z<=i ;z++){
                if(z % 1 == 0){
                    System.out.print(symbol);    
                }
                System.out.print(z);
            }
            System.out.println("");
        }
        
//        System.out.println("    *");
//        System.out.println("   ***");
//        System.out.println("  *****");
//        System.out.println(" *******");
//        System.out.println("*********");

    }
}

//            for(int z=1; z<=10; z++){
//                if(z % 1 == 1){
//                    System.out.print("7");
//                    break;
//                }
//            }