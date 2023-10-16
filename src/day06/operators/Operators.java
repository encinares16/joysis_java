package day06.operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

//        byte day = 7;
//        
//        if(day == 1){
//            System.out.println("Today is Monday");
//        } else if(day == 2){
//            System.out.println("Today is Tuesday");
//        } else if(day == 3){
//            System.out.println("Today is Wednesday");
//        } else if(day == 4){
//            System.out.println("Today is Thursday");
//        } else if(day == 5){
//            System.out.println("Today is Friday");
//        } else if(day == 6){
//            System.out.println("Today is Saturday");
//        } else if (day == 7) {
//            System.out.println("Today is Sunday");
//        } else {
//            System.out.println("Invalid Input");
//        }
        
        int age = 25 ;
        if(age > 18){
            System.out.println("You are eligible to vote for National Election");
        } else if(age >= 15 ){
            System.out.println("You are eligible to vote for SK Election");
        } else if (age <= 14) {
            System.out.println("You are not yet eligible to vote for any election");
        } else {
            System.out.println("Invalid Age Input");
        }
            
//        String day = "Sunday";
//        switch(day){
//            case "Monday":
//                System.out.println("1st Weekday of the Week");
//                break;
//            case "Tuesday":
//                System.out.println("2nd Weekday of the Week");
//                break;
//            case "Wednesday":
//                System.out.println("3rd Weekday of the Week");
//                break;            
//            case "Thursday":
//                System.out.println("4th Weekday of the Week");
//                break;
//            case "Friday":
//                System.out.println("5th Weekday of the Week");
//                break;            
//            case "Saturday":
//                System.out.println("1st Weekend of the Week");
//                break;
//            case "Sunday":
//                System.out.println("2nd Weekend of the Week");
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;
//        }
    }
}
