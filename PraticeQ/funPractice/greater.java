import java.util.Scanner;
public class greater{
  public static void big(int a, int b){
    int sum=0;
    if(a>b){
      sum = a;
    }else{
      sum = b;
    }System.out.println("Bigger num: "+sum);
    
  }
  public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
int a = sc.nextInt();
System.out.print("Enter number: ");
int b = sc.nextInt();
big(a, b);


}}