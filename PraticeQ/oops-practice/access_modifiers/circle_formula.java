// circle formula using access modifier and SETTER, GETTER

class circle{
	private int radius; 

	
	public void setRadius(int r){
		if(r>=0){
		radius = r;
	}else{
		System.out.println("Invalid input");
	}}
public void getArea(){
	System.out.println("area is: "+3.14*radius*radius);
}
	public void getPerimeter(){
		System.out.println("perimeter is: "+2*3.14*radius);
	}
}
public class circle_formula{
	public static void main(String[]args){
		circle c = new circle();
		c.setRadius(5);
		c.getArea();
		c.getPerimeter();
		
	}
}