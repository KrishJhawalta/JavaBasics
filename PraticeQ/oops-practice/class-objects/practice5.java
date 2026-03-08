
class RockstarGames{
	String name;
	
	public void hitting(){
		System.out.println("Hitting!");
	}
	public void running(){
		System.out.println("Running");
	}
	public void fire(){
		System.out.println("Firing");
	}
}
public class practice5 {
	public static void main(String[] args) {
		RockstarGames character1 = new RockstarGames();
		character1.name = "TommyVecetti";
		character1.running();
		character1.hitting();
		character1.fire();
		
	}
}