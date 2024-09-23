package homeworks;

public class ArraysDemoHome {
	public static void main(String[] args) {
		int[] numbers = { 8, 10, 11, 19 };              
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {      //1
			sum += numbers[i];
		}
		System.out.println(sum);

		for (int i : numbers) {
			System.out.println(i);
		}

		double avg = (double) sum / numbers.length;      //2
		System.out.println(avg);

		int min_element = numbers[0];                   //3
		for (int j = 1; j < numbers.length; j++) {
			if (numbers[j] < min_element) {
				min_element = numbers[j];
			}
		}
		System.out.println(min_element);

		int max_element = numbers[0];           
		for (int j = 1; j < numbers.length; j++) {
			if (numbers[j] > max_element) {
				max_element = numbers[j];
			}
		}
		System.out.println(max_element);

		for (int num : numbers) {                //4
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}

		for (int num : numbers) {                
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		for (int numberr : numbers) {            //5
			if (numberr <= 1) {
				continue;
			}

			boolean find_prime = true;
			for (int i = 2; i <= numberr / 2; i++) {
				if (numberr % i == 0) {
					find_prime = false;
					break;
				}
			}

			if (find_prime == true) {
				System.out.println(numberr);
			}
		}
	}

}
