
package java_day4.variables;

public class Instance_Variable {
    
    String livesOnEarth = "Earth Boy"; // instance variable
    String livesOnPluto = "Alien"; // instance variable
    float x = 35.5f;
    
    public static void main(String[] args){
        Instance_Variable boy = new Instance_Variable();
        System.out.println(boy.livesOnEarth);
        
        alien();
    }
    
    static void alien(){
        Instance_Variable alien = new Instance_Variable();
        System.out.println(alien.livesOnPluto);
    }
}
