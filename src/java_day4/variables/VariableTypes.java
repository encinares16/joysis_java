package java_day4.variables;

public class VariableTypes {

    static String name = "Rome"; // static variable - accessible
    
    public static void main(String[] args) {
        boy(); // calling method
        alien();
        
        System.out.println(name); // accessing static variable
    }
    
    static void boy(){
        String livesOnEarth = "Earth Boy"; // local variable
        System.out.println(livesOnEarth);
    }
    
    static void alien(){
        String livesOnPluto = "Alien"; // local variable
        System.out.println(livesOnPluto);
    }
}
