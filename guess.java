class game{
	private int setn;
	
	
	game(int n){
		setn = n;
	}
	
	public void check(){
		if(int n == setn){
			System.out.println("Correct");
		}
		else{
			System.out.println("Incorrect");
		}
	}
	
}

public class guess{
	public static void main(String[] args) {
	game g1 = new game(6);
	g.check();
	
	}
} 