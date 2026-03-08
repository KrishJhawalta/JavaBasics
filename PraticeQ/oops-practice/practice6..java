class circle{
	int radius;
	
	public void area(){
		System.out.println("Area of circle is: "+3.17*radius*radius);
	}
	public void perimeter(){
		System.out.println("Perimeter of circle is: "+2*3.14*radius);
	}
}

class practice6 {
	public static void main(String[] args) {
		circle r = new circle();
		r.radius = 12;
		r.area();
		r.perimeter();
		
	}
}