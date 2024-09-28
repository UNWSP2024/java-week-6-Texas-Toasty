
import java.util.Scanner;

public class ExampleSubstring {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		String piece;
		char smallPiece;
		int i;
		float j;
		String line = "Pizza765.23"; // initialize string
		StringBuilder message = new StringBuilder(line);
		System.out.println("Original Message: " + message);
		smallPiece = message.charAt(8); // get a character
		System.out.println("Character: " + smallPiece);
		piece = message.substring(2, 5); // get a substring
		System.out.println("Substring: " + piece);
		piece = message.substring(5, 8); // get a substring
		i = Integer.parseInt(piece); // convert substring to an integer
		System.out.println("Integer + 1: " + (i + 1));
		piece = message.substring(5, 11); // get a substring
		j = Float.parseFloat(piece); // convert substring to float
		System.out.println("Float : " + j);
	} // end main line

} // end class
