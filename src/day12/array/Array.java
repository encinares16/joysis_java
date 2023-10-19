package day12.array;

public class Array {

//    public static void otherways(){
//
//        String[][] fruits = {   { "Apple", "Banana", "Orange" },
//                                { "Strawberry", "Mango", "Lemon" }
//                            };
//
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println();
//            for (int j = 0; j < fruits[i].length; j++) {
//                System.out.print(fruits[i][j] + " ");
//            }
//        }
//    }


    public static void main(String[] args) {


        String planets[][] = { 
                               {"Mercury","Venus","Earth","Mars"},
                               {"Jupiter","Saturn","Uranus","Neptune"}
                            };
        
//        for(int i=0; i<planets.length; i++){
//            System.out.println();
//            for (int j=0; j<planets[i].length; j++) {
//                System.out.println(planets[i][j] +" ");
//            }
//        }
            
            for (String[] innerArray : planets){
               for (String data : innerArray)
               {
                   System.out.println(data);
               } 
                System.out.println("");
            }
        }
}
//        String[][] planets = new String[2][4];
//        String planets[][] = new String[2][4];
//        planets[0][0] = "Mercury";
//        planets[0][1] = "Venus";
//        planets[0][2] = "Earth";
//        planets[0][3] = "Mars";
//
//        planets[1][0] = "Jupiter";
//        planets[1][1] = "Saturn";
//        planets[1][2] = "Uranus";
//        planets[1][3] = "Neptune";