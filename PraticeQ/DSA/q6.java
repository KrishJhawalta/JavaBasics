package PraticeQ.DSA;
class Circle{
    

    
    
    double Area(int radius){
        return 3.14*radius*radius;
        
    }
    
    double Circumference(int radius){
        return 2*3.14*radius;
    }
}
class q6{
    

    public static void main(String[] args){
        
        Circle c1 = new Circle();
        System.out.println(c1.Area(7));
        System.out.println(c1.Circumference(7));
        
        
        
    }
}



