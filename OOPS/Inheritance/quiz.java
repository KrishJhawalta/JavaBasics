
class Animal{
    public String type;


    void printname(){
        System.out.println(" I Am an Animal");
    }
}

class dog extends Animal{
    void printFunction(){
        System.out.println(" I am dog");
    }
}


public class quiz {
    public static void main(String[]args) {
        dog d = new dog();
        d. printFunction();
        d.printname();

    }
}
