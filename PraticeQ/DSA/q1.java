package PraticeQ.DSA;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    

    // Take input in array
    int [] arr = new int [5];
    for(int i=0; i<arr.length; i++){
        System.out.print("Enter elements: ");
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<arr.length; i++){
        
        System.out.println(arr[i]);
    }
    
    
}}
