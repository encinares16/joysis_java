package java_day7.controlflow;

public class IfElseStatement {
    public static void main(String[] args) {
        String day = "Sunday";
        
        if(day == "Saturday" || day == "Sunday"){
            System.out.println("It's Weekend");
        } else {
            System.out.println("It's Weekday");
        }
    }
}
