package PraticeQ;
public class star{
    public static void myStar(){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
            System.out.print("*");}
            System.out.println();
        }
        }
    public static void main(String[]args){
        myStar();
        /* OUTPUT: 
         *
         **
         ***
         ****
         *****
         */

         // reverse star pattern
         for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");}
                System.out.println();
            
         }
}}