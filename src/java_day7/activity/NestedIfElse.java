/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day7.activity;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        int age = scanner.nextInt(); scanner.nextLine();
//        
//        String name = scanner.nextLine();
//        System.out.print("Name: ");
//        System.out.println(name + age);

//        Scanner scan = new Scanner(System.in);
//        
//        System.out.print("Please enter your age: ");
//        int age = scan.nextInt(); // scan.nextLine();
//
//        System.out.print("Please enter your name: ");
//        String name = scan.nextLine();
//
//        System.out.print("Please enter your email: ");
//        String email = scan.nextLine();
//
//        System.out.println("Hello, " + name + "!");
//        System.out.println("You are " + age + " years old!");
//        System.out.println("Your email is " + email);
//        
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        String name;
//        int age = scanner.nextInt(); 
////        scanner.nextLine();
//        System.out.print("Please enter your name: ");
//        String name = scanner.nextLine();

//        if(age > 0 ){
//            System.out.println("you are not a voter yet");
//        } else if(age > 14){
//            System.out.println("you are eligible for SK Election");
//        } else if(age > 17){
//            System.out.println( ", you are eligible for NAtional Election");
//        } else {
//            System.out.println("Invalid Input");
//        }
//        scanner.close();

    
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
