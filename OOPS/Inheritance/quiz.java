
class Animal{
    public String type;


    void printname(){
        System.out.println(" Iam an Animal");
    }
}

class dog extends Animal{
    void printFunction(){
        System.out.println(" I am dog");
    }
    void bark(){
        System.out.println("Barking..");
    }
}


public class quiz {
    public static void main(String[]args) {
        dog d = new dog();
        d. printFunction();
        d.bark();
        d.printname();

    }
}
