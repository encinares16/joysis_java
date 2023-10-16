package day04.variables;

public class Local_Variable {
    public static void main(String[] args){
        human(); //calling method
        alien();
    }
    
    static void human(){
        String livesOnEarth = "I am a human"; // local variable can't be static
        System.out.println(livesOnEarth);
    }
    
    static void alien(){
        String livesOnPluto = "I am an alien"; // local variable
        System.out.println(livesOnPluto);
    }
}
