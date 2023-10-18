 
class GFG {
 
    public static void main(String[] args){
    int[] lotto = new int[7];
    int[] lotto1 = new int[7];

    for (int i = 1; i < 7; i++) {
        int shuffle = (int) (Math.random() * 7) + 1;
        lotto1[i] = shuffle;
        for (int j = 1; j < i; j++) {
            if (lotto[j] == shuffle) 
            {
                shuffle = (int) (Math.random() * 8); 
                j = -1;
//                System.out.println(j = j - 1);
            }

        }
        lotto[i] = shuffle;
    }

    for(int data : lotto){
        System.out.println(data);
    }
    
    for(int data : lotto1){
        System.out.print(data);
    }
    
    }
}