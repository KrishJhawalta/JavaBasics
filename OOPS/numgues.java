import java.util.Scanner;
class guess{
    private int number;
    guess(int n){
        number = n;}


    public int getInp(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public boolean check(int n){
        if(number == n){
            return true;
        }else{
            return false;
        }



    }
}
public class numguess {
    public static void main(String args[]) {
        guess g1 = new guess(5);
        int user = g1.getInp();
        if(g1.check(user)){
            System.out.println("correct");
        }else{
            System.out.println("Incorrect");
        }

    }
}
