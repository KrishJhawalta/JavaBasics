import javax.xml.transform.Source;
import java.util.Scanner;

public class methods1 {
//    public static void Calculate_um(int a, int b){
//        int multi = a*b;
//        System.out.println(multi);
//        return;
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int b = sc.nextInt();
//        Calculate_um(a,b);
//
//
//
//
//    }
    public static void factorial(int n){
        if(n<0){
            System.out.println("Error: only positive number");
            return;
        }else{
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial is: "+fact);}

    }

    public static void main(String[]args){

        factorial(5);

    }
}
