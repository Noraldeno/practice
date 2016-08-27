import java.util.Scanner;

public class hello{
	public static void main(String [] args){
		
		//Intializes scanner
		Scanner input = new Scanner(System.in);
		
		//Prints "Hello!" and asks name of user
		System.out.println("Hello!");
		System.out.println("What is your name?");
		String name = input.nextLine();
			
		//Prints out user name and says "Nice to meet you!"
		System.out.printf("Hi %s!! Nice to meet you!", name);
	}

}
