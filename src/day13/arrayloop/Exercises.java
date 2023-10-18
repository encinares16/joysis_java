package day13.arrayloop;

import java.util.Scanner;

public class Exercises {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        exercise2();
//        exercise2a();
        exercise3();
    }   
    
    // Exercise 2
    static void exercise2(){
        System.out.println("[Exercise 2] Find Character");
        String name = "Phippines";
        int vowels = 0;
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < name.length(); i++) {  
            if (name.charAt(i) == 'P' || name.charAt(i) == 'p') { 
                vowels++;
//                if(name.charAt(i)== name.charAt(0)){
                if(name.charAt(i) == 'P' ){
                    System.out.println(name.charAt(i));
                    upperCase++;
                } else {
                    System.out.println(name.charAt(i));
                    lowerCase++;
                }             
            }  
        }
        System.out.print("Word: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) );
        }
        System.out.println( "\nUpper Case : "+ upperCase);
        System.out.println( "Lower Case : "+ lowerCase);
        scanner.close();
    } 
    
    // Exercise 2a
    static void exercise2a(){
        System.out.println("[Exercise 2a] Find Character");
        System.out.print("Type any words: ");
        String word = scanner.nextLine().toLowerCase();
        int found = 0;
        
        System.out.print("Find Character: ");
        String character = scanner.nextLine();
        char c = character.charAt(0);
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                found++;
            } 
        }
        
        System.out.println("Word: " + word);
        System.out.println("Word Length: " + word.length());
        System.out.println("Character: " + c);
        System.out.println("Found: " + found);
    }
    
    // Exercise 3
    static void exercise3(){
        System.out.println("[Exercise 3] Vowels Counter");
        System.out.print("Type any words: ");
        String word = scanner.nextLine().toLowerCase();
        int getVowelsCount = 0;
        
//        solution 1
//        for (int i=0; i < word.length(); i++) {
//            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
//                System.out.println( " Vowel " + (getVowelsCount + 1) + " : " + word.charAt(i));
//                getVowelsCount++;
//            } 
//        }

//        solution 2
        char[] vowels = {'a','e','i','o','u'};
        for (int i=0; i < word.length(); i++) {
            if(word.charAt(i) ==  vowels[0] || word.charAt(i) == vowels[1] || word.charAt(i) == vowels[2] || word.charAt(i) == vowels[3] || word.charAt(i) == vowels[4]){
                System.out.println( "Vowel " + (getVowelsCount + 1) + " : " + word.charAt(i));
                getVowelsCount++;
            } 
        }
        
        System.out.println("Word: " + word);
        System.out.println("Word Length: " + word.length());
        System.out.println( "Vowels: "+ getVowelsCount);
        System.out.println( "Consonants : "+ (word.length() - getVowelsCount));
        scanner.close();
    }
    
}
