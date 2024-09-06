package homeworks;

import java.util.Scanner;

public class SimpleOperators {
	public static void main(String[] args) {
		for (int n = 1; n <= 5; n++) { // 1
			System.out.println(n);
		}

		Scanner scanner_sum = new Scanner(System.in); // 2
		System.out.println("Enter a number: ");
		int a = scanner_sum.nextInt();
		System.out.println("Enter a number: ");
		int b = scanner_sum.nextInt();
		int sum1 = a + b;
		System.out.println(sum1);

		Scanner scanner_multiple = new Scanner(System.in); // 3
		System.out.println("Enter a number: ");
		int n1 = scanner_multiple.nextInt();
		System.out.println("Enter a number: ");
		int n2 = scanner_multiple.nextInt();
		int multiple = n1 * n2;
		System.out.println(multiple);

		Scanner scanner_length = new Scanner(System.in); // 4
		System.out.println("Enter a number: ");
		int r = scanner_length.nextInt();
		double length = 2 * Math.PI * r;
		System.out.println(length);

		Scanner scanner_number = new Scanner(System.in); // 5
		System.out.println("Enter a number: ");
		int number = scanner_number.nextInt();
		int summ = 0;
		int numeral = number;
		while (numeral > 0) {
			summ += numeral % 10;
			numeral /= 10;
		}
		System.out.println(summ);

		Scanner scanner_find = new Scanner(System.in); // 6
		System.out.println("Enter a number: ");
		int numberr = scanner_find.nextInt();
		if (numberr <= 1) {
			System.out.println("Number is not a prime number");
			return;
		}

		boolean find_prime = true;
		for (int i = 2; i <= numberr / 2; i++) {
			if (numberr % i == 0) {
				find_prime = false;
				break;
			}
		}
		if (find_prime = true) {
			System.out.println("Number is a prime number");
		} else {
			System.out.println("Number is not a prime number");
		}

		int sum = 0; // 7
		for (int n = 1; n <= 100; n++) {
			sum += n;
		}
		System.out.println(sum);

		for (int n = 1; n <= 100; n++) { // 8
			if (n % 7 == 0) {
				System.out.println(n);
			}
		}

		Scanner scanner_even = new Scanner(System.in); // 9
		System.out.println("Enter a number: ");
		int nnumber = scanner_even.nextInt();
		boolean find_even = true;
		if (nnumber % 2 == 0) {
			find_even = true;
		}
		if (find_even = true) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");

		}

		for (int n = 1; n <= 200; n++) { // 10
			if (n % 3 == 0 && n % 7 == 0) {
				System.out.println(n);

			}
		}

	}
}
