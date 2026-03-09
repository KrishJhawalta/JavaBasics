// constructors : a special function that runs automatically every time you create a new object from a class (a blueprint)

class myEmployee{
	int id;
	String name;
	
	public myEmployee(String myname){  // constructor declard 
		name = myname;
		id = 33;
	}
	
	public String getName(){
		return name;
	}
	public int getId(){
		return id;}
	
	public void setId(int n){
		id = n;
	}
		public void setName(String na){
			name = na;
		}
	
	
	
}

class constructors {
	public static void main(String[] args) {
		myEmployee emp1 = new myEmployee("Krish");
		System.out.println(emp1.name);
		System.out.println(emp1.id);
		
	}
}