package day07.controlflow;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1]Monday [2]Tuesday... [7]Sunday");
        System.out.print("Enter number of days in a week: ");
        int day = scanner.nextInt();
        
        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekdays");
        }
        
        //shorthand -> ternary
        System.out.println("\nUsing Ternary");
        System.out.println("Enter number of days in a week: " + day);
        System.out.println((day == 6 || day == 7) ? "Weekend" : "Weekdays");
    }   
}
