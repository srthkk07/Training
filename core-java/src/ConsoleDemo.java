
import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Enter Your Name : ");
		String name = console.next();
		System.out.println("your Name : "+ name);
		
		System.out.println("Enter age : ");
		int number = console.nextInt();
		System.out.println("Age is : "+number);
	}

}
