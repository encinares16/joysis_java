package day13.arrayloop;

public class Activity7_SingleAndMultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("[Single Dimensional]");
        String drinks[] = { "Water","Coke","Mountain Dew","Sprite"};
        
        System.out.println("Using for loop");
        for (int i=0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }
        
        System.out.println("\nUsing for each");
        for (String data : drinks) {
            System.out.println(data);
        }
        
        System.out.println("\n[Multi Dimensional]");
        String colors[][] = {   
                                { "Light Blue", "Light Red", "Light Green" },
                                { "Dark Blue", "Dark Red", "Dark Green"}
                            };
        System.out.println("Using for loop");
        for (int i=0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.println(colors[i][j]);
            }
            System.out.println("");
        }
        
        
        System.out.println("Using for each");
        String colors2[][] = new String[2][3];
        colors2[0][0] = "Light Blue";
        colors2[0][1] = "Light Red";
        colors2[0][2] = "Light Green";
        
        colors2[1][0] = "Dark Blue";
        colors2[1][1] = "Dark Red";
        colors2[1][2] = "Dark Green";

        for (String color[] : colors2) {
            for (String data : color)
               {
                   System.out.println(data);
            } 
            System.out.println("");
        }
    }
}