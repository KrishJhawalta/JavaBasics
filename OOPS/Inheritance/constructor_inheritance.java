class base1{
    base(){
        System.out.println("I am base constructor ");
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I am derived constructor");
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
        base1 b = new base1();
        derived1 d = new derived1();



    }
}