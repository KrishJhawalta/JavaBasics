package PraticeQ;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
       
        // Question1: Given numeber is greather than user input num 
        Scanner s = new Scanner(System.in);
         System.out.print("Enter number: ");
           int num2 = s.nextInt();
           int num1 = 4;
        System.out.println(num2<num1);

        // Question2: Following expressoin 
        int v = 5;
        int u = 4;
        int a = 2;
        int e = 6;
        double divi = (v*v-u*u)/(2.0*a*e);
        System.out.println(divi);



      

    }
    
}
