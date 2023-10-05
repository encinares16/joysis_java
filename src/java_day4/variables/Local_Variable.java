
package java_day4.variables;

public class Local_Variable {
    public static void main(String[] args){
        boy();
        alien();
    }
    
    static void boy(){
        String livesOnEarth = "Earth Boy"; // local variable can't be static
        System.out.println(livesOnEarth);
    }
    
    static void alien(){
        String livesOnPluto = "Alien"; // local variable
        System.out.println(livesOnPluto);
    }
}
