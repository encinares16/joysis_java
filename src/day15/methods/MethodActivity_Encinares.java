package day15.methods;

import java.util.Scanner;

public class MethodActivity_Encinares {
    public static void main(String[] args) {

        // 1.
        MethodActivity_Encinares me = new MethodActivity_Encinares();
        Scanner scan = new Scanner(System.in);

        int first = 16;
        int second = 39;
        System.out.println("\nCheck Odd or Even");
        System.out.println((me.checkEven(first) == true) ? first +  " is even number" : + first + " is odd number");
        System.out.println((me.checkEven(second) == true) ? second +  " is even number" : + second + " is odd number");
        
        // 2.
        me.printMyName();
        
        // 3.
        int root = 81;
        System.out.println("Get square root of " + root + ": " + (int) squareRoot(root) + "\n");
        
        // 4.
        System.out.println("Get the power");
        System.out.println("Base of 10");
        System.out.print("Exponent of 3\nResult: ");
        
        power();
        
        // 5. 
        int result = random(100);
        System.out.println("\nRandomize number: " + result);
        
        //6.
        System.out.println("\nGet the area of the circle");
        System.out.print("Please enter the radius of the circle: ");
        int r = scan.nextInt();
        System.out.println("Radius of the circle: " + circle(r));
        
        // 7. 
        System.out.println("\nCheck if a person is a voter or not");
        int voter = me.voter(25);
        System.out.println((voter > 18) ? "Voter" : "Not a voter");
   
        // 8. 
        System.out.println("\nGet Word Length");
        lenght();
        
        // 9.
        char[] word = {'Y','O','T','I','B'}; // Dynamic array printing
        char[] myName = {'h','a','n','d','s','o','m','e'};
        char[] city = {'A','L','I','N','A','M'};
        
        System.out.println("Reverse a word");
        me.reverse(word);
        me.reverse(myName);
        me.reverse(city);

        // 10.
        print("Jerome Encinares",25);
        
        scan.close();
        System.exit(0);
    }
    
    // 1. Check Odd or Even
    boolean checkEven(int a){ 
        return a % 2 == 0;
    }
    
    // 2. Print name 50 times
    static String print(String name){
        return name;
    }
    
    void printMyName(){
        System.out.println("\nPrint name 50 times");
        for (int i = 1; i < 51; i++) {
            if (i == 25) {
                System.out.println(i  + print(" Jerome"));
            } else {
                System.out.print(i  + print(" Jerome"));
            }
        }
        System.out.println("\n");
    }
    
    // 3. Get square root
    static double squareRoot(double x){
        return Math.sqrt(x);
    }
    
    // 4. Get the power
    static void power(){
        int base = 10;
        int power = base * base * base;
        System.out.println(power); // or
        //  System.out.println((int) Math.pow(10, 3));
    }
    
    // 5. Randomize number 1 - 100
    static int random(int a){
        return a = (int) (Math.random() * 100) + 1;
    }
    
    // 6. Get the radius
    static double circle(int radius){
        final double PI = 3.14159; // const in other language,
        double area;
        return  area = (PI * ((int) radius * radius)); // a=π*(r*r) formula
    }
    
    // 7. Check if a person is a voter or not
    int voter(int v){
        return v;
    }
    
    // 8. Get lenghth of the word
    static void lenght(){
        String word = "Pepito Manaloto";
        System.out.println("Word: " + word);
        System.out.println("Lenght: " + word.length() + "\n");
    }
    
    // 9. Reverse a word
    char[] reverse(char word[]){
        for (int i = word.length-1; i > word.length - (word.length + 1); i--) {
            System.out.print(word[i] + " ");
        }
        System.out.println("");
        return word;
    }
    
     // 10. Print fullname and age   
    static void print(String fullName,int age){
        System.out.println("\nName: " + fullName + "\nAge: " + age);
    }
}

/*  
    Output
    run:

    Check Odd or Even
    16 is even number
    39 is odd number

    Print name 50 times
    1 Jerome2 Jerome3 Jerome4 Jerome5 Jerome6 Jerome7 Jerome8 Jerome9 Jerome10 Jerome11 Jerome12 Jerome13 Jerome14 Jerome15 Jerome16 Jerome17 Jerome18 Jerome19 Jerome20 Jerome21 Jerome22 Jerome23 Jerome24 Jerome25 Jerome
    26 Jerome27 Jerome28 Jerome29 Jerome30 Jerome31 Jerome32 Jerome33 Jerome34 Jerome35 Jerome36 Jerome37 Jerome38 Jerome39 Jerome40 Jerome41 Jerome42 Jerome43 Jerome44 Jerome45 Jerome46 Jerome47 Jerome48 Jerome49 Jerome50 Jerome

    Get square root of 81: 9

    Get the power
    Base of 10
    Exponent of 3
    Result: 1000

    Randomize number: 99

    Get the area of the circle
    Please enter the radius of the circle: 5
    Radius of the circle: 78.53975

    Check if a person is a voter or not
    Voter

    Get Word Length
    Word: Pepito Manaloto
    Lenght: 15

    Reverse a word
    B I T O Y 
    e m o s d n a h 
    M A N I L A 

    Name: Jerome Encinares
    Age: 25
    BUILD SUCCESSFUL (total time: 3 seconds)

*/