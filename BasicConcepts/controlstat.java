public class controlstat{
    public static void main (String[]args){

        // Control Statements:

        // While loop: reverse a number
         int a = 5;
         while(a>=1){
             System.out.println(a);
             a--;
         }

         // Program to print 100 to 200
         int num = 100;
         while(num<=200){
             System.out.println(num);
             num++;
         }

         //Do-while loop:
         int numbers = 1;
         int i = 10;
         do{
             System.out.println(i);
         }while(numbers<=i);
         numbers++;

         //For loop:
         for(int i=5;i>=1;i--){
             System.out.println(i);
         }

         //Program to print first n odd numbers for loop
         for(int b=1;b<10;b++){
             System.out.println(b*2+1);
         }

        // Program to print first n reverse number
        for(int i=10;i!=1;i--){
            System.out.println(i);

        }

    




    }
}
