package java_day10.looping;
import java.util.*;

public class Act5_Loop {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int multiplier, tables;
        tables = 0;
        
        System.out.println("------------- Multiplcation Table -------------");
        do {
            System.out.print("Please input the multiplier: ");
            multiplier = scanner.nextInt();
            while(multiplier > 0){
                System.out.println("Multiplier: " + multiplier + "\nNumber of tables: " + tables);
              do{
                System.out.print("Please input number of tables [maximum of 15] : ");
                tables = scanner.nextInt();
                    while(tables <= 15){ // validation
                        System.out.println("Multiplier: " + multiplier + "\nNumber of tables: " + tables);
                        for(int i=0; i <= tables; i++){
                            System.out.println( multiplier + " x " + i + " = " + (i * multiplier));
                        } 
                        System.exit(0); // Terminate program
                    } 
              } while(tables > 15);
            }
        } while(multiplier < 0);
        scanner.close();
        System.out.println("Scanner has stopped");
    }
}
