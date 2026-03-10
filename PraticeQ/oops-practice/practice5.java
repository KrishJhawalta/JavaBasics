// Q5: class sphere using getter and setter: radius 

class sphere{
	private int radius;
	
	
	public void setRadius(int r){         //SETTER
		radius = r;
	}
	
	public int getRadius(){            // GETTER
		return radius;
	}
}

public class practice5{
	public static void main(String[] args) {
		sphere sp = new sphere();
		sp.setRadius(5);
		System.out.println("Radius is: "+sp.getRadius());
		
	}
	
	
}