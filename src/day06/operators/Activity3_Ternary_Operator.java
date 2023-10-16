package day06.operators;

public class Activity3_Ternary_Operator {

    public static void main(String[] args) {

        System.out.println("Ternary Operator"); // if else short hand
        boolean isTodayMonday = true;
        
        System.out.println("[Regular If Else]");
        
        if(!isTodayMonday){
            System.out.println("Yes, Today is Monday");
        } else {
            System.out.println("Boolean value if " + !isTodayMonday);
            System.out.println("No, Today is other day\n");
        }
        
        System.out.println("[Ternary]");
        System.out.println("Boolean value: " + isTodayMonday);
        System.out.println((isTodayMonday) ? "Yes, Today is Monday" : "No, Today is Sunday");
    }
}