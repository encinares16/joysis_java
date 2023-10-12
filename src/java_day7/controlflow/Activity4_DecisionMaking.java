package java_day7.controlflow;
import java.util.Scanner;

public class Activity4_DecisionMaking {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        do { // just added do-while statement, name validation
            System.out.print("Please enter your name: "); 
            name = scanner.nextLine();
        } while(name.isEmpty() || name.matches("-?(0|[1-9]\\d*)")); // check name if its empty || using basic regular expression. check string kung numeric
        
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        
         if(age >= 0 && age < 100){
            if(age > 64){
                System.out.println("Senior Citizen\nAge Qualification: 75");
                if(age > 74){
                    System.out.println( "Hi " + name + "\nYou are eligible for pension");
                } else {
                    System.out.println( "Sorry " + name + ". You are not yet eligible for pension");
                    int isQualify = 75 - age; // experiment lang
                    if(isQualify == 1){
                        System.out.println(isQualify + " Year to go. You will be qualify next year");
                    } else {
                        System.out.println("You will be qualify in the next " + isQualify + "years");
                    } 
                }
                
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
         scanner.close(); // Scanner properties,  to avoid leaking its memory
         System.exit(0); // Terminate java program
    }
}
