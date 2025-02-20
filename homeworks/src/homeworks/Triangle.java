package homeworks;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first side length: ");
		int a = scanner.nextInt();
		System.out.println("Enter the second side length: ");
		int b = scanner.nextInt();
		System.out.println("Enter the third side length: ");
		int c = scanner.nextInt();

		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c && b + c > a && a + c > b) {
				if (a == b && b == c) {
					System.out.println("Triangle is beraberterefli.");
				} else if (a == b || b == c || a == c) {
					System.out.println("Triangle is beraberyanli.");
				} else {
					System.out.println("Triangle is muxtelifterefli");
				}
			} else {
				System.out.println("Ucbucaq qurmaq mumkun deyil!");
			}
		} else {
			System.out.println("Ucbucagin terefi menfi ola bilmez");
		}

		scanner.close();
	}
}
