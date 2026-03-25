package PraticeQ.funPractice;
import java.util.Scanner;
public class sumofevenodd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =1;
        int i =sc.nextInt();
        int sumodd =0;
        int sumeven =0;

        while(i<=num){
            if(i%2==0){
                sumeven = sumeven +i;
            }else{
                sumodd = sumodd+i;
            }i++;
        }
        System.out.println("Even sum is: "+sumeven);
        System.out.println("odd sum is: "+sumodd);
    }
}
