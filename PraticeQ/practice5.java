package PraticeQ;

public class practice5 {
    public static void main(String[] args) {
        
        // Question1: Print **** pattern
    //   for(int i=5; i!=1; i--){
    //     for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }}

        // Question2: Program to sum first n even numbers while loop
        int a = 1;
        while(a<10){
            System.out.println(a*2);
            a++;
        }

        // Question3: Multiplication table of given number
        int table = 1;
        while(table<=10){
            System.out.println(5+ " X " + table + " = " +table*5 );
            table++;
        }

        // Question 4: Multiplication in reverse order of a numberx
        int multi = 10;
        while(multi>=1){
            System.out.println(7+" X "+ multi + " =" + multi*7);
            multi--;
        }

        // Question 5: Program to factorial of a number
       int fact=1;
       int n = 5;
       int i =1;
       while(i<=n){
        fact=fact*i;
        i++;
       }System.out.println(" Factorial is: "+fact);

       // Question 6: Repeat quesiton 5 using while loop
       int factorial = 1;
       int number = 5;
       int l=1;
       while(l<=number){
        factorial = factorial*l;
        l++;
       }System.out.println(factorial);

       // Question 9: Program to calculate the ssum of multiplicatoin table
       int numbe = 0;
       for(int numb = 1; numb<=10; numb++){
        numbe+=5*numb;
       }System.out.println(numbe);


       // Question 10: Program to calculate sum of n even numbers (for loop)
       for(int mac =1; mac<=10; mac++){
        System.out.println(mac*2);
       
       }

        
        
    }
    
}
