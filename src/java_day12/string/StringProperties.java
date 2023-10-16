package java_day12.string;

import java.util.Scanner;

public class StringProperties {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }   
    
    static void exercise2(){
        System.out.println("[Exercise 2] Find Character");
        String name = "Philippines";
        int vowels = 0;

        for (int i = 0; i < name.length(); i++) {  
            if (name.charAt(i) == 'P' || name.charAt(i) == 'p') { 
                vowels++;
                if(name.charAt(i)== name.charAt(0)){
                    System.out.println( "Uppercase: " + name.charAt(i));
                } else {
                    System.out.println( "Lowercase: " + name.charAt(i));
                }             
            }  
        }
        System.out.print("Word: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) );
        }
        System.out.println("\nVowel Count: " + vowels);
    } 
    
    static void exercise3(){
        System.out.println("\n[Exercise 3] Vowels Counter");
        System.out.println("Please type any words: ");
        String word = scanner.nextLine().toLowerCase();
        int vowels = 0;
        for (int i=0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                System.out.println((vowels + 1) + " Vowels: " + word.charAt(i));
                vowels++;
            } 
        }
        System.out.println("Word: " + word);
        System.out.println( "Vowel Count: "+ vowels);
    }
}
