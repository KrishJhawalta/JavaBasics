import java.util.Scanner;
public class celcius{
  public static void numb(int n){
    double fahren = (33.8)*n;
    System.out.println("Fahrenhiet: "+fahren);
  }
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Ceclcius: ");
  int n = sc.nextInt();

  numb(n);

  

   
    
  }
  }
  

