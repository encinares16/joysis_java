package day04.variables;

public class Activity1_Encinares {
    
    static double temperature = 37.5; // static variable
    int age = 25; // instance variable
    
    public static void main(String[] args) {
        
        Activity1_Encinares myAge = new Activity1_Encinares(); // creating an object or instantiate
        
        String firstName = "Jerome"; // local variable
        String lastName = "Encinares"; 

        System.out.println("First Name: " + firstName); 
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + myAge.age); // accessing intantiated variable

        //  System.out.println("Temperature: " + temperature);
        temperature(); // or by calling method temperature 
    }
    
    static void  temperature(){
        System.out.println("Temperature: " + temperature); // accessing static variable
    }
}
