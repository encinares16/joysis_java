package day07.controlflow;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt(); 
        
        if(age > 17){
            System.out.println( "You are eligible for National Election");
        } else if (age > 14){
            System.out.println("You are eligible for SK Election");
        } else if (age > 0) {
            System.out.println("You are not a voter yet");
        } else {
            System.out.println("Invalid Input");
        }
         scanner.close();
    }
}
