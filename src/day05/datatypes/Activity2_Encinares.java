package day05.datatypes;

public class Activity2_Encinares {
    
    static String day = "Friday"; // static variable
    static String currentMonth = "October";
    static byte today = 6; 
    static short currentYear = 2023; //since short data types has max value of 32,767, we can use short for currentYear
    float usdToPesos = 56.61f; // or float usdToPesos = (float) 56.61; // instance variable
    static double moonRadius = 1737.4;
    static long moonAge = 4530000000L;
    
    public static void main(String[] args) {
        
        System.out.println("Activity 2 : Data Types \n");
        
        myInfo();
        dateToday();
        bool();
        dollarToPesoConversion();
        moon();
    }
    
    static void dateToday(){
    //  System.out.println("Date Today : Friday, September 6, 2023");
        System.out.println("Data types used: [String, byte, short]");
        System.out.println("Date Today : " + day + ", " + currentMonth + " " + today + ", "+ currentYear + "\n");
    }
    
    static void myInfo(){
        char firstInitial = 'J';  // local variable
        String firstName = "Encinares";
        int age = 25;
        System.out.println("Data types used: [String, char, int]");
        System.out.println("Initial: " + firstInitial + ". " + firstName + ", " + age + "\n");
    }
    
        static void bool(){
        boolean isTodayFriday = !true; // this was what i meant pala on comment Sir, peace. Nagaaccept din pala sya ng logical operator
        boolean isTodaySaturday = !true && true; // capable din pala si java mag handle ng truth table. Goods talaga sir pag deep dive sa topic
                                                // Sa school dami nalagpasan na topics
        System.out.println("Data types used: [String, boolean]");                                                
        System.out.println("Today is Friday: " + isTodayFriday); // return value: false
        System.out.println("Today is Saturday: " + !isTodayFriday); // return value: true
        
        System.out.println("is today Saturday? " + isTodaySaturday); // return value: false
        System.out.println("is today Friday? " + (isTodaySaturday = true || !true) + "\n"); // logic gates OR return value: true
    }
        
    static void dollarToPesoConversion(){
        Activity2_Encinares convert = new Activity2_Encinares(); // create an object, instantiate
        
        System.out.println("Data types used: [String, float]"); 
        System.out.println("USD to PHP");
        System.out.println("1 Dollar = " + convert.usdToPesos);
    }    
    
    static void moon(){
        System.out.println("\nData types used: [String, double, long]");
        System.out.println("Moon Age and Radius");
        System.out.println("Radius: " + moonRadius);
        System.out.println("Age: " + moonAge + " years");
    }
}