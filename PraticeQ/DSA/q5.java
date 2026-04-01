public class q5{

    // calculaor using methods
    void calculator(int a, int b, char c){
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {
        q5 obj = new q5();
        obj.calculator(10, 5, '+');
        obj.calculator(10, 5, '-');
        obj.calculator(10, 5, '*');
        obj.calculator(10, 5, '/');
        obj.calculator(10, 0, '/');
        obj.calculator(10, 5, '%');
        
    }
}