package homeworks;

public class SimpleOperators {
	public static void main(String[] args) {
		for (int n = 1; n <= 5; n++) { // 1
			System.out.println(n);
		}

		int sum = 0; // 7
		for (int n = 1; n <= 100; n++) {
			sum = sum + n;
		}
		System.out.println(sum);

		for (int n = 1; n <= 100; n++) { // 8
			if (n % 7 == 0) {
				System.out.println(n);
			}
		}
		for (int n = 1; n <= 200; n++) { // 10
			if (n % 3 == 0) {
				if (n % 7 == 0) {
					System.out.println(n);
				}
			}
		}
	}
}
