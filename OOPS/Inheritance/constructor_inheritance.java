// class base 
class base1{
    base(){            // constructor 
        System.out.println("I am base constructor ");
    }
}

// class derived 
class derived1 extends base1{
    derived1(){         // constructor
        System.out.println("I am derived constructor");
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
        derived1 d = new derived1();




    }
}
