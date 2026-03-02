public class voting {

     // function for voting
     public static void vote(int n){
        if(n>18){
            System.out.println("You can vote");
        }else{
            System.out.println("You are younger to vote");
        }
     }
    public static void main(String[]args){
vote(99);


    }
}
