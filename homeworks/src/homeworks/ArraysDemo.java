package homeworks;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, };         
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {           //1
			sum += numbers[i];
		}
		System.out.println(sum);

		double avg = (double) sum / numbers.length;           //2
		System.out.println(+avg);

		int min_element = numbers[0];                        //3
		for (int j = 1; j < numbers.length; j++) {
			if (numbers[j] < min_element) {
				min_element = numbers[j];
			}
		}
		System.out.println(min_element);

		for (int num = 0; num < numbers.length; num++) {      //4
			if (numbers[num] % 2 != 0) {
				System.out.println(numbers[num]);
			}
		}
	}
}
