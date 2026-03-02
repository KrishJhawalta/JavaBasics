
import java.util.Scanner;

public class ifelse {
    public static void main(String[]args){
        // If else conditionals
        int a = 5;
        if(a==5){
            System.out.println("hello");
        }else{
            System.out.println("5 is not equals to a");
    
        }
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("This person can vote");
            case 15:
                System.out.println("he can not vote");
        }
        
int vote_age=19;
        if(vote_age>18){
            System.out.println("Vote available");
        }else{
            System.out.println("No vote available");
        }








    }
    
}
