class base{
     int x;

    public void setX(int xe) {
        x = xe;
    }
    public int getX() {
        return x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }
}

class derived extends base{      // extends = takes all functions of {base()} class
    int y;
}
public class inheritance{

    public static void main(String[] args) {

        derived d = new derived();    // derived object can access all base class { But base class cannot access derived}
        d.setX(7);
        System.out.println("Number is: "+d.getX());


    }
}