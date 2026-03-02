public class cont_break{
    public static void main(String[] args) {
        
        // Break statement
        for(int i=1; i<=10; i++){
            System.out.println(i);
            if(i==8){
                break;
            }
        }


        // Continue statement 
        for(int a=1; a<=10; a++){
            
            if(a==6){
                continue;
            }
            System.out.println(a);
        }
    }
}