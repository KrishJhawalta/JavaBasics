class square{
    int side;



    public void area(){
        System.out.println("Area is: "+side*side);

    }
    public void perimeter(){
        System.out.println("Perimeter is: "+4*side);
    }
}

public class practice3{
    public static void main(String[]args){
        square sq = new square();
        sq.side = 2;
        sq.area();
        sq.perimeter();

    }
}