package lessonn14;

public class nestedTry {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5 };
		int a = 3;
		int b = 0;
		try {
			try {
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("daxili blok: " + e.getMessage());

			}

			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("xarici blok: " + e.getMessage());
		}
	}
}