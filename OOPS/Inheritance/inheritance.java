class base{
     int x;


    public void setX(int x) {
        x = x;
    }
    public int getX() {
        return x;
    }
    public void printme(){
        System.out.println("I am constructor");
    }

}
class derived extends base{
    int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class inheritance{

    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
        b.printme();
        d.printme();
        b.setX(5);

        d.setY(10);
        System.out.println("D is:"+d.getY());
        System.out.println("Number is: "+b.getX());


    }
}