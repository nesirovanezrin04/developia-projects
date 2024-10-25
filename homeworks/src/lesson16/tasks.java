package lesson16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tasks {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); // 1
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);

		System.out.println(numbers);

		Set<String> fruits = new HashSet<>(); // 2

		fruits.add("Alma");
		fruits.add("Armud");
		fruits.add("Nar");
		fruits.add("Alca");
		fruits.add("Heyva");

		System.out.println(fruits);

	}
}