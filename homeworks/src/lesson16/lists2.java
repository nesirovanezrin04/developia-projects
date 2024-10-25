package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lists2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(8);
		numbers.add(78);
		numbers.add(10);

		int c = Collections.max(numbers); // 3
		System.out.println(c);

		Set<Integer> uniqueNumbers = new HashSet<>(numbers); // 4
		System.out.println(uniqueNumbers);

	}
}
