
public class ExampleSpew {

	public static void main(String[] args) {
		String s;
		s = "Hello World";
		System.out.println("The string is : " + s);
		s = s + ". I am awake.";
		System.out.println("The string is : " + s);
		s = "O.K. " + s;
		System.out.println("The string is : " + s);
		System.out.println("The string has " + s.length() + " characters.");
		System.out.println("The 6th character is " + s.charAt(5));

		s = s.toLowerCase();
		System.out.println("The string is : " + s);
		s = s.substring(4, 12);
		System.out.println("The string is : " + s);
		int i;
		for (i = 1; i <= 255; i++) {
			System.out.format("%c", i);
			if ((i % 30) == 0) {
				System.out.println("");
			}
		}
		System.out.println("\n¶¶¶¶¶¶¶¶¶ææææææÞßàáâãäåæçèéêë");
	}
}
