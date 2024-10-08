package lesson12;

public class task2 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "python";

		int result = str1.compareTo(str2);

		if (result < 0) {
			System.out.println('"' + str1 + "\" is lexicographically less than \"" + str2 + "\".");
		} else if (result == 0) {
			System.out.println('"' + str1 + "\" is lexicographically equal to \"" + str2 + "\".");
		} else {
			System.out.println('"' + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
		}

	}
}
