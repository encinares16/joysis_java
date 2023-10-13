package java_day10.looping;
import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int multiplier, tables;
        
        System.out.println("------------- Multiplcation Table -------------");

        do {
            System.out.print("Please input the multiplier: ");
            multiplier = scanner.nextInt();
            System.out.print("Please input number of tables maximum of 15: ");
            tables = scanner.nextInt();
        } while(multiplier <= 0);
        
        for(int i=0; i<=tables; i++){
            System.out.println( multiplier + " x " + i + " = " + (i * multiplier));
        }
        scanner.close();
    }
}
