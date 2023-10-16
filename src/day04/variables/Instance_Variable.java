package day04.variables;

public class Instance_Variable {
    
    String livesOnEarth = "Human"; // instance variable
    String livesOnPluto = "Alien"; // instance variable
    float x = 35.5f;
    
    public static void main(String[] args){
        Instance_Variable human = new Instance_Variable();
        System.out.println(human.livesOnEarth);
        
        alien();
    }
    
    static void alien(){
        Instance_Variable alien = new Instance_Variable();
        System.out.println(alien.livesOnPluto);
    }
}
