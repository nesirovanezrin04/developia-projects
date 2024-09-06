package homeworks;

import java.util.Scanner;

public class LoopOperators {
	public static void main(String[] args) {
		for (int n = 50; n >= 20; n--) { // 1
			System.out.println(n);
		}
		for (double i = 0; i <= 5; i += 0.1) { // 2
			System.out.println(i);
		}
		Scanner scanner_digit = new Scanner(System.in); // 3
		System.out.println("Enter a number: ");
		int number = scanner_digit.nextInt();
		int max_digit = 0;
		while (number > 0) {
			int digit = number % 10;
			if (digit > max_digit) {
				max_digit = digit;
			}
			number /= 10;
		}

		System.out.println(max_digit);
		Scanner scanner_digitt = new Scanner(System.in); // 4
		System.out.println("Enter a number: ");
		int numberr = scanner_digitt.nextInt();
		int min_digit = 9;
		while (numberr > 0) {
			int digit = numberr % 10;
			if (digit < min_digit) {
				min_digit = digit;
			}
			numberr /= 10;
		}

		System.out.println(min_digit);

	}
}
