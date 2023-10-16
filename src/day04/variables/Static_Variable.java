package day04.variables;

public class Static_Variable {

    static String nickname = "Rome"; // static variable - accessible
    static String firstName = "Jerome"; 
    static String lastName = "Encinares"; 

    public static void main(String[] args) {
        System.out.println("Hello, I'm " + firstName + " " + lastName);
        nickname();
    }
    
    static void nickname(){
        System.out.println("My nickname is " + nickname);
    }
}

