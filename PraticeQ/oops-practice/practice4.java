// Q4: overload constructor used to initialize a rectangle of length 4 and bradth 5
class rectangle{
	private int length;
	private int breadth;
	
	public rectangle(){             // constructor 1 
		length = 1;
		breadth = 1;
	}
	public rectangle(int l, int b){     // constructor 2
		length = l;
		breadth = b;
	}
	public int getBreadth(){
		return breadth; 
	}
	public int getLength(){
		return length;
	}
}

class practice4 {
	public static void main(String[] args) {
		rectangle r = new rectangle(5,2);
		System.out.println("Breadth is: "+r.getBreadth());
		System.out.println("Length is: " +r.getLength());
	
	}
}