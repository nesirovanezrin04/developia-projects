package lesson12;

public class task7 {
	public static void main(String[] args) {

		String str = "Java Programming language";

		char[] charArray = str.toCharArray();
		System.out.println("The character array is:");

		for (char c : charArray) {
			System.out.print(c + " ");
		}
	}
}
