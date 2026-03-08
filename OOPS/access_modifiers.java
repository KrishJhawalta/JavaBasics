// Access modifiers: These are just specifiers where a method is accessible or not
// Types : { Private , default, protected , public}


class myEmployee{
	private int id;     // Using this is not accessible directly by method property { We need to set value from another method}
	private String name;
	
	public void getName(){    
		System.out.println(name);
	}
	
	public int getId(){
		return(id);
	}
	
	public void setName(String n){    // This is called: GETTER { it set value to private variables} 
		name = n;
	}
	public void setId(int i){
		id = i;
	}
	
}
class access_modifiers {
	public static void main(String[] args) {
		myEmployee user1 = new myEmployee();
		user1.setName("Krish");
		user1.getName();
		
	}
}