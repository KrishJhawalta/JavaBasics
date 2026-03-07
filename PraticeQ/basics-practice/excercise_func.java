import java.util.Scanner;
public class excercise_func{
  public static void avg(int a, int b, int c){
    int average = (a+b+c)/3;
    System.out.println("Average is: "+average);
  }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sub1: ");
        int a = sc.nextInt();
        System.out.print("Enter a sub2: ");
        int b = sc.nextInt();
        System.out.print("Enter a sub3: ");
        int c = sc.nextInt();
        avg(a,b,c);

      }
  }
