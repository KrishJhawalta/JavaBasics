import java.util.*;
import java.awt.font.*;

class Untitled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Choose num +,-,*,/,%");
		char c = sc.next().charAt(0);
		int result = 0;
		
		switch (c) {
			case '+':
			result = a+b;
			break; 
			case '-':
			result = a-b;
			break;
			case '*':
			result = a*b;
			break;
			case '/':
			result = a/b;
			break;
			case '%':
			result = a%b;
			break;
			
		}
		System.out.println("Answer is: "+result);
	}
		
		
	
}