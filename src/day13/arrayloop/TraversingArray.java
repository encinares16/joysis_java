
package java_day13.arrayloop;

public class TraversingArray {
    public static void main(String[] args) {
        
//        String[][] planets = { 
//                               {"Mercury","Venus","Earth","Mars"},
//                               {"Jupiter","Saturn","Uranus","Neptune"}
//                            };
//                    
//        for (String[] planet : planets){
//           for (String data : planet)
//           {
//               System.out.println(data);
//           } 
//            System.out.println("");
//        }
//        for (int i=0; i < planets.length; i++) {
//            for (int j=0; j< planets[0].length; j++) {
//                System.out.println(planets[i][j]);
//            }
//            System.out.println("");
//        }
//        
//        for (String[] planet : planets) {
//            for (int j = 0; j< planets[0].length; j++) {
//                System.out.println(planet[j]);
//            }
//            System.out.println("");
//        }
        
        String name = "Philippines";
        
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }System.out.println("");
        
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'P' || name.charAt(i) == 'p') {
                if(name.charAt(i)== name.charAt(0)){
                    System.out.println( "Uppercase: " + name.toUpperCase().charAt(i));
                } else {
                    System.out.println( "Lowercase: " + name.charAt(i));
                }
            }
        }
//        System.out.println("");
//        for (int i = 0; i < name.length(); i++) {
//                        System.out.println(name.charAt(i));
//
//        }
    }
}
