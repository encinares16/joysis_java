package java_day10.looping;
import java.util.*;

public class Act5_Looping {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int multiplier, numberOfTables;
        
        System.out.println("------------- Multiplcation Table -------------");
        do {
            System.out.print("Please input the multiplier: ");
            multiplier = scanner.nextInt();
            while(multiplier > 0){ // execute if multiplier is greater than 0, inner-while
                numberOfTables = 0;
                System.out.println("Multiplier: " + multiplier + "\nNumber of tables: " + numberOfTables);
              do { 
                System.out.print("Please input number of tables [maximum of 15] : ");
                numberOfTables = scanner.nextInt();
                    while (numberOfTables < 16){ // execute if multiplier is less than 15
                        System.out.println("Multiplier: " + multiplier + "\nNumber of tables: " + numberOfTables);
                        for (int i=0; i <= numberOfTables; i++){
                            System.out.println( multiplier + " x " + i + " = " + (i * multiplier)); // get the value of multiplir from line 14, iterate tables and product
                        }
                        scanner.close(); // Stop scanner
                        System.out.println("Scanner has stopped");
                        System.exit(0); // Terminate program, program ends here
                    } 
              } while(numberOfTables > 15);
            }
        } while(multiplier < 0); 
    }
}
