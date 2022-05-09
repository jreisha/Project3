import java.util.Scanner;

public class PatternMaker{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Pattern Maker - Please choose an option.");
		System.out.println(" ");
		System.out.println("S - Square");
		System.out.println("T - Triangle");
		System.out.println("D -Diamond");
		System.out.println("Q - Quit");
		System.out.println(" ");
		System.out.println("Option:");
	
		char userInput = in.next().charAt(0);	
		
		while (userInput != 'S' || userInput != 's' || userInput != 'T' || userInput != 't'
				||userInput != 'D' || userInput != 'd' || userInput != 'Q' ||  
				userInput != 'q' ||userInput.charAt(0) != ' ' ) {
			
			throw IllegalArgumentException("Invalid option");
			
			System.out.println("Pattern Maker - Please choose an option.");
			System.out.println(" ");
			System.out.println("S - Square");
			System.out.println("T - Triangle");
			System.out.println("D -Diamond");
			System.out.println("Q - Quit");
			System.out.println(" ");
			System.out.println("Option:");
		} 
		
		if (userName = 's'|| userName = 'S') {
			int rows = in.nextInt();
		}
		

		else if (userName = 't'|| userName = 'T'|| userName = 'd' || userName = 'D') {
			int rows = in.nextInt();
			int columns = in.nextInt();
		}
		
		if 
	}
	

	
}