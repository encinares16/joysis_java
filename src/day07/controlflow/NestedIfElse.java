package day07.controlflow;

import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if(age >= 0 && age < 100){
            if(age > 64){
                System.out.println("Senior Citizen");
            } else if (age > 39){
                System.out.println("Adult");
            } else if (age > 19){
                System.out.println("Young Adult");
            } else if (age > 12){
                System.out.println("Teen");
            } else if (age > 4){
                System.out.println("Pre-schooler");
            } else if (age > 2){
                System.out.println("Toodler");
            } else {
                System.out.println("Baby");
            }
        } else {
            System.out.println("Invalid Output");
        }
    }
}
