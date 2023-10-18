package day15.math;

import java.lang.Math;

class GFG { 
    public static int search(int arr[], int N, int x) 
    { 
        for (int i = 0; i < N; i++) { 
            if (arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = new int[7]; 
        int x = 7; 
        
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 7) + 1;
            arr[i] = random;
        }
        
        for(int data : arr){
            System.out.println("Array: " + data);
        }
        
        // Function call 
        int result = search(arr, arr.length, x); 
        if (result == -1) 
            System.out.print( 
                "Element is not present in array"); 
        else
            System.out.print("Element is present at index "
        + result); 
    } 
}