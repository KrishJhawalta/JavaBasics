// Q3: Create a cylinder class using setter getter with constructor
class cylinder{
   private int radius;
   private int height;
   
   public cylinder(int r, int h){  // constructor
      radius = r;
      height = h;
   }
   
   public void setRadius(int r){
      radius = r;
   }
   
   public void setHeight(int h){
      height =h;
   }
   
   public int getRadius(){
      return radius;
   }
   public int getHeight(){
      return height;
   }
   
}

class practice3{
   public static void main(String[]args){
      cylinder c1 = new cylinder(1,2); // constructor object
      
      c1.setRadius(5);  // This is for change after construtor initilization
      c1.setHeight(2);  
      System.out.println("Radius is: "+c1.getRadius());
      System.out.println("Height is: "+c1.getHeight());
      
   }
}
