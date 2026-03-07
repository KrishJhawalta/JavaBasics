class rectangle{
    int length;
    int breadth;
    
    
    public void area(){
        System.out.println("Area is: "+length*breadth);
    }
    
    public void perimeter(){
        System.out.println("perimeter is: "+2*length+breadth);
    }
  
}

public class practice4{
    public static void main(String[]args){
      rectangle r = new rectangle();
      r.length = 2;
      r.breadth = 3;
    
    r.area();
    r.perimeter();
        
        
        
    }
}
